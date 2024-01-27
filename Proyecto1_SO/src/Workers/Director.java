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
public class Director extends Worker {

    public Director(int id, double hourlyRate, Semaphore sem, int dayLength, Drive drive) {
        super(id, hourlyRate, sem, dayLength, drive);
    }
    
    @Override
    public void run(){
    }
    

    @Override
    public void work() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
