/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Dutan2000
 */
public class RegistrarPersona extends javax.swing.JInternalFrame {

    private ControladorPersona controladorP;
    private ControladorUsuario controladorU;
    private Usuario usuario;
    private Persona persona;

    /**
     * Creates new form RegistrarPersona
     */
    public RegistrarPersona(ControladorPersona controladorPersona, ControladorUsuario controladorUsuario) {
        initComponents();
        controladorP = controladorPersona;
        controladorU = controladorUsuario;
    }

    public int cargarSiguienteCodigo() {
        return controladorP.generarCodigo();
    }

    public void limpiar() {
        txtID.setText(String.valueOf(cargarSiguienteCodigo()));
        txtNombre.setText("");
        txtCedula.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtFechaDeNacimiento.setText("");
        cmbxGenero.setSelectedIndex(0);
        cmbxEstadoCivil.setSelectedIndex(0);
        txtCorreo.setText("");
        txtContrasenia.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblFechaDeNacimiento = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblApellido2 = new javax.swing.JLabel();
        cmbxGenero = new javax.swing.JComboBox<>();
        cmbxEstadoCivil = new javax.swing.JComboBox<>();
        txtFechaDeNacimiento = new javax.swing.JFormattedTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lblNombre.setText("NOMBRE:");

        lblApellido.setText("APELLIDO:");

        txtContrasenia.setEditable(false);

        lblCedula.setText("CEDULA:");

        lblCorreo.setText("CORREO:");

        lblContrasenia.setText("CONTRASEÑA:");

        lblRegistro.setText("REGISTRO");

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCorreo.setEditable(false);

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.setText("0");

        lblId.setText("ID:");

        lblFechaDeNacimiento.setText("FECHA DE NACIMIENTO:");

        lblApellido1.setText("GENERO:");

        lblDireccion.setText("DIRECCION:");

        lblApellido2.setText("ESTADO CIVIL:");

        cmbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECIONE UNA OPCION--", "MASCULINO", "FEMENINO" }));

        cmbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECIONE UNA OPCION--", "SOLTERO", "JUEZ" }));
        cmbxEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxEstadoCivilActionPerformed(evt);
            }
        });

        try {
            txtFechaDeNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblRegistro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnRegistrar)
                                .addGap(46, 46, 46)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblContrasenia)
                                    .addComponent(lblApellido)
                                    .addComponent(lblNombre)
                                    .addComponent(lblCedula)
                                    .addComponent(lblId)
                                    .addComponent(lblApellido1)
                                    .addComponent(lblFechaDeNacimiento)
                                    .addComponent(lblApellido2)
                                    .addComponent(lblDireccion)
                                    .addComponent(lblCorreo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtID)
                                    .addComponent(txtCedula)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)
                                    .addComponent(txtContrasenia)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbxEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFechaDeNacimiento))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistro)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaDeNacimiento)
                    .addComponent(txtFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido1)
                    .addComponent(cmbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido2)
                    .addComponent(cmbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasenia)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (!txtCedula.getText().isEmpty() && !txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty()
                && !txtDireccion.getText().isEmpty() && !txtFechaDeNacimiento.getText().isEmpty() && cmbxEstadoCivil.getSelectedIndex() != 0
                && cmbxGenero.getSelectedIndex() != 0) {
            int codigo = Integer.parseInt(txtID.getText());
            String cedula = txtCedula.getText();
            for (int i = cedula.length(); i < 10; i++) {
                cedula += " ";
            }
            cedula = cedula.substring(0, 10);
            String nombre = txtNombre.getText();
            for (int i = nombre.length(); i < 25; i++) {
                nombre += " ";
            }
            nombre = nombre.substring(0, 25);
            String apellido = txtApellido.getText();
            for (int i = apellido.length(); i < 25; i++) {
                apellido += " ";
            }
            apellido = apellido.substring(0, 25);
            String direcion = txtDireccion.getText();
            for (int i = direcion.length(); i < 50; i++) {
                direcion += " ";
            }
            direcion = direcion.substring(0, 50);
            String fechaDeNacimiento = txtFechaDeNacimiento.getText();
            String genero = cmbxGenero.getSelectedItem().toString();
            for (int i = genero.length(); i < 10; i++) {
                genero += " ";
            }
            genero = genero.substring(0, 10);
            String tipo = cmbxEstadoCivil.getSelectedItem().toString();
            for (int i = tipo.length(); i < 10; i++) {
                tipo += " ";
            }
            tipo = tipo.substring(0, 10);
            if (tipo.equals("JUEZ      ")) {

                String correo = txtCorreo.getText();
                for (int i = correo.length(); i < 25; i++) {
                    correo += " ";
                }
                correo = correo.substring(0, 25);
                String contrasenia = txtContrasenia.getText();
                for (int i = contrasenia.length(); i < 10; i++) {
                    contrasenia += " ";
                }
                contrasenia = contrasenia.substring(0, 10);

                usuario = new Usuario(correo, contrasenia, codigo, cedula, nombre, apellido, direcion, fechaDeNacimiento, genero, tipo);
                controladorU.registrar(usuario);
                JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO EXITOSAMENTE");
                limpiar();
            } else {
                persona = new Persona(codigo, cedula, nombre, apellido, direcion, fechaDeNacimiento, genero, tipo);
                controladorP.create(persona);
                JOptionPane.showMessageDialog(null, "PERSONA REGISTRADO EXITOSAMENTE");
                limpiar();
                txtContrasenia.setEditable(false);
                txtCorreo.setEditable(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR SE ENCUENTRAN CAMPOS VACIOS");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbxEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxEstadoCivilActionPerformed
        if (cmbxEstadoCivil.getSelectedIndex() != 0) {
            int tipo = cmbxEstadoCivil.getSelectedIndex();
            if (tipo == 2) {
                txtCorreo.setEditable(true);
                txtContrasenia.setEditable(true);
            }
        }
    }//GEN-LAST:event_cmbxEstadoCivilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbxEstadoCivil;
    private javax.swing.JComboBox<String> cmbxGenero;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblApellido2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFechaDeNacimiento;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JFormattedTextField txtFechaDeNacimiento;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
