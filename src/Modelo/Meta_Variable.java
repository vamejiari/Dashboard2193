/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class Meta_Variable {
    private String id_Meta;
    private String id_Variable;
    private String id_Area;
    private String id_Hospital;
    private int valor_Meta;
    private String año;
    
    //-------*Constructor*-------
    public Meta_Variable() {
    }
    
    //-------*Constructor con atributos*-------
    public Meta_Variable(String id_Meta, String id_Variable, String id_Area, String id_Hospital, int valor_Meta, String año) {
        this.setId_Meta(id_Meta);
        this.setId_Variable(id_Variable);
        this.setId_Area(id_Area);
        this.setId_Hospital(id_Hospital);
        this.setValor_Meta(valor_Meta);
        this.setAño(año);
    }
    
    //-------*Metodos Get*-------
    public String getId_Meta(){
        return id_Meta;
    }
    
    public String getId_Variable() {
        return id_Variable;
    }

    public String getId_Area() {
        return id_Area;
    }

    public String getId_Hospital() {
        return id_Hospital;
    }

    public int getValor_Meta() {
        return valor_Meta;
    }

    public String getAño() {
        return año;
    }
    
    //-------*Metodos Set*-------
    public void setId_Meta(String id_Meta){
        this.id_Meta=id_Meta;
    }
    
    public void setId_Variable(String id_Variable) {
        this.id_Variable = id_Variable;
    }

    public void setId_Area(String id_Area) {
        this.id_Area = id_Area;
    }

    public void setId_Hospital(String id_Hospital) {
        this.id_Hospital = id_Hospital;
    }

    public void setValor_Meta(int valor_Meta) {
        this.valor_Meta = valor_Meta;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
}
