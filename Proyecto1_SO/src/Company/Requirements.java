/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Company;

/**
 *
 * @author andre
 */
public class Requirements {
    
    private int dayLength=500;
    private int daysBetweenReleases=10;
    
    //Enum identificador de la empresa
    private EnumC identifier;
    
    //Cantidad de partes necesitadas por capítulo
    private int scriptsNeed;
    private int settingsNeed;
    private int animationsNeed;
    private int translationsNeed;
    
    //Capítulos con PlotTwist
    private int plotTwistsNeed;
    private int capsBetweenPt; //Capítulos entre plotTwists
    
    
    //Ganancias por tipo de capítulo
    private int earningsReg; //Regular
    private int earningsPt; //Con PlotTwist
    
    public Requirements(EnumC identifier){
        this.identifier = identifier;
        switch (identifier){
            
            case Nickelodeon -> {
                scriptsNeed = 2;
                settingsNeed = 1;
                animationsNeed = 4;
                translationsNeed = 4;
                plotTwistsNeed = 2;
                earningsReg = 450000;
                earningsPt = 500000;
                capsBetweenPt = 5;
            }
                
            case DisneyChannel -> {
                scriptsNeed = 1;
                settingsNeed = 1;
                animationsNeed = 2;
                translationsNeed = 4;
                plotTwistsNeed = 3;
                earningsReg = 250000;
                earningsPt = 600000;
                capsBetweenPt = 2;
            }
            
            
        }
    }
    
     public boolean checkForReg(int scriptsAv, int settAv, int aniAv, int transAv ){
    
        return scriptsAv >= this.getScriptsNeed() && settAv >= this.getScenesNeed() && aniAv >= this.getAnimationsNeed() && transAv >= this.getTranslationsNeed();
    
    }
    public boolean checkForPT(int scriptsAv, int settAv, int aniAv, int transAv, int ptAv ){
    
        return scriptsAv >= this.getScriptsNeed() && settAv >= this.getScenesNeed() && aniAv >= this.getAnimationsNeed() && transAv >= this.getTranslationsNeed()&& ptAv >= this.getPlotTwistsNeed();
    
    }

    /**
     * @return the identifier
     */
    public EnumC getIdentifier() {
        return identifier;
    }

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(EnumC identifier) {
        this.identifier = identifier;
    }

    /**
     * @return the scriptsNeed
     */
    public int getScriptsNeed() {
        return scriptsNeed;
    }

    /**
     * @param scriptsNeed the scriptsNeed to set
     */
    public void setScriptsNeed(int scriptsNeed) {
        this.scriptsNeed = scriptsNeed;
    }

    /**
     * @return the settingsNeed
     */
    public int getScenesNeed() {
        return settingsNeed;
    }

    /**
     * @param settingsNeed the settingsNeed to set
     */
    public void setScenesNeed(int settingsNeed) {
        this.settingsNeed = settingsNeed;
    }

    /**
     * @return the animationsNeed
     */
    public int getAnimationsNeed() {
        return animationsNeed;
    }

    /**
     * @param animationsNeed the animationsNeed to set
     */
    public void setAnimationsNeed(int animationsNeed) {
        this.animationsNeed = animationsNeed;
    }

    /**
     * @return the translationsNeed
     */
    public int getTranslationsNeed() {
        return translationsNeed;
    }

    /**
     * @param translationsNeed the translationsNeed to set
     */
    public void setTranslationsNeed(int translationsNeed) {
        this.translationsNeed = translationsNeed;
    }

    /**
     * @return the plotTwistsNeed
     */
    public int getPlotTwistsNeed() {
        return plotTwistsNeed;
    }

    /**
     * @param plotTwistsNeed the plotTwistsNeed to set
     */
    public void setPlotTwistsNeed(int plotTwistsNeed) {
        this.plotTwistsNeed = plotTwistsNeed;
    }

    /**
     * @return the capsBetweenPt
     */
    public int getCapsBetweenPt() {
        return capsBetweenPt;
    }

    /**
     * @param capsBetweenPt the capsBetweenPt to set
     */
    public void setCapsBetweenPt(int capsBetweenPt) {
        this.capsBetweenPt = capsBetweenPt;
    }

    /**
     * @return the earningsReg
     */
    public int getEarningsReg() {
        return earningsReg;
    }

    /**
     * @param earningsReg the earningsReg to set
     */
    public void setEarningsReg(int earningsReg) {
        this.earningsReg = earningsReg;
    }

    /**
     * @return the earningsPt
     */
    public int getEarningsPt() {
        return earningsPt;
    }

    /**
     * @param earningsPt the earningsPt to set
     */
    public void setEarningsPt(int earningsPt) {
        this.earningsPt = earningsPt;
    }

    /**
     * @return the dayLength
     */
    public int getDayLength() {
        return dayLength;
    }

    /**
     * @return the daysBetweenRealeses
     */
    public int getDaysBetweenReleases() {
        return daysBetweenReleases;
    }

    /**
     * @param daysBetweenRealeses the daysBetweenRealeses to set
     */
    public void setDaysBetweenReleases(int daysBetweenRealeses) {
        this.daysBetweenReleases = daysBetweenRealeses;
    }

    /**
     * @param dayLength the dayLength to set
     */
    public void setDayLength(int dayLength) {
        this.dayLength = dayLength;
    }
    
    
    
}
