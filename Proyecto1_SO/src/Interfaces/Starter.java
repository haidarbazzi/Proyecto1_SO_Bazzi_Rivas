/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Company.Company;
import Company.EnumC;
import Company.Requirements;
import Disk.Drive;
import Disk.FileAdmin;
import Disk.FileAdmin.JSONFile;
import Main.Global;

/**
 *
 * @author HP Inicia la simulación para cada compañía
 */
public class Starter {

    public static void startSimNickelodeon() {

        Requirements NickelodeonReq = new Requirements(EnumC.Nickelodeon);
        FileAdmin fileAdmin = new FileAdmin();
        JSONFile fileNickelodeon = null;
        Company Nick;
        try {
            fileNickelodeon = fileAdmin.getFile(EnumC.Nickelodeon);

        } catch (Exception e) {
        }
        if (fileNickelodeon != null) {
            Drive NickelodeonDrive = new Drive(fileNickelodeon.getDaysBetweenReleases());
            Global.setDaysBetweenRelease(fileNickelodeon.getDaysBetweenReleases());
            System.out.println(fileNickelodeon.getDaysBetweenReleases());
            Global.setDayLength(fileNickelodeon.getDayLength());

            Nick = new Company(NickelodeonReq, NickelodeonDrive, fileNickelodeon.getNumScriptWriters(), fileNickelodeon.getNumDesigners(), fileNickelodeon.getNumAnimators(), fileNickelodeon.getNumActors(), fileNickelodeon.getNumPlotTwisters(), fileNickelodeon.getNumAssemblers(), fileNickelodeon.getDayLength());

        } else {
            Drive NickelodeonDrive = new Drive(20);
            Global.setDaysBetweenRelease(20);
            Global.setDayLength(35000);
            Nick= new Company(NickelodeonReq, NickelodeonDrive, 1,1,1,1,1,1, 350000);
        }
        
        Nickelodeon NickelodeonTab = new Nickelodeon(Nick);
        
        Global.getMainWindow().getTabPanel().addTab("Nickelodeon", NickelodeonTab);
        Updater update = new Updater(NickelodeonTab);
        update.start();
    }
        

    
}
