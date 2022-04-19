package Modelo;

public class Departamento {
    private String id_Departamento;
    private String nombre_Departamento;

    public Departamento() {
        
    }

    public Departamento(String id_Departamento, String nombre_Departamento) {
        this.setId_Departamento(id_Departamento);
        this.setNombre_Departamento(nombre_Departamento);
    }
    
    //-------*Metodos Get*------

    public String getId_Departamento() {
        return id_Departamento;
    }

    public String getNombre_Departamento() {
        return nombre_Departamento;
    }
    
    //-------*Metodos Set*------
    public void setId_Departamento(String id_Departamento) {
        this.id_Departamento = id_Departamento;
    }

    public void setNombre_Departamento(String nombre_Departamento) {
        this.nombre_Departamento = nombre_Departamento;
    }
    
}
