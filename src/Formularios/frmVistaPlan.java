
package Formularios;

import Clases.Dia;
import Clases.Ejercicio;
import Clases.Plan;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class frmVistaPlan extends javax.swing.JFrame {

    private frmInicio_tmp parent;
    private DefaultListModel dmList = new DefaultListModel();
    
    private ArrayList<Plan> listaPlanes = new ArrayList();

    
    public frmVistaPlan(frmInicio_tmp parent) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.parent = parent;
        
        ltEjercicios.setModel(dmList);
        
        if(parent.getListaPlanes().isEmpty()) {
            JOptionPane.showConfirmDialog(null, "No ha creado ningun plan todavia");
        }
        listaPlanes = parent.getListaPlanes();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlanes)
                            .addComponent(lblDias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbPlanes, 0, 103, Short.MAX_VALUE)
                                .addComponent(cbDias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnVolver))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlanes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDias))
                        .addGap(62, 62, 62)
                        .addComponent(btnVolver))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        try {
            Dia dia = listaPlanes.get(cbPlanes.getSelectedIndex()).getListaDias().get(cbDias.getSelectedIndex());
        
            dmList.clear();
        for (int i = 0; i < dia.getListaEjercicios().size(); i++) {
            Ejercicio ejercicio = dia.getEjercicioDeLista(i);
            
            dmList.addElement(ejercicio.getNombreEjercicio() + ": " + ejercicio.getSeries() + " x " + ejercicio.getSeries());
        }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_cbDiasActionPerformed

    private void actualizarCbPlanes() {
        cbPlanes.removeAllItems();
        for (int i = 0; i < listaPlanes.size(); i++) {
            cbPlanes.addItem("Plan N°" + (i+1));
        }
    }
    
    private void actualizarCbDias() {
        cbDias.removeAllItems();
        for (int i = 0; i < listaPlanes.get(cbPlanes.getSelectedIndex()).getListaDias().size(); i++) {
            cbDias.addItem("Dia N°" + (i+1));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbDias;
    private javax.swing.JComboBox<String> cbPlanes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblPlanes;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> ltEjercicios;
    // End of variables declaration//GEN-END:variables
}
