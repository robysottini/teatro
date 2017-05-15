package view;

import controller.FuncionController;
import controller.FuncionTableModel;
import dao.FuncionDao;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Sottini
 */
public class FuncionForm extends javax.swing.JFrame {

    private InsertFuncionForm insertFuncionForm;
    FuncionController controller;

    public FuncionForm() {
        this.insertFuncionForm = new InsertFuncionForm(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        funcionTable = new javax.swing.JTable();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funciones");

        funcionTable.setModel(new controller.FuncionTableModel());
        jScrollPane1.setViewportView(funcionTable);

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(botonInsertar)
                .addGap(18, 18, 18)
                .addComponent(botonModificar)
                .addGap(18, 18, 18)
                .addComponent(botonBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrar)
                    .addComponent(botonModificar)
                    .addComponent(botonInsertar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        this.insertFuncionForm.clear();
        this.insertFuncionForm.setVisible(true);
        this.insertFuncionForm.mostrarBotonModificar(false);
        this.insertFuncionForm.mostrarBotonGuardar(true);

    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        int filaSeleccionada = this.funcionTable.getSelectedRow();
        if (filaSeleccionada != -1) {
            Long   idFuncion = (Long)   this.funcionTable.getModel().getValueAt(filaSeleccionada, 0);
            Date   fecha     = (Date)   this.funcionTable.getModel().getValueAt(filaSeleccionada, 1);
            String nombre    = (String) this.funcionTable.getModel().getValueAt(filaSeleccionada, 2);
            String precio    = (String) this.funcionTable.getModel().getValueAt(filaSeleccionada, 3);
            Long   idTeatro  = (Long)   this.funcionTable.getModel().getValueAt(filaSeleccionada, 4);
                                    
            this.insertFuncionForm.clear();
            this.insertFuncionForm.setVisible(true);
            this.insertFuncionForm.mostrarBotonModificar(true);
            this.insertFuncionForm.mostrarBotonGuardar(false);
            this.insertFuncionForm.completar(
                    idFuncion, 
                    fecha, 
                    nombre, 
                    precio, 
                    idTeatro
            );
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una función.");
        }

    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int filaSeleccionada = this.funcionTable.getSelectedRow();
        if (filaSeleccionada != -1) {
            Long   idFuncion = (Long)   this.funcionTable.getModel().getValueAt(filaSeleccionada, 0);
            Date   fecha     = (Date)   this.funcionTable.getModel().getValueAt(filaSeleccionada, 1);
            String nombre    = (String) this.funcionTable.getModel().getValueAt(filaSeleccionada, 2);
            Double precio    = Double.parseDouble((String) this.funcionTable.getModel().getValueAt(filaSeleccionada, 3));
            Long   idTeatro  = (Long)   this.funcionTable.getModel().getValueAt(filaSeleccionada, 4);
            
            this.controller = new FuncionController(
                    idFuncion, 
                    fecha, 
                    nombre, 
                    precio, 
                    idTeatro
            );
            //this.controller.borrar();
            this.updateForm();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una función.");
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FuncionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTable funcionTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    void updateForm() {
        //Relleno la tabla.
        ((FuncionTableModel) this.funcionTable.getModel()).update();
    }
}
