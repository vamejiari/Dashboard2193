package Controlador;
import Modelo.UVR;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad UVR
*/
public class ControladorUVR {
    private Conexion conexion=new Conexion();
    //Metodo para crear UVR de cada variable
    public boolean crearUVR(UVR uvr) throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta=("insert into uvr values (?,?,?,?)");
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, uvr.getId_UVR());
            con.setFloat(2, uvr.getPonderado());
            con.setString(3, uvr.getId_Variable());
            con.setString(4, uvr.getId_Nivel());
            int cantidad=con.executeUpdate();
            agregado=(cantidad>0);
        }catch(Exception e){
            System.out.println("Existe un error que no permite crear una nueva UVR "+e.getMessage());
        }finally{
            cx.close();
        }
        
        return agregado;
    }
}
