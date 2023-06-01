package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Conexion {
    
    String bd="test";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion(String bd) {
      this.bd = bd;
    }

    
    public Connection conectar(){
   try{
   Class.forName(driver);
   cx=DriverManager.getConnection(url+bd,user,password);
     System.out.println(" Se conecto a la base de datos "+ bd);
   }catch(ClassNotFoundException | SQLException ex){
       System.out.println("No se conecto");
   
   }
   return  cx;
    }
    
    public void desconectar(){
      try{
        cx.close();
      }catch (SQLException ex){
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
      }

    }
    public static void main(String[] args){
      Conexion conexion = new Conexion("test");
      conexion.conectar();
    }

}