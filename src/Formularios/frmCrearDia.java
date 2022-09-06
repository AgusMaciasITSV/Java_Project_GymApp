package Formularios;

import Clases.Ejercicio;
import Clases.Dia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

/**
 *
 * @author orell
 */
public class frmCrearDia extends javax.swing.JFrame {

    private ArrayList<Ejercicio> listaEjercicio = new ArrayList();
    private DefaultListModel dmList = new DefaultListModel();
    
    frmCrearPlan parent;
    
    public frmCrearDia(frmCrearPlan parent) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.parent = parent;
        ltEjercicio.setModel(dmList);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltEjercicio = new javax.swing.JList<>();
        lblNombreEjercicio = new javax.swing.JLabel();
        lblSubTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSeries = new javax.swing.JLabel();
        txtSeries = new javax.swing.JTextField();
        lblRepeticiones = new javax.swing.JLabel();
        txtRepeticiones = new javax.swing.JTextField();
        btnAñadirEjercicio = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCrearDia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Formulario Dia ");

        jScrollPane1.setViewportView(ltEjercicio);

        lblNombreEjercicio.setText("Nombre del Ejercicio");

        lblSubTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSubTitulo.setText("Crear Ejercicio");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblSeries.setText("Series");

        txtSeries.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeriesKeyTyped(evt);
            }
        });

        lblRepeticiones.setText("Repeticiones");

        txtRepeticiones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRepeticionesKeyTyped(evt);
            }
        });

        btnAñadirEjercicio.setText("Añadir Ejercicio");
        btnAñadirEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirEjercicioActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCrearDia.setText("Crear Dia");
        btnCrearDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(btnAñadirEjercicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblNombreEjercicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombre))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSubTitulo)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSeries)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnCrearDia, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSubTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreEjercicio)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSeries)
                            .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRepeticiones)
                            .addComponent(txtRepeticiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAñadirEjercicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnCrearDia))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirEjercicioActionPerformed
        if(validacionEjercicio() == false) {
            return;
        }
        
        String nombreEjercicio = txtNombre.getText();
        int series = Integer.parseInt(txtSeries.getText());
        int repeticiones = Integer.parseInt(txtRepeticiones.getText());
        
        vaciarTxt();
        listaEjercicio.add(new Ejercicio(nombreEjercicio, repeticiones, series));
        
        dmList.addElement(nombreEjercicio + ": " + series + " x " + repeticiones);
    }//GEN-LAST:event_btnAñadirEjercicioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCrearDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDiaActionPerformed
        parent.añadirDia(new Dia(listaEjercicio));
        JOptionPane.showMessageDialog(null, "Se agrego el dia correctamente");
        
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearDiaActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char ch = evt.getKeyChar();
        if( (ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z') ) evt.consume();
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtSeriesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeriesKeyTyped
        char ch = evt.getKeyChar();
        if(ch < '0' || ch > '9') evt.consume();
    }//GEN-LAST:event_txtSeriesKeyTyped

    private void txtRepeticionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRepeticionesKeyTyped
        char ch = evt.getKeyChar();
        if(ch < '0' || ch > '9') evt.consume();
    }//GEN-LAST:event_txtRepeticionesKeyTyped

    private boolean validacionEjercicio() {
        if(txtNombre.getText().equals("")) {
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
    
    private void vaciarTxt() {
        txtNombre.setText("");
        txtSeries.setText("");
        txtRepeticiones.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirEjercicio;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearDia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreEjercicio;
    private javax.swing.JLabel lblRepeticiones;
    private javax.swing.JLabel lblSeries;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> ltEjercicio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRepeticiones;
    private javax.swing.JTextField txtSeries;
    // End of variables declaration//GEN-END:variables
}
