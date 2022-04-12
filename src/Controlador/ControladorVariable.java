package Controlador;
import Modelo.Variable;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad variable
*/
public class ControladorVariable {
    private Conexion conexion=new Conexion();
    //Metodo para crear nuevas variables
    public boolean crearVariable(Variable variable) throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta=("Insert into variable values (?,?)");
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, variable.getId_Variable());
            con.setString(2, variable.getNombre_Variable());
            int cantidad=con.executeUpdate();
            agregado=(cantidad>0);
        }catch(Exception e){
            System.out.println("Existe un error que no permite crear una nueva variable "+ e.getMessage());
        }finally{
            cx.close();
        }
        return agregado;
    }
}
