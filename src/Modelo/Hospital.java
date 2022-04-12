/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Valentina Mejia
 */
public class Hospital {
    private String id_Hospital;
    private String nit;
    private String cod_Habilitacion;
    private String nombre;
    private String departamento;
    private String municipio;
    //private Image logo;
    private String id_Nivel;
    
    //-------*Constructor*-------
    public Hospital(){
    }
    
    //-------*Constructor con atributos*-------
    public Hospital(String id_Hospital, String nit, String cod_Habilitacion, String nombre, String departamento, 
        String municipio, String id_Nivel) {
        
        this.setId_Hospital(id_Hospital);
        this.setNit(nit);
        this.setCod_Habilitacion(cod_Habilitacion);
        this.setNombre(nombre);
        this.setDepartamento(departamento);
        this.setMunicipio(municipio);
        //this.setLogo(logo);
        this.setId_Nivel(id_Nivel);
    }
    
    //-------*Metodos Get*-------
    public String getId_Hospital() {
        return id_Hospital;
    }

    public String getNit() {
        return nit;
    }

    public String getCod_Habilitacion() {
        return cod_Habilitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    /*public Image getLogo() {
        return logo;
    }*/

    public String getId_Nivel() {
        return id_Nivel;
    }
    
    //-------*Metodos Set*-------
    public void setId_Hospital(String id_Hospital) {
        this.id_Hospital = id_Hospital;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setCod_Habilitacion(String cod_Habilitacion) {
        this.cod_Habilitacion = cod_Habilitacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /*public void setLogo(Image logo) {
        this.logo = logo;
    }*/

    public void setId_Nivel(String id_Nivel) {
        this.id_Nivel = id_Nivel;
    }
    
}
