package view;

import Entidades.Teatro;
import controller.TeatroComboBoxModel;
//import controller.LibroTableModel;
import controller.TeatroController;
import controller.TeatroTableModel;
import dao.TeatroDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Sottini
 */
public class TeatroForm extends javax.swing.JFrame {

    private InsertTeatroForm insertTeatroForm;
    TeatroController controller;

    /**
     * Creates new form SocioForm
     */
    public TeatroForm() {
        this.insertTeatroForm = new InsertTeatroForm(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        teatroTable = new javax.swing.JTable();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teatros");

        teatroTable.setModel(new controller.TeatroTableModel());
        jScrollPane1.setViewportView(teatroTable);

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
        this.insertTeatroForm.clear();
        this.insertTeatroForm.setVisible(true);
        this.insertTeatroForm.mostrarBotonModificar(false);
        this.insertTeatroForm.mostrarBotonGuardar(true);

    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        int filaSeleccionada = this.teatroTable.getSelectedRow();
        if (filaSeleccionada != -1) {
            Long    idTeatro     = (Long)    this.teatroTable.getModel().getValueAt(filaSeleccionada, 0);
            String  nombre       =           this.teatroTable.getModel().getValueAt(filaSeleccionada, 1).toString();
            Integer capacidad    = (Integer) this.teatroTable.getModel().getValueAt(filaSeleccionada, 2);
            String  calle        =           this.teatroTable.getModel().getValueAt(filaSeleccionada, 3).toString();
            Integer numero       = (Integer) this.teatroTable.getModel().getValueAt(filaSeleccionada, 4);
            Integer codigoPostal = (Integer) this.teatroTable.getModel().getValueAt(filaSeleccionada, 5);
                                    
            this.insertTeatroForm.clear();
            this.insertTeatroForm.setVisible(true);
            this.insertTeatroForm.mostrarBotonModificar(true);
            this.insertTeatroForm.mostrarBotonGuardar(false);
            this.insertTeatroForm.completar(
                    idTeatro, 
                    nombre, 
                    capacidad.toString(), 
                    calle, 
                    numero.toString(), 
                    codigoPostal.toString()
            );
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un teatro.");
        }

    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int filaSeleccionada = this.teatroTable.getSelectedRow();
        if (filaSeleccionada != -1) {
            Long    idTeatro     = (Long)    this.teatroTable.getModel().getValueAt(filaSeleccionada, 0);
            String  nombre       =           this.teatroTable.getModel().getValueAt(filaSeleccionada, 1).toString();
            Integer capacidad    = (Integer) this.teatroTable.getModel().getValueAt(filaSeleccionada, 2);
            String  calle        =           this.teatroTable.getModel().getValueAt(filaSeleccionada, 3).toString();
            Integer numero       = (Integer) this.teatroTable.getModel().getValueAt(filaSeleccionada, 4);
            Integer codigoPostal = (Integer) this.teatroTable.getModel().getValueAt(filaSeleccionada, 5);
            
            this.controller = new TeatroController(
                    idTeatro, 
                    nombre, 
                    capacidad, 
                    calle, 
                    numero,
                    codigoPostal
            );
            //this.controller.borrar();
            this.updateForm();
            
            //Solución 2:
            TeatroDao teatroDao = new TeatroDao();
            Teatro teatro = teatroDao.find(idTeatro);
            
            this.controller = new TeatroController(
                    teatro.getId(), 
                    teatro.getNombre(), 
                    teatro.getCapacidad(),
                    teatro.getDireccion().getCalle(), 
                    teatro.getDireccion().getNumero(), 
                    teatro.getDireccion().getCodigoPostal()
            );
            this.controller.borrar();

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un teatro.");
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
                if ("DarculaLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeatroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeatroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeatroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeatroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeatroForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable teatroTable;
    // End of variables declaration//GEN-END:variables

    void updateForm() {
        //Relleno la tabla.
        ((TeatroTableModel) this.teatroTable.getModel()).update();
    }
}
