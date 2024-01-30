/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disk;

import Workers.EnumW;
import java.util.concurrent.Semaphore;

/**
 *
 * @author andre
 */
public class Drive {
    
    //recursos producidos
    private int scripts =0;
    private int settings = 0;
    private int animations = 0;
    private int dubs = 0;
    private int plotTwists = 0;
    private int regEps = 0;
    private int ptEps = 0;
    
    //maximos de produccion
    private int maxScript = 25;
    private int maxSetting = 20;
    private int maxAnimation = 55;
    private int maxDub = 35;
    private int maxpTwist = 10;
    
    //Semaforos
    private Semaphore produceM; // para acceder a lo producido 
    private Semaphore assembleM; // para ensamblar episodios
    private Semaphore daysM; // accedar al contador de dias
    private Semaphore costsM; //acceder a los costos
    
    // simulacion 
    private int statusDirector; //si esta trabajando o no
    private int statusPM; //si esta trabajando o no
    private int faults; //num de faltas;
    
    // costos
    private int costScript=20;
    private int costSetting=26;
    private int costAnimation=40;
    private int costDub=16;
    private int costPT=34;
    private int costAssemble=50;
    private int costPM=40;
    private int costDirector = 60;
    
    private int profit;
    private int netProfit;
    private int salaryFault;
    private int totalCosts;
    
    private int daysCountdown;
    private int regEpsSinceptEp =0;
    private int regEpstoplotEp;

    public Drive(int daysCountdown) {
        this.produceM = new Semaphore(1);
        this.assembleM = new Semaphore(1);
        this.daysM = new Semaphore(1);
        this.costsM = new Semaphore(1);
        this.statusDirector = 1;
        this.statusPM = 1;
        this.faults = 0;
        this.profit = 0;
        this.netProfit = 0;
        this.salaryFault = 100;
        this.daysCountdown = daysCountdown;
        regEpstoplotEp =0;
    }
    
    public void addProduct(EnumW type){
        switch (type){
            //ScriptWriter(0), Designer(1), Animator(2), Translator(3), PtWriter(4), Assembler(5), ProjectManager(6), Director(7);
            case ScriptWriter:
                scripts = (scripts < maxScript)? scripts + 1: scripts;
                break;
            case Designer:
                settings = (settings < maxSetting)? settings + 1: settings;
                break;
            case Animator:
                animations = (animations < maxAnimation)? animations + 1: animations;
                break;
            case Translator:
                dubs = (dubs < maxDub)? dubs + 1: dubs;
                break;
            case PtWriter:
                plotTwists = (plotTwists < maxpTwist)? plotTwists + 1: plotTwists;
                break;
    
    }
    }

    /**
     * @return the scripts
     */
    public int getScripts() {
        return scripts;
    }

    /**
     * @param scripts the scripts to set
     */
    public void setScripts(int scripts) {
        this.scripts = scripts;
    }

    /**
     * @return the settings
     */
    public int getSettings() {
        return settings;
    }

    /**
     * @param settings the settings to set
     */
    public void setSettings(int settings) {
        this.settings = settings;
    }

    /**
     * @return the animations
     */
    public int getAnimations() {
        return animations;
    }

    /**
     * @param animations the animations to set
     */
    public void setAnimations(int animations) {
        this.animations = animations;
    }

    /**
     * @return the dubs
     */
    public int getDubs() {
        return dubs;
    }

    /**
     * @param dubs the dubs to set
     */
    public void setDubs(int dubs) {
        this.dubs = dubs;
    }

    /**
     * @return the plotTwists
     */
    public int getPlotTwists() {
        return plotTwists;
    }

    /**
     * @param plotTwists the plotTwists to set
     */
    public void setPlotTwists(int plotTwists) {
        this.plotTwists = plotTwists;
    }

    /**
     * @return the regEps
     */
    public int getRegEps() {
        return regEps;
    }

    /**
     * @param regEps the regEps to set
     */
    public void setRegEps(int regEps) {
        this.regEps = regEps;
    }

    /**
     * @return the ptEps
     */
    public int getPtEps() {
        return ptEps;
    }

    /**
     * @param ptEps the ptEps to set
     */
    public void setPtEps(int ptEps) {
        this.ptEps = ptEps;
    }

    /**
     * @return the maxScript
     */
    public int getMaxScript() {
        return maxScript;
    }

    /**
     * @return the maxSetting
     */
    public int getMaxSetting() {
        return maxSetting;
    }

    /**
     * @return the maxAnimation
     */
    public int getMaxAnimation() {
        return maxAnimation;
    }

    /**
     * @return the maxDub
     */
    public int getMaxDub() {
        return maxDub;
    }

    /**
     * @return the maxpTwist
     */
    public int getMaxpTwist() {
        return maxpTwist;
    }

    /**
     * @return the statusDirector
     */
    public int getStatusDirector() {
        return statusDirector;
    }

    /**
     * @param statusDirector the statusDirector to set
     */
    public void setStatusDirector(int statusDirector) {
        this.statusDirector = statusDirector;
    }

    /**
     * @return the statusPM
     */
    public int getStatusPM() {
        return statusPM;
    }

    /**
     * @param statusPM the statusPM to set
     */
    public void setStatusPM(int statusPM) {
        this.statusPM = statusPM;
    }

    /**
     * @return the faults
     */
    public int getFaults() {
        return faults;
    }

    /**
     * @param faults the faults to set
     */
    public void setFaults(int faults) {
        this.faults = faults;
    }

    /**
     * @return the costScript
     */
    public int getCostScript() {
        return costScript;
    }

    /**
     * @return the costSetting
     */
    public int getCostSetting() {
        return costSetting;
    }

    /**
     * @return the costAnimation
     */
    public int getCostAnimation() {
        return costAnimation;
    }

    /**
     * @return the costDub
     */
    public int getCostDub() {
        return costDub;
    }

    /**
     * @return the costPT
     */
    public int getCostPT() {
        return costPT;
    }

    /**
     * @return the costAssemble
     */
    public int getCostAssemble() {
        return costAssemble;
    }

    /**
     * @return the costPM
     */
    public int getCostPM() {
        return costPM;
    }

    /**
     * @return the costDirector
     */
    public int getCostDirector() {
        return costDirector;
    }

    /**
     * @return the profit
     */
    public int getProfit() {
        return profit;
    }

    /**
     * @param profit the profit to set
     */
    public void setProfit(int profit) {
        this.profit = profit;
    }

    /**
     * @return the netProfit
     */
    public int getNetProfit() {
        return netProfit;
    }

    /**
     * @param netProfit the netProfit to set
     */
    public void setNetProfit(int netProfit) {
        this.netProfit = netProfit;
    }

    /**
     * @return the salaryFault
     */
    public int getSalaryFault() {
        return salaryFault;
    }

    /**
     * @return the daysCountdown
     */
    public int getDaysCountdown() {
        return daysCountdown;
    }

    /**
     * @param daysCountdown the daysCountdown to set
     */
    public void setDaysCountdown(int daysCountdown) {
        this.daysCountdown = daysCountdown;
    }

    /**
     * @return the regEpsSinceptEp
     */
    public int getRegEpsSinceptEp() {
        return regEpsSinceptEp;
    }

    /**
     * @param regEpsSinceptEp the regEpsSinceptEp to set
     */
    public void setRegEpsSinceptEp(int regEpsSinceptEp) {
        this.regEpsSinceptEp = regEpsSinceptEp;
    }

    /**
     * @return the produceM
     */
    public Semaphore getProduceM() {
        return produceM;
    }

    /**
     * @return the assembleM
     */
    public Semaphore getAssembleM() {
        return assembleM;
    }

    /**
     * @return the daysM
     */
    public Semaphore getDaysM() {
        return daysM;
    }

    /**
     * @return the costsM
     */
    public Semaphore getCostsM() {
        return costsM;
    }

    /**
     * @return the regEpstoplotEp
     */
    public int getRegEpstoplotEp() {
        return regEpstoplotEp;
    }

    /**
     * @param regEpstoplotEp the regEpstoplotEp to set
     */
    public void setRegEpstoplotEp(int regEpstoplotEp) {
        this.regEpstoplotEp = regEpstoplotEp;
    }

    /**
     * @return the totalCosts
     */
    public int getTotalCosts() {
        return totalCosts;
    }

    /**
     * @param totalCosts the totalCosts to set
     */
    public void setTotalCosts(int totalCosts) {
        this.totalCosts = totalCosts;
    }
    
    
    
}
