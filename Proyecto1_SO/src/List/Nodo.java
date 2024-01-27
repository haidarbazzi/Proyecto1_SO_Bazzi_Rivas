/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

import Workers.Worker;

/**
 *
 * @author andre
 */
public class Nodo {
    
    private Worker data;
    private Nodo pNext;

    public Nodo(Worker data) {
        this.data = data;
        this.pNext = null;
    }

    /**
     * @return the data
     */
    public Worker getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Worker data) {
        this.data = data;
    }

    /**
     * @return the pNext
     */
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
    
    
    
    
        
    
}
