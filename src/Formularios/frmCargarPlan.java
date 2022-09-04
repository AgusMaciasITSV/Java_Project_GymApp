/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Ejercicio;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author agust
 */
public class frmCargarPlan extends javax.swing.JFrame {
    
    private frmInicio_tmp parent;
    
    private ArrayList<ArrayList<Ejercicio>> listaDias = new ArrayList();
    private int indexDiaSelected;
    
    private DefaultListModel dmLista = new DefaultListModel();
    
    public frmCargarPlan() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        //this.parent = frmInicio;
        
        this.listEjercicios.setModel(dmLista);
        
        listaDias.add(new ArrayList<Ejercicio>());
        actualizarCbDias();
        actualizarListaEjercicio();
        indexDiaSelected = cbDias.getSelectedIndex();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDia = new javax.swing.JLabel();
        btnAñadirEjercicio = new javax.swing.JButton();
        btnAñadirDia = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblEjercicio = new javax.swing.JLabel();
        lblSeries = new javax.swing.JLabel();
        lblRepeticiones = new javax.swing.JLabel();
        txtEjercicio = new javax.swing.JTextField();
        txtSeries = new javax.swing.JTextField();
        txtRepeticiones = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEjercicios = new javax.swing.JList<>();
        cbDias = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDia.setText("Creando Plan");

        btnAñadirEjercicio.setText("Añadir Ejercicio");
        btnAñadirEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirEjercicioActionPerformed(evt);
            }
        });

        btnAñadirDia.setText("Añadir Dia");
        btnAñadirDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirDiaActionPerformed(evt);
            }
        });

        btnVolver.setText("Crear Plan");

        lblEjercicio.setText("Añadir Ejercicio");

        lblSeries.setText("Series");

        lblRepeticiones.setText("Repeticiones");

        txtEjercicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEjercicioKeyTyped(evt);
            }
        });

        txtSeries.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeriesKeyTyped(evt);
            }
        });

        txtRepeticiones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepeticionesKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(listEjercicios);

        cbDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia 1" }));
        cbDias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDiasItemStateChanged(evt);
            }
        });

        jLabel2.setText("Ejercicios");

        jButton1.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEjercicio)
                                            .addComponent(lblEjercicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAñadirDia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAñadirEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVolver)))))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblEjercicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSeries)
                            .addComponent(lblRepeticiones)
                            .addComponent(txtRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAñadirEjercicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAñadirDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolver)
                            .addComponent(jButton1))
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // EVENTOS
    
    private void btnAñadirEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirEjercicioActionPerformed
        if(this.estaValidacionEjercicio() == false) {
            return;
        }
        
        String nombreEjercicio = txtEjercicio.getText();
        int series = Integer.parseInt(txtSeries.getText());
        int repeticiones = Integer.parseInt(txtRepeticiones.getText());
        
        Ejercicio ejercicio = new Ejercicio(nombreEjercicio, repeticiones, series);
        JOptionPane.showMessageDialog(null, "Ejercicio añadido exitosamente");
        
        vaciarTxt();
        
        listaEjerciciosDelDia.add(ejercicio);
        actualizarListaEjercicio();
    }//GEN-LAST:event_btnAñadirEjercicioActionPerformed

    private void txtEjercicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEjercicioKeyTyped
        char ch = evt.getKeyChar();
        if( (ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z') ) evt.consume();
    }//GEN-LAST:event_txtEjercicioKeyTyped

    private void txtSeriesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeriesKeyTyped
        char ch = evt.getKeyChar();
        if(ch < '0' || ch > '9') evt.consume();
    }//GEN-LAST:event_txtSeriesKeyTyped

    private void txtRepeticionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepeticionesKeyTyped
        char ch = evt.getKeyChar();
        if(ch < '0' || ch > '9') evt.consume();
    }//GEN-LAST:event_txtRepeticionesKeyTyped

    private void cbDiasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDiasItemStateChanged
        int indiceDiaSeleccion = cbDias.getSelectedIndex();
        System.out.println("indiceDiaSeleccion:" + indiceDiaSeleccion);
        listaDias.get(indexDiaSelected) = listaDias.get(indiceDiaSeleccion);
        
        actualizarListaEjercicio();
    }//GEN-LAST:event_cbDiasItemStateChanged

    private void btnAñadirDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirDiaActionPerformed
        if(listaEjerciciosDelDia.isEmpty()){
            JOptionPane.showMessageDialog(null, "Tienes que agregar ejercicios al dia");
            return;
        }
        
        listaDias.add(listaEjerciciosDelDia);
        listaEjerciciosDelDia.clear();
        
        actualizarCbDias();
        // TEST: cbDias.setSelectedIndex(cbDias.getItemCount() - 1);
    }//GEN-LAST:event_btnAñadirDiaActionPerformed

    
    // FUNCIONES
    
    private void actualizarListaEjercicio() {
        dmLista.clear();
        
        if(listaEjerciciosDelDia.isEmpty()) {
            return;
        }
        
        for (int i = 0; i < listaEjerciciosDelDia.size(); i++) {
            String nombre = listaEjerciciosDelDia.get(i).getNombreEjercicio();
            int series = listaEjerciciosDelDia.get(i).getSeries();
            int reps = listaEjerciciosDelDia.get(i).getRepeticiones();
            
            dmLista.addElement(nombre+": " + series + " x "+ reps);
        }
        
    }
    
    private boolean estaValidacionEjercicio() {
        if(txtEjercicio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar el nombre de ejercicio para añadir el ejercicio");
            return false;
        }
        if(txtRepeticiones.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar el las repeticiones para añadir el ejercicio");
            return false;
        }
        if(txtSeries.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar las series para añadir el ejercicio");
            return false;
        }
        
        if(txtSeries.getText().equals("0") || txtRepeticiones.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "No puede completar los campos de series y/o repeciones con cero");
            return false;
        }
        
        return true;
    }
    
    private void actualizarCbDias() {
        cbDias.removeAllItems();
        
        for (int i = 0; i < listaDias.size(); i++) {
            cbDias.addItem("Dia " + (i+1));
        }
    }
    
    private void vaciarTxt() {
        txtEjercicio.setText("");
        txtSeries.setText("");
        txtRepeticiones.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(frmInicio_tmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio_tmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio_tmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio_tmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCargarPlan().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Declaracio variables">    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirDia;
    private javax.swing.JButton btnAñadirEjercicio;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbDias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblEjercicio;
    private javax.swing.JLabel lblRepeticiones;
    private javax.swing.JLabel lblSeries;
    private javax.swing.JList<String> listEjercicios;
    private javax.swing.JTextField txtEjercicio;
    private javax.swing.JTextField txtRepeticiones;
    private javax.swing.JTextField txtSeries;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>  
}
