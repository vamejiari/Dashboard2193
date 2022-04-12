/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class Variable_Hospital {
    private String id_Hospital;
    private String id_area;
    private String id_Variable;
    
    //-------*Constructor*-------
    public Variable_Hospital(){
    }
    
    //-------*Constructor con atributos*-------

    public Variable_Hospital(String id_Hospital, String id_area, String id_Variable) {
        this.setId_Hospital(id_Hospital);
        this.setId_area(id_area);
        this.setId_Variable(id_Variable);
    }
    
    //-------*Metodos Get*-------
    public String getId_Hospital() {
        return id_Hospital;
    }

    public String getId_Area() {
        return id_area;
    }

    public String getId_Variable() {
        return id_Variable;
    }
    
    //-------*Metodos Set*-------
    public void setId_Hospital(String id_Hospital) {
        this.id_Hospital = id_Hospital;
    }

    public void setId_area(String id_area) {
        this.id_area = id_area;
    }

    public void setId_Variable(String id_Variable) {
        this.id_Variable = id_Variable;
    }
    
}
