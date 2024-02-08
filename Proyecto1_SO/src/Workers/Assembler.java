/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Company.Requirements;
import Disk.Drive;
import java.util.concurrent.Semaphore;

/**
 *
 * @author andre
 */
public class Assembler extends Worker {
    
    protected boolean assembling;
    protected Requirements requirements;
    protected int regEpToplotEp; //capitulos regulares a capitulos con plot twist

    public Assembler(Requirements requirements, int regEpToplotEp, EnumW type, int hourlyRate, Semaphore sem, int dayLength, Drive drive) {
        super(type, hourlyRate, sem, dayLength, drive);
        this.requirements = requirements;
        this.regEpToplotEp = regEpToplotEp;
    }
    
    public void run(){
    
        while(isHired()){
            try{
                work();
                if(isAssembling()){
                    sleep(2*this.getDayLength());
                    this.getDrive().getCostsM().acquire();
                    this.getDrive().setCostAssemble((int)this.getDrive().getCostAssemble()+this.getHourlyRate()*48);
                    this.getDrive().setTotalCosts((int)this.getDrive().getTotalCosts()+this.getHourlyRate()*48);
                    this.getDrive().getCostsM().release();
                    
                }else{
                    sleep(this.getDayLength());
                    this.getDrive().getCostsM().acquire();
                    this.getDrive().setCostAssemble((int)this.getDrive().getCostAssemble()+this.getHourlyRate()*24);
                    this.getDrive().setTotalCosts((int)this.getDrive().getTotalCosts()+this.getHourlyRate()*24);
                    this.getDrive().getCostsM().release();
                }
            }catch(Exception e){}
        }
    }
    

    @Override
    public void work() {
        try{
            this.setDaysWorked(this.getDaysWorked()+1);
            this.getDrive().getProduceM().acquire();
            //validacion de que se tengan los recursos necesarios para producir un capitulo
            boolean checkResources = (this.getDrive().getRegEpsSinceptEp() >= this.getRegEpToplotEp())?     
                    this.getRequirements().checkForPT(this.getDrive().getScripts(), this.getDrive().getSettings(), this.getDrive().getAnimations(), this.getDrive().getDubs(), this.getDrive().getPlotTwists())
                    : this.getRequirements().checkForReg(this.getDrive().getScripts(), this.getDrive().getSettings(), this.getDrive().getAnimations(), this.getDrive().getDubs());
            
            if(checkResources){
                
                this.getDrive().setScripts(this.getDrive().getScripts()-this.getRequirements().getScriptsNeed());
                this.getDrive().setSettings(this.getDrive().getSettings()-this.getRequirements().getScenesNeed());
                this.getDrive().setAnimations(this.getDrive().getAnimations()-this.getRequirements().getAnimationsNeed());
                this.getDrive().setDubs(this.getDrive().getDubs()-this.getRequirements().getTranslationsNeed());
                this.getDrive().getAssembleM().acquire();
                //si hay suficientes capitulos normales como para crear uno con plottwists, se crea el capitulo con plot twists 
                
                if(this.getDrive().getRegEpsSinceptEp() >= this.getRegEpToplotEp()){
                    System.out.println("aqui");
                    this.getDrive().setPlotTwists(this.getDrive().getPlotTwists()-this.getRequirements().getPlotTwistsNeed());
                    this.getDrive().setPtEps(this.getDrive().getPtEps()+1);
                    this.getDrive().setRegEpsSinceptEp(this.getDrive().getRegEpsSinceptEp()-this.getRegEpToplotEp());
                }else{
                    System.out.println("aquipt");
                    this.getDrive().setRegEps(this.getDrive().getRegEps()+1);
                    this.getDrive().setRegEpsSinceptEp(this.getDrive().getRegEpsSinceptEp()+1);
                }
                
                this.getDrive().getAssembleM().release();
                this.setAssembling(true);
            
            }
            this.getDrive().getProduceM().release();
            
        }catch(Exception e){}
        
        
        
        
        
        
        
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
    public Requirements getRequirements() {
        return requirements;
    }

    /**
     * @return the regEpToplotEp
     */
    public int getRegEpToplotEp() {
        return regEpToplotEp;
    }
    
    
    
}
