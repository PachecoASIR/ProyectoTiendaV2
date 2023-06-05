package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public Connection con = null;

    public static Connection Conectar() {

        Connection cn = null;
        try {
            // Cargar el controlador de la base de datos MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión a la base de datos
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        } catch (Exception e) {
            // Imprimir la información de la excepción en caso de error
            System.out.println(String.valueOf(e));
        }

        // Devolver la conexión establecida o null en caso de error
        return cn;
    }
}
