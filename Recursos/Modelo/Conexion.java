package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Connection con = null;
    
    public static Connection Conectar (){
    
    Connection cn=null;
    try{
        // Cargar el controlador JDBC específico para MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establecer la conexión a la base de datos
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        
    }catch (Exception e){
        // Capturar cualquier excepción que pueda ocurrir durante la carga del controlador o la conexión
        // e imprimir el mensaje de error
        System.out.println(String.valueOf(e));
    
    }
    
    // Devolver el objeto de conexión
    return cn;   
    }

}
