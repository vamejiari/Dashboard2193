package Controlador;
import Modelo.Area; //Instancia de la clase Area
import Modelo.Conexion; //Instancia de la clase de conexion
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad area
*/
public class ControladorArea {
    private Conexion conexion=new Conexion(); //Variable de tipo conexion 
    
   //Metodo para crear Areas
    public boolean crearArea(Area area) throws SQLException{
        boolean agregado=false; //Bandera de control y entrega
        Connection cx=conexion.conectar(); //Entrega y guarda la conexion a la base de datos
        try {
            String consulta="insert into area values(?,?)"; //Consulta SQL
            PreparedStatement con=cx.prepareStatement(consulta); //Objeto que se encarga de dirigir la consulta hacia la base de datos
            con.setString(1, area.getId_Area());
            con.setString(2, area.getNombre_Area());
            int cantidad=con.executeUpdate(); //Ejecuta la consulta a la base de datos y adicional retorna la cantidad de datos cargados
            agregado=(cantidad>0); //Si la linea anterior se ejecuto de manera correcta se compara si es mayor a cero la variable y cambia el valor a TRUE
        } catch (Exception e) {
            System.out.println("Existe un error que no permite crear una nueva area"+e.getMessage()); 
        }finally{
            cx.close(); //Cierra la conexion a la base de datos 
        }
        
        return agregado;
    }
    
    //Metodo para listar y buscar todas las areas
    
}
