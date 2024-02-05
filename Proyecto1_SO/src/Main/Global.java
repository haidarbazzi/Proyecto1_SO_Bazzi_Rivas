/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Interfaces.MainWindow;

/**
 *
 * @author HP
 */
public class Global {
    public static int dayLengthD;
    public static int dayLengthN;
    
    private static MainWindow MainWindow;

    public Global(MainWindow mainwindow) {
        this.MainWindow = mainwindow;
    }

    public static void setDayLengthN(int day){
        Global.dayLengthN= day;
    }
    public static int getDayLengthN(){
        return dayLengthN;}
    /**
     * @return the daysBetweenRelease
     */
    
    /**
     * @return the MainWindow
     */
    public static MainWindow getMainWindow() {
        return MainWindow;
    }

    /**
     * @param aMainWindow the MainWindow to set
     */
    public static void setMainWindow(MainWindow aMainWindow) {
        MainWindow = aMainWindow;
    }

    /**
     * @return the daysBetweenReleaseD
     */
    
    /**
     * @return the dayLengthD
     */
    public static int getDayLengthD() {
        return dayLengthD;
    }

    /**
     * @param aDayLengthD the dayLengthD to set
     */
    public static void setDayLengthD(int aDayLengthD) {
        dayLengthD = aDayLengthD;
    }
    
    
    
}
