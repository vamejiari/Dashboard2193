/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class UVR {
    private String id_UVR;
    private float ponderado;
    private String id_Variable;
    private String id_Nivel;
    
    //-------*Constructor*-------
    public UVR(){
    }
    
    //-------*Constructor con atributos*-------
    public UVR(String id_UVR, float ponderado, String id_Variable, String id_Nivel) {
        this.setId_UVR(id_UVR);
        this.setPonderado(ponderado);
        this.setId_Variable(id_Variable);
        this.setId_Nivel(id_Nivel);
    }
    
    //-------*Metodos Get*-------
    public String getId_UVR() {
        return id_UVR;
    }

    public float getPonderado() {
        return ponderado;
    }

    public String getId_Variable() {
        return id_Variable;
    }

    public String getId_Nivel() {
        return id_Nivel;
    }
    
    //-------*Metodos Set*-------
    public void setId_UVR(String id_UVR) {
        this.id_UVR = id_UVR;
    }

    public void setPonderado(float ponderado) {
        this.ponderado = ponderado;
    }

    public void setId_Variable(String id_Variable) {
        this.id_Variable = id_Variable;
    }

    public void setId_Nivel(String id_Nivel) {
        this.id_Nivel = id_Nivel;
    }
}
