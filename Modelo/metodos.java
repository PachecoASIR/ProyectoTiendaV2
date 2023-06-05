package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class metodos {

    public static boolean InsertarUsuario(usuario x) {

        Connection cn = Conexion.Conectar();
        PreparedStatement ps = null;
        String sql = "insert into usuario (Nombre,Apellidos,Contraseña,Correo) values (?,?,?,?)";

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, x.getNombre());
            ps.setString(2, x.getApellidos());
            ps.setString(3, x.getContraseña());
            ps.setString(4, x.getCorreo());
            ps.execute();
            ps.close();

            return true;

        } catch (Exception e) {
            System.out.println(e);

        }
        return false;
    }
    
   
    
    public static boolean Autentificacion(String Puser,String Ppsw){
        Connection cn = Conexion.Conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        
        
        
        String sql="select Nombre,Contraseña from usuario where Nombre=? and Contraseña=?";
        try{
        ps=cn.prepareStatement(sql);
        ps.setString(1, Puser);
        ps.setString(2, Ppsw);
        rs=ps.executeQuery();
        
        while(rs.next()){
        cn.close();
        return true;
        }
        
        }catch (Exception e){
        System.out.println(e);
        
        
        }
    return false;
    
    }
}
