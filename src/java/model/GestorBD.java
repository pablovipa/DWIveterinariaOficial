/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBD {
    Connection conn = null;
    Statement stm=null;
    ResultSet usuarioResultSet;
    Usuario usuarioHallado;
    String nom,apell,cuent,mail,passw,fechaN;
    
      public boolean registrar(String nombre, String apellidos, String cuenta, String mail, String clave, String fechaN) {
        int resultUpdate = 0;
        try{
            conn = ConectaBD.abrir();
            stm = conn.createStatement();
            resultUpdate=stm.executeUpdate("INSERT INTO usuarios (nombre,apellidos,cuenta,mail,clave,fecha_nacimiento) VALUES('" + nombre +"','"+ apellidos +"','"+ cuenta +"','" + mail +"','"+ clave + "','"+ fechaN +"');");
            if(resultUpdate != 0){ //si una columna es afectada en la base de datos (se ejecutó la consulta correctamente)
                ConectaBD.cerrar();
                return true;
            }else{
                ConectaBD.cerrar();
                return false;
                }
            } catch (Exception e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
            }
        }
        
        public Usuario consultar(String cuenta, String clave){
            try{
            conn = ConectaBD.abrir();
            stm = conn.createStatement();
            usuarioResultSet = stm.executeQuery("SELECT * FROM usuarios WHERE cuenta='"+cuenta+"' and clave='"+clave+"';");
            if(!usuarioResultSet.next()){
            System.out.println(" No se encontro el registro");
            ConectaBD.cerrar();
            return null;
            }else{
            System.out.println("Se encontró el registro");
            nom = usuarioResultSet.getString("nombre");
            apell = usuarioResultSet.getString("apellidos");
            cuent = usuarioResultSet.getString("cuenta");//" " nombre de las columnas de la tabla de la base de datos
            mail = usuarioResultSet.getString("mail");
            passw = usuarioResultSet.getString("clave");
            fechaN = usuarioResultSet.getString("fecha_nacimiento");
            usuarioHallado = new Usuario(nom,apell,cuent,mail,passw,fechaN);
            ConectaBD.cerrar();
            return usuarioHallado;
            }
            }catch(Exception e){
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return null;
            }
        }
        
    /*    
        public boolean borrar(String cuenta, String clave){
        int resultUpdate = 0;
        try{
        conn = ConectaBD.abrir();
        stm = conn.createStatement();
        resultUpdate= stm.executeUpdate("DELETE FROM usuarios WHERE(cuenta='" + cuenta + "'and clave='"+ clave +"');");
        if(resultUpdate != 0){
            ConectaBD.cerrar();
            return true;
        }else{
            ConectaBD.cerrar();
            return false;
            }
        } catch (SQLException e) {
            System.out.println("Error en la base de datos.");
            e.printStackTrace();
            return false;
            }
        }
        
        
        public ArrayList<Usuario> leeTodos(){
            ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
            try{
                conn = ConectaBD.abrir();
                stm = conn.createStatement();
                usuarioResultSet = stm.executeQuery("SELECT * FROM usuarios");
                if(!usuarioResultSet.next()){
                System.out.println(" No se encontraron registros");
                ConectaBD.cerrar();
                return null;
            }else{
                do{
                    nom = usuarioResultSet.getString("nombre");
                    apell = usuarioResultSet.getString("apellidos");
                    cuent = usuarioResultSet.getString("cuenta");//variable de la clase Usuario* y base de datos
                    mail = usuarioResultSet.getString("mail");
                    passw = usuarioResultSet.getString("clave");
                    fechaN = usuarioResultSet.getString("fechaN");
                    usuarioHallado = new Usuario(nom,apell,cuent,mail,passw,fechaN);
                    usuarios.add(usuarioHallado);
                }while(usuarioResultSet.next());//hay datos en la siguiente linea? t o f
                ConectaBD.cerrar();
                return usuarios;//regresa el array con todos los campos y filas obtenidas
                }
            }catch(Exception e){
                System.out.println("Error en la base de datos.");
                e.printStackTrace();
                return null;
            }
        }*/

}