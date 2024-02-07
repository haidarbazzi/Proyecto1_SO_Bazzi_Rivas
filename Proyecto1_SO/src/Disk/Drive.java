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
    
    // costos (gastos)
    private float costScript=0;
    private float costSetting=0;
    private float costAnimation=0;
    private float costDub = 0;
    private float costPT = 0;
    private float costAssemble=0;
    private float costPM=0;
    private float costDirector = 0;
    
    private float profit;
    private float netProfit;
    private int salaryFault;
    private float totalCosts;
  
    
    private int daysCountdown;
    private int regEpsSinceptEp =0;
   

    public Drive(int daysCountdown) {
        this.produceM = new Semaphore(1);
        this.assembleM = new Semaphore(1);
        this.daysM = new Semaphore(1);
        this.costsM = new Semaphore(1);
        this.statusDirector = 0;
        this.statusPM = 1;
        this.faults = 0;
        this.profit = 0;
        this.netProfit = 0;
        this.salaryFault = 100;
        this.daysCountdown = daysCountdown;
    }
    
    public void addProduct(EnumW type){
        switch (type){
            //ScriptWriter(0), Designer(1), Animator(2), Translator(3), PtWriter(4), Assembler(5), ProjectManager(6), Director(7);
            case ScriptWriter:
                this.setScripts((this.getScripts() < this.getMaxScript())? this.getScripts() + 1: this.getScripts());
                break;
            case Designer:
                this.setSettings((this.getSettings() < this.getMaxSetting())? this.getSettings() + 1: this.getSettings());
                break;
            case Animator:
                this.setAnimations((this.getAnimations() < this.getMaxAnimation())? this.getAnimations() + 1: this.getAnimations());
                break;
            case Translator:
                this.setDubs((this.getDubs() < this.getMaxDub())? this.getDubs() + 1: this.getDubs());
                break;
            case PtWriter:
                this.setPlotTwists((this.getPlotTwists() < this.getMaxpTwist())? this.getPlotTwists() + 1: this.getPlotTwists());
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
    public float getCostScript() {
        return costScript;
    }

    /**
     * @return the costSetting
     */
    public float getCostSetting() {
        return costSetting;
    }

    /**
     * @return the costAnimation
     */
    public float getCostAnimation() {
        return costAnimation;
    }

    /**
     * @return the costDub
     */
    public float getCostDub() {
        return costDub;
    }

    /**
     * @return the costPT
     */
    public float getCostPT() {
        return costPT;
    }

    /**
     * @return the costAssemble
     */
    public float getCostAssemble() {
        return costAssemble;
    }

    /**
     * @return the costPM
     */
    public float getCostPM() {
        return costPM;
    }

    /**
     * @return the costDirector
     */
    public float getCostDirector() {
        return costDirector;
    }

    /**
     * @return the profit
     */
    public float getProfit() {
        return profit;
    }

    /**
     * @param profit the profit to set
     */
    public void setProfit(float profit) {
        this.profit = profit;
    }

    /**
     * @return the netProfit
     */
    public float getNetProfit() {
        return netProfit;
    }

    /**
     * @param netProfit the netProfit to set
     */
    public void setNetProfit(float netProfit) {
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
    

    /**
     * @return the totalCosts
     */
    public float getTotalCosts() {
        return totalCosts;
    }

    /**
     * @param totalCosts the totalCosts to set
     */
    public void setTotalCosts(int totalCosts) {
        this.totalCosts = totalCosts;
    }

    /**
     * @param costScript the costScript to set
     */
    public void setCostScript(int costScript) {
        this.costScript = costScript;
    }

    /**
     * @param costSetting the costSetting to set
     */
    public void setCostSetting(int costSetting) {
        this.costSetting = costSetting;
    }

    /**
     * @param costAnimation the costAnimation to set
     */
    public void setCostAnimation(int costAnimation) {
        this.costAnimation = costAnimation;
    }

    /**
     * @param costDub the costDub to set
     */
    public void setCostDub(int costDub) {
        this.costDub = costDub;
    }

    /**
     * @param costPT the costPT to set
     */
    public void setCostPT(int costPT) {
        this.costPT = costPT;
    }

    /**
     * @param costAssemble the costAssemble to set
     */
    public void setCostAssemble(int costAssemble) {
        this.costAssemble = costAssemble;
    }

    /**
     * @param costPM the costPM to set
     */
    public void setCostPM(int costPM) {
        this.costPM = costPM;
    }

    /**
     * @param costDirector the costDirector to set
     */
    public void setCostDirector(int costDirector) {
        this.costDirector = costDirector;
    }

    
}
