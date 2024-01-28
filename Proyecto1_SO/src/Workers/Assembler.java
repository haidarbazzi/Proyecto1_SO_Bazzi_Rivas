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
public class Assembler extends Worker {
    
    protected boolean assembling;
    protected CompanyRules requirements;
    protected int regEpToplotEp; //capitulos regulares a capitulos con plot twist

    public Assembler(CompanyRules requirements, int regEpToplotEp, EnumW type, double hourlyRate, Semaphore sem, int dayLength, Drive drive) {
        super(type, hourlyRate, sem, dayLength, drive);
        this.requirements = requirements;
        this.regEpToplotEp = regEpToplotEp;
    }
    
    public void run(){
    
        while(isHired()){
            try{
                work();
                if(isAssembling()){
                    sleep(2*getDayLength());
                }else{
                    sleep(getDayLength());
                }
            }catch(Exception e){}
        }
    }
    

    @Override
    public void work() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the assembling
     */
    public boolean isAssembling() {
        return assembling;
    }

    /**
     * @param assembling the assembling to set
     */
    public void setAssembling(boolean assembling) {
        this.assembling = assembling;
    }

    /**
     * @return the requirements
     */
    public CompanyRules getRequirements() {
        return requirements;
    }

    /**
     * @return the regEpToplotEp
     */
    public int getRegEpToplotEp() {
        return regEpToplotEp;
    }
    
    
    
}
