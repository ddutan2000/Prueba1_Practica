/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.*;
import ec.edu.ups.modelo.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dutan2000
 */
public class ListarDatos extends javax.swing.JInternalFrame {
    private ControladorRegistro controladorR;
    private ControladorUsuario controladorU;
    private ControladorPersona controladorP;
    private Persona esposo;
    private Persona esposa;
    private Usuario juez;
    private Persona testigo1;
    private Persona testigo2;
    private Registro registrar;
    
    

    public ListarDatos(ControladorRegistro controladorRegistro, ControladorPersona controladorPersona, ControladorUsuario controladorUsuario ) {
        initComponents();
        controladorR=controladorRegistro;
        controladorP=controladorPersona;
        controladorU=controladorUsuario;
        VistaRegistros();
    }
    
    public void VistaRegistros() {
        List<Registro> listaDeregistros = controladorR.findAllRegistros();

        DefaultTableModel modelo = (DefaultTableModel) tablaDeDatos.getModel();
        modelo.setRowCount(0);
        tablaDeDatos.setModel(modelo);
        Object[] fila = new Object[8];
        for (Registro registros : listaDeregistros) {
            fila[0] = registros.getId();
            fila[1] = registros.getFechaDeMatrimonio();
            fila[2] = registros.getTestigo1();
            fila[3] = registros.getTestigo2();
            fila[4] = registros.getLugarDeCelebracion();
            fila[5] = registros.getJuez();
            fila[6] = registros.getMarido();
            fila[7] = registros.getMujer();
            modelo.addRow(fila);
        }
        tablaDeDatos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeDatos = new javax.swing.JTable();
        btnMostrar = new javax.swing.JToggleButton();
        vtnDivorciar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreJuez = new javax.swing.JTextField();
        txtApellidoJuez = new javax.swing.JTextField();
        txtApellidoMarido = new javax.swing.JTextField();
        txtNombreMarido = new javax.swing.JTextField();
        txtApellidoEsposa = new javax.swing.JTextField();
        txtNombreEsposa = new javax.swing.JTextField();
        txtApellidoTestigo1 = new javax.swing.JTextField();
        txtNombreTestigo1 = new javax.swing.JTextField();
        txtApellidoTestigo2 = new javax.swing.JTextField();
        txtNombreTestigo2 = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        tablaDeDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACTA", "FECHA", "TESTIGO", "TESTIGO", "UBICACION", "JUEZ", "MARIDO", "ESPOSA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDeDatos);

        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        vtnDivorciar.setText("DIVORCIAR");
        vtnDivorciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtnDivorciarActionPerformed(evt);
            }
        });

        jLabel1.setText("JUEZ:");

        jLabel2.setText("MARIDO:");

        jLabel3.setText("ESPOSA:");

        jLabel4.setText("TESTIGO1:");

        jLabel5.setText("TESTIGO2:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vtnDivorciar)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidoTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidoTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(txtNombreJuez, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidoJuez, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombreEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidoEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombreMarido, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellidoMarido, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(vtnDivorciar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreJuez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoJuez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreMarido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidoMarido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidoEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidoTestigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidoTestigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vtnDivorciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtnDivorciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vtnDivorciarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int filaSelecionada=tablaDeDatos.getSelectedRow();
        int juez=Integer.parseInt(tablaDeDatos.getValueAt(filaSelecionada, 5).toString());
        int marido=Integer.parseInt(tablaDeDatos.getValueAt(filaSelecionada, 6).toString());
        int esposa=Integer.parseInt(tablaDeDatos.getValueAt(filaSelecionada, 7).toString());
        int testigo1=Integer.parseInt(tablaDeDatos.getValueAt(filaSelecionada, 2).toString());
        int testigo2=Integer.parseInt(tablaDeDatos.getValueAt(filaSelecionada, 3).toString());
        
        this.juez=controladorU.buscarUsuario(juez);
        this.esposa=controladorP.read(esposa);
        this.testigo1=controladorP.read(testigo1);
        this.testigo2=controladorP.read(testigo2);
        this.esposo=controladorP.read(marido);
        
        txtNombreJuez.setText(this.juez.getNombre());
        txtApellidoJuez.setText(this.juez.getApellido());
        txtNombreEsposa.setText(this.esposa.getNombre());
        txtApellidoEsposa.setText(this.esposa.getApellido());
        txtNombreMarido.setText(this.esposo.getNombre());
        txtApellidoMarido.setText(this.esposo.getApellido());
        txtNombreTestigo1.setText(this.testigo1.getNombre());
        txtApellidoTestigo1.setText(this.testigo1.getApellido());
        txtNombreTestigo2.setText(this.testigo2.getNombre());
        txtApellidoTestigo2.setText(this.testigo2.getApellido());
    }//GEN-LAST:event_btnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDeDatos;
    private javax.swing.JTextField txtApellidoEsposa;
    private javax.swing.JTextField txtApellidoJuez;
    private javax.swing.JTextField txtApellidoMarido;
    private javax.swing.JTextField txtApellidoTestigo1;
    private javax.swing.JTextField txtApellidoTestigo2;
    private javax.swing.JTextField txtNombreEsposa;
    private javax.swing.JTextField txtNombreJuez;
    private javax.swing.JTextField txtNombreMarido;
    private javax.swing.JTextField txtNombreTestigo1;
    private javax.swing.JTextField txtNombreTestigo2;
    private javax.swing.JToggleButton vtnDivorciar;
    // End of variables declaration//GEN-END:variables
}
