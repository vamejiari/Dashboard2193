/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Nivel; //Instancia de la clase nivel
import Modelo.Conexion; //Instancia de la clase conexion
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad nivel
*/
public class ControladorNivel {
    Conexion conexion=new Conexion();//Instancia de la clase conexion que nos entrega la conexion a la base de datos
    
    public boolean crearNivel(Nivel nivel) throws SQLException{
        boolean agregado=false; //Bandera de control y entrega
        Connection cx=conexion.conectar(); //Entrega y guarda la conexion a la base de datos
        
        try{
            String consulta=("insert into nivel values (?,?)"); //Consulta SQL 
            PreparedStatement con=cx.prepareStatement(consulta); ////Objeto que se encarga de preparar la consulta hacia la base de datos
            con.setString(1, nivel.getId_Nivel());
            con.setString(2, nivel.getNivel_Atencion());
            int cantidad=con.executeUpdate();//Ejecuta la consulta a la base de datos y adicional retorna la cantidad de datos cargados
            agregado=(cantidad>0);//Si la linea anterior se ejecuto de manera correcta se compara si es mayor a cero la variable y cambia el valor a TRUE
        }catch (Exception e){
            System.out.println("Existe un error que no permite crear un nuevo nivel"+e.getMessage());
        }finally{
            cx.close(); //Cierre de conexion a base de datos
        }
        return agregado;
    } 
}
