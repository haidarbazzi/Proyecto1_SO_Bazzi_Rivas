/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

import Workers.Worker;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class List {
    
    private Nodo pFirst;
    private Nodo pLast;
    private int size;

    public List() {
        this.pFirst=null;
        this.pLast=null;
        this.size=0;
    }
    
    public boolean isEmpty(){
        return getpFirst()==null;
    }
    
    public void empty(){
        setpFirst(null);
        setpLast(null);
        setSize(0);
    }
    
    public void insert(Worker data){
        Nodo newNodo = new Nodo(data);
        if(isEmpty()){
            setpFirst(newNodo);
            setpLast(newNodo);
        }else{
            getpLast().setpNext(newNodo);
            setpLast(newNodo);
        }
        setSize(getSize()+1);
        newNodo.getData().start();
    }
    
    public boolean remove(){
        if(getSize()==1){
            JOptionPane.showMessageDialog(null, "No puede quedar vacia la lista");
            return false;
        }else if(getSize()>1){
            getpFirst().getData().fire();
            setpFirst(getpFirst().getpNext());
            setSize(getSize()-1);
            return true;
        }
        else{
            return false;
        }
    }
    
    public Nodo getNodo(int pos){
        if(pos > getSize()){
            return null;
        }else if(pos==getSize()){
            return getpLast();
        }else{
            Nodo aux = getpFirst();
            for (int i = 0; i < pos; i++) {
                aux = aux.getpNext();
            }
            return aux;
        }
    }

    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
   
    
    
}
