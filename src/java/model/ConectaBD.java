/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alan
 */
public class ConectaBD {

    public static Connection con = null;
    private static String bd = "dwivet";
    public static String usuario = "root";
    public static String passw = "DIVADolbap96-97";
    public static String url = "jdbc:mysql://localhost/" + bd;

    /*private String username = "root";
    private String password = "";
    private String hostname = "localhost";
    private String port = "3306";
    private String database = "carritojsp";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
    private Connection conn;
    
    public Conexion() {
        
        try {
            Class.forName(classname);
            this.con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        
    }*/
  
    
    public static Connection abrir() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, passw);
            System.out.println("Conexión exitosa:" + con);
        } catch (Exception e) {
            System.out.println("Error en la conexion...");
            e.printStackTrace();
            return null;
        }
        return con;
    }
public Connection getConnection() {
        return this.con;
    }
    public static void cerrar() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Error: No se logro cerrar la conexion:\n" + e);
        }
    }
}
