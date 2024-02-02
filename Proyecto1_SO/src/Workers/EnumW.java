/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Workers;

/**
 *
 * @author HP
 */
public enum EnumW {
    
    ScriptWriter(0), Designer(1), Animator(2), Translator(3), PtWriter(4), Assembler(5), ProjectManager(6), Director(7);
    
    private final int id;
    
    private EnumW(int id){
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    
}
