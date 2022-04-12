package Controlador;
import Modelo.Meta_Variable;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad meta variable
*/
public class ControladorMetaVariable {
    private Conexion conexion=new Conexion();
    //Metodo para crear las metas de las variables
    public boolean crearMetaVariable(Meta_Variable metaVariable) throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta=("insert into meta_variable values(?,?,?,?,?,?)");
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, metaVariable.getId_Meta());
            con.setString(2, metaVariable.getId_Variable());
            con.setString(3, metaVariable.getId_Area());
            con.setString(4, metaVariable.getId_Hospital());
            con.setInt(5, metaVariable.getValor_Meta());
            con.setString(6, metaVariable.getAño());
            int cantidad=con.executeUpdate();
            agregado=(cantidad>0);
        }catch(Exception e){
            System.out.println("Existe un error que no permite crear una nueva variable "+e.getMessage());
        }finally{
            cx.close();
        }
        return agregado;
    }
}
