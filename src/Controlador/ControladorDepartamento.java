package Controlador;
import Modelo.Departamento;
import Modelo.Conexion;
import java.sql.*;
import java.util.*;
/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad Departamento
*/
public class ControladorDepartamento {
    private Conexion conexion=new Conexion();
    
    //Metodo para crear Departamento
    public boolean crearDepartamento(Departamento departamento)throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta="INSERT INTO departamento VALUES (?,?)";
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, departamento.getId_Departamento());
            con.setString(2, departamento.getNombre_Departamento());
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
