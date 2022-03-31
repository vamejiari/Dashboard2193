/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection; //Permite realizar la conexion con la base de datos
import java.sql.DriverManager; //Conecta con la libreria importada anteriormente
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valentina Mejia
 */
public class Conexion {
    private Connection conexion; 
    
    private String host= "localhost"; //Servidor en el cual se encuentra ubicada la base de datos
    private String usuario="root"; //Usuario por el cual me conecto al servidor o PHPMyAdmin
    private String contraseña= ""; //Contraseña del PHPMyAdmin para acceder a la base de datos
    private String nombre_BD="dashboard2193"; //Nombre de la base de datos
    private String url_Conexion="jdbc:mysql://"+host+"/"+nombre_BD; 
    private String driver="com.mysql.cj.jdbc.Driver"; 
    
    public Connection conectar (){
        try {
            Class.forName(driver);
            conexion=DriverManager.getConnection(url_Conexion,usuario,contraseña);
            System.out.println("Conexion exitosa a la base de datos");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se pudo conectar a la base de datos"+nombre_BD);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

    public void desconectar(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
