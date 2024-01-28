/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Disk.Drive;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Regular extends Worker {
    
    protected int dailyProduction;
    private float accWork; // Acumulado de la fracción de la parte de Capítulo que realiza a diario

    public Regular(int dailyProduction, Drive drive, EnumW type, double hourlyRate, Semaphore sem, int dayLength) {
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
            this.daysWorked++;
        }
        
        catch(Exception e){
        
        }
        
    }
    
    /**
     * @return the dailyProduction
     */
    public int getDailyProduction() {
        return dailyProduction;
    }

    
    
    
}
