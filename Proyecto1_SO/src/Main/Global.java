/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author HP
 */
public class Global {
    public static int daysBetweenRelease;

    public Global(int daysBetweenRelease) {
        this.daysBetweenRelease = daysBetweenRelease;
    }

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
    
    
    
}
