/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.controlador.ControladorRegistro;
import ec.edu.ups.controlador.ControladorUsuario;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Dutan2000
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private IniciarSession iniciarSession;
    private ListarDatos listarDatos;
    private RegistrarPersona registrarPersona;
    private RegistroCivil registroCivil;

    private ControladorPersona controladorPersona;
    private ControladorRegistro controladorRegistro;
    private ControladorUsuario controladorUsuario;

    public MenuPrincipal() {
        initComponents();

        tabCerrarSession.setVisible(false);
        menuTab.setVisible(false);

        controladorPersona = new ControladorPersona();
        controladorRegistro = new ControladorRegistro();
        controladorUsuario = new ControladorUsuario();

        iniciarSession = new IniciarSession(this, controladorUsuario);
        listarDatos = new ListarDatos(controladorRegistro,controladorPersona, controladorUsuario);
        registrarPersona = new RegistrarPersona(controladorPersona, controladorUsuario);
        registroCivil = new RegistroCivil(controladorRegistro, controladorPersona, controladorUsuario);

        desktopPane.add(iniciarSession);
        desktopPane.add(listarDatos);
        desktopPane.add(registrarPersona);
        desktopPane.add(registroCivil);
    }

    public JMenu getTabMenu() {
        return menuTab;
    }

    public JMenuItem getIniciarSession() {
        return tabInicioSession;
    }

    public JMenuItem getregistrarUsuario() {
        return tabRegistrarPersonas;
    }

    public JMenuItem getCerrarSession() {
        return tabCerrarSession;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        tabInicioSession = new javax.swing.JMenuItem();
        tabListarMatrimonios = new javax.swing.JMenuItem();
        tabRegistrarPersonas = new javax.swing.JMenuItem();
        tabQuit = new javax.swing.JMenuItem();
        tabCerrarSession = new javax.swing.JMenuItem();
        menuTab = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setLayout(null);

        menuInicio.setMnemonic('e');
        menuInicio.setText("INICIO");

        tabInicioSession.setMnemonic('t');
        tabInicioSession.setText("I. SESSION");
        tabInicioSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabInicioSessionActionPerformed(evt);
            }
        });
        menuInicio.add(tabInicioSession);

        tabListarMatrimonios.setMnemonic('y');
        tabListarMatrimonios.setText("L. MATRIMONIOS");
        tabListarMatrimonios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabListarMatrimoniosActionPerformed(evt);
            }
        });
        menuInicio.add(tabListarMatrimonios);

        tabRegistrarPersonas.setMnemonic('p');
        tabRegistrarPersonas.setText("R. PERSONA");
        tabRegistrarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabRegistrarPersonasActionPerformed(evt);
            }
        });
        menuInicio.add(tabRegistrarPersonas);

        tabQuit.setMnemonic('d');
        tabQuit.setText("QUIT");
        tabQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabQuitActionPerformed(evt);
            }
        });
        menuInicio.add(tabQuit);

        tabCerrarSession.setMnemonic('y');
        tabCerrarSession.setText("CERRAR SESSION");
        tabCerrarSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCerrarSessionActionPerformed(evt);
            }
        });
        menuInicio.add(tabCerrarSession);

        menuBar.add(menuInicio);

        menuTab.setMnemonic('f');
        menuTab.setText("MENU");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("REGISTRO CIVIL");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        menuTab.add(openMenuItem);

        menuBar.add(menuTab);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabListarMatrimoniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabListarMatrimoniosActionPerformed
        listarDatos.setVisible(true);
    }//GEN-LAST:event_tabListarMatrimoniosActionPerformed

    private void tabQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabQuitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_tabQuitActionPerformed

    private void tabCerrarSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCerrarSessionActionPerformed
        menuTab.setVisible(false);
        tabCerrarSession.setVisible(false);
        tabInicioSession.setVisible(true);
        tabRegistrarPersonas.setVisible(true);
    }//GEN-LAST:event_tabCerrarSessionActionPerformed

    private void tabInicioSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabInicioSessionActionPerformed
        iniciarSession.setVisible(true);
    }//GEN-LAST:event_tabInicioSessionActionPerformed

    private void tabRegistrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabRegistrarPersonasActionPerformed
    registrarPersona.setVisible(true);
    }//GEN-LAST:event_tabRegistrarPersonasActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        registroCivil.setVisible(true);
    }//GEN-LAST:event_openMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuTab;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem tabCerrarSession;
    private javax.swing.JMenuItem tabInicioSession;
    private javax.swing.JMenuItem tabListarMatrimonios;
    private javax.swing.JMenuItem tabQuit;
    private javax.swing.JMenuItem tabRegistrarPersonas;
    // End of variables declaration//GEN-END:variables

}
