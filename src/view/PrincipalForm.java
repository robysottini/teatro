package view;

import controller.FuncionController;

/**
 *
 * @author Roberto Sottini
 */
public class PrincipalForm extends javax.swing.JFrame {

    FuncionForm formulario;
    FuncionController controller;
    long idFuncion;
    long idInformacionContacto;
    
    private InsertFuncionForm insertFuncionForm;
    //PrincipalController controller;
    
    public PrincipalForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonClientes = new javax.swing.JButton();
        BotonTeatros = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BotonFunciones = new javax.swing.JButton();
        BotonVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botonClientes.setFont(new java.awt.Font("URW Chancery L", 0, 24)); // NOI18N
        botonClientes.setForeground(new java.awt.Color(204, 102, 0));
        botonClientes.setText("Clientes");
        botonClientes.setMaximumSize(new java.awt.Dimension(102, 31));
        botonClientes.setMinimumSize(new java.awt.Dimension(102, 31));
        botonClientes.setNextFocusableComponent(BotonTeatros);
        botonClientes.setPreferredSize(new java.awt.Dimension(102, 31));
        botonClientes.setSelected(true);
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        BotonTeatros.setFont(new java.awt.Font("URW Chancery L", 0, 24)); // NOI18N
        BotonTeatros.setForeground(new java.awt.Color(204, 102, 0));
        BotonTeatros.setText("Teatros");
        BotonTeatros.setMaximumSize(new java.awt.Dimension(102, 31));
        BotonTeatros.setMinimumSize(new java.awt.Dimension(102, 31));
        BotonTeatros.setPreferredSize(new java.awt.Dimension(102, 31));
        BotonTeatros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTeatrosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("URW Chancery L", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 102, 0));
        jLabel4.setText("Teatrix");

        BotonFunciones.setFont(new java.awt.Font("URW Chancery L", 0, 24)); // NOI18N
        BotonFunciones.setForeground(new java.awt.Color(204, 102, 0));
        BotonFunciones.setText("Funciones");
        BotonFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFuncionesActionPerformed(evt);
            }
        });

        BotonVentas.setFont(new java.awt.Font("URW Chancery L", 0, 24)); // NOI18N
        BotonVentas.setForeground(new java.awt.Color(204, 102, 0));
        BotonVentas.setText("Ventas");
        BotonVentas.setMaximumSize(new java.awt.Dimension(102, 31));
        BotonVentas.setMinimumSize(new java.awt.Dimension(102, 31));
        BotonVentas.setPreferredSize(new java.awt.Dimension(102, 31));
        BotonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonFunciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(BotonVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonTeatros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonTeatros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonFunciones)
                .addGap(18, 18, 18)
                .addComponent(BotonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        ClienteForm c = new ClienteForm();
        c.setVisible(true);
    }//GEN-LAST:event_botonClientesActionPerformed

    private void BotonTeatrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTeatrosActionPerformed
        TeatroForm t = new TeatroForm();
        t.setVisible(true);
    }//GEN-LAST:event_BotonTeatrosActionPerformed

    private void BotonFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFuncionesActionPerformed
        FuncionForm f = new FuncionForm();
        f.setVisible(true);
    }//GEN-LAST:event_BotonFuncionesActionPerformed

    private void BotonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentasActionPerformed
        TicketForm v = new TicketForm();
        v.setVisible(true);
    }//GEN-LAST:event_BotonVentasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFunciones;
    private javax.swing.JButton BotonTeatros;
    private javax.swing.JButton BotonVentas;
    private javax.swing.JButton botonClientes;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
