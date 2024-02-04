/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author HP Se encarga de actualizar los valores en las simulaciones
 */
public class Updater extends Thread{
    
    private Nickelodeon nickelodeonFrame;
    private Disney disneyFrame;
    
    public Updater (Nickelodeon nickelodeonFrame){
        
        this.nickelodeonFrame = nickelodeonFrame;
        this.disneyFrame = null;
        
    }
    
    public String transformToK(float num){
        if (num < 1000){
            return Float.toString(num);
        } else {
            String toReturn = Float.toString(num/1000) + "K";
            return toReturn;
        }
    }
    @Override
    public void run (){
        while (true){
            
            //NICKELODEON:
            
            //Estadisticas generales
            nickelodeonFrame.getTotalCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getTotalCosts()));
            nickelodeonFrame.getTotalEarnings().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getProfit()));
            nickelodeonFrame.getUtilities().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getNetProfit()));
            
            //Costos Particulares
            
            nickelodeonFrame.getScriptsCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostScript()));
            nickelodeonFrame.getSettingsCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostSetting()));
            nickelodeonFrame.getAnimationsCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostAnimation()));
            nickelodeonFrame.getPlotTwistsCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostPT()));
            nickelodeonFrame.getAssembleCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostAssemble()));
            nickelodeonFrame.getDubsCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostDub()));
            
            //Progress Bars y cantidad de cada parte de capítulo
            
            nickelodeonFrame.getScriptProgress().setValue(nickelodeonFrame.getNickelodeon().getDrive().getScripts());
            nickelodeonFrame.getNumScripts().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getScripts()));
            
            nickelodeonFrame.getTransProgress().setValue(nickelodeonFrame.getNickelodeon().getDrive().getDubs());
            nickelodeonFrame.getNumTranslations().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getDubs()));
            
            nickelodeonFrame.getAnimationsProgress().setValue(nickelodeonFrame.getNickelodeon().getDrive().getAnimations());
            nickelodeonFrame.getNumAnimations().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getAnimations()));
            
            nickelodeonFrame.getScenesProgress().setValue(nickelodeonFrame.getNickelodeon().getDrive().getSettings());
            nickelodeonFrame.getNumScenes().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getSettings()));
            
            nickelodeonFrame.getPlottwistsProgress().setValue(nickelodeonFrame.getNickelodeon().getDrive().getScripts());
            nickelodeonFrame.getNumPlotTwists().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getPlotTwists()));
            
            //Status del Pm
            
            if(nickelodeonFrame.getNickelodeon().getDrive().getStatusPM() ==1){
                nickelodeonFrame.getStatusPM().setText("Viendo Anime");
            } else if (nickelodeonFrame.getNickelodeon().getDrive().getStatusPM() ==0) {
                nickelodeonFrame.getStatusPM().setText("Trabajando");
            }
            
            //Status del director
            
            if(nickelodeonFrame.getNickelodeon().getDrive().getStatusDirector() == 0){
                nickelodeonFrame.getStatusDirector().setText("Trabajando");
            } else if (nickelodeonFrame.getNickelodeon().getDrive().getStatusPM() ==1){
                
                nickelodeonFrame.getStatusDirector().setText("Vigilando al PM");
            }
            
            //Numero de faltas y salario descontado
            
            nickelodeonFrame.getNumFaults4().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getFaults()));
            nickelodeonFrame.getSalaryDiscount().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getFaults()*100));
            
            //Cantidad de capítulos producidos
            
            nickelodeonFrame.getNumRegEps().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getRegEps()));
            nickelodeonFrame.getNumPtEps().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getPtEps()));
            
            //Dias para la entrega
            nickelodeonFrame.getDaysCountdown().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getDaysCountdown()));
            
            //DISNEY CHANNEL:
            
            //Estadisticas generales
//            disneyFrame.getTotalCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getTotalCosts()));
//            disneyFrame.getTotalEarnings().setText(transformToK(disneyFrame.getDisney().getDrive().getProfit()));
//            disneyFrame.getUtilities().setText(transformToK(disneyFrame.getDisney().getDrive().getNetProfit()));
//            
//            //Costos Particulares
//            
//            disneyFrame.getScriptsCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getCostScript()));
//            disneyFrame.getPlotTwistCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getCostPT()));
//            disneyFrame.getAnimationsCost().setText(transformToK(disneyFrame.getDisney().getDrive().getCostAnimation()));
//            disneyFrame.getPlotTwistCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getCostPT()));
//            disneyFrame.getAssembleCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getCostAssemble()));
//            disneyFrame.getDubsCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getCostDub()));
//            
//            //Progress Bars y cantidad de cada parte de capítulo
//            
//            disneyFrame.getScriptProgress().setValue(disneyFrame.getDisney().getDrive().getScripts());
//            disneyFrame.getNumScripts().setText(Integer.toString(disneyFrame.getDisney().getDrive().getScripts()));
//            
//            disneyFrame.getTransProgress().setValue(disneyFrame.getDisney().getDrive().getDubs());
//            disneyFrame.getNumTranslations().setText(Integer.toString(disneyFrame.getDisney().getDrive().getDubs()));
//            
//            disneyFrame.getAnimationsProgress().setValue(disneyFrame.getDisney().getDrive().getAnimations());
//            disneyFrame.getNumAnimations().setText(Integer.toString(disneyFrame.getDisney().getDrive().getAnimations()));
//            
//            disneyFrame.getScenesProgress().setValue(disneyFrame.getDisney().getDrive().getSettings());
//            disneyFrame.getNumScenes().setText(Integer.toString(disneyFrame.getDisney().getDrive().getSettings()));
//            
//            disneyFrame.getPlottwistsProgress().setValue(disneyFrame.getDisney().getDrive().getScripts());
//            disneyFrame.getNumPlotTwists().setText(Integer.toString(disneyFrame.getDisney().getDrive().getPlotTwists()));
//            
//            //Status del Pm
//            
//            if(disneyFrame.getDisney().getDrive().getStatusPM() ==1){
//                disneyFrame.getStatusPM().setText("Trabajando");
//            } else if (disneyFrame.getDisney().getDrive().getStatusPM() ==0) {
//                disneyFrame.getStatusPM().setText("Viendo anime");
//            }
//            
//            //Status del director
//            
//            if(disneyFrame.getDisney().getDrive().getStatusDirector() == 0){
//                disneyFrame.getStatusDirector().setText("Trabajando");
//            } else if (disneyFrame.getDisney().getDrive().getStatusPM() ==1){
//                disneyFrame.getStatusDirector().setText("Vigilando al PM");
//            }
//            
//            //Numero de faltas y salario descontado
//            
//            disneyFrame.getNumFaults().setText(Integer.toString(disneyFrame.getDisney().getDrive().getFaults()));
//            disneyFrame.getSalaryDiscount().setText(Integer.toString(disneyFrame.getDisney().getDrive().getFaults()*100));
//            
//            //Cantidad de capítulos producidos
//            
//            disneyFrame.getNumRegEps().setText(transformToK(disneyFrame.getDisney().getDrive().getRegEps()));
//            disneyFrame.getNumPtEps().setText(transformToK(disneyFrame.getDisney().getDrive().getPtEps()));
        }
    }
}
