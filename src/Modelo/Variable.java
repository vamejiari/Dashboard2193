/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class Variable {
    private String id_Variable;
    private String nombre_Variable;
    
    //-------*Constructor*-------
    public Variable(){
    }
    
    //-------*Constructor con atributos*-------
    public Variable(String id_Variable, String nombre_Variable) {
        this.setId_Variable(id_Variable);
        this.setNombre_Variable(nombre_Variable);
    }
    
    //-------*Metodos Get*-------
    public String getId_Variable() {
        return id_Variable;
    }

    public String getNombre_Variable() {
        return nombre_Variable;
    }
    
    //-------*Metodos Set*-------

    public void setId_Variable(String id_Variable) {
        this.id_Variable = id_Variable;
    }

    public void setNombre_Variable(String nombre_Variable) {
        this.nombre_Variable = nombre_Variable;
    }
    
}
