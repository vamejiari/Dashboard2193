package Modelo;

public class Municipio {
    private String id_Municipio;
    private String nombre_Municipio;
    private String id_Departamento;

    public Municipio() {
        
    }

    public Municipio(String id_Municipio, String nombre_Municipio, String id_Departamento) {
        this.setId_Municipio(id_Municipio);
        this.setNombre_Municipio(nombre_Municipio);
        this.setId_Departamento(id_Departamento);
    }

    //-------*Metodos Get*------
    public String getId_Municipio() {
        return id_Municipio;
    }

    public String getNombre_Municipio() {
        return nombre_Municipio;
    }

    public String getId_Departamento() {
        return id_Departamento;
    }
    
    //-------*Metodos Set*------
    public void setId_Municipio(String id_Municipio) {
        this.id_Municipio = id_Municipio;
    }

    public void setNombre_Municipio(String nombre_Municipio) {
        this.nombre_Municipio = nombre_Municipio;
    }

    public void setId_Departamento(String id_Departamento) {
        this.id_Departamento = id_Departamento;
    }
    
}
