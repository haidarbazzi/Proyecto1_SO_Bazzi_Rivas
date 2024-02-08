/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Company.Company;
import Company.EnumC;
import Main.Global;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author HP
 */
public class Chart {
    
    
    //Atributos que guardarán cada compañía
    
    Company disney;
    Company nickelodeon;
    //Series de cada compañía
    
    XYSeries nickelodeonS = new XYSeries("Nickelodeon");
    XYSeries disneyS = new XYSeries("Disney");
    
    //Colección de datos de cada serie
    
    XYSeriesCollection nickData = new XYSeriesCollection(nickelodeonS);
    XYSeriesCollection disneyData = new XYSeriesCollection(disneyS);
    XYSeriesCollection nickDisneyData = new XYSeriesCollection();
    
    //Charts
    
    JFreeChart disneyChart = ChartFactory.createXYLineChart("Utilidad en el tiempo", "Días", "Utilidad", disneyData, PlotOrientation.VERTICAL, true, true, false);
    JFreeChart nickChart = ChartFactory.createXYLineChart("Utilidad en el tiempo", "Días", "Utilidad", nickData, PlotOrientation.VERTICAL, true, true, false);
    JFreeChart nickDisneyChart = ChartFactory.createXYLineChart("Utilidad en el tiempo", "Días", "Utilidad", nickDisneyData, PlotOrientation.VERTICAL, true, true, false);
    
    //Paneles
    
    JPanel nickPanel = new ChartPanel(nickChart);
    JPanel disneyPanel = new ChartPanel(disneyChart);
    JPanel nickDisneyPanel = new ChartPanel(nickDisneyChart);
    
    // Días (tiempo de la gráfica)
    
    int days = 0;
    
    // Constructor
    
    public Chart(Company nick, int chosenComp, Company disney){
        
        JFrame frame = new JFrame();
        
        switch (chosenComp) {
            case 0 ->                 {
                    this.nickelodeon = nick;
                    Timer timer = new Timer(Math.round(Global.getDayLengthN()), (ActionEvent e) -> {
                        float totalC = nickelodeon.getDrive().getCostAnimation() + nickelodeon.getDrive().getCostAssemble() + nickelodeon.getDrive().getCostScript() + nickelodeon.getDrive().getCostSetting();
                        days++;
                       
                        nickelodeonS.addOrUpdate(days, Math.round(nickelodeon.getDrive().getProfit() - totalC));
                    });     
                    frame.add(nickPanel, BorderLayout.CENTER);
                    timer.start();
                }
            case 1 ->                 {
                    this.disney = disney;
                    Timer timer = new Timer(Math.round(Global.getDayLengthD()), (ActionEvent e) -> {
                        float totalC = disney.getDrive().getCostAnimation() + disney.getDrive().getCostAssemble() + disney.getDrive().getCostScript() + disney.getDrive().getCostSetting();
                        System.out.println(days + "ACAAAAAAA");
                        days++;
                        disneyS.addOrUpdate(days, Math.round(disney.getDrive().getProfit() - totalC));
                    });   
                    frame.add(disneyPanel, BorderLayout.CENTER);
                    timer.start();
                }
            default ->                 {
                    
                    
                    this.nickelodeon = nick;
                    this.disney = disney;
                    nickDisneyData.addSeries(nickelodeonS);
                    nickDisneyData.addSeries(disneyS);
                    Timer timer = new Timer(Math.round((Global.getDayLengthN() + Global.getDayLengthD())/2 ), (ActionEvent e) -> {
                        days++;
                        
                        float totalCnick = nickelodeon.getDrive().getCostAnimation() + nickelodeon.getDrive().getCostAssemble() + nickelodeon.getDrive().getCostScript() + nickelodeon.getDrive().getCostSetting();
                        nickelodeonS.addOrUpdate(days, Math.round(nickelodeon.getDrive().getProfit() - totalCnick));
                        
                        float totalCdisney = disney.getDrive().getCostAnimation() + disney.getDrive().getCostAssemble() + disney.getDrive().getCostScript() + disney.getDrive().getCostSetting();
                        disneyS.addOrUpdate(days, Math.round(disney.getDrive().getProfit() - totalCdisney));
                    });     frame.add(nickDisneyPanel, BorderLayout.CENTER);
                    timer.start();
                }
        }

        frame.setDefaultCloseOperation(frame.HIDE_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
    
}
