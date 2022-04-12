package Controlador;
import Modelo.Conexion;
import Modelo.Registro;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad registro
*/
public class ControladorRegistro {
    private Conexion conexion=new Conexion();
    //Metodo para crear nuevos registros
    public boolean crearRegistro(Registro registro) throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta=("Insert into registro values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, registro.getId_Registro());
            con.setInt(2, registro.getPoblacion_Pobre());
            con.setInt(3, registro.getNo_Poss());
            con.setInt(4, registro.getSubsidiado());
            con.setInt(5, registro.getContributivo());
            con.setInt(6, registro.getOtros());
            con.setInt(7, registro.getTotal());
            con.setFloat(8, registro.getCalculo_UVR());
            con.setString(9, registro.getAño());
            con.setString(10, registro.getMes());
            con.setString(11, registro.getId_Hospital());
            con.setString(12, registro.getId_Area());
            con.setString(13, registro.getId_Variable());
            int cantidad=con.executeUpdate();
            agregado=(cantidad>0);
        }catch(Exception e){
            System.out.println("Existe un error que no permite crear un nuevo registro "+e.getMessage());
        }finally{
            cx.close();
        }
        
        return agregado;
    }
}
