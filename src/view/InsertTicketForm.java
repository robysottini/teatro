package view;

import Entidades.Cliente;
import Entidades.Funcion;
import controller.TicketController;
import dao.ClienteDao;
import dao.FuncionDao;
import dao.TicketDao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Roberto Sottini
 */
public class InsertTicketForm extends javax.swing.JFrame {

    TicketForm formulario;
    TicketController controller;
    long idTicket;
    DefaultComboBoxModel modeloComboBoxClientes  = new javax.swing.DefaultComboBoxModel(new String[] {});
    DefaultComboBoxModel modeloComboBoxFunciones = new javax.swing.DefaultComboBoxModel(new String[] {});
    
    /**
     * Creates new form InsertFuncionForm
     */
    public InsertTicketForm(TicketForm formulario) {
        this.formulario = formulario;
        initComponents();
        iniciarComboBoxCliente();
        iniciarComboBoxFuncion();
    }
    
    private void iniciarComboBoxCliente() {
        List clientes = new ArrayList();
        ClienteDao clienteDao = new ClienteDao();
        clientes = new ArrayList(clienteDao.getClientes());
        
        for (int i = 0; i < clientes.size(); i++) {
            modeloComboBoxClientes.addElement(clientes.get(i));
        }
    }
    
    private void iniciarComboBoxFuncion() {
        List funciones = new ArrayList();
        FuncionDao funcionDao = new FuncionDao();
        TicketDao ticketDao = new TicketDao();
        funciones = new ArrayList(funcionDao.getFunciones());
        Funcion unaFuncion;
        Integer asientos;
        Long asientosOcupados;
        
        for (int i = 0; i < funciones.size(); i++) {
            unaFuncion = (Funcion) funciones.get(i);
            
            asientos = funcionDao.contarAsientos(unaFuncion.getId());
            asientosOcupados = ticketDao.contarAsientosOcupados(unaFuncion.getId());
            
            //System.out.println("capacidad: " + asientos);
            //System.out.println("capacidad ocupada: " + asientosOcupados);
            
            if (asientosOcupados < asientos) {
                modeloComboBoxFunciones.addElement(unaFuncion);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxClientes = new javax.swing.JComboBox<>();
        jComboBoxFunciones = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        fechaVenta = new com.toedter.calendar.JDateChooser();
        modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        guardar.setText("Vender");
        guardar.setNextFocusableComponent(cancelar);
        guardar.setSelected(true);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Venta de una función");

        jLabel6.setText("Función");

        jLabel8.setText("Fecha de venta");

        jComboBoxClientes.setModel(modeloComboBoxClientes);
        jComboBoxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClientesActionPerformed(evt);
            }
        });

        jComboBoxFunciones.setModel(modeloComboBoxFunciones);
        jComboBoxFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFuncionesActionPerformed(evt);
            }
        });

        jLabel7.setText("Cliente");

        fechaVenta.setFocusable(false);

        modificar.setText("Modificar");
        modificar.setSelected(true);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxFunciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardar)
                                .addGap(18, 18, 18)
                                .addComponent(modificar)
                                .addGap(18, 18, 18)
                                .addComponent(cancelar)))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(guardar)
                    .addComponent(modificar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        guardar.getAccessibleContext().setAccessibleName("Vender");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void elegirItemClientes(JComboBox comboBox, long idCliente) {
        Cliente item;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = (Cliente) comboBox.getItemAt(i);
            if (item.getId() == (idCliente)) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }
    
    public static void elegirItemFunciones(JComboBox comboBox, long idFuncion) {
        Funcion item;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = (Funcion) comboBox.getItemAt(i);
            if (item.getId() == (idFuncion)) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        java.util.Date fechaVentaUtil = fechaVenta.getDate();
        java.sql.Date fechaVentaSql = new java.sql.Date(fechaVentaUtil.getTime());

        this.controller = new TicketController(
            fechaVentaSql,
            ((Cliente) modeloComboBoxClientes.getSelectedItem()).getId(),
            ((Funcion) modeloComboBoxFunciones.getSelectedItem()).getId()
        );

        this.controller.insert();
        this.formulario.updateForm();
        this.clear();
        this.setVisible(false);
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.fechaVenta.setDate(new java.util.Date());
        this.clear();
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void jComboBoxFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFuncionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFuncionesActionPerformed

    private void jComboBoxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClientesActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        java.util.Date fechaVentaUtil = fechaVenta.getDate();
        java.sql.Date fechaVentaSql = new java.sql.Date(fechaVentaUtil.getTime());

        this.controller = new TicketController(
            this.idTicket,
            fechaVentaSql,
            ((Cliente) modeloComboBoxClientes.getSelectedItem()).getId(),
            ((Funcion) modeloComboBoxFunciones.getSelectedItem()).getId()
        );
        
        this.controller.modificar();
        this.formulario.updateForm();
        this.clear();
        this.setVisible(false);
    }//GEN-LAST:event_modificarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private com.toedter.calendar.JDateChooser fechaVenta;
    private javax.swing.JButton guardar;
    private javax.swing.JComboBox<String> jComboBoxClientes;
    private javax.swing.JComboBox<String> jComboBoxFunciones;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton modificar;
    // End of variables declaration//GEN-END:variables

    /**
     * Limpia todos los campos de texto la clase InsertFuncionForm.
     */
    void clear() {
        this.fechaVenta.setDate(new java.util.Date());
        this.fechaVenta.setEnabled(false);
    }

    /**
     * Completa los campos de texto.
     * 
     * @param idTicket
     * @param fechaVenta
     * @param idCliente
     * @param idFuncion
     */
    public void completar(
            Long idTicket, 
            Date fechaVenta,
            Long idCliente,
            Long idFuncion
    ) {
        this.idTicket = idTicket;
        this.fechaVenta.setDate(fechaVenta);
        elegirItemClientes(jComboBoxClientes, idCliente);
        elegirItemFunciones(jComboBoxFunciones, idFuncion);
    }

    public void mostrarBotonModificar(Boolean mostrar) {
        this.modificar.setVisible(mostrar);
    }

    public void mostrarBotonGuardar(Boolean mostrar) {
        this.guardar.setVisible(mostrar);
    }
}
