package Controlador;

import Vista.CatalogoEstilo;
import Modelo.metodos;
import Modelo.usuario;
import Vista.CatalogoNoSesion;
import Vista.CatalogoNoSesion2;
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
    CatalogoNoSesion cns = new CatalogoNoSesion();
    CatalogoNoSesion2 cns2 = new CatalogoNoSesion2();

    public controlador(Login log, Registro reg, usuario user,CatalogoNoSesion cns,CatalogoNoSesion2 cns2) {
        
        this.log = log;
        this.reg = reg;
        this.x = user;
        this.cns = cns;
        this.cns2 = cns2;

        ///registro de usuarios
        this.reg.btnRegistrarse.addActionListener(this);
        ///login de usuario
        this.log.btnLogin.addActionListener(this);
        this.log.IrRegistrarse.addActionListener(this);
        this.reg.irLogin.addActionListener(this);
        this.cns.NoSesion1.addActionListener(this);
        this.cns2.NoSesion2.addActionListener(this);
        this.cns.PS1.addActionListener(this);
        this.cns2.PS2.addActionListener(this);
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
    public void irRegistro(){
       reg.setVisible(true);
       log.setVisible(false);
    
    }
     public void irLogin(){
       reg.setVisible(false);
       log.setVisible(true);
    
    }
     public void LoginCns(){
       cns.setVisible(false);
       log.setVisible(true);
     }
     public void LoginCns2(){
       cns2.setVisible(false);
       log.setVisible(true);
     }
     public void PS1(){
       cns.setVisible(false);
       cns2.setVisible(true);
     }
     public void PS2(){
       cns2.setVisible(false);
       cns.setVisible(true);
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
        if (e.getSource() == log.IrRegistrarse) {
            irRegistro();
        }
        if (e.getSource() == reg.irLogin) {
            irLogin();
        }
        if (e.getSource() == cns.NoSesion1) {
           LoginCns();
        }
        if (e.getSource() == cns2.NoSesion2) {
           LoginCns2();
        }
        if (e.getSource() == cns.PS1) {
           PS1();
        }
        if (e.getSource() == cns2.PS2) {
           PS2();
        }
    }

}
