/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author HP Se encarga de actualizar los valores en las simulaciones
 */
public class UpdaterDisney extends Thread{
    
   
    private Disney disneyFrame;
    
    public UpdaterDisney (Disney disneyFrame){
        
        this.disneyFrame = disneyFrame;
        
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
           
            
            //DISNEY CHANNEL:
            
            //Estadisticas generales
            disneyFrame.getTotalCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getTotalCosts()));
            disneyFrame.getTotalEarnings().setText(transformToK(disneyFrame.getDisney().getDrive().getProfit()));
            disneyFrame.getUtilities().setText(transformToK(disneyFrame.getDisney().getDrive().getNetProfit()));
            
            //Costos Particulares
            
            disneyFrame.getScriptsCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getCostScript()));
            disneyFrame.getSettingsCost().setText(transformToK(disneyFrame.getDisney().getDrive().getCostSetting()));
            disneyFrame.getAnimationsCost().setText(transformToK(disneyFrame.getDisney().getDrive().getCostAnimation()));
            disneyFrame.getPlotTwistCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getCostPT()));
            disneyFrame.getAssembleCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getCostAssemble()));
            disneyFrame.getDubsCosts().setText(transformToK(disneyFrame.getDisney().getDrive().getCostDub()));
            
            //Progress Bars y cantidad de cada parte de capítulo
            
            disneyFrame.getScriptProgress().setValue(disneyFrame.getDisney().getDrive().getScripts());
            disneyFrame.getNumScripts().setText(Integer.toString(disneyFrame.getDisney().getDrive().getScripts()));
            
            disneyFrame.getTransProgress().setValue(disneyFrame.getDisney().getDrive().getDubs());
            disneyFrame.getNumTranslations().setText(Integer.toString(disneyFrame.getDisney().getDrive().getDubs()));
            
            disneyFrame.getAnimationsProgress().setValue(disneyFrame.getDisney().getDrive().getAnimations());
            disneyFrame.getNumAnimations().setText(Integer.toString(disneyFrame.getDisney().getDrive().getAnimations()));
            
            disneyFrame.getScenesProgress().setValue(disneyFrame.getDisney().getDrive().getSettings());
            disneyFrame.getNumScenes().setText(Integer.toString(disneyFrame.getDisney().getDrive().getSettings()));
            
            disneyFrame.getPlottwistsProgress().setValue(disneyFrame.getDisney().getDrive().getPlotTwists());
            disneyFrame.getNumPlotTwists().setText(Integer.toString(disneyFrame.getDisney().getDrive().getPlotTwists()));
            
            //Status del Pm
            
            if(disneyFrame.getDisney().getDrive().getStatusPM() ==1){
                disneyFrame.getStatusPM().setText("Trabajando");
            } else if (disneyFrame.getDisney().getDrive().getStatusPM() ==0) {
                disneyFrame.getStatusPM().setText("Viendo anime");
            }
            
            //Status del director
            
            if(disneyFrame.getDisney().getDrive().getStatusDirector() == 0){
                disneyFrame.getStatusDirector().setText("Trabajando");
            } else if (disneyFrame.getDisney().getDrive().getStatusDirector() ==1){
                disneyFrame.getStatusDirector().setText("Vigilando al PM");
            }
            
            //Numero de faltas y salario descontado
            
            disneyFrame.getNumFaults().setText(Integer.toString(disneyFrame.getDisney().getDrive().getFaults()));
            disneyFrame.getSalaryDiscount().setText(Integer.toString(disneyFrame.getDisney().getDrive().getFaults()*100));
            
            //Cantidad de capítulos producidos
            
            disneyFrame.getNumRegEps().setText(transformToK(disneyFrame.getDisney().getDrive().getRegEps()));
            disneyFrame.getNumPtEps().setText(transformToK(disneyFrame.getDisney().getDrive().getPtEps()));
             //Dias para la entrega
            disneyFrame.getDaysCountdown().setText(transformToK(disneyFrame.getDisney().getDrive().getDaysCountdown()));
        }
    }
}
