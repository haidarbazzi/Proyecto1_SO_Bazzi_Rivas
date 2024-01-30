/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import Disk.Drive;
import List.List;
import Workers.Assembler;
import Workers.Director;
import Workers.EnumW;
import Workers.ProjectManager;
import Workers.Regular;
import Workers.Worker;
import java.util.concurrent.Semaphore;

/**
 *
 * @author andre
 */
public class Company {
    
    protected CompanyRules requirements;
    protected Drive drive;
    
    /**
     * 0 - guionista
     * 1 - disenador
     * 2 - animador
     * 3 - actor
     * 4 - plot twist
     * 5 - ensamblador
     */
    private List[] employees = new List[6];
    
    private int maxEmployees;
    private int numEmployees;

    public Company(CompanyRules requirements, Drive drive, int numScripters, int numDesigners, int numAnimators, int numActors, int numPlotTwisters, int numAssemblers) {
        this.requirements = requirements;
        this.drive = drive;
        switch (requirements.getIdentifier()){
            case Nickelodeon -> maxEmployees = 17;
            case DisneyChannel -> maxEmployees = 19;
        }
        
        for (int i = 0; i < this.employees.length; i++){
            employees[i] = new List();
        }
 
        //falta llenar las listas con los empleados segun el numero y set numEmployees.
    }
    
        
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
        }; 
    }
    
    
    
    
    
    public void hireEmployee(){
    
    };
    
    public void fireEmployee(){
    
    };
    
    
    /**
     * @return the requirements
     */
    public CompanyRules getRequirements() {
        return requirements;
    }

    /**
     * @return the drive
     */
    public Drive getDrive() {
        return drive;
    }

    /**
     * @return the employees
     */
    public List[] getEmployees() {
        return employees;
    }

    /**
     * @return the maxEmployees
     */
    public int getMaxEmployees() {
        return maxEmployees;
    }

    /**
     * @param maxEmployees the maxEmployees to set
     */
    public void setMaxEmployees(int maxEmployees) {
        this.maxEmployees = maxEmployees;
    }

    /**
     * @return the numEmployees
     */
    public int getNumEmployees() {
        return numEmployees;
    }

    /**
     * @param numEmployees the numEmployees to set
     */
    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }
    
    
    
    
}
