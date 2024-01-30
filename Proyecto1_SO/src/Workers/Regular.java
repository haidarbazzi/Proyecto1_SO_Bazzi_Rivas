/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Disk.Drive;
import static Workers.EnumW.Animator;
import static Workers.EnumW.Designer;
import static Workers.EnumW.PtWriter;
import static Workers.EnumW.ScriptWriter;
import static Workers.EnumW.Translator;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Regular extends Worker {
    
    protected double dailyProduction;
    private float accWork; // Acumulado de la fracción de la parte de Capítulo que realiza a diario

    public Regular(double dailyProduction, Drive drive, EnumW type, double hourlyRate, Semaphore sem, int dayLength) {
        super(type, hourlyRate, sem, dayLength, drive);
        this.dailyProduction = dailyProduction;
        this.accWork = 0;
    }
    
    @Override
    public void  run(){
        while(isHired()){
            try{
                work();
                sleep(getDayLength());
                
            }catch(InterruptedException e){}
        }    
    }
    
    
    

    @Override
    public void work() {
        
        this.accWork += this.dailyProduction;
        
        try{
            while (accWork >= 1){
                this.sem.acquire(1);
                this.drive.addProduct(this.type);
                this.sem.release();
                accWork--;
                if (accWork < 1){
                    accWork = 0;
                }
            }
             
            this.drive.getCostsM().acquire();
                
                //  ScriptWriter(0), Designer(1), Animator(2), Translator(3), PtWriter(4)
                switch(this.type){
                    case ScriptWriter:
                        this.drive.setTotalCosts(this.drive.getTotalCosts() + this.drive.getCostScript()*24);
                    case Designer:
                        this.drive.setTotalCosts(this.drive.getTotalCosts() + this.drive.getCostDirector()*24);
                    case Animator:
                        this.drive.setTotalCosts(this.drive.getTotalCosts() + this.drive.getCostAnimation()*24);
                    case Translator:
                        this.drive.setTotalCosts(this.drive.getTotalCosts() + this.drive.getCostDub()*24);
                    case PtWriter:
                        this.drive.setTotalCosts(this.drive.getTotalCosts() + this.drive.getCostPT()*24);
                }
            this.drive.getCostsM().release();
            this.daysWorked++;
        }
        
        catch(Exception e){
        
        }
        
    }
    
    /**
     * @return the dailyProduction
     */
    public double getDailyProduction() {
        return dailyProduction;
    }

    
    
    
}
