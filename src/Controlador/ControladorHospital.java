package Controlador;
import Modelo.Hospital;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/*
    En esta clase, se registraran los metodos usados para realizar operaciones a la base de datos a la entidad Hospital
*/
public class ControladorHospital {
    private Conexion conexion=new Conexion();
    //Metodo para crear hospitales
    public boolean crearHospital(Hospital hospital) throws SQLException{
        boolean agregado=false;
        Connection cx=conexion.conectar();
        try{
            String consulta=("Insert into hospital values (?,?,?,?,?,?,?)");
            PreparedStatement con=cx.prepareStatement(consulta);
            con.setString(1, hospital.getId_Hospital());
            con.setString(2, hospital.getNit());
            con.setString(3, hospital.getCod_Habilitacion());
            con.setString(4, hospital.getNombre());
            con.setString(5, hospital.getId_Departamento());
            con.setString(6, hospital.getId_Municipio());
            con.setString(7, hospital.getId_Nivel());
            int cantidad=con.executeUpdate();
            agregado=(cantidad>0);
        }catch(Exception e){
            System.out.println("Existe un error que no permite crear una nueva area"+e.getMessage());
        }finally{
            cx.close();
        }
        return agregado;
    }
}
