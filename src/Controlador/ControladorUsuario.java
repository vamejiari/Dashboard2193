package Controlador;
import Modelo.Usuario;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad Usuario
*/
public class ControladorUsuario {
    private Conexion conexion=new Conexion();
    //Metodo para crear nuevos usuarios
    public boolean crearUsuario(Usuario usuario) throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta=("insert into usuario values (?,?,?,?,?,?,?)");
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, usuario.getId_Usuario());
            con.setString(2, usuario.getNombre());
            con.setString(3, usuario.getApellidos());
            con.setString(4, usuario.getUsuario());
            con.setString(5, usuario.getContraseña());
            con.setString(6, usuario.getId_Hospital());
            con.setString(7, usuario.getId_Rol());
            int cantidad=con.executeUpdate();
            agregado=(cantidad>0);
        }catch (Exception e){
            System.out.println("Existe un error que no permite crear un nuevo usuario"+e.getMessage());
        }finally{
            cx.close();
        }
        return agregado;
    }
}
