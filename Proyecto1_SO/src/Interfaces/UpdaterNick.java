/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author HP Se encarga de actualizar los valores en las simulaciones
 */
public class UpdaterNick extends Thread{
    
    private Nickelodeon nickelodeonFrame;
    
    
    public UpdaterNick (Nickelodeon nickelodeonFrame){
        
        this.nickelodeonFrame = nickelodeonFrame;
        
        
    }
    
    
    public String transformToK(float num){
        if (Math.abs(num)< 1000){
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
            float totalC = nickelodeonFrame.getNickelodeon().getDrive().getCostAnimation() + nickelodeonFrame.getNickelodeon().getDrive().getCostAssemble() + nickelodeonFrame.getNickelodeon().getDrive().getCostDirector() + nickelodeonFrame.getNickelodeon().getDrive().getCostDub() + nickelodeonFrame.getNickelodeon().getDrive().getCostPM() + nickelodeonFrame.getNickelodeon().getDrive().getCostPT() + nickelodeonFrame.getNickelodeon().getDrive().getCostScript() + nickelodeonFrame.getNickelodeon().getDrive().getCostSetting();
            nickelodeonFrame.getTotalCosts().setText(transformToK(totalC));
            nickelodeonFrame.getTotalEarnings().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getProfit()));
            nickelodeonFrame.getUtilities().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getProfit() - totalC));
            
            //Costos Particulares
            
            nickelodeonFrame.getScriptsCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostScript()));
            nickelodeonFrame.getSettingsCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostSetting()));
            nickelodeonFrame.getAnimationsCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostAnimation()));
            nickelodeonFrame.getPlotTwistsCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostPT()));
            nickelodeonFrame.getAssembleCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostAssemble()));
            nickelodeonFrame.getDubsCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostDub()));
            nickelodeonFrame.getPMCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostPM()));
            nickelodeonFrame.getDirectorCosts().setText(transformToK(nickelodeonFrame.getNickelodeon().getDrive().getCostDirector()));
            
            //Progress Bars y cantidad de cada parte de capítulo
            
            nickelodeonFrame.getScriptProgress().setValue(nickelodeonFrame.getNickelodeon().getDrive().getScripts());
            nickelodeonFrame.getNumScripts().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getScripts()));
            
            nickelodeonFrame.getTransProgress().setValue(nickelodeonFrame.getNickelodeon().getDrive().getDubs());
            nickelodeonFrame.getNumTranslations().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getDubs()));
            
            nickelodeonFrame.getAnimationsProgress().setValue(nickelodeonFrame.getNickelodeon().getDrive().getAnimations());
            nickelodeonFrame.getNumAnimations().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getAnimations()));
            
            nickelodeonFrame.getScenesProgress().setValue(nickelodeonFrame.getNickelodeon().getDrive().getSettings());
            nickelodeonFrame.getNumScenes().setText(Integer.toString(nickelodeonFrame.getNickelodeon().getDrive().getSettings()));
            
            nickelodeonFrame.getPlottwistsProgress().setValue(nickelodeonFrame.getNickelodeon().getDrive().getPlotTwists());
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
            } else if (nickelodeonFrame.getNickelodeon().getDrive().getStatusDirector() ==1){
                
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
           
        }
    }
}
