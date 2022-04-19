package dashboard2193;

import Modelo.*;
import Controlador.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

//Clase principal
public class Dashboard2193 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        Conexion conexion=new Conexion();
        
        //CONTROLADORES
        ControladorDepartamento controladorDepartamento=new ControladorDepartamento();
        ControladorMunicipio controladorMunicipio=new ControladorMunicipio();
        ControladorRol controladorRol=new ControladorRol();
        ControladorNivel controladorNivel=new ControladorNivel();
        ControladorVariable controladorVariable=new ControladorVariable();
        ControladorArea controladorArea=new ControladorArea();
        ControladorHospital controladorHospital=new ControladorHospital();
        ControladorUsuario controladorUsuario=new ControladorUsuario();
        ControladorAreaHospital controladorAreaHospital=new ControladorAreaHospital();
        ControladorVariableHospital controladorVariableHospital=new ControladorVariableHospital();
        ControladorPeriodo controladorPeriodo=new ControladorPeriodo();
        //FIN CONTROLADORES
        Periodo periodo=new Periodo("2020-3","3","2020");
        try{
            if(controladorPeriodo.crearPeriodo(periodo)){
                System.out.println("Se agrego con exito");
            }else{
                System.out.println("Existe un error que no permite crear");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
