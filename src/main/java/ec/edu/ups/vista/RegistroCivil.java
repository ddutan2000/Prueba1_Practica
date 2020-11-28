/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.controlador.ControladorRegistro;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Registro;
import ec.edu.ups.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Dutan2000
 */
public class RegistroCivil extends javax.swing.JInternalFrame {

    private ControladorRegistro controladorR;
    private ControladorPersona controladorP;
    private ControladorUsuario controladorU;
    private Persona esposo;
    private Persona esposa;
    private Usuario juez;
    private Persona testigo1;
    private Persona testigo2;
    private Registro registrar;

    /**
     * Creates new form RegistroCivil
     */
    public RegistroCivil(ControladorRegistro controaldorRegistro, ControladorPersona controladorPersona, ControladorUsuario controladorUsuario) {
        initComponents();
        controladorR = controaldorRegistro;
        controladorP = controladorPersona;
        controladorU = controladorUsuario;
    }
    
    public int cargarCodigo(){
        return controladorR.generacodigo();
    }

    public void limpiar() {
        txtNumero.setText(String.valueOf(cargarCodigo()));
        txtCedulaEsposa.setText("");
        txtCedulaEsposo.setText("");
        txtCedulaTestigo.setText("");
        txtCedulaTestigo2.setText("");
        txtCodigoDeMarido.setText("");
        txtCodigoEsposa.setText("");
        txtTestigo1.setText("");
        txtTestigo2.setText("");
        txtNombreEsposo.setText("");
        txtNombreEsposa.setText("");
        txtnombreTestigo1.setText("");
        txtnombreTestigo2.setText("");
        txtApellidoEsposa.setText("");
        txtApellifoEsposo.setText("");
        txtApellidoTestigo1.setText("");
        txtApellidoTestigo2.setText("");
        txtDireccionEsposo.setText("");
        txtDireccionEsposa.setText("");
        txtDireccionTestigo1.setText("");
        txtDireccionTestigo2.setText("");
        txtFechaEsposa.setText("");
        txtFechaEsposo.setText("");
        txtFechaTestigo1.setText("");
        txtFechaTestigo2.setText("");
        txtGeneroEsposa.setText("");
        txtGeneroEsposo.setText("");
        txtGeneroTestigo1.setText("");
        txtGeneroTestigo2.setText("");
        txtEstadoCivilEsposo.setText("");
        txtEstadoEsposa.setText("");
        txtEstadoTestigo1.setText("");
        txtEstadoTestigo2.setText("");
        txtFecha.setText("");
        txtUbicacion.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigoDeMarido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedulaEsposo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreEsposo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellifoEsposo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccionEsposo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFechaEsposo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGeneroEsposo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEstadoCivilEsposo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoEsposa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCedulaEsposa = new javax.swing.JTextField();
        txtNombreEsposa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtApellidoEsposa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDireccionEsposa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFechaEsposa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtGeneroEsposa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEstadoEsposa = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTestigo1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCedulaTestigo = new javax.swing.JTextField();
        txtnombreTestigo1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtApellidoTestigo1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDireccionTestigo1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtFechaTestigo1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtGeneroTestigo1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtEstadoTestigo1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtTestigo2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtCedulaTestigo2 = new javax.swing.JTextField();
        txtnombreTestigo2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtApellidoTestigo2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtDireccionTestigo2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtFechaTestigo2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtGeneroTestigo2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtEstadoTestigo2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        jLabel35 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        txtCodigoDeMarido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoDeMaridoKeyTyped(evt);
            }
        });

        jLabel1.setText("REGISTRO CIVIL");

        jLabel2.setText("CODIGO DE PROMETIDA/O:");

        txtCedulaEsposo.setEditable(false);

        jLabel4.setText("CEDULA:");

        txtNombreEsposo.setEditable(false);

        jLabel5.setText("NOMBRE:");

        txtApellifoEsposo.setEditable(false);

        jLabel6.setText("APELLIDO:");

        txtDireccionEsposo.setEditable(false);

        jLabel7.setText("DIRECCION:");

        txtFechaEsposo.setEditable(false);

        jLabel8.setText("FECHA DE NACIMIENTO:");

        txtGeneroEsposo.setEditable(false);

        jLabel9.setText("GENERO:");

        txtEstadoCivilEsposo.setEditable(false);

        jLabel10.setText("ESTADO CIVIL:");

        txtCodigoEsposa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoEsposaKeyTyped(evt);
            }
        });

        jLabel3.setText("CODIGO DE PROMETIDO/A:");

        txtCedulaEsposa.setEditable(false);

        txtNombreEsposa.setEditable(false);

        jLabel11.setText("NOMBRE:");

        txtApellidoEsposa.setEditable(false);

        jLabel12.setText("APELLIDO:");

        txtDireccionEsposa.setEditable(false);

        jLabel13.setText("DIRECCION:");

        txtFechaEsposa.setEditable(false);

        jLabel14.setText("FECHA DE NACIMIENTO:");

        txtGeneroEsposa.setEditable(false);

        jLabel15.setText("GENERO:");

        txtEstadoEsposa.setEditable(false);

        jLabel16.setText("ESTADO CIVIL:");

        txtTestigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTestigo1KeyTyped(evt);
            }
        });

        jLabel17.setText("CODIGO DE TESTIGO 1:");

        txtCedulaTestigo.setEditable(false);

        txtnombreTestigo1.setEditable(false);

        jLabel18.setText("NOMBRE:");

        txtApellidoTestigo1.setEditable(false);

        jLabel19.setText("APELLIDO:");

        txtDireccionTestigo1.setEditable(false);

        jLabel20.setText("DIRECCION:");

        txtFechaTestigo1.setEditable(false);

        jLabel21.setText("FECHA DE NACIMIENTO:");

        txtGeneroTestigo1.setEditable(false);

        jLabel22.setText("GENERO:");

        txtEstadoTestigo1.setEditable(false);

        jLabel23.setText("ESTADO CIVIL:");

        txtTestigo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTestigo2KeyTyped(evt);
            }
        });

        jLabel24.setText("CODIGO DE TESTIGO 2:");

        txtCedulaTestigo2.setEditable(false);

        txtnombreTestigo2.setEditable(false);

        jLabel25.setText("NOMBRE:");

        txtApellidoTestigo2.setEditable(false);

        jLabel26.setText("APELLIDO:");

        txtDireccionTestigo2.setEditable(false);

        jLabel27.setText("DIRECCION:");

        txtFechaTestigo2.setEditable(false);

        jLabel28.setText("FECHA DE NACIMIENTO:");

        txtGeneroTestigo2.setEditable(false);

        jLabel29.setText("GENERO:");

        txtEstadoTestigo2.setEditable(false);

        jLabel30.setText("ESTADO CIVIL:");

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel31.setText("CEDULA:");

        jLabel32.setText("CEDULA:");

        jLabel33.setText("CEDULA:");

        jLabel34.setText("FECHA:");

        try {
            txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel35.setText("UBICACION:");

        jLabel36.setText("CASO:");

        txtNumero.setEditable(false);
        txtNumero.setBackground(new java.awt.Color(204, 204, 204));
        txtNumero.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigoDeMarido)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(txtNombreEsposo)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellifoEsposo)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccionEsposo)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaEsposo)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGeneroEsposo)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstadoCivilEsposo)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCedulaEsposo)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigoEsposa)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreEsposa)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidoEsposa)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccionEsposa)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaEsposa)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGeneroEsposa)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstadoEsposa)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCedulaEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel31))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTestigo1)
                                .addComponent(jLabel17))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnombreTestigo1)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidoTestigo1)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccionTestigo1)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaTestigo1)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGeneroTestigo1)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstadoTestigo1)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCedulaTestigo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTestigo2)
                                    .addComponent(jLabel24))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel34))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel35)
                                                    .addComponent(jLabel36)))))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnombreTestigo2)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidoTestigo2)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccionTestigo2)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaTestigo2)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGeneroTestigo2)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstadoTestigo2)
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCedulaTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoDeMarido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellifoEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneroEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstadoCivilEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneroEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstadoEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaTestigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombreTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneroTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstadoTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedulaTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombreTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGeneroTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstadoTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoDeMaridoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoDeMaridoKeyTyped
        char validar = evt.getKeyChar();
        if (validar == '\n') {
            if (!txtCodigoDeMarido.getText().isEmpty()) {
                if (!txtCodigoEsposa.getText().equals(txtCodigoDeMarido.getText()) && !txtTestigo1.getText().equals(txtCodigoDeMarido.getText())
                        && !txtTestigo2.getText().equals(txtCodigoDeMarido.getText())) {
                    esposo = controladorP.read(Integer.parseInt(txtCodigoDeMarido.getText()));
                    txtCedulaEsposo.setText(esposo.getCedula());
                    txtNombreEsposo.setText(esposo.getNombre());
                    txtApellifoEsposo.setText(esposo.getApellido());
                    txtDireccionEsposo.setText(esposo.getDireccion());
                    txtFechaEsposo.setText(esposo.getFechaDeNacimiento());
                    txtGeneroEsposo.setText(esposo.getGenero());
                    txtEstadoCivilEsposo.setText(esposo.getEstadoCivil());
                }
                JOptionPane.showMessageDialog(null, "CAMPO REPETIDO");
            }
            JOptionPane.showMessageDialog(null, "CAMPO VACIO");
        }

    }//GEN-LAST:event_txtCodigoDeMaridoKeyTyped

    private void txtCodigoEsposaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEsposaKeyTyped

        char validar = evt.getKeyChar();
        if (validar == '\n') {
            if (!txtCodigoEsposa.getText().isEmpty()) {
                if (!txtCodigoDeMarido.getText().equals(txtCodigoEsposa.getText()) && !txtTestigo1.getText().equals(txtCodigoEsposa.getText())
                        && !txtTestigo2.getText().equals(txtCodigoEsposa.getText())) {
                    esposa = controladorP.read(Integer.parseInt(txtCodigoEsposa.getText()));
                    txtCedulaEsposa.setText(esposa.getCedula());
                    txtNombreEsposa.setText(esposa.getNombre());
                    txtApellidoEsposa.setText(esposa.getApellido());
                    txtDireccionEsposa.setText(esposa.getDireccion());
                    txtFechaEsposa.setText(esposa.getFechaDeNacimiento());
                    txtGeneroEsposa.setText(esposa.getGenero());
                    txtEstadoEsposa.setText(esposa.getEstadoCivil());
                }
                JOptionPane.showMessageDialog(null, "CAMPO REPETIDO");
            }
            JOptionPane.showMessageDialog(null, "CAMPO VACIO");
        }
    }//GEN-LAST:event_txtCodigoEsposaKeyTyped

    private void txtTestigo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTestigo1KeyTyped

        char validar = evt.getKeyChar();
        if (validar == '\n') {
            if (!txtTestigo1.getText().isEmpty()) {
                if (!txtCodigoDeMarido.getText().equals(txtTestigo1.getText()) && !txtCodigoEsposa.getText().equals(txtTestigo1.getText())
                        && !txtTestigo2.getText().equals(txtTestigo1.getText())) {
                    testigo1 = controladorP.read(Integer.parseInt(txtTestigo1.getText()));
                    txtCedulaTestigo.setText(testigo1.getCedula());
                    txtnombreTestigo1.setText(testigo1.getNombre());
                    txtApellidoTestigo1.setText(testigo1.getApellido());
                    txtDireccionTestigo1.setText(testigo1.getDireccion());
                    txtFechaTestigo1.setText(testigo1.getFechaDeNacimiento());
                    txtGeneroTestigo1.setText(testigo1.getGenero());
                    txtEstadoTestigo1.setText(testigo1.getEstadoCivil());
                }
                JOptionPane.showMessageDialog(null, "CAMPO REPETIDO");
            }
            JOptionPane.showMessageDialog(null, "CAMPO VACIO");
        }
    }//GEN-LAST:event_txtTestigo1KeyTyped

    private void txtTestigo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTestigo2KeyTyped

        char validar = evt.getKeyChar();
        if (validar == '\n') {
            if (!txtTestigo2.getText().isEmpty()) {

                if (!txtCodigoDeMarido.getText().equals(txtTestigo2.getText()) && !txtCodigoEsposa.getText().equals(txtTestigo2.getText())
                        && !txtTestigo1.getText().equals(txtTestigo2.getText())) {
                    testigo2 = controladorP.read(Integer.parseInt(txtTestigo2.getText()));
                    txtCedulaTestigo2.setText(testigo2.getCedula());
                    txtnombreTestigo2.setText(testigo2.getNombre());
                    txtApellidoTestigo2.setText(testigo2.getApellido());
                    txtDireccionTestigo2.setText(testigo2.getDireccion());
                    txtFechaTestigo2.setText(testigo2.getFechaDeNacimiento());
                    txtGeneroTestigo2.setText(testigo2.getGenero());
                    txtEstadoTestigo2.setText(testigo2.getEstadoCivil());

                }
                JOptionPane.showMessageDialog(null, "CAMPO REPETIDO");
            }
            JOptionPane.showMessageDialog(null, "CAMPO VACIO");
        }
    }//GEN-LAST:event_txtTestigo2KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!txtCodigoDeMarido.getText().isEmpty() && !txtCodigoEsposa.getText().isEmpty() && txtTestigo1.getText().isEmpty()
                && !txtTestigo2.getText().isEmpty() && !txtFecha.getText().isEmpty() && !txtUbicacion.getText().isEmpty()) {
            juez = controladorU.verUsuario();
            registrar = new Registro(Integer.parseInt(txtNumero.getText()), txtFecha.getText(), Integer.parseInt(txtTestigo1.getText()),
                    Integer.parseInt(txtTestigo2.getText()), txtUbicacion.getText(), juez.getId(), Integer.parseInt(txtCodigoDeMarido.getText()), Integer.parseInt(txtCodigoEsposa.getText()));
            JOptionPane.showMessageDialog(null, "FELICIDADES! YA ESTAS CASADO");
            limpiar();

        }
        JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS");

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidoEsposa;
    private javax.swing.JTextField txtApellidoTestigo1;
    private javax.swing.JTextField txtApellidoTestigo2;
    private javax.swing.JTextField txtApellifoEsposo;
    private javax.swing.JTextField txtCedulaEsposa;
    private javax.swing.JTextField txtCedulaEsposo;
    private javax.swing.JTextField txtCedulaTestigo;
    private javax.swing.JTextField txtCedulaTestigo2;
    private javax.swing.JTextField txtCodigoDeMarido;
    private javax.swing.JTextField txtCodigoEsposa;
    private javax.swing.JTextField txtDireccionEsposa;
    private javax.swing.JTextField txtDireccionEsposo;
    private javax.swing.JTextField txtDireccionTestigo1;
    private javax.swing.JTextField txtDireccionTestigo2;
    private javax.swing.JTextField txtEstadoCivilEsposo;
    private javax.swing.JTextField txtEstadoEsposa;
    private javax.swing.JTextField txtEstadoTestigo1;
    private javax.swing.JTextField txtEstadoTestigo2;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtFechaEsposa;
    private javax.swing.JTextField txtFechaEsposo;
    private javax.swing.JTextField txtFechaTestigo1;
    private javax.swing.JTextField txtFechaTestigo2;
    private javax.swing.JTextField txtGeneroEsposa;
    private javax.swing.JTextField txtGeneroEsposo;
    private javax.swing.JTextField txtGeneroTestigo1;
    private javax.swing.JTextField txtGeneroTestigo2;
    private javax.swing.JTextField txtNombreEsposa;
    private javax.swing.JTextField txtNombreEsposo;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTestigo1;
    private javax.swing.JTextField txtTestigo2;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtnombreTestigo1;
    private javax.swing.JTextField txtnombreTestigo2;
    // End of variables declaration//GEN-END:variables
}
