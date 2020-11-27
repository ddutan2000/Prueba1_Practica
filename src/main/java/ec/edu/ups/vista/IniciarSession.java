/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorUsuario;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 *
 * @author Dutan2000
 */
public class IniciarSession extends javax.swing.JInternalFrame {
    private ControladorUsuario controladorU;
    private MenuPrincipal menuP;
    /**
     * Creates new form IniciarSession
     */
    public IniciarSession(MenuPrincipal menuPrincipal,ControladorUsuario controladorUsuario) {
        initComponents();
        controladorU=controladorUsuario;
        menuP=menuPrincipal;
    }
    
    public void limpiar(){
        txtCorreo.setText("");
        txtContrasenia.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCorreo = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        btnIniciarSession = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblInicioSession = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblCorreo.setText("CORREO:");

        lblContrasenia.setText("CONTRASEÑA:");

        btnIniciarSession.setText("INICIO");
        btnIniciarSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSessionActionPerformed(evt);
            }
        });

        btnCerrar.setText("CANCELAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblInicioSession.setText("INICIAR SESSION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnIniciarSession)
                        .addGap(49, 49, 49)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContrasenia)
                            .addComponent(lblCorreo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInicioSession)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCorreo)
                                .addComponent(txtContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicioSession)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasenia)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarSession)
                    .addComponent(btnCerrar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSessionActionPerformed
        if(!txtCorreo.getText().isEmpty()&&!txtContrasenia.getText().isEmpty()){
            String correo=txtCorreo.getText();
            String contrasenia= txtContrasenia.getText();
            for (int i = correo.length(); i < 25; i++) {
                correo+=" ";
            }
            correo=correo.substring(0, 25);
            for (int i = contrasenia.length(); i < 10; i++) {
                contrasenia+=" ";
            }
            contrasenia=contrasenia.substring(0, 10);
            
            

            if(controladorU.login(correo, contrasenia)!=null){
                JOptionPane.showMessageDialog(null, "BIEVENIDO ");
                menuP.getTabMenu().setVisible(true);
                menuP.getCerrarSession().setVisible(true);
                menuP.getIniciarSession().setVisible(false);
                menuP.getregistrarUsuario().setVisible(false);
                limpiar();

            }else{
                JOptionPane.showMessageDialog(null, "CONTRASEÑA O CORREO EQUIVOCADO");
                limpiar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS");
        }

    }//GEN-LAST:event_btnIniciarSessionActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIniciarSession;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblInicioSession;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
