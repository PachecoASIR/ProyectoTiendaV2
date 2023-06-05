package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class metodos {

    public static boolean InsertarUsuario(usuario x) {
        // Establecer la conexión a la base de datos

        Connection cn = Conexion.Conectar();
        // Declarar el objeto PreparedStatement para ejecutar la consulta SQL

        PreparedStatement ps = null;
        // Definir la consulta SQL para insertar un nuevo usuario en la tabla "usuario"

        String sql = "insert into usuario (Nombre,Apellidos,Contraseña,Correo) values (?,?,?,?)";

        try {
            // Preparar la consulta SQL

            ps = cn.prepareStatement(sql);
            // Establecer los valores de los parámetros en la consulta

            ps.setString(1, x.getNombre());
            ps.setString(2, x.getApellidos());
            ps.setString(3, x.getContraseña());
            ps.setString(4, x.getCorreo());
            // Ejecutar la consulta SQL

            ps.execute();
            // Cerrar el objeto PreparedStatement

            ps.close();

            return true;

        } catch (Exception e) {
            // Imprimir la información de la excepción en caso de error

            System.out.println(e);

        }
        // Si ocurrió un error durante la inserción, retornar false

        return false;
    }

    public static boolean Autentificacion(String Puser, String Ppsw) {
        // Establecer la conexión a la base de datos
        Connection cn = Conexion.Conectar();

        // Declarar el objeto PreparedStatement para ejecutar la consulta SQL
        PreparedStatement ps = null;

        // Declarar el objeto ResultSet para almacenar los resultados de la consulta
        ResultSet rs = null;

        // Definir la consulta SQL para autenticar al usuario
        String sql = "select Nombre, Contraseña from usuario where Nombre=? and Contraseña=?";

        try {
            // Preparar la consulta SQL
            ps = cn.prepareStatement(sql);

            // Establecer los valores de los parámetros en la consulta
            ps.setString(1, Puser);
            ps.setString(2, Ppsw);

            // Ejecutar la consulta SQL y obtener los resultados
            rs = ps.executeQuery();

            // Verificar si se encontró un registro en la base de datos
            while (rs.next()) {
                // Cerrar la conexión a la base de datos
                cn.close();

                // Si se encontró un registro, retornar true
                return true;
            }

        } catch (Exception e) {
            // Imprimir la información de la excepción en caso de error
            System.out.println(e);
        }

        // Si no se encontró un registro o ocurrió un error, retornar false
        return false;
    }

}
