package Controlador;

import Vista.CatalogoEstilo;
import Modelo.metodos;
import Modelo.usuario;
import Vista.Login;
import Vista.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlador implements ActionListener {

    metodos met = new metodos();
    usuario x = new usuario();
    Login log = new Login();
    Registro reg = new Registro();
    CatalogoEstilo cata = new CatalogoEstilo();

    public controlador(Login log, Registro reg, usuario user) {
        
        this.log = log;
        this.reg = reg;
        this.x = user;

        ///registro de usuarios
        this.reg.btnRegistrarse.addActionListener(this);
        ///login de usuario
        this.log.btnLogin.addActionListener(this);

    }

    public void Registrar() {
        x.setNombre(reg.txtNombre.getText());
        x.setApellidos(reg.txtApellidos.getText());
        x.setContraseña(reg.txtPass.getText());
        x.setCorreo(reg.txtCorreo.getText());

        if (met.InsertarUsuario(x)) {
            reg.setVisible(false);
            log.setVisible(true);
            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");

        } else {
            JOptionPane.showMessageDialog(null, "Error al regisitrarse");
        }

    }

    public void Ingreso() {
        String us = log.logNombre.getText();
        String pw = log.logContraseña.getText();

        if (met.Autentificacion(us, pw)) {
            log.setVisible(false);
            cata.setVisible(true);
            JOptionPane.showMessageDialog(null, "Usuario logueado");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no registrado");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == reg.btnRegistrarse) {
            Registrar();
        }
        if (e.getSource() == log.btnLogin) {
            Ingreso();
        }
    }

}
