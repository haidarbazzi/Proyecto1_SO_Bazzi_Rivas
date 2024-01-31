/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

import Company.CompanyRules;
import Disk.Drive;
import Main.Global;
import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author andre
 */
public class Director extends Worker {

    private CompanyRules cRules;
    

    public Director(EnumW type, int hourlyRate, Semaphore sem, int dayLength, Drive drive, CompanyRules cRules) {
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
            this.getDrive().getDaysM().acquire();
            if (this.getDrive().getDaysCountdown() == 0) {
                this.getDrive().getAssembleM().acquire();
                this.getDrive().setProfit(this.getDrive().getRegEps() * this.getcRules().getEarningsReg() + this.getDrive().getPtEps() * this.getcRules().getEarningsPt());
                this.getDrive().setRegEps(0);
                this.getDrive().setPtEps(0);
                this.getDrive().setDaysCountdown(Global.getDaysBetweenRelease());
                this.getDrive().getAssembleM().release();
                this.getDrive().getDaysM().release();
                sleep(this.getDayLength());
            }else{
                this.getDrive().getDaysM().release();
                
                Random ran = new Random();
                double hour = this.getDayLength()/24;
                double hourEq = ran.nextInt(24)*hour;
                for (double i = 0; i < this.getDayLength(); i++) {
                    if(i == hourEq){
                    
                        this.getDrive().setStatusDirector(0);
                        
                        double min = hour/60;
                        sleep(Math.round(min*25));
                         this.getDrive().setStatusDirector(1);
                        sleep(Math.round(min*35));
                        
                    }else{
                        sleep(Math.round(hour));
                    }
                    
                    i += hour;
                    
                }
            }
            
            this.getDrive().getCostsM().acquire();
            this.getDrive().setCostDirector(this.getDrive().getCostDirector()+this.getHourlyRate()*24);
            this.getDrive().getCostsM().release();

        } catch (Exception e) {
        }

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

    /**
     * @return the status
     */
    

}
