/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Company.CompanyRules;
import Disk.Drive;
import java.util.concurrent.Semaphore;

/**
 *
 * @author andre
 */
public class Director extends Worker {

    private CompanyRules cRules;
    public Director(EnumW type, double hourlyRate, Semaphore sem, int dayLength, Drive drive, CompanyRules cRules) {
        super(type, hourlyRate, sem, dayLength, drive);
        this.cRules = cRules;
    }
    
    @Override
    public void run(){
    }
    

    @Override
    public void work() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the cRules
     */
    public CompanyRules getcRules() {
        return cRules;
    }

    /**
     * @param cRules the cRules to set
     */
    public void setcRules(CompanyRules cRules) {
        this.cRules = cRules;
    }
    
    
    
}
