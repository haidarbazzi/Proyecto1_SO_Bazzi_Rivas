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
public abstract class Worker extends Thread {

    /**
     * @return the type
     */
        
    protected EnumW type; 
    protected int daysWorked;
    protected int hourlyRate;
    protected boolean hired;
    protected Semaphore sem;
    protected int dayLength;
    protected final Drive drive;

    public Worker(EnumW type, int hourlyRate, Semaphore sem, int dayLength, Drive drive) {
        this.type = type;
        this.daysWorked = 0;
        this.hourlyRate = hourlyRate;
        this.hired = true;
        this.sem = sem;
        this.dayLength = dayLength;
        this.drive = drive;
    }
    
    public abstract void work();
    
    public void fire(){
        setHired(false);
    }

    public EnumW getType() {
        return type;
    }

    public Drive getDrive(){
        return this.drive;
    }
    
    /**
     * @return the daysWorked
     */
    public int getDaysWorked() {
        return daysWorked;
    }

    /**
     * @param daysWorked the daysWorked to set
     */
    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    /**
     * @return the hourlyRate
     */
    public int getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return the hired
     */
    public boolean isHired() {
        return hired;
    }

    /**
     * @param hired the hired to set
     */
    public void setHired(boolean hired) {
        this.hired = hired;
    }

    /**
     * @return the sem
     */
    public Semaphore getSem() {
        return sem;
    }

    /**
     * @param sem the sem to set
     */
    public void setSem(Semaphore sem) {
        this.sem = sem;
    }

    /**
     * @return the dayLength
     */
    public int getDayLength() {
        return dayLength;
    }

    /**
     * @param dayLength the dayLength to set
     */
    public void setDayLength(int dayLength) {
        this.dayLength = dayLength;
    }
    
    
    
    
}
