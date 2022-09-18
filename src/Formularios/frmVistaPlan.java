
package Formularios;

import Clases.Cliente;
import Clases.Dia;
import Clases.Ejercicio;
import Clases.Plan;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmVistaPlan extends javax.swing.JFrame {

    private Cliente cliente;
    
    private frmEntrenador parent;
    private DefaultListModel dmList = new DefaultListModel();

    public frmVistaPlan(frmEntrenador parent) {
        this.parent = parent;
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        ltEjercicios.setModel(dmList);
        
        String nombre = cliente.getInformacion().getNombre();
        lblNombre.setText(lblNombre.getText() + nombre);
        
        String apellido = cliente.getInformacion().getApellido();
        lblApellido.setText(lblNombre.getText() + apellido);
        
        int edad = cliente.getInformacion().getEdad();
        lblEdad.setText(lblNombre.getText() + edad);
        
        actualizarCbPlanes();
        actualizarCbDias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbDias = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltEjercicios = new javax.swing.JList<>();
        cbPlanes = new javax.swing.JComboBox<>();
        lblPlanes = new javax.swing.JLabel();
        lblDias = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        btnAñadirPlan = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiasActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Ver Planes");

        jScrollPane1.setViewportView(ltEjercicios);

        cbPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlanesActionPerformed(evt);
            }
        });

        lblPlanes.setText("Planes");

        lblDias.setText("Dias");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre:");

        lblApellido.setText("Apellido:");

        lblEdad.setText("Edad:");

        btnAñadirPlan.setText("Añadir Plan");
        btnAñadirPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirPlanActionPerformed(evt);
            }
        });

        jButton3.setText("Editar Plan");

        jButton4.setText("Eliminar Plan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnVolver))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDias, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPlanes)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAñadirPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlanes)
                            .addComponent(cbPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDias)
                            .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(btnAñadirPlan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnVolver)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlanesActionPerformed
        actualizarCbDias();
    }//GEN-LAST:event_cbPlanesActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiasActionPerformed
        Dia dia = 
                cliente.getListaPlanes().
                get(cbPlanes.getSelectedIndex()).
                        getListaDias().
                        get(cbDias.getSelectedIndex());
        
        dmList.clear();
        
        for (int i = 0; i < dia.getListaEjercicios().size(); i++) {
            Ejercicio ejercicio = dia.getListaEjercicios().get(i);
            dmList.addElement(ejercicio.getNombreEjercicio() + ": " + ejercicio.getSeries() + " x " + ejercicio.getSeries());
        }
    }//GEN-LAST:event_cbDiasActionPerformed

    private void btnAñadirPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirPlanActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAñadirPlanActionPerformed

    private void actualizarCbPlanes() {
        cbPlanes.removeAllItems();
        if(cliente.getListaPlanes().isEmpty()) {
            return;
        }
        for (int i = 0; i < cliente.getListaPlanes().size(); i++) {
            cbPlanes.addItem("Plan N°" + (i+1));
        }
    }
    
    private void actualizarCbDias() {
        cbDias.removeAllItems();
        if(cliente.getListaPlanes().isEmpty()) {
            return;
        }
        
        int cantDias = 
                cliente.getListaPlanes().
                get( cbPlanes.getSelectedIndex()).
                getListaDias().size();
        
        for (int i = 0; i < cantDias; i++) {
            cbDias.addItem("Dia N°" + (i+1));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirPlan;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbDias;
    private javax.swing.JComboBox<String> cbPlanes;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPlanes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> ltEjercicios;
    // End of variables declaration//GEN-END:variables
}
