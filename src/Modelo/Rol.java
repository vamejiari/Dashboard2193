/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class Rol {
    private String id_Rol;
    private String nombre_Rol;
    
    //-------*Constructor*-------
    public Rol(){
    }
    
    //-------*Constructor con atributos*-------
    public Rol(String id_Rol, String nombre_Rol) {
        this.setId_Rol(id_Rol);
        this.setNombre_Rol(nombre_Rol);
    }
    
    //-------*Metodos Get*-------
    public String getId_Rol() {
        return id_Rol;
    }

    public String getNombre_Rol() {
        return nombre_Rol;
    }
    
    //-------*Metodos Set*-------

    public void setId_Rol(String id_Rol) {
        this.id_Rol = id_Rol;
    }

    public void setNombre_Rol(String nombre_Rol) {
        this.nombre_Rol = nombre_Rol;
    }
    
}
