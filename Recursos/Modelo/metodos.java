package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class metodos {

    public static boolean InsertarUsuario(usuario x) {
        // Obtener una conexión a la base de datos
        Connection cn = Conexion.Conectar();
        // Declarar el objeto PreparedStatement para ejecutar consultas SQL parametrizadas
        PreparedStatement ps = null;
        // Definir la consulta SQL para insertar un nuevo usuario en la tabla
        String sql = "insert into usuario (Nombre,Apellidos,Contraseña,Correo) values (?,?,?,?)";

        try {
            // Preparar la consulta SQL con los parámetros correspondientes
            ps = cn.prepareStatement(sql);
            ps.setString(1, x.getNombre());
            ps.setString(2, x.getApellidos());
            ps.setString(3, x.getContraseña());
            ps.setString(4, x.getCorreo());
            // Ejecutar la consulta
            ps.execute();
            ps.close();

            return true;

        } catch (Exception e) {
            // Imprimir cualquier excepción que ocurra durante el proceso de inserción
            System.out.println(e);

        }
        return false;
    }   
    
    public static boolean Autentificacion(String Puser,String Ppsw){
        // Obtener una conexión a la base de datos
        Connection cn = Conexion.Conectar();
        // Declarar el objeto PreparedStatement para ejecutar consultas SQL parametrizadas
        PreparedStatement ps = null;
        // Declarar el objeto ResultSet para almacenar los resultados de la consulta
        ResultSet rs = null;       
        
        // Definir la consulta SQL para autenticar al usuario
        String sql="select Nombre,Contraseña from usuario where Nombre=? and Contraseña=?";
        try{
            // Preparar la consulta SQL con los parámetros correspondientes
            ps=cn.prepareStatement(sql);
            ps.setString(1, Puser);
            ps.setString(2, Ppsw);
            // Ejecutar la consulta y obtener los resultados
            rs=ps.executeQuery();
        
            // Si se encuentra una coincidencia en la base de datos, cerrar la conexión y retornar true
            while(rs.next()){
                cn.close();
                return true;
            }
        
        }catch (Exception e){
            // Imprimir cualquier excepción que ocurra durante el proceso de autenticación
            System.out.println(e);        
        }
        return false;
    }
}

