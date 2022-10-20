/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alan
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String cuenta;
    private String mail;
    private String clave;
    private String fechaN;
    public Usuario(String nombre, String apellidos, String cuenta, String mail, String clave, String fechaN){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cuenta = cuenta;
        this.mail = mail;
        this.clave = clave;
        this.fechaN = fechaN;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getMail() {
        return mail;
    }

    public String getClave() {
        return clave;
    }

    public String getFechaN() {
        return fechaN;
    }
    
}
