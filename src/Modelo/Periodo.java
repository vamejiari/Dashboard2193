package Modelo;

public class Periodo {
    private String id_Periodo;
    private String trimestre;
    private String año;

    public Periodo() {
    }

    public Periodo(String id_Periodo, String trimestre, String año) {
        this.id_Periodo = id_Periodo;
        this.trimestre = trimestre;
        this.año = año;
    }
    
    //-------*Metodos Get*-------
    public String getId_Periodo() {
        return id_Periodo;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public String getAño() {
        return año;
    }
    
    //-------*Metodos Set*-------
    public void setId_Periodo(String id_Periodo) {
        this.id_Periodo = id_Periodo;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
}
