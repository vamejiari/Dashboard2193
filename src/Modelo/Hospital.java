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
    private String id_Departamento;
    private String id_Municipio;
    //private Image logo;
    private String id_Nivel;
    
    //-------*Constructor*-------
    public Hospital(){
    }
    
    //-------*Constructor con atributos*-------
    public Hospital(String id_Hospital, String nit, String cod_Habilitacion, String nombre, String id_Departamento, 
        String id_Municipio, String id_Nivel) {
        
        this.setId_Hospital(id_Hospital);
        this.setNit(nit);
        this.setCod_Habilitacion(cod_Habilitacion);
        this.setNombre(nombre);
        this.setId_Departamento(id_Departamento);
        this.setId_Municipio(id_Municipio);
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

    public String getId_Departamento() {
        return id_Departamento;
    }

    public String getId_Municipio() {
        return id_Municipio;
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

    public void setId_Departamento(String id_departamento) {
        this.id_Departamento = id_departamento;
    }

    public void setId_Municipio(String id_Municipio) {
        this.id_Municipio = id_Municipio;
    }

    /*public void setLogo(Image logo) {
        this.logo = logo;
    }*/

    public void setId_Nivel(String id_Nivel) {
        this.id_Nivel = id_Nivel;
    }
    
}
