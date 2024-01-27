/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

import Disk.Drive;
import List.List;

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

    public Company(CompanyRules requirements, Drive drive, int maxEmployees, int numScripters, int numDesigners, int numAnimators, int numActors, int numPlotTwisters, int numAssemblers) {
        this.requirements = requirements;
        this.drive = drive;
        this.maxEmployees = maxEmployees;
       
        //falta llenar las listas con los empleados segun el numero y set numEmployees.
        
        
    }
    
    public void hireEmployee(){};
    
    public void fireEmployee(){};
    
    
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
