/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Rol; //Instancia de la clase ROL
import Modelo.Conexion;//Instancia de la clase conexion
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
    
/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad rol
*/
public class ControladorRol {
    private Conexion conexion=new Conexion(); 
    
    public boolean crearRol(Rol rol) throws SQLException{
        boolean agregado=false;//Bandera de control y entrega
        Connection cx=conexion.conectar(); //Entrega y guarda la conexion a la base de datos
        try{
            String consulta=("insert into rol values (?,?)");//Consulta SQL
            PreparedStatement con=cx.prepareStatement(consulta);//Objeto que se encarga de dirigir la consulta hacia la base de datos
            con.setString(1, rol.getId_Rol());
            con.setString(2, rol.getNombre_Rol());
            int cantidad=con.executeUpdate(); //Ejecuta la consulta a la base de datos y adicional retorna la cantidad de datos cargados
            agregado=(cantidad>0);//Si la linea anterior se ejecuto de manera correcta se compara si es mayor a cero la variable y cambia el valor a TRUEs
        }catch(Exception e){
            System.out.println("Existe un error que no permite crear un nuevo rol"+e.getMessage());
        }finally{
            cx.close(); //Cierre de conexion a la base de datos
        }
        return agregado;
    }
    
}
