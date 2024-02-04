/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Interfaces.MainWindow;

/**
 *
 * @author andre
 */
public class Proyecto1_SO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainWindow main = new MainWindow();
        Global global = new Global(main);
        main.setVisible(true);
    }
    
}
