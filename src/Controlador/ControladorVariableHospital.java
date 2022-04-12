package Controlador;
import Modelo.Variable_Hospital;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad registro
*/
public class ControladorVariableHospital {
    private Conexion conexion=new Conexion();
    //Metodo para crear las variables del hospital
    public boolean crearVariableHospital(Variable_Hospital variableHospital)throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta=("insert into variable_hospital values (?,?,?)"); 
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, variableHospital.getId_Hospital());
            con.setString(2, variableHospital.getId_Area());
            con.setString(3, variableHospital.getId_Variable());
            int cantidad=con.executeUpdate();
            agregado=(cantidad>0);
        }catch(Exception e){
            System.out.println("Existe un error que no permite crear las variables del hospital "+e.getMessage());
        }finally{
            cx.close();
        }
        
        return agregado;
    }
}
