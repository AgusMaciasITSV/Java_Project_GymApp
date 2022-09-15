package Formularios;

import javax.swing.JOptionPane;

public class frmCrearPlan extends javax.swing.JFrame {

    public frmCrearPlan() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupSeries = new javax.swing.ButtonGroup();
        rbGroupReps = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        cbDias = new javax.swing.JComboBox<>();
        lblNombreEjercicio = new javax.swing.JLabel();
        cbNombreEjercicios = new javax.swing.JComboBox<>();
        lblDias = new javax.swing.JLabel();
        txtNombreEjercicio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltEjercicios = new javax.swing.JList<>();
        rb1serie = new javax.swing.JRadioButton();
        rb2serie = new javax.swing.JRadioButton();
        lblSeries = new javax.swing.JLabel();
        rb3serie = new javax.swing.JRadioButton();
        rbOtraSerie = new javax.swing.JRadioButton();
        txtSeries = new javax.swing.JTextField();
        lblReps = new javax.swing.JLabel();
        rb10reps = new javax.swing.JRadioButton();
        rb8reps = new javax.swing.JRadioButton();
        rb12reps = new javax.swing.JRadioButton();
        rbFalloreps = new javax.swing.JRadioButton();
        rbOtraReps = new javax.swing.JRadioButton();
        rb4serie = new javax.swing.JRadioButton();
        btnAñadirEjercicio = new javax.swing.JButton();
        btnAñadirDia = new javax.swing.JButton();
        lblNombrePlan = new javax.swing.JLabel();
        txtNombrePlan = new javax.swing.JTextField();
        txtReps = new javax.swing.JTextField();
        btnCrearPlan = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Crear Plan");

        cbDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiasActionPerformed(evt);
            }
        });

        lblNombreEjercicio.setText("Nombre Ejercicio");

        cbNombreEjercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNombreEjerciciosActionPerformed(evt);
            }
        });

        lblDias.setText("Dias");

        txtNombreEjercicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEjercicioKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(ltEjercicios);

        rbGroupSeries.add(rb1serie);
        rb1serie.setText("1 Serie");

        rbGroupSeries.add(rb2serie);
        rb2serie.setText("2 Series");

        lblSeries.setText("Series");

        rbGroupSeries.add(rb3serie);
        rb3serie.setText("3 Series");

        rbGroupSeries.add(rbOtraSerie);
        rbOtraSerie.setText("Otra cantidad");
        rbOtraSerie.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbOtraSerieStateChanged(evt);
            }
        });

        txtSeries.setEnabled(false);
        txtSeries.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeriesKeyTyped(evt);
            }
        });

        lblReps.setText("Repeticiones");

        rbGroupReps.add(rb10reps);
        rb10reps.setText("10 Repeticiones");

        rbGroupReps.add(rb8reps);
        rb8reps.setText("8 Repeticiones");

        rbGroupReps.add(rb12reps);
        rb12reps.setText("12 Repeticiones");

        rbGroupReps.add(rbFalloreps);
        rbFalloreps.setText("All fallo");

        rbGroupReps.add(rbOtraReps);
        rbOtraReps.setText("Otra Cantidad");
        rbOtraReps.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbOtraRepsStateChanged(evt);
            }
        });

        rbGroupSeries.add(rb4serie);
        rb4serie.setText("4 Series");

        btnAñadirEjercicio.setText("Añadir Ejercicio");
        btnAñadirEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirEjercicioActionPerformed(evt);
            }
        });

        btnAñadirDia.setText("Agregar Dia");
        btnAñadirDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirDiaActionPerformed(evt);
            }
        });

        lblNombrePlan.setText("Nombre Plan");

        txtNombrePlan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePlanKeyTyped(evt);
            }
        });

        txtReps.setEnabled(false);
        txtReps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepsKeyTyped(evt);
            }
        });

        btnCrearPlan.setText("Crear Plan");
        btnCrearPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlanActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCrearPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAñadirDia, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(rb1serie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(rb2serie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(rb3serie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(rbOtraSerie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(rb4serie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(lblSeries)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblReps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(57, 57, 57))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rb10reps)
                                                    .addComponent(rb8reps)
                                                    .addComponent(rb12reps)
                                                    .addComponent(rbFalloreps)
                                                    .addComponent(rbOtraReps)
                                                    .addComponent(txtReps, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(10, 10, 10))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombrePlan))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblNombreEjercicio)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbNombreEjercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNombreEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnAñadirEjercicio)
                                        .addGap(72, 72, 72))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnVolver)
                                        .addContainerGap())))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDias)
                    .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombrePlan)
                    .addComponent(txtNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreEjercicio)
                            .addComponent(cbNombreEjercicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSeries)
                            .addComponent(lblReps))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb1serie)
                            .addComponent(rb8reps))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb2serie)
                            .addComponent(rb10reps))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb3serie)
                            .addComponent(rb12reps))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb4serie)
                            .addComponent(rbFalloreps, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbOtraReps)
                            .addComponent(rbOtraSerie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAñadirDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAñadirEjercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // EVENTOS
    
    private void btnAñadirEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirEjercicioActionPerformed
        if(!validarCampos()) {
            return;
        }
        
        int serie, rep;
        
        String nombreEjer = txtNombreEjercicio.getText();
        
        try {
            serie = checkRadioButtons(true); // metodo solo para ordenar el codigo
            rep = checkRadioButtons(false);
            
            System.out.println(nombreEjer);
            System.out.println(serie);
            System.out.println(rep);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnAñadirEjercicioActionPerformed

    private void btnAñadirDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirDiaActionPerformed

    private void btnCrearPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearPlanActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbNombreEjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNombreEjerciciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNombreEjerciciosActionPerformed

    private void cbDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDiasActionPerformed

    private void rbOtraSerieStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbOtraSerieStateChanged
        if(rbOtraSerie.isSelected()) {
            txtSeries.setEnabled(true);
            return;
        }
        txtSeries.setText("");
        txtSeries.setEnabled(false);
        
    }//GEN-LAST:event_rbOtraSerieStateChanged

    private void rbOtraRepsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbOtraRepsStateChanged
        if(rbOtraReps.isSelected()) {
            txtReps.setEnabled(true);
            return;
        }
        txtReps.setText("");
        txtReps.setEnabled(false);
    }//GEN-LAST:event_rbOtraRepsStateChanged

    private void txtNombrePlanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePlanKeyTyped
        filtrarCaracteres(true, evt);
    }//GEN-LAST:event_txtNombrePlanKeyTyped

    private void txtNombreEjercicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEjercicioKeyTyped
        filtrarCaracteres(true, evt);
    }//GEN-LAST:event_txtNombreEjercicioKeyTyped

    private void txtSeriesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeriesKeyTyped
        filtrarCaracteres(false, evt);
    }//GEN-LAST:event_txtSeriesKeyTyped

    private void txtRepsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepsKeyTyped
        filtrarCaracteres(false, evt);
    }//GEN-LAST:event_txtRepsKeyTyped

    
    // FUNCIONES 

    private int checkRadioButtons(boolean esSerie) {
        if(esSerie) {
            
            if(rbOtraSerie.isSelected()) return Integer.parseInt(txtSeries.getText());
            
            if(rb1serie.isSelected()) return 1;
            
            if(rb2serie.isSelected()) return 2;
            
            if(rb3serie.isSelected()) return 3;
            
            if(rb4serie.isSelected()) return 4;
        }
        
        if(rbOtraReps.isSelected()) return Integer.parseInt(txtReps.getText());
        
        if(rb8reps.isSelected()) return 8;
        
        if(rb10reps.isSelected()) return 10;
        
        if(rb12reps.isSelected()) return 12;
        
        if(rbFalloreps.isSelected()) return 0; ; // cero significa al fallo
        
        return 999; // significa fallo
    }
    
    private static void filtrarCaracteres(boolean filtrarNumeros, java.awt.event.KeyEvent evt) {
        char ch = evt.getKeyChar();
        
        if(filtrarNumeros) {
            if( (ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z') ) evt.consume();
            return;
        }
        
        if(ch < '0' || ch > '9') evt.consume();
    }
    
    private boolean validarCampos() {
        if(txtNombreEjercicio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccionade/Complete el nombre de ejercicio");
            return false;
        }
        if(rbOtraReps.isSelected() || rbOtraSerie.isSelected()) {
            JOptionPane.showMessageDialog(null, "No puede completar los campos de series y/o repeciones con cero");
            return false;
        }
        if(rbOtraSerie.isSelected()) {
            if(txtSeries.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione/Complete el campo de las series");
                return false;
            }
        }
        if(rbOtraReps.isSelected()) {
            if(rbOtraReps.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione/Complete el campo de las repeticiones");
                return false;
            } 
        }
        if(checkRadioButtons(true) == checkRadioButtons(false)) { // si los dos me devuelven 999 devolver true
            JOptionPane.showMessageDialog(null, "Seleccionar algun radio button de series y/o repeticiones");
        }
        return true;
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
                new frmCrearPlan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirDia;
    private javax.swing.JButton btnAñadirEjercicio;
    private javax.swing.JButton btnCrearPlan;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbDias;
    private javax.swing.JComboBox<String> cbNombreEjercicios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblNombreEjercicio;
    private javax.swing.JLabel lblNombrePlan;
    private javax.swing.JLabel lblReps;
    private javax.swing.JLabel lblSeries;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> ltEjercicios;
    private javax.swing.JRadioButton rb10reps;
    private javax.swing.JRadioButton rb12reps;
    private javax.swing.JRadioButton rb1serie;
    private javax.swing.JRadioButton rb2serie;
    private javax.swing.JRadioButton rb3serie;
    private javax.swing.JRadioButton rb4serie;
    private javax.swing.JRadioButton rb8reps;
    private javax.swing.JRadioButton rbFalloreps;
    private javax.swing.ButtonGroup rbGroupReps;
    private javax.swing.ButtonGroup rbGroupSeries;
    private javax.swing.JRadioButton rbOtraReps;
    private javax.swing.JRadioButton rbOtraSerie;
    private javax.swing.JTextField txtNombreEjercicio;
    private javax.swing.JTextField txtNombrePlan;
    private javax.swing.JTextField txtReps;
    private javax.swing.JTextField txtSeries;
    // End of variables declaration//GEN-END:variables
}
