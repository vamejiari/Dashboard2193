/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class Registro {
    private String id_Registro;
    private int poblacion_Pobre;
    private int no_Poss;
    private int subsidiado;
    private int contributivo;
    private int otros;
    private int total;
    private String id_UVR;
    private float calculo_UVR;
    private String mes;
    private String año;
    private String id_Hospital;
    private String id_Area;
    private String id_Variable;
    
    //-------*Constructor*-------
    public Registro(){
    }
    
    //-------*Constructor con atributos*-------
    public Registro(String id_Registro, int poblacion_Pobre, int no_Poss, int subsidiado, int contributivo, int otros, int total,
        String id_UVR,float calculo_UVR, String mes, String año, String id_Hospital, String id_Area, String id_Variable) {
        
        this.setId_Registro(id_Registro);
        this.setPoblacion_Pobre(poblacion_Pobre);
        this.setNo_Poss(no_Poss);
        this.setSubsidiado(subsidiado);
        this.setContributivo(contributivo);
        this.setOtros(otros);
        this.setTotal(total);
        this.setId_UVR(id_UVR);
        this.setCalculo_UVR(calculo_UVR);
        this.setMes(mes);
        this.setAño(año);
        this.setId_Hospital(id_Hospital);
        this.setId_Area(id_Area);
        this.setId_Variable(id_Variable);
    }
    
    //-------*Metodos Get*-------
    public String getId_Registro() {
        return id_Registro;
    }

    public int getPoblacion_Pobre() {
        return poblacion_Pobre;
    }

    public int getNo_Poss() {
        return no_Poss;
    }

    public int getSubsidiado() {
        return subsidiado;
    }

    public int getContributivo() {
        return contributivo;
    }

    public int getOtros() {
        return otros;
    }

    public int getTotal() {
        return total;
    }

    public String getId_UVR() {
        return id_UVR;
    }

    public float getCalculo_UVR() {
        return calculo_UVR;
    }

    public String getMes() {
        return mes;
    }

    public String getAño() {
        return año;
    }

    public String getId_Hospital() {
        return id_Hospital;
    }

    public String getId_Area() {
        return id_Area;
    }

    public String getId_Variable() {
        return id_Variable;
    }
    
    //-------*Metodos Set*-------
    public void setId_Registro(String id_Registro) {
        this.id_Registro = id_Registro;
    }

    public void setPoblacion_Pobre(int poblacion_Pobre) {
        this.poblacion_Pobre = poblacion_Pobre;
    }

    public void setNo_Poss(int no_Poss) {
        this.no_Poss = no_Poss;
    }

    public void setSubsidiado(int subsidiado) {
        this.subsidiado = subsidiado;
    }

    public void setContributivo(int contributivo) {
        this.contributivo = contributivo;
    }

    public void setOtros(int otros) {
        this.otros = otros;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setId_UVR(String id_UVR) {
        this.id_UVR = id_UVR;
    }

    public void setCalculo_UVR(float calculo_UVR) {
        this.calculo_UVR = calculo_UVR;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setId_Hospital(String id_Hospital) {
        this.id_Hospital = id_Hospital;
    }

    public void setId_Area(String id_Area) {
        this.id_Area = id_Area;
    }

    public void setId_Variable(String id_Variable) {
        this.id_Variable = id_Variable;
    }
    
}
