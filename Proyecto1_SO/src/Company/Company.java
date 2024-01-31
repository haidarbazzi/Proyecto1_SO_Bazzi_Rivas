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
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Company {

    protected CompanyRules requirements;
    protected Drive drive;

    /**
     * 0 - guionista 1 - disenador 2 - animador 3 - actor 4 - plot twist 5 -
     * ensamblador
     */
    private List[] employees = new List[8];

    private int maxEmployees;
    private int numEmployees;

    public Company(CompanyRules requirements, Drive drive, int numScripters, int numDesigners, int numAnimators, int numActors, int numPlotTwisters, int numAssemblers, int dayLength) {
        this.requirements = requirements;
        this.drive = drive;
        switch (requirements.getIdentifier()) {
            case Nickelodeon ->
                maxEmployees = 17;
            case DisneyChannel ->
                maxEmployees = 19;
        }

        for (int i = 0; i < this.employees.length; i++) {
            employees[i] = new List();
        }

        for (int i = 0; i < numScripters; i++) {
            employees[0].insert(this.createWorker(drive, EnumW.ScriptWriter, drive.getProduceM(), requirements.getDayLength()));
        }
        for (int i = 0; i < numDesigners; i++) {
            employees[1].insert(this.createWorker(drive, EnumW.Designer, drive.getProduceM(), requirements.getDayLength()));
        }
        for (int i = 0; i < numAnimators; i++) {
            employees[2].insert(this.createWorker(drive, EnumW.Animator, drive.getProduceM(), requirements.getDayLength()));
        }
        for (int i = 0; i < numActors; i++) {
            employees[3].insert(this.createWorker(drive, EnumW.Translator, drive.getProduceM(), requirements.getDayLength()));
        }
        for (int i = 0; i < numPlotTwisters; i++) {
            employees[4].insert(this.createWorker(drive, EnumW.PtWriter, drive.getProduceM(), requirements.getDayLength()));
        }
        for (int i = 0; i < numAssemblers; i++) {
            employees[5].insert(this.createWorker(drive, EnumW.Assembler, drive.getProduceM(), requirements.getDayLength()));
        }

        employees[6].insert(this.createWorker(drive, EnumW.ProjectManager, drive.getProduceM(), requirements.getDayLength()));
        employees[7].insert(this.createWorker(drive, EnumW.Director, drive.getProduceM(), requirements.getDayLength()));

        numEmployees = numScripters + numDesigners + numAnimators + numActors + numPlotTwisters + numAssemblers;

    }

    public Worker createWorker(Drive drive, EnumW type, Semaphore sem, int dayLength) {

        double swDP = 0, dDP = 0, aDP = 0, tDP = 0, ptwDP = 0, asDP = 0;

        switch (this.getRequirements().getIdentifier()) {
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
            case ScriptWriter ->
                new Regular(swDP, drive, type, drive.getCostScript(), sem, dayLength);
            case Designer ->
                new Regular(dDP, drive, type, drive.getCostSetting(), sem, dayLength);
            case Animator ->
                new Regular(aDP, drive, type, drive.getCostAnimation(), sem, dayLength);
            case Translator ->
                new Regular(tDP, drive, type, drive.getCostDub(), sem, dayLength);
            case PtWriter ->
                new Regular(ptwDP, drive, type, drive.getCostPT(), sem, dayLength);
            case Assembler ->
                new Assembler(this.getRequirements(), drive.getRegEpstoplotEp(), type, drive.getCostAssemble(), sem, dayLength, drive);
            case ProjectManager ->
                new ProjectManager(type, 40, sem, dayLength, drive);
            case Director ->
                new Director(type, 100, sem, dayLength, drive, this.getRequirements());
            default ->
                null;
        };
    }

    public void hireEmployee(int type) {

        if (this.getNumEmployees() < this.getMaxEmployees()) {
            switch (type) {
                case 0:
                    this.createWorker(this.getDrive(), EnumW.ScriptWriter, this.getDrive().getProduceM(), this.getRequirements().getDayLength());
                    break;
                case 1:
                    this.createWorker(this.getDrive(), EnumW.Designer, this.getDrive().getProduceM(), this.getRequirements().getDayLength());
                    break;
                case 2:
                    this.createWorker(this.getDrive(), EnumW.Animator, this.getDrive().getProduceM(), this.getRequirements().getDayLength());
                    break;
                case 3:
                    this.createWorker(this.getDrive(), EnumW.Translator, this.getDrive().getProduceM(), this.getRequirements().getDayLength());
                    break;
                case 4:
                    this.createWorker(this.getDrive(), EnumW.PtWriter, this.getDrive().getProduceM(), this.getRequirements().getDayLength());
                    break;
                case 5:
                    this.createWorker(this.getDrive(), EnumW.Assembler, this.getDrive().getProduceM(), this.getRequirements().getDayLength());
                    break;

            }
            this.setNumEmployees(this.getNumEmployees() + 1);
        } else {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el maximo de empleados");
        }

    }

    ;
    
   
    
    public void fireEmployee(int type) {
        if(this.getNumEmployees()>0){
            
            boolean eliminado = employees[type].remove();
            if(eliminado){
                this.setNumEmployees(this.getNumEmployees()-1);
            }else{
                JOptionPane.showMessageDialog(null, "No es posible eliminar el empleado");
            }
        
        }
    }

    ;
    
    
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
