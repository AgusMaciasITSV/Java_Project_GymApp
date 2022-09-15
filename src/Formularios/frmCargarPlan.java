package Formularios;

import Clases.Dia;
import Clases.Ejercicio;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class frmCargarPlan extends javax.swing.JFrame {
    
    private frmInicio_tmp parent;
    private ArrayList<Ejercicio> listaEjercicio = new ArrayList();
    
    private ArrayList<Dia> listaDias = new ArrayList();
    
    private DefaultListModel dmLista = new DefaultListModel();
    private DefaultComboBoxModel dmCbDias = new DefaultComboBoxModel();
    
    public frmCargarPlan() {
        iniciarComponentes();
        this.setLocationRelativeTo(null);
        
       // this.parent = frmInicio;
        
        this.listEjercicios.setModel(dmLista);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Iniciar Componentes">                          
    private void iniciarComponentes() {

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
        btnVerEjercicios = new javax.swing.JButton();

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

        jLabel2.setText("Ejercicios");

        jButton1.setText("Cancelar");

        btnVerEjercicios.setText("Ver Ejercicios");
        btnVerEjercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEjerciciosActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVerEjercicios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAñadirDia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAñadirEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVolver))
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
                                                .addComponent(txtRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerEjercicios, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblEjercicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(13, Short.MAX_VALUE))
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
    }// </editor-fold>
    
    //NO USAR
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
        btnVerEjercicios = new javax.swing.JButton();

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

        jLabel2.setText("Ejercicios");

        jButton1.setText("Cancelar");

        btnVerEjercicios.setText("Ver Ejercicios");
        btnVerEjercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEjerciciosActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVerEjercicios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAñadirDia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAñadirEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVolver))
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
                                                .addComponent(txtRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerEjercicios, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblEjercicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(13, Short.MAX_VALUE))
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
        
        listaEjercicio.add(ejercicio);
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

    private void btnAñadirDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirDiaActionPerformed
        if(listaEjercicio.isEmpty()){
            JOptionPane.showMessageDialog(null, "Tienes que agregar ejercicios al dia");
            return;
        }
        
        listaDias.add(new Dia(listaEjercicio));
        listaEjercicio = new ArrayList();
        
        cbDias.addItem("Dia " + (listaDias.size() + 1));
        cbDias.setSelectedIndex(listaDias.size());
        
        dmLista.clear();
    }//GEN-LAST:event_btnAñadirDiaActionPerformed

    private void btnVerEjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEjerciciosActionPerformed
        if(cbDias.getSelectedIndex() == (cbDias.getItemCount() - 1)) {
            actualizarListaEjercicio();
        }
        try {
            listaEjercicio = listaDias.get(cbDias.getSelectedIndex()).getListaEjercicios();
            actualizarListaEjercicio();
        } catch (Exception e) {
            if(!listaEjercicio.isEmpty()) {
                actualizarListaEjercicio();
                return;
            }
            JOptionPane.showMessageDialog(null, "No ha cargado ningun ejercicio");
        }
    }//GEN-LAST:event_btnVerEjerciciosActionPerformed

    
    // FUNCIONES
    
    private void actualizarListaEjercicio() {
        dmLista.clear();
        
        if(listaEjercicio.isEmpty()) {
            return;
        }
        
        for (int i = 0; i < listaEjercicio.size(); i++) {
            
            String nombre = listaEjercicio.get(i).getNombreEjercicio();
            int series = listaEjercicio.get(i).getSeries();
            int reps = listaEjercicio.get(i).getRepeticiones();
            
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
    private javax.swing.JButton btnVerEjercicios;
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
