package Controlador;
import Modelo.Conexion;
import Modelo.Consolidado;
import java.sql.*;
import java.util.*;

/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad consolidado
*/
public class ControladorConsolidado {
    private Conexion conexion=new Conexion();
    
    //Metodo para crear consolidados
    public boolean crearConsolidado(Consolidado consolidado) throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta=("INSERT INTO consolidado VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, consolidado.getId_Consolidado());
            con.setString(2, consolidado.getId_Periodo());
            con.setInt(3, consolidado.getPoblacion_Pobre());
            con.setInt(4, consolidado.getNo_Poss());
            con.setInt(5, consolidado.getSubsidiado());
            con.setInt(6, consolidado.getContributivo());
            con.setInt(7, consolidado.getOtros());
            con.setInt(8, consolidado.getTotal());
            con.setString(9, consolidado.getId_UVR());
            con.setFloat(10, consolidado.getTotal_UVR());
            con.setString(11, consolidado.getId_Hospital());
            con.setString(12, consolidado.getId_Area());
            con.setString(13, consolidado.getId_Variable());
            int cantidad=con.executeUpdate();
            agregado=(cantidad>0);
        }catch(Exception e){
            System.out.println("Existe un error que no permite crear un nuevo consolidado "+e.getMessage());
        }finally{
            cx.close();
        }
        return agregado;
    }
    
  
}
