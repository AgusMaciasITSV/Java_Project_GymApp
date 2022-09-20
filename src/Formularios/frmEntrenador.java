package Formularios;

import Clases.Cliente;
import Clases.Dia;
import Clases.Plan;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmEntrenador extends javax.swing.JFrame {
    
    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultListModel dmList = new DefaultListModel();
    
    private ArrayList<Cliente> listaClientes;
    
    public frmEntrenador(ArrayList<Cliente> listaClientes) {
        initComponents();
        ltEjer.setModel(dmList);
        this.listaClientes = listaClientes;
        
        completarTabla();
        actualizarCbPlanes();
        actualizarCbDias();
        actualizarListaEjercicios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeClientes = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        lblPlan = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        cbDias = new javax.swing.JComboBox<>();
        btAñadirDia = new javax.swing.JButton();
        cbPlan = new javax.swing.JComboBox<>();
        btnBorrarPlan = new javax.swing.JButton();
        btnAñadirDia = new javax.swing.JButton();
        btnEliminarDia = new javax.swing.JButton();
        btnAgregarEjercicios = new javax.swing.JButton();
        lblEjercicios = new javax.swing.JLabel();
        btnEditarEjercicios = new javax.swing.JButton();
        btnEliminarEjercicios = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ltEjer = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("StayFit");

        lblClientes.setText("Clientes");

        tblDeClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDeClientes);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblPlan.setText("Planes");

        lblDia.setText("Días");

        btAñadirDia.setText("Añadir Plan");
        btAñadirDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAñadirDiaActionPerformed(evt);
            }
        });

        btnBorrarPlan.setText("Borrar Plan");
        btnBorrarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPlanActionPerformed(evt);
            }
        });

        btnAñadirDia.setText("Añadir Dia");

        btnEliminarDia.setText("Eliminar Dia");

        btnAgregarEjercicios.setText("Agregar Ejercicio");

        lblEjercicios.setText("Ejercicios");

        btnEditarEjercicios.setText("Editar Ejercicio");

        btnEliminarEjercicios.setText("Eliminar Ejercicio");

        jScrollPane2.setViewportView(ltEjer);

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
                            .addComponent(lblClientes)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(227, 227, 227))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnEliminarEjercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnEditarEjercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAgregarEjercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblEjercicios, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBorrarPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btAñadirDia)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnEliminarDia)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnAñadirDia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlan)
                            .addComponent(cbPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAñadirDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarPlan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDia)
                            .addComponent(cbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAñadirDia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEjercicios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregarEjercicios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarEjercicios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarEjercicios)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBorrarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPlanActionPerformed
        if (listaClientes.isEmpty()) {
            return;
        }
        if (tblDeClientes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente para acceder a sus planes");
            return;
        }
        if(cbPlan.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "No tienen ningun plan para borrar");
            return;
        }
        int opcion = JOptionPane.showConfirmDialog(this, "¿Estas seguro que quiere eliminar el plan?", "Confirmar eliminar plan", 0, 1);
        if(opcion == 0) {
            listaClientes.get(tblDeClientes.getSelectedRow()).getListaPlanes().remove(cbPlan.getSelectedIndex());
            actualizarCbPlanes();
            actualizarCbDias();
            actualizarListaEjercicios();
            return;
        }
        
    }//GEN-LAST:event_btnBorrarPlanActionPerformed

    private void btAñadirDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAñadirDiaActionPerformed
        this.setVisible(false);
        frmCrearPlan frmCrearPlan = new frmCrearPlan(this);
        frmCrearPlan.setVisible(true);
    }//GEN-LAST:event_btAñadirDiaActionPerformed

    private void completarTabla() {
        String[] columnas = {"Nombre", "Apellido", "Edad"};
        dtm.setColumnIdentifiers(columnas);
        
        if(listaClientes.isEmpty()) {
            return;
        }
        for (Cliente client : listaClientes) {
            String nombre = client.getInformacion().getNombre();
            String apellido = client.getInformacion().getApellido();
            String edad = String.valueOf(client.getInformacion().getEdad());
            
            String[] fila = {nombre, apellido, edad};
            
            dtm.addRow(fila);
        }
    }
    
    private void actualizarCbPlanes() {
        if(tblDeClientes.getSelectedRow() == -1) {
            return;
        }
        
        Cliente client = listaClientes.get(tblDeClientes.getSelectedRow());
        for (int i = 0; i < client.getListaPlanes().size(); i++) {
            cbPlan.addItem("Plan N°" + i);
        }
        
    }
    
    private void actualizarCbDias() {
        if(cbPlan.getSelectedIndex() == -1) {
            return;
        }
        Cliente cleint = listaClientes.get(tblDeClientes.getSelectedRow());
        Plan plan = cleint.getListaPlanes().get(cbPlan.getSelectedIndex());
        for (int i = 0; i < plan.getListaDias().size(); i++) {
            cbDias.addItem("Dia N°" + i);
        }
    }
    
    private void actualizarListaEjercicios() {
        if(cbDias.getSelectedIndex() == -1) {
            return;
        }
        Cliente cleint = listaClientes.get(tblDeClientes.getSelectedRow());
        Plan plan = cleint.getListaPlanes().get(cbPlan.getSelectedIndex());
        Dia dia = plan.getListaDias().get(cbDias.getSelectedIndex());
        
        for (int i = 0; i < dia.getListaEjercicios().size(); i++) {
            String nombre = dia.getListaEjercicios().get(i).getNombreEjercicio();
            int series = dia.getListaEjercicios().get(i).getSeries();
            int reps = dia.getListaEjercicios().get(i).getRepeticiones();
            
            if(reps != 0) { // si rep es igual a cero significa que es al fallo
                dmList.addElement(nombre + ": " + series + " x " + reps);
            } else {
                dmList.addElement(nombre + ": " + series + " x  al fallo");
            }
        }
    }
    
    public void añadirPlan(Plan plan) {
        Cliente client = listaClientes.get(tblDeClientes.getSelectedRow());
        client.getListaPlanes().add(plan);
        
        actualizarCbPlanes();
        actualizarCbDias();
        actualizarListaEjercicios();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAñadirDia;
    private javax.swing.JButton btnAgregarEjercicios;
    private javax.swing.JButton btnAñadirDia;
    private javax.swing.JButton btnBorrarPlan;
    private javax.swing.JButton btnEditarEjercicios;
    private javax.swing.JButton btnEliminarDia;
    private javax.swing.JButton btnEliminarEjercicios;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbDias;
    private javax.swing.JComboBox<String> cbPlan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblEjercicios;
    private javax.swing.JLabel lblPlan;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> ltEjer;
    private javax.swing.JTable tblDeClientes;
    // End of variables declaration//GEN-END:variables
}
