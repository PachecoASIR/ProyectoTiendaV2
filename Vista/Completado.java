/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.controlador;
import Modelo.usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Pacheco
 */
public class Completado extends javax.swing.JFrame {

    /**
     * Creates new form Completado
     */
    public Completado() {
        initComponents();
        this.setTitle("Cuerdotoo");
        this.setResizable(false);
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/Logo2.png"));
        Image resizedImg = img.getScaledInstance(60, 50, Image.SCALE_SMOOTH);
        ImageIcon icono = new ImageIcon(resizedImg);
        this.setIconImage(icono.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volverCompletado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        volverCompletado.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        volverCompletado.setText("VOLVER");
        volverCompletado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverCompletadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("SU COMPRA SE HA COMPLETADO SATISFACTORIAMENTE");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pegatinas-coches-motos-cara-sonriente-con-boca-y-ojos-abiertos (2).jpg"))); // NOI18N

        imprimir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        imprimir.setText("IMPRIMIR TICKET");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(volverCompletado)
                        .addGap(401, 401, 401))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imprimir)
                .addGap(115, 115, 115)
                .addComponent(volverCompletado)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverCompletadoActionPerformed
        
    }//GEN-LAST:event_volverCompletadoActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                     usuario user = new usuario();
        Login log = new Login();
        Registro reg = new Registro();
        CatalogoNoSesion cns = new CatalogoNoSesion();
        CatalogoNoSesion2 cns2 = new CatalogoNoSesion2();
        CatalogoEstilo cata = new CatalogoEstilo();
        CatalogoEstilo2 cata2 = new CatalogoEstilo2();
        Perfil Per = new Perfil();
        Amazon Amazon = new Amazon();
        Anillo Anillo = new Anillo();
        Casio Casio = new Casio();
        Caña Caña = new Caña();
        Chanel Chanel = new Chanel();
        Iphone Iphone = new Iphone();
        Nokia Nokia = new Nokia();
        PS5 PS5 = new PS5();
        Pendientes Pendientes = new Pendientes();
        Rolex Rolex = new Rolex();
        Volante Volante = new Volante();
        XBOX XBOX = new XBOX();
        //OTROS
        Direccion direc = new Direccion();
        Paypal paypal = new Paypal();
        Tarjeta tarjeta = new Tarjeta();
        Completado completado = new Completado();

        controlador con = new controlador(log, reg, user, cns, cns2, cata, cata2, Per, Amazon, Anillo, Casio, Caña, Chanel, Iphone, Nokia, PS5, Pendientes, Rolex, Volante, XBOX, direc, paypal, tarjeta,completado);
         completado.setVisible(true);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton volverCompletado;
    // End of variables declaration//GEN-END:variables
}
