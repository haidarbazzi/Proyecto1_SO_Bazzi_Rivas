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

    public ProjectManager(EnumW type, double hourlyRate, Semaphore sem, int dayLength, Drive drive) {
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
        this.daysWorked++;
        int thirtyMin = this.getDayLength()/48;
        int eightHours = (this.getDayLength()/24) * 8;
        int faultCount = 0;
        try{
        while (counter < 16){
            this.drive.setStatusPM(1); //Esta viendo anime
            if (this.drive.getStatusDirector() == 1){ //Lo vigila el director
                this.drive.setFaults(this.drive.getFaults() + 1);
                faultCount ++;
                sleep(thirtyMin);
            }
            
            this.drive.setStatusPM(0); //Termina de ver anime y empieza a trabajar
            sleep(thirtyMin);
            counter++;
        }
        sleep(eightHours);
        drive.getDaysM().acquire();
        if (drive.getDaysCountdown() > 0){
            drive.setDaysCountdown(drive.getDaysCountdown() - 1);
        }
        drive.getDaysM().release();
        
        int lostMoney = faultCount*100;
   
        //Se aumentan los gastos en PM en el drive
        
        drive.getCostsM().acquire();
        
            this.drive.setFaults(this.drive.getFaults() + faultCount);
            int PMpay = (this.drive.getCostPM()*24) - lostMoney;
            this.drive.setTotalCosts(this.drive.getTotalCosts() + PMpay);
            
        drive.getCostsM().release();
        
        }
        catch(Exception e){
        
        }
    }

}
