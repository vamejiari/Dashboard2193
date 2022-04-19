package Controlador;
import Modelo.Municipio;
import Modelo.Conexion;
import java.sql.*;
import java.util.*;
/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad municipio
*/
public class ControladorMunicipio {
    private Conexion conexion=new Conexion();
    
    //Metodo para crear municipios
    public boolean crearMunicipio(Municipio municipio) throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta="INSERT INTO municipio VALUES (?,?,?)";
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, municipio.getId_Municipio());
            con.setString(2, municipio.getNombre_Municipio());
            con.setString(3, municipio.getId_Departamento());
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
