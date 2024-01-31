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
    private double accWork; // Acumulado de la fracción de la parte de Capítulo que realiza a diario

    public Regular(double dailyProduction, Drive drive, EnumW type, int hourlyRate, Semaphore sem, int dayLength) {
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
        
        this.setAccWork( this.getAccWork()+ this.getDailyProduction());
        
        try{
            while (this.getAccWork() >= 1){
                this.getSem().acquire(1);
                this.getDrive().addProduct(this.getType());
                this.getSem().release();
                this.setAccWork( this.getAccWork()-1);
                if (this.getAccWork() < 1){
                    this.setAccWork(0);
                }
            }
             
            this.getDrive().getCostsM().acquire();
                
                //  ScriptWriter(0), Designer(1), Animator(2), Translator(3), PtWriter(4)
                switch(this.getType()){
                    case ScriptWriter:
                        this.getDrive().setTotalCosts(this.getDrive().getTotalCosts() + this.getDrive().getCostScript()*24);
                    case Designer:
                        this.getDrive().setTotalCosts(this.getDrive().getTotalCosts() + this.getDrive().getCostDirector()*24);
                    case Animator:
                        this.getDrive().setTotalCosts(this.getDrive().getTotalCosts() + this.getDrive().getCostAnimation()*24);
                    case Translator:
                        this.getDrive().setTotalCosts(this.getDrive().getTotalCosts() + this.getDrive().getCostDub()*24);
                    case PtWriter:
                        this.getDrive().setTotalCosts(this.getDrive().getTotalCosts() + this.getDrive().getCostPT()*24);
                }
            this.getDrive().getCostsM().release();
            this.setDaysWorked(this.getDaysWorked() +1);
        }
        
        catch(Exception e){
        
        }
        
    }
    
    /**
     * @return the dailyProduction
     */
    public double getDailyProduction() {
        return this.dailyProduction;
    }

    public double getAccWork(){
        return this.accWork;
    }
    public void setAccWork(double accwork){
        this.accWork = accwork;
    }
    
    
}
