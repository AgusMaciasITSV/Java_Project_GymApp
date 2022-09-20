
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

    public frmVistaPlan(frmEntrenador parent, Cliente client) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.parent = parent;
        ltEjercicios.setModel(dmList);
        
        this.cliente = client;
        
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
        btnEliminarPlan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnAñadirPlan1 = new javax.swing.JButton();
        btnAñadirPlan2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiasActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Planes del Cliente");

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
        btnAñadirPlan.setBorder(null);
        btnAñadirPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirPlanActionPerformed(evt);
            }
        });

        btnEliminarPlan.setText("Eliminar Plan");
        btnEliminarPlan.setBorder(null);
        btnEliminarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPlanActionPerformed(evt);
            }
        });

        jLabel1.setText("Ejercicios");

        jButton5.setText("Eliminar Dia");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnAñadirPlan1.setText("Añadir Dia");
        btnAñadirPlan1.setBorder(null);
        btnAñadirPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirPlan1ActionPerformed(evt);
            }
        });

        btnAñadirPlan2.setText("Añadir Ejercicio");
        btnAñadirPlan2.setBorder(null);
        btnAñadirPlan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirPlan2ActionPerformed(evt);
            }
        });

        jButton7.setText("Editar Ejercicio");
        jButton7.setBorder(null);

        jButton8.setText("Eliminar Ejercicio");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAñadirPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAñadirPlan1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPlanes)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDias, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAñadirPlan2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlanes)
                            .addComponent(cbPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarPlan)
                            .addComponent(btnAñadirPlan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDias)
                            .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(btnAñadirPlan1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAñadirPlan2))
                    .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
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
        dmList.clear();
        
        Dia dia = 
                cliente.getListaPlanes().
                get(cbPlanes.getSelectedIndex()).
                        getListaDias().
                        get(cbDias.getSelectedIndex());
        
        if(dia.getListaEjercicios().isEmpty()) {
            return;
        }
        
        for (Ejercicio ejer : dia.getListaEjercicios()) {
            
            String nombreEjer = ejer.getNombreEjercicio();
            int series = ejer.getSeries();
            int reps = ejer.getRepeticiones();
            
            if(reps == 0) {
                dmList.addElement(nombreEjer + ": " + series + " x al fallo");
            } else {
                dmList.addElement(nombreEjer + ": " + series + " x " + reps);
            }
        }
    }//GEN-LAST:event_cbDiasActionPerformed

    private void btnAñadirPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirPlanActionPerformed
        this.setVisible(false);
        frmCargarPlan frmCargarPlan = new frmCargarPlan();
    }//GEN-LAST:event_btnAñadirPlanActionPerformed

    private void btnEliminarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPlanActionPerformed
        if(cbPlanes.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "No tiene ningun plan para eliminar");
            return;
        }
        
        int index = cbPlanes.getSelectedIndex();
        cliente.getListaPlanes().remove(index);
        
        actualizarCbPlanes();
    }//GEN-LAST:event_btnEliminarPlanActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnAñadirPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirPlan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirPlan1ActionPerformed

    private void btnAñadirPlan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirPlan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirPlan2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void actualizarCbPlanes() {
        cbPlanes.removeAllItems();
        
        if(cliente.getListaPlanes().isEmpty()) {
            return;
        }
        
        for (int i = 0; i < cliente.getListaPlanes().size(); i++) {
            cbPlanes.addItem("Plan N°" + (i+1));
        }
        
        actualizarCbDias();
    }
    
    private void actualizarCbDias() {
        cbDias.removeAllItems();
        
        if(cliente.getListaPlanes().isEmpty()) {
            return;
        }
        
        int cantDias = 
                cliente.getListaPlanes().
                get(cbPlanes.getSelectedIndex()).
                getListaDias().size();
        
        for (int i = 0; i < cantDias; i++) {
            cbDias.addItem("Dia N°" + (i+1));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirPlan;
    private javax.swing.JButton btnAñadirPlan1;
    private javax.swing.JButton btnAñadirPlan2;
    private javax.swing.JButton btnEliminarPlan;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbDias;
    private javax.swing.JComboBox<String> cbPlanes;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
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
