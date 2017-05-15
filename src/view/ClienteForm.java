package view;

import Entidades.Cliente;
//import controller.LibroTableModel;
import controller.ClienteController;
import controller.ClienteTableModel;
import dao.ClienteDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Sottini
 */
public class ClienteForm extends javax.swing.JFrame {

    private InsertClienteForm insertClienteForm;
    ClienteController controller;

    /**
     * Creates new form ClienteForm
     */
    public ClienteForm() {
        this.insertClienteForm = new InsertClienteForm(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        clienteTable = new javax.swing.JTable();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        clienteTable.setModel(new controller.ClienteTableModel());
        jScrollPane1.setViewportView(clienteTable);

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
        this.insertClienteForm.clear();
        this.insertClienteForm.setVisible(true);
        this.insertClienteForm.mostrarBotonModificar(false);
        this.insertClienteForm.mostrarBotonGuardar(true);

    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        int filaSeleccionada = this.clienteTable.getSelectedRow();
        if (filaSeleccionada != -1) {
            Long    idCliente    = (Long)    this.clienteTable.getModel().getValueAt(filaSeleccionada, 0);
            Integer documento    = (Integer) this.clienteTable.getModel().getValueAt(filaSeleccionada, 1);
            String  nombre       =           this.clienteTable.getModel().getValueAt(filaSeleccionada, 2).toString();
            String  apellido     =           this.clienteTable.getModel().getValueAt(filaSeleccionada, 3).toString();
            Integer telefono     = (Integer) this.clienteTable.getModel().getValueAt(filaSeleccionada, 4);
            String  calle        =           this.clienteTable.getModel().getValueAt(filaSeleccionada, 5).toString();
            Integer numero       = (Integer) this.clienteTable.getModel().getValueAt(filaSeleccionada, 6);
            Integer codigoPostal = (Integer) this.clienteTable.getModel().getValueAt(filaSeleccionada, 7);
                                    
            this.insertClienteForm.clear();
            this.insertClienteForm.setVisible(true);
            this.insertClienteForm.mostrarBotonModificar(true);
            this.insertClienteForm.mostrarBotonGuardar(false);
            this.insertClienteForm.completar(
                    idCliente, 
                    documento.toString(), 
                    nombre, 
                    apellido, 
                    telefono.toString(), 
                    calle, 
                    numero.toString(), 
                    codigoPostal.toString()
            );
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente.");
        }

    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int filaSeleccionada = this.clienteTable.getSelectedRow();
        if (filaSeleccionada != -1) {
            Long    idCliente    = (Long)    this.clienteTable.getModel().getValueAt(filaSeleccionada, 0);
            Integer documento    = (Integer) this.clienteTable.getModel().getValueAt(filaSeleccionada, 1);
            String  nombre       =           this.clienteTable.getModel().getValueAt(filaSeleccionada, 2).toString();
            String  apellido     =           this.clienteTable.getModel().getValueAt(filaSeleccionada, 3).toString();
            Integer telefono     = (Integer) this.clienteTable.getModel().getValueAt(filaSeleccionada, 4);
            String  calle        =           this.clienteTable.getModel().getValueAt(filaSeleccionada, 5).toString();
            Integer numero       = (Integer) this.clienteTable.getModel().getValueAt(filaSeleccionada, 6);
            Integer codigoPostal = (Integer) this.clienteTable.getModel().getValueAt(filaSeleccionada, 7);
            
            this.controller = new ClienteController(
                    idCliente, 
                    documento, 
                    nombre, 
                    apellido, 
                    telefono, 
                    calle, 
                    numero,
                    codigoPostal
            );
            //this.controller.borrar();
            this.updateForm();
            
            //Solución 2:
            ClienteDao clienteDao = new ClienteDao();
            Cliente cliente = clienteDao.find(idCliente);
            
            this.controller = new ClienteController(
                    cliente.getId(), 
                    cliente.getDocumento(), 
                    cliente.getNombre(), 
                    cliente.getApellido(), 
                    cliente.getTelefono(),
                    cliente.getDireccion().getCalle(), 
                    cliente.getDireccion().getNumero(), 
                    cliente.getDireccion().getCodigoPostal()
            );
            this.controller.borrar();

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente.");
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
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTable clienteTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    void updateForm() {
        ((ClienteTableModel) this.clienteTable.getModel()).update();
    }
}
