package Controlador;

import Vista.CatalogoEstilo;
import Modelo.metodos;
import Modelo.usuario;
import Vista.Amazon;
import Vista.Anillo;
import Vista.Casio;
import Vista.CatalogoEstilo2;
import Vista.CatalogoNoSesion;
import Vista.CatalogoNoSesion2;
import Vista.Caña;
import Vista.Chanel;
import Vista.Completado;
import Vista.Direccion;
import Vista.Iphone;
import Vista.Login;
import Vista.Nokia;
import Vista.PS5;
import Vista.Paypal;
import Vista.Pendientes;
import Vista.Perfil;
import Vista.Registro;
import Vista.Rolex;
import Vista.Tarjeta;
import Vista.Volante;
import Vista.XBOX;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class controlador implements ActionListener {

    metodos met = new metodos();
    usuario x = new usuario();
    Login log = new Login();
    Registro reg = new Registro();
    CatalogoEstilo cata = new CatalogoEstilo();
    CatalogoEstilo2 cata2 = new CatalogoEstilo2();
    CatalogoNoSesion cns = new CatalogoNoSesion();
    CatalogoNoSesion2 cns2 = new CatalogoNoSesion2();
    Perfil Per = new Perfil();
    //fichas
    Amazon Amazon = new Amazon();
    Anillo Anillo = new Anillo();
    Casio Casio = new Casio();
    Caña Caña = new Caña();
    Chanel Chanel = new Chanel();
    Iphone Iphone = new Iphone();
    Nokia Nokia = new Nokia();
    PS5 PS5  = new PS5 ();
    Pendientes Pendientes = new Pendientes();
    Rolex Rolex = new Rolex();
    Volante Volante = new Volante();
    XBOX XBOX  = new XBOX ();
    //OTROS
    Direccion direc = new Direccion();
    Paypal paypal = new Paypal();
    Tarjeta tarjeta = new Tarjeta();
    Completado completado = new Completado();
            
    

    public controlador(Login log, Registro reg, usuario user,CatalogoNoSesion cns,CatalogoNoSesion2 cns2,CatalogoEstilo cata,CatalogoEstilo2 cata2,Perfil Per,Amazon Amazon,Anillo Anillo,Casio Casio,Caña Caña,Chanel Chanel,Iphone Iphone,Nokia Nokia,PS5 PS5,Pendientes Pendientes,Rolex Rolex,Volante Volante, XBOX XBOX,Direccion direc,Paypal paypal,Tarjeta tarjeta,Completado completado) {
        
        this.log = log;
        this.reg = reg;
        this.x = user;
        this.cns = cns;
        this.cns2 = cns2;
        this.cata = cata;
        this.cata2 = cata2;
        this.Per = Per;
        this.Amazon = Amazon;
        this.Anillo = Anillo;
        this.Casio = Casio;
        this.Caña = Caña;
        this.Chanel = Chanel;
        this.Iphone = Iphone;
        this.Nokia = Nokia;
        this.PS5=PS5;
        this.Pendientes = Pendientes;
        this.Rolex = Rolex;
        this.Volante = Volante;
        this.XBOX = XBOX;
        this.paypal = paypal;
        this.tarjeta = tarjeta;
        this.direc=direc;
        this.completado=completado;
        
        

        ///registro de usuarios
        this.reg.btnRegistrarse.addActionListener(this);
        ///login de usuario
        this.log.btnLogin.addActionListener(this);
        this.log.IrRegistrarse.addActionListener(this);
        this.reg.IrLogin.addActionListener(this);
        this.cns.NoSesion1.addActionListener(this);
        this.cns2.NoSesion2.addActionListener(this);
        this.cns.PS1.addActionListener(this);
        this.cns2.PS2.addActionListener(this);
        ///catalogo
        this.cata.Perfil.addActionListener(this);
        this.Per.volverCatalogo.addActionListener(this);
        this.cata.irCata2.addActionListener(this);
        this.cata2.Perfil2.addActionListener(this);
        this.cata2.volverCata1.addActionListener(this);
        //catalogo1Productos
        this.cata.Biphone.addActionListener(this);
        this.cata.bCaña.addActionListener(this);
        this.cata.bPS5.addActionListener(this);
        this.cata.bPendientes.addActionListener(this);
        this.cata.bRolex.addActionListener(this);
        this.cata.bXBOX.addActionListener(this);
        //catalogo12Productos
        this.cata2.bAmazon.addActionListener(this);
        this.cata2.bAnillo.addActionListener(this);
        this.cata2.bCasio.addActionListener(this);
        this.cata2.bChanel.addActionListener(this);
        this.cata2.bNokia.addActionListener(this);
        this.cata2.bVolante.addActionListener(this);
        //fichas
        this.Amazon.VolverAmazon.addActionListener(this);
        this.Anillo.volverAnillo.addActionListener(this);
        this.Casio.volverCasio.addActionListener(this);
        this.Caña.volverCaña.addActionListener(this);
        this.Chanel.volverChanel.addActionListener(this);
        this.Nokia.volverNokia.addActionListener(this);
        this.PS5.volverPS5.addActionListener(this);
        this.Rolex.volverRolex.addActionListener(this);
        this.Volante.volverVolante.addActionListener(this);
        this.XBOX.volverXBOX.addActionListener(this);
        this.Iphone.volverIphone.addActionListener(this);
        this.Pendientes.volverPendientes.addActionListener(this);
        //fichasComprar
        this.Amazon.comprarAmazon.addActionListener(this);
        this.Anillo.comprarAnillo.addActionListener(this);
        this.Casio.comprarCasio.addActionListener(this);
        this.Caña.comprarCaña.addActionListener(this);
        this.Chanel.comprarChanel.addActionListener(this);
        this.Nokia.comprarNokia.addActionListener(this);
        this.PS5.comprarPS5.addActionListener(this);
        this.Rolex.comprarRolex.addActionListener(this);
        this.Volante.comprarVolante.addActionListener(this);
        this.XBOX.comprarXBOX.addActionListener(this);
        this.Iphone.comprarIphone.addActionListener(this);
        this.Pendientes.comprarPendientes.addActionListener(this);
        //direccion
        this.direc.dirVolver.addActionListener(this);
        this.direc.dirSiguiente.addActionListener(this);
        //tarjeta/paypal
        this.tarjeta.volverTarjeta.addActionListener(this);
        this.tarjeta.siguienteTarjeta.addActionListener(this);
        this.paypal.siguientePaypal.addActionListener(this);
        this.paypal.volverPaypal.addActionListener(this);
        //completado
        this.completado.imprimir.addActionListener(this);
        this.completado.volverCompletado.addActionListener(this);
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
     public void irPerfil(){
       cata.setVisible(false);
       Per.setVisible(true);
    
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
     public void volverCa(){
       Per.setVisible(false);
       cata.setVisible(true);
         
     }
     public void ircata2(){
       cata.setVisible(false);
       cata2.setVisible(true);
     }
     public void irperfil2(){
       cata2.setVisible(false);
       Per.setVisible(true);
     }
     public void volverCata1(){
       cata2.setVisible(false);
       cata.setVisible(true);
    }
       public void irIphone(){
       cata.setVisible(false);
       Iphone.setVisible(true);
    }
       public void irCaña(){
       cata.setVisible(false);
       Caña.setVisible(true);
    }
       public void irXBOX(){
       cata.setVisible(false);
       XBOX.setVisible(true);
    }
       public void irPS5(){
       cata.setVisible(false);
       PS5.setVisible(true);
    }
       public void irPendientes(){
       cata.setVisible(false);
       Pendientes.setVisible(true);
    }
       public void irRolex(){
       cata.setVisible(false);
       Rolex.setVisible(true);
    }
       public void irNokia(){
       cata2.setVisible(false);
       Nokia.setVisible(true);
       
       }
       public void irChanel(){
       cata2.setVisible(false);
       Chanel.setVisible(true);
       
       }
       public void irAnillo(){
       cata2.setVisible(false);
       Anillo.setVisible(true);
       
       }
       public void irCasio(){
       cata2.setVisible(false);
       Casio.setVisible(true);
       
       }
       public void irVolante(){
       cata2.setVisible(false);
       Volante.setVisible(true);
       
       }
       public void irAmazon(){
       cata2.setVisible(false);
       Amazon.setVisible(true);     
       }
       public void volverAmazon(){
       Amazon.setVisible(false);
       cata2.setVisible(true);     
       }
       public void volverAnillo(){
       Anillo.setVisible(false);
       cata2.setVisible(true); 
       }
       
    public void volverCasio() {
        Casio.setVisible(false);
        cata2.setVisible(true);
    }

    public void volverCaña() {
        Caña.setVisible(false);
        cata.setVisible(true);
    }

    public void volverChanel() {
        Chanel.setVisible(false);
        cata2.setVisible(true);
    }

    public void volverIphone() {
        Iphone.setVisible(false);
        cata.setVisible(true);
    }

    public void volverNokia() {
        Nokia.setVisible(false);
        cata2.setVisible(true);
    }

    public void volverPS5() {
        PS5.setVisible(false);
        cata.setVisible(true);
    }

    public void volverPendientes() {
        Pendientes.setVisible(false);
        cata.setVisible(true);
    }

    public void volverRolex() {
        Rolex.setVisible(false);
        cata.setVisible(true);
    }

    public void volverVolante() {
        Volante.setVisible(false);
        cata2.setVisible(true);
    }

    public void volverXBOX() {
        XBOX.setVisible(false);
        cata.setVisible(true);
    }
    public void comprarAmazon(){
       Amazon.setVisible(false);
       direc.setVisible(true);     
       }
       public void comprarAnillo(){
       Anillo.setVisible(false);
       direc.setVisible(true); 
       }
       
    public void comprarCasio() {
        Casio.setVisible(false);
        direc.setVisible(true);
    }

    public void comprarCaña() {
        Caña.setVisible(false);
        direc.setVisible(true);
    }

    public void comprarChanel() {
        Chanel.setVisible(false);
        direc.setVisible(true);
    }

    public void comprarIphone() {
        Iphone.setVisible(false);
        direc.setVisible(true);
    }

    public void comprarNokia() {
        Nokia.setVisible(false);
        direc.setVisible(true);
    }

    public void comprarPS5() {
        PS5.setVisible(false);
        direc.setVisible(true);
    }

    public void comprarPendientes() {
        Pendientes.setVisible(false);
        direc.setVisible(true);
    }

    public void comprarRolex() {
        Rolex.setVisible(false);
        direc.setVisible(true);
    }

    public void comprarVolante() {
        Volante.setVisible(false);
        direc.setVisible(true);
    }

    public void comprarXBOX() {
        XBOX.setVisible(false);
        direc.setVisible(true);
    }
    public void volverDireccion() {
        direc.setVisible(false);
        cata.setVisible(true);
    }
    public void siguienteDireccion(){
        JButton boton1 = new JButton("Tarjeta");
    boton1.addActionListener(e -> {
        // Acción al pulsar el botón 1 (abrir archivo 1)
        direc.setVisible(false);
        
        tarjeta.setVisible(true);
    });

    JButton boton2 = new JButton("Paypal");
    boton2.addActionListener(e -> {
        // Acción al pulsar el botón 2 (abrir archivo 2)
        direc.setVisible(false);
        
        paypal.setVisible(true);
    });

    Object[] opciones = {boton1, boton2};
    JOptionPane.showOptionDialog(null, "Selecciona un método de pago:", "Método de pago",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
    }
       
    
    public void volverTarjeta(){
    tarjeta.setVisible(false);
    direc.setVisible(true);
    }
     public void siguienteTarjeta(){
    tarjeta.setVisible(false);
    completado.setVisible(true);
    }
     public void volverPaypal(){
     paypal.setVisible(false);
     direc.setVisible(true);
     }
     public void siguientePaypal(){
     paypal.setVisible(false);
     completado.setVisible(true);
     }
      public void imprimir(){
     paypal.setVisible(false);
     direc.setVisible(true);
     }
     public void volverCompletado(){
     completado.setVisible(false);
     cata.setVisible(true);
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
        if (e.getSource() == reg.IrLogin) {
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
        if (e.getSource() == cata.Perfil) {
           irPerfil();
        }
        if (e.getSource() == Per.volverCatalogo) {
           volverCa();
        }
        if (e.getSource() == cata.irCata2) {
           ircata2();
        }
        if (e.getSource() == cata2.Perfil2) {
           irperfil2();
        }
        if (e.getSource() == cata2.volverCata1) {
           volverCata1();
        }
        if (e.getSource() == cata.Biphone) {
           irIphone();
        }
        if (e.getSource() == cata.bCaña) {
           irCaña();
        }
        if (e.getSource() == cata.bPS5) {
           irPS5();
        }
        if (e.getSource() == cata.bPendientes) {
           irPendientes();
        }
        if (e.getSource() == cata.bRolex) {
           irRolex();
        }
        if (e.getSource() == cata.bXBOX) {
           irXBOX();
        }
        if (e.getSource()== cata2.bAmazon){
        irAmazon();
        }
        if (e.getSource()== cata2.bAnillo){
        irAnillo();
        }
        if (e.getSource()== cata2.bCasio){
        irCasio();
        }
        if (e.getSource()== cata2.bChanel){
        irChanel();
        }
        if (e.getSource()== cata2.bNokia){
        irNokia();
        }
        if (e.getSource()== cata2.bVolante){
        irVolante();
        }
        if (e.getSource()== Amazon.VolverAmazon){
        volverAmazon();
        }
        if (e.getSource()== Anillo.volverAnillo){
        volverAnillo();
        }
        if (e.getSource()== Casio.volverCasio){
        volverCasio();
        }
        if (e.getSource()== Caña.volverCaña){
        volverCaña();
        }
        if (e.getSource()== Iphone.volverIphone){
        volverIphone();
        }
        if (e.getSource()== Nokia.volverNokia){
        volverNokia();
        }
        if (e.getSource()== PS5.volverPS5){
        volverPS5();
        }
        if (e.getSource()== Pendientes.volverPendientes){
        volverPendientes();
        }
        if (e.getSource()== Rolex.volverRolex){
        volverRolex();
        }
        if (e.getSource()== Volante.volverVolante){
        volverVolante();
        }
        if (e.getSource()== XBOX.volverXBOX){
        volverXBOX();
        }
         if (e.getSource()== Chanel.volverChanel){
        volverChanel();
        }
         
         
         if (e.getSource()== Amazon.comprarAmazon){
        comprarAmazon();
        }
        if (e.getSource()== Anillo.comprarAnillo){
        comprarAnillo();
        }
        if (e.getSource()== Casio.comprarCasio){
        comprarCasio();
        }
        if (e.getSource()== Caña.comprarCaña){
        comprarCaña();
        }
        if (e.getSource()== Iphone.comprarIphone){
       comprarIphone();
        }
        if (e.getSource()== Nokia.comprarNokia){
        comprarNokia();
        }
        if (e.getSource()== PS5.comprarPS5){
        comprarPS5();
        }
        if (e.getSource()== Pendientes.comprarPendientes){
        comprarPendientes();
        }
        if (e.getSource()== Rolex.comprarRolex){
        comprarRolex();
        }
        if (e.getSource()== Volante.comprarVolante){
        comprarVolante();
        }
        if (e.getSource()== XBOX.comprarXBOX){
       comprarXBOX();
        }
         if (e.getSource()== Chanel.comprarChanel){
        comprarChanel();
        }
       if (e.getSource()== direc.dirVolver){
        volverDireccion();
        }
       if (e.getSource()== direc.dirSiguiente){
       siguienteDireccion();
        }
       if (e.getSource()== tarjeta.volverTarjeta){
       volverTarjeta();
        }
       if (e.getSource()== tarjeta.siguienteTarjeta){
       siguienteTarjeta();
        }
       if (e.getSource()== paypal.volverPaypal){
       volverTarjeta();
        }
       if (e.getSource()== paypal.siguientePaypal){
       siguienteTarjeta();
        }
       if (e.getSource()== completado.imprimir){
       imprimir();
        }
       if (e.getSource()== completado.volverCompletado){
        volverCompletado();
        }

        
    }
}
        
        
    


