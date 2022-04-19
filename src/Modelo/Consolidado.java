/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class Consolidado {
    private String id_Consolidado;
    private String id_Periodo;
    private int poblacion_Pobre;
    private int no_Poss;
    private int subsidiado;
    private int contributivo;
    private int otros;
    private int total;
    private String id_UVR;
    private float total_UVR;
    private String id_Hospital;
    private String id_Area;
    private String id_Variable;
    
    //Constructor
    public Consolidado(){
    }
    
    //Constructor con atributos
    public Consolidado(String id_Consolidado,String id_Periodo,int poblacion_Pobre,int no_Poss,int subsidiado,int contributivo,
        int otros,int total, String id_UVR, float total_UVR, String id_Hospital,String id_Area,String id_Variable){
        
        this.setId_Consolidado(id_Consolidado);
        this.setId_Periodo(id_Periodo);
        this.setPoblacion_Pobre(poblacion_Pobre);
        this.setNo_Poss(no_Poss);
        this.setSubsidiado(subsidiado);
        this.setContributivo(contributivo);
        this.setOtros(otros);
        this.setTotal(total);
        this.setId_UVR(id_UVR);
        this.setTotal_UVR(total_UVR);
        this.setId_Hospital(id_Hospital);
        this.setId_Area(id_Area);
        this.setId_Variable(id_Variable);
    }
    
    //-------*Metodos Get*-------
    public String getId_Consolidado(){
        return id_Consolidado;
    }
    
    public String getId_Periodo(){
        return id_Periodo;
    }

    public int getPoblacion_Pobre(){
        return poblacion_Pobre;
    }
    
    public int getNo_Poss(){
        return no_Poss;
    }
    
    public int getSubsidiado(){
        return subsidiado;
    }
    
    public int getContributivo(){
        return contributivo;
    }
    
    public int getOtros(){
        return otros;
    }
    
    public int getTotal(){
        return total;
    }

    public String getId_UVR() {
        return id_UVR;
    }
    
    public float getTotal_UVR(){
        return total_UVR;
    }
    
    public String getId_Hospital(){
        return id_Hospital;
    }
    
    public String getId_Area(){
        return id_Area;
    }
    
    public String getId_Variable(){
        return id_Variable;
    }
    //-------*Metodos Set*-------
    public void setId_Consolidado(String id_Consolidado){
        this.id_Consolidado=id_Consolidado;
    }
    
    public void setId_Periodo(String id_Periodo){
        this.id_Periodo=id_Periodo;
    }
    
    public void setPoblacion_Pobre(int poblacion_Pobre){
        this.poblacion_Pobre=poblacion_Pobre;
    }
    
    public void setNo_Poss(int no_Poss){
        this.no_Poss=no_Poss;
    }
    
    public void setSubsidiado(int subsidiado){
        this.subsidiado=subsidiado;
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

    public void setTotal_UVR(float total_UVR) {
        this.total_UVR = total_UVR;
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