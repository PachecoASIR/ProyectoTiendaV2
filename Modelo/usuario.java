package Modelo;

public class usuario {
    
    private String nombre;
    private String apellidos;
    private String contraseña;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // Establecer el nombre del usuario
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellido) {
        // Establecer los apellidos del usuario
        this.apellidos = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        // Establecer la contraseña del usuario
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        // Establecer el correo electrónico del usuario
        this.correo = correo;
    }   
}

