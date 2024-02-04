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
    public static int daysBetweenRelease;
    public static int dayLength;
    private static MainWindow MainWindow;

    public Global(MainWindow mainwindow) {
        this.MainWindow = mainwindow;
    }

    public static void setDayLength(int day){
        Global.dayLength= day;
    }
    public static int getDayLength(){
        return dayLength;}
    /**
     * @return the daysBetweenRelease
     */
    public static int getDaysBetweenRelease() {
        return daysBetweenRelease;
    }

    /**
     * @param daysBetweenRelease the daysBetweenRelease to set
     */
    public static void setDaysBetweenRelease(int daysBetweenRelease) {
        Global.daysBetweenRelease = daysBetweenRelease;
    }

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
    
    
    
}
