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
public class ProjectManager extends Worker {

    public ProjectManager(EnumW type, int hourlyRate, Semaphore sem, int dayLength, Drive drive) {
        super(type, hourlyRate, sem, dayLength, drive);
    }

    @Override
    public void run(){
        while (isHired()){
            try{
                work();
            
            }
            catch(Exception e){
            
            }
        }
        
    }
    
    @Override
    public void work() {
        int counter = 0;
        this.setDaysWorked(this.getDaysWorked()+1);
        int thirtyMin = this.getDayLength()/48;
        int eightHours = (this.getDayLength()/24) * 8;
        int faultCount = 0;
        try{
        while (counter < 16){
            this.getDrive().setStatusPM(1); //Esta viendo anime
            if (this.getDrive().getStatusDirector() == 1){ //Lo vigila el director
                this.getDrive().setFaults(this.getDrive().getFaults() + 1);
                faultCount ++;
                sleep(thirtyMin);
            }
            
            this.getDrive().setStatusPM(0); //Termina de ver anime y empieza a trabajar
            sleep(thirtyMin);
            counter++;
        }
        sleep(eightHours);
        this.getDrive().getDaysM().acquire();
        if (this.getDrive().getDaysCountdown() > 0){
            this.getDrive().setDaysCountdown(this.getDrive().getDaysCountdown() - 1);
        }
        this.getDrive().getDaysM().release();
        
        int lostMoney = faultCount*100;
   
        //Se aumentan los gastos en PM en el drive
        
        this.getDrive().getCostsM().acquire();
        
            this.getDrive().setFaults(this.getDrive().getFaults() + faultCount);
            int PMpay = (this.getDrive().getCostPM()*24) - lostMoney;
            this.getDrive().setTotalCosts(this.getDrive().getTotalCosts() + PMpay);
            
        this.getDrive().getCostsM().release();
        
        }
        catch(Exception e){
        
        }
    }

}
