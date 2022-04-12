/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Valentina Mejia
 */
public class Usuario {
    private String id_Usuario;
    private String nombre;
    private String apellidos;
    private String usuario;
    private String contraseña;
    private String id_Hospital;
    private String id_Rol;
    
    //-------*Constructor*-------
    public Usuario(){
    }
    
    //-------*Constructor*-------

    public Usuario(String id_Usuario, String nombre, String apellidos, String usuario, String contraseña, String id_Hospital, 
        String id_Rol) {
        this.setId_Usuario(id_Usuario);
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setUsuario(usuario);
        this.setContraseña(contraseña);
        this.setId_Hospital(id_Hospital);
        this.setId_Rol(id_Rol);
    }
    
    //-------*Metodos Get*-------
    public String getId_Usuario() {
        return id_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getId_Hospital() {
        return id_Hospital;
    }

    public String getId_Rol() {
        return id_Rol;
    }
    
    //-------*Metodos Set*-------
    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setId_Hospital(String id_Hospital) {
        this.id_Hospital = id_Hospital;
    }

    public void setId_Rol(String id_Rol) {
        this.id_Rol = id_Rol;
    }
    
}
