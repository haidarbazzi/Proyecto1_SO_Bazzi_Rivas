/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Disk.Drive;
import java.util.concurrent.Semaphore;

/**
 *
 * @author andre
 */
public class Regular extends Worker {
    
    protected int dailyProduction;

    public Regular(int dailyProduction, Drive drive, int id, double hourlyRate, Semaphore sem, int dayLength) {
        super(id, hourlyRate, sem, dayLength, drive);
        this.dailyProduction = dailyProduction;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the dailyProduction
     */
    public int getDailyProduction() {
        return dailyProduction;
    }

    
    
    
}
