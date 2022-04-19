package Controlador;
import Modelo.Periodo;
import Modelo.Conexion;
import java.sql.*;
import java.util.*;
/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad periodo
*/
public class ControladorPeriodo {
    private Conexion conexion=new Conexion();
    
    //Metodo para crear Periodos
    public boolean crearPeriodo(Periodo periodo)throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta="INSERT INTO periodo VALUES (?,?,?)";
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, periodo.getId_Periodo());
            con.setString(2, periodo.getTrimestre());
            con.setString(3, periodo.getAño());
            int cantidad=con.executeUpdate();
            agregado=(cantidad>0);
        }catch(Exception e){
            System.out.println("Existe un error "+e.getMessage());
        }finally{
            cx.close();
        }
        
        return agregado;
    }
}
