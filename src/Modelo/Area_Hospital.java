/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class Area_Hospital {
    private String id_Hospital;
    private String id_Area;
    private String id_Usuario;
    
    //Constructor
    public Area_Hospital(){
    }
    
    //Constructor con parametros
    public Area_Hospital(String id_Hospital, String id_Area, String id_Usuario){
        
    }
    
    //-------*Metodos Get*-------
    public String getId_Hospital(){
        return id_Hospital;
    }
    
    public String getId_Area(){
        return id_Area;
    }
    
    public String getId_Usuario(){
        return id_Usuario;
    }
    
    //-------*Metodos Set*_______
    public void setId_Hospital(String id_Hospital){
        this.id_Hospital=id_Hospital;
    }
    
    public void setId_Area(String id_Area){
        this.id_Area=id_Area;
    }
    
    public void setId_Usuario(String id_Usuario){
        this.id_Usuario=id_Usuario;
    }
}
