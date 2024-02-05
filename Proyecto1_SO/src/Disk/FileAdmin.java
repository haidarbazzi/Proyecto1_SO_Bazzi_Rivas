package Disk;

import Company.EnumC;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HP
 */
public class FileAdmin {

    File NickelodeonFile = new File("./src/Disk/NickelodeonFile.json");
    File DisneyFile = new File("./src/Disk/DisneyFile.json");
    Gson jsonAdmin = new Gson();

    public FileAdmin() {
    }

    public JSONFile getFile(EnumC companyType) {

        try {
            File selected = null;
            switch (companyType) {
                case Nickelodeon:
                    selected = this.NickelodeonFile;
                    break;
                case DisneyChannel:
                    selected = this.DisneyFile;
                    break;
            }

            FileReader read = new FileReader(selected);
            JSONFile file = this.jsonAdmin.fromJson(read, JSONFile.class);
            read.close();
            return file;

        } catch (Exception e) {
             return null;
        }
       
    }
    public void saveFile(EnumC companyType, JSONFile save) {

        try {
            File selected = null;
            switch (companyType) {
                case Nickelodeon:
                    selected = this.NickelodeonFile;
                    break;
                case DisneyChannel:
                    selected = this.DisneyFile;
                    break;
            }

            FileWriter write = new FileWriter(selected);
            this.jsonAdmin.toJson(save, write);
            write.close();

        } catch (Exception e) {

        }
       
    }

    public class JSONFile {

        private int dayLength;
        private int daysBetweenReleases;
        private int numScriptWriters;
        private int numDesigners;
        private int numAnimators;
        private int numActors;
        private int numPlotTwisters;
        private int numAssemblers;

        public JSONFile() {
        }

        /**
         * @return the dayLength
         */
        public int getDayLength() {
            return dayLength;
        }

        /**
         * @return the daysBetweenReleases
         */
        public int getDaysBetweenReleases() {
            return daysBetweenReleases;
        }

        /**
         * @return the numScriptWriters
         */
        public int getNumScriptWriters() {
            return numScriptWriters;
        }

        /**
         * @return the numDesigners
         */
        public int getNumDesigners() {
            return numDesigners;
        }

        /**
         * @return the numAnimators
         */
        public int getNumAnimators() {
            return numAnimators;
        }

        /**
         * @return the numActors
         */
        public int getNumActors() {
            return numActors;
        }

        /**
         * @return the numPlotTwisters
         */
        public int getNumPlotTwisters() {
            return numPlotTwisters;
        }

        /**
         * @return the numAssemblers
         */
        public int getNumAssemblers() {
            return numAssemblers;
        }

        /**
         * @param dayLength the dayLength to set
         */
        public void setDayLength(int dayLength) {
            this.dayLength = dayLength;
        }

        /**
         * @param daysBetweenReleases the daysBetweenReleases to set
         */
        public void setDaysBetweenReleases(int daysBetweenReleases) {
            this.daysBetweenReleases = daysBetweenReleases;
        }

        /**
         * @param numScriptWriters the numScriptWriters to set
         */
        public void setNumScriptWriters(int numScriptWriters) {
            this.numScriptWriters = numScriptWriters;
        }

        /**
         * @param numDesigners the numDesigners to set
         */
        public void setNumDesigners(int numDesigners) {
            this.numDesigners = numDesigners;
        }

        /**
         * @param numAnimators the numAnimators to set
         */
        public void setNumAnimators(int numAnimators) {
            this.numAnimators = numAnimators;
        }

        /**
         * @param numActors the numActors to set
         */
        public void setNumActors(int numActors) {
            this.numActors = numActors;
        }

        /**
         * @param numPlotTwisters the numPlotTwisters to set
         */
        public void setNumPlotTwisters(int numPlotTwisters) {
            this.numPlotTwisters = numPlotTwisters;
        }

        /**
         * @param numAssemblers the numAssemblers to set
         */
        public void setNumAssemblers(int numAssemblers) {
            this.numAssemblers = numAssemblers;
        }

    }

}
