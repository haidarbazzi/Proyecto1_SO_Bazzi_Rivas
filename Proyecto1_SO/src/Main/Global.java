/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Company.Company;
import Interfaces.MainWindow;

/**
 *
 * @author HP
 */
public class Global {
    public static int dayLengthD;
    public static int dayLengthN;
    private static Company nick;
    private static Company disney;
    
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

    /**
     * @return the nick
     */
    public static Company getNick() {
        return nick;
    }

    /**
     * @param aNick the nick to set
     */
    public static void setNick(Company aNick) {
        nick = aNick;
    }

    /**
     * @return the disney
     */
    public static Company getDisney() {
        return disney;
    }

    /**
     * @param aDisney the disney to set
     */
    public static void setDisney(Company aDisney) {
        disney = aDisney;
    }
    
    
    
}
