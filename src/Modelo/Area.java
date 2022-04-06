/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class Area {
    private String id_Area;
    private String nombre_Area;
    
    //Constructor
    public Area(){
    }
    
    //Constructor con parametros
    public Area(String id_Area, String nombre_Area) {
        this.setId_Area(id_Area);
        this.setNombre_Area(nombre_Area);
    }
    
    //-------*Metodos get*-------
    public String getId_Area() {
        return id_Area;
    }

    public String getNombre_Area() {
        return nombre_Area;
    }

    //-------*Metodos set*-------
    public void setId_Area(String id_Area) {
        this.id_Area = id_Area;
    }

    public void setNombre_Area(String nombre_Area) {
        this.nombre_Area = nombre_Area;
    }
    
}
