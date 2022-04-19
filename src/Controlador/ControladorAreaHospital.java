package Controlador;
import Modelo.Conexion;
import Modelo.Area_Hospital;
import java.sql.*;
import java.util.ArrayList;
/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad Area Hospital
*/
public class ControladorAreaHospital {
    private Conexion conexion=new Conexion();
    //Metodo para asignar y crear las areas del hospital
    public boolean crearAreaHospital(Area_Hospital areaHospital)throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta=("INSERT INTO area_hospital VALUES (?,?,?)");
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, areaHospital.getId_Hospital());
            con.setString(2, areaHospital.getId_Area());
            con.setString(3, areaHospital.getId_Usuario());
            int cantidad=con.executeUpdate();
            agregado=(cantidad>0);
        }catch(Exception e){
            System.out.println("Existe un error que no permite adicionar un area al hospital "+e.getMessage());
        }finally{
            cx.close();
        }
        
        return agregado;
    }
  }
