package Formularios;

import Clases.Dia;
import Clases.Ejercicio;
import com.sun.source.tree.ParenthesizedTree;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmCrearDia extends javax.swing.JFrame {
    
    private frmCrearPlan parentPlan;
    private frmEntrenador parentEntrenador;
    private boolean isParentPlan;
    
    private DefaultListModel<String> modelDatosLista = new DefaultListModel<>();
    
    private ArrayList<Ejercicio> listaEjercicios = new ArrayList<>();
    
    public frmCrearDia(frmCrearPlan parent) {
        initComponents();
        this.parentPlan = parent;
        this.isParentPlan = true;
        this.setLocationRelativeTo(null);
              
        ltEjercicios.setModel(modelDatosLista);
    }
    public frmCrearDia(frmEntrenador parent) {
        initComponents();
        this.isParentPlan = false;
        this.parentEntrenador = parent;
        this.setLocationRelativeTo(null);
              
        ltEjercicios.setModel(modelDatosLista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupSeries = new javax.swing.ButtonGroup();
        rbGroupReps = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNombreEjercicio = new javax.swing.JLabel();
        cbNombreEjercicios = new javax.swing.JComboBox<>();
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
        btnVolver = new javax.swing.JButton();
        txtReps = new javax.swing.JTextField();
        btnAñadirDia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Formulario Plan");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Crear Dia");

        lblNombreEjercicio.setText("Nombre Ejercicio");

        cbNombreEjercicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sentadilla", "Flexion", "Dominadas", "Peso Muerto", "Remo", "Dominadas", "Curl" }));
        cbNombreEjercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNombreEjerciciosActionPerformed(evt);
            }
        });

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
        rb10reps.setSelected(true);
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

        btnVolver.setText("Cancelar");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtReps.setEnabled(false);
        txtReps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepsKeyTyped(evt);
            }
        });

        btnAñadirDia.setText("Añadir Dia");
        btnAñadirDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirDiaActionPerformed(evt);
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
                            .addComponent(btnVolver))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                        .addGap(63, 63, 63))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rb10reps)
                                            .addComponent(rb8reps)
                                            .addComponent(rb12reps)
                                            .addComponent(rbFalloreps)
                                            .addComponent(rbOtraReps)
                                            .addComponent(txtReps, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnAñadirEjercicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAñadirDia))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblNombreEjercicio)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbNombreEjercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNombreEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAñadirEjercicio)
                        .addComponent(btnAñadirDia))
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
        
        String nombreEjer = txtNombreEjercicio.getText();
        int serie = checkRadioButtons(true); // metodos solo para ordenar el codigo
        int rep = checkRadioButtons(false);
        
        Ejercicio ejer = new Ejercicio(nombreEjer, serie, rep);
        listaEjercicios.add(ejer);
        
        JOptionPane.showMessageDialog(null, "Ejercicio añadido exitosamente");
        
        limpiarCampos(serie, rep);
        actualizarListaEjercicios();
    }//GEN-LAST:event_btnAñadirEjercicioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       if(isParentPlan) {
           parentEntrenador.setVisible(true);
       }
        parent.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbNombreEjerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNombreEjerciciosActionPerformed
        txtNombreEjercicio.setText(String.valueOf(cbNombreEjercicios.getSelectedItem()));
    }//GEN-LAST:event_cbNombreEjerciciosActionPerformed

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

    private void txtNombreEjercicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEjercicioKeyTyped
        filtrarCaracteres(true, evt);
    }//GEN-LAST:event_txtNombreEjercicioKeyTyped

    private void txtSeriesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeriesKeyTyped
        filtrarCaracteres(false, evt);
    }//GEN-LAST:event_txtSeriesKeyTyped

    private void txtRepsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepsKeyTyped
        filtrarCaracteres(false, evt);
    }//GEN-LAST:event_txtRepsKeyTyped

    private void btnAñadirDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirDiaActionPerformed
        parent.añadirDia(new Dia(listaEjercicios));
        JOptionPane.showMessageDialog(null, "Se agrego dia correctamente");
        
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAñadirDiaActionPerformed

    
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
        
        return 9*9*9*9*9*9*9;  // para que no tire error por "missing return", en validarCampos se comprueba si hay alguno selec
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
        if(rbOtraSerie.isSelected()) {
            if(txtSeries.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione/Complete el campo de las series");
                return false;
            }
        }
        if(rbOtraReps.isSelected()) {
            if(txtReps.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione/Complete el campo de las series");
                return false;
            }
        }
        if(checkRadioButtons(true) == 999 || checkRadioButtons(false) == 999) { // si los dos me devuelven 999 devolver true
            JOptionPane.showMessageDialog(null, "Seleccionar algun radio button de series o repeticiones");
        }
        return true;
    }
    
    private void limpiarCampos(int serie, int rep) {
        txtNombreEjercicio.setText("");
        txtSeries.setText("");
        txtReps.setText("");
        
        // solucion momentanea: no puedo deseleleccionar todos los radio buttons por ser parte de un gruop button
        rb1serie.setSelected(true);
        rb8reps.setSelected(true);
        
        //solucion no anda
        /*
        switch (serie) {
            case 1 -> rb1serie.setSelected(false);
            case 2 -> rb2serie.setSelected(false);
            case 3 -> rb2serie.setSelected(false);
            case 4 -> rb4serie.setSelected(false);
            default -> rbOtraSerie.setSelected(false);
        }
        
        switch (rep) {
            case 8 -> rb8reps.setSelected(false);
            case 10 -> rb10reps.setSelected(false);
            case 12 -> rb12reps.setSelected(false);
            case 0 -> rbFalloreps.setSelected(false);
            default -> rbOtraReps.setSelected(false);
        }
        */
    }
    
    private void actualizarListaEjercicios() {
        
        modelDatosLista.clear();
        
        for (Ejercicio ejer : listaEjercicios) {
            
            String nombreEjer = ejer.getNombreEjercicio();
            int series = ejer.getSeries();
            int rep = ejer.getRepeticiones();
            
            if(rep != 0) { // si rep es igual a cero significa que es al fallo
                modelDatosLista.addElement(nombreEjer + ": " + series + " x " + rep);
            } else {
                modelDatosLista.addElement(nombreEjer + ": " + series + " x  al fallo");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirDia;
    private javax.swing.JButton btnAñadirEjercicio;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbNombreEjercicios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreEjercicio;
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
    private javax.swing.JTextField txtReps;
    private javax.swing.JTextField txtSeries;
    // End of variables declaration//GEN-END:variables
}
