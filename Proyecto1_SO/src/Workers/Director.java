/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Company.Requirements;
import Disk.Drive;
import Main.Global;
import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author andre
 */
public class Director extends Worker {

    private Requirements cRules;
    

    public Director(EnumW type, int hourlyRate, Semaphore sem, int dayLength, Drive drive, Requirements cRules) {
        super(type, hourlyRate, sem, dayLength, drive);
        this.cRules = cRules;
        
    }

    @Override
    public void run() {
        while (isHired()) {
            try {
                work();

            } catch (Exception e) {

            }
        }
    }

    @Override
    public void work() {
        try {
            this.getDrive().setStatusDirector(0);
            this.getDrive().getDaysM().acquire();
            if (this.getDrive().getDaysCountdown() == 0) {
               
                this.getDrive().getAssembleM().acquire();
                this.getDrive().setProfit(this.getDrive().getRegEps() * this.getcRules().getEarningsReg() + this.getDrive().getPtEps() * this.getcRules().getEarningsPt());
                this.getDrive().setRegEps(0);
                this.getDrive().setPtEps(0);
                this.getDrive().setDaysCountdown(this.getcRules().getDaysBetweenReleases());
                this.getDrive().getAssembleM().release();
                this.getDrive().getDaysM().release();
               
                sleep(this.getDayLength());
            }else{
                this.getDrive().getDaysM().release();
                
                Random ran = new Random();
                double hour = this.getDayLength()/24;
                double hourEq = ran.nextInt(24)*hour;
                for (double i = 0; i < this.getDayLength(); i+=hour) {
                  
                    if(i == hourEq){
                    
                        this.getDrive().setStatusDirector(1);
                        
                        double min = hour/60;
                        System.out.println("VIGILA");
                        sleep(Math.round(min*35));
                        this.getDrive().setStatusDirector(0);
                        System.out.println("se acaba");
                        sleep(Math.round(min*25));
                       
                    }else{
                        sleep(Math.round(hour));
                     
                        
                    }
                    
                    i += hour;
                    
                }
            }
            
            this.getDrive().getCostsM().acquire();
            this.getDrive().setCostDirector((int)this.getDrive().getCostDirector()+this.getHourlyRate()*24);
            this.getDrive().getCostsM().release();

        } catch (Exception e) {
        }

    }

    /**
     * @return the cRules
     */
    public Requirements getcRules() {
        return cRules;
    }

    /**
     * @param cRules the cRules to set
     */
    public void setcRules(Requirements cRules) {
        this.cRules = cRules;
    }

    /**
     * @return the status
     */
    

}
