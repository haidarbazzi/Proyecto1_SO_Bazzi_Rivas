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
            NickelodeonReq.setDaysBetweenReleases(fileNickelodeon.getDaysBetweenReleases());
            System.out.println(fileNickelodeon.getDaysBetweenReleases());
            Global.setDayLengthN(fileNickelodeon.getDayLength());

            Nick = new Company(NickelodeonReq, NickelodeonDrive, fileNickelodeon.getNumScriptWriters(), fileNickelodeon.getNumDesigners(), fileNickelodeon.getNumAnimators(), fileNickelodeon.getNumActors(), fileNickelodeon.getNumPlotTwisters(), fileNickelodeon.getNumAssemblers(), fileNickelodeon.getDayLength());

        } else {
            Drive NickelodeonDrive = new Drive(20);
            NickelodeonReq.setDaysBetweenReleases(10);
            Global.setDayLengthN(35000);
            Nick= new Company(NickelodeonReq, NickelodeonDrive, 1,1,1,1,1,1, 350000);
        }
        Nick.updateTimes(EnumC.Nickelodeon);
        Nickelodeon NickelodeonTab = new Nickelodeon(Nick);
        
       
        Global.getMainWindow().getTabPanel().addTab("Nickelodeon", NickelodeonTab);
        
        UpdaterNick update = new UpdaterNick(NickelodeonTab);
        update.start();
    }
    public static void startSimDisney() {

        Requirements DisneyReq = new Requirements(EnumC.DisneyChannel);
        FileAdmin fileAdmin = new FileAdmin();
        JSONFile fileDisney = null;
        Company Disney;
        try {
            fileDisney = fileAdmin.getFile(EnumC.DisneyChannel);

        } catch (Exception e) {
        }
        if (fileDisney != null) {
            Drive DisneyDrive = new Drive(fileDisney.getDaysBetweenReleases());
            DisneyReq.setDaysBetweenReleases(fileDisney.getDaysBetweenReleases());
            System.out.println(fileDisney.getDaysBetweenReleases());
            Global.setDayLengthD(fileDisney.getDayLength());

            Disney = new Company(DisneyReq, DisneyDrive, fileDisney.getNumScriptWriters(), fileDisney.getNumDesigners(), fileDisney.getNumAnimators(), fileDisney.getNumActors(), fileDisney.getNumPlotTwisters(), fileDisney.getNumAssemblers(), fileDisney.getDayLength());

        } else {
            Drive DisneyDrive = new Drive(20);
            DisneyReq.setDaysBetweenReleases(10);
            Global.setDayLengthD(35000);
            Disney= new Company(DisneyReq, DisneyDrive, 1,1,1,1,1,1, 350000);
        }
        Disney.updateTimes(EnumC.DisneyChannel);
        Disney DisneyTab = new Disney(Disney);
        
       
        Global.getMainWindow().getTabPanel().addTab("Disney", DisneyTab);
        
        UpdaterDisney update = new UpdaterDisney(DisneyTab);
        update.start();
    }
    
    public static void stopNickelodeon(){
        for (int i = 0; i < Global.getMainWindow().getTabPanel().getTabCount(); i++) {
                if(Global.getMainWindow().getTabPanel().getTitleAt(i).equals("Nickelodeon")){
                    Nickelodeon nick = (Nickelodeon) Global.getMainWindow().getTabPanel().getComponentAt(i);
                    nick.getNickelodeon().endCompany();
                    break;
                }
            }
    }
    public static void stopDisney(){
        for (int i = 0; i < Global.getMainWindow().getTabPanel().getTabCount(); i++) {
                if(Global.getMainWindow().getTabPanel().getTitleAt(i).equals("Disney")){
                    Disney disney = (Disney) Global.getMainWindow().getTabPanel().getComponentAt(i);
                    disney.getDisney().endCompany();
                    break;
                }
            }
    }

    
}
