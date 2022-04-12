/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class Nivel {
    private String id_Nivel;
    private String nivel_Atencion;
    
    //-------*Constructor*-------
    public Nivel(){
    }
    
    //-------*Constructor con atributos*-------
    public Nivel(String id_Nivel, String nivel_Atencion) {
        this.setId_Nivel(id_Nivel);
        this.setNivel_Atencion(nivel_Atencion);
    }
    
    //-------*Metodos Get*-------
    public String getId_Nivel() {
        return id_Nivel;
    }

    public String getNivel_Atencion() {
        return nivel_Atencion;
    }
    
    //-------*Metodos Set*-------
    public void setId_Nivel(String id_Nivel) {
        this.id_Nivel = id_Nivel;
    }

    public void setNivel_Atencion(String nivel_Atencion) {
        this.nivel_Atencion = nivel_Atencion;
    }
    
}
