/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Company.Company;
import static Company.EnumC.DisneyChannel;
import static Company.EnumC.Nickelodeon;
import Disk.Drive;
import static Workers.EnumW.Animator;
import static Workers.EnumW.Designer;
import static Workers.EnumW.PtWriter;
import static Workers.EnumW.ScriptWriter;
import static Workers.EnumW.Translator;
import java.util.concurrent.Semaphore;

/**
 *
 * @author andre
 */
public abstract class Worker extends Thread {
    
    protected EnumW type; 
    protected int daysWorked;
    protected double hourlyRate;
    protected boolean hired;
    protected Semaphore sem;
    protected int dayLength;
    protected final Drive drive;

    public Worker(EnumW type, double hourlyRate, Semaphore sem, int dayLength, Drive drive) {
        this.type = type;
        this.daysWorked = 0;
        this.hourlyRate = hourlyRate;
        this.hired = true;
        this.sem = sem;
        this.dayLength = dayLength;
        this.drive = drive;
    }
    
    public abstract void work();
    
    public Worker createWorker(Company company, Drive drive, EnumW type, Semaphore sem, int dayLength){
    
        double swDP = 0, dDP = 0, aDP = 0, tDP = 0, ptwDP = 0, asDP = 0;
        
        switch (company.getRequirements().getIdentifier()){
            case Nickelodeon:
                swDP = 0.34f;
                dDP = 0.34f;
                aDP = 0.5f;
                tDP = 0.2f;
                ptwDP = 0.5f;
                asDP = 0.5f;
                break;
            case DisneyChannel:
                swDP = 0.25f;
                dDP = 0.25f;
                aDP = 1;
                tDP = 0.2f;
                ptwDP = 0.5f;
                asDP = 0.5f;
                break;
        }
        return switch (type) {
            case ScriptWriter -> new Regular(swDP, drive, type, drive.getCostScript(), sem, dayLength);
            case Designer -> new Regular(dDP, drive, type, drive.getCostSetting(), sem, dayLength);
            case Animator -> new Regular(aDP, drive, type, drive.getCostAnimation(), sem, dayLength);
            case Translator -> new Regular(tDP, drive, type, drive.getCostDub(), sem, dayLength);
            case PtWriter -> new Regular(ptwDP, drive, type, drive.getCostPT(), sem, dayLength);
            case Assembler -> new Assembler(company.getRequirements(), drive.getRegEpstoplotEp(), type, drive.getCostAssemble(), sem, dayLength, drive);
            case ProjectManager -> new ProjectManager(type, 40, sem, dayLength, drive);
            case Director -> new Director(type, 100, sem, dayLength, drive, company.getRequirements());
            default -> null;
        }; //CompanyRules requirements, int regEpToplotEp, EnumW type, double hourlyRate, Semaphore sem, int dayLength, Drive drive
        //EnumW type, double hourlyRate, Semaphore sem, int dayLength, Drive drive
    }
    
    
    
    
    
    public void fire(){
        setHired(false);
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
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
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
