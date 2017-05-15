package view;

import Entidades.Teatro;
import controller.FuncionController;
import dao.TeatroDao;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Roberto Sottini
 */
public class InsertFuncionForm extends javax.swing.JFrame {

    FuncionForm formulario;
    FuncionController controller;
    long idFuncion;
    long idTeatro;
    DefaultComboBoxModel modeloComboBoxTeatros  = new javax.swing.DefaultComboBoxModel(new String[] {});
    
    /**
     * Creates new form InsertFuncionForm
     */
    public InsertFuncionForm(FuncionForm formulario) {
        this.formulario = formulario;
        initComponents();
        iniciarComboBoxTeatro();
    }
    
    private void iniciarComboBoxTeatro() {
        List teatros = new ArrayList();
        TeatroDao teatroDao = new TeatroDao();
        teatros = new ArrayList(teatroDao.getTeatros());
        
        for (int i = 0; i < teatros.size(); i++) {
            modeloComboBoxTeatros.addElement(teatros.get(i));
            //System.out.println("Teatro: " + ((Teatro) teatros.get(i)).getDireccion());
        }
        
    }
    
    public static void elegirItem(JComboBox comboBox, long idTeatro) {
        Teatro item;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = (Teatro) comboBox.getItemAt(i);
            if (item.getId() == (idTeatro)) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxTeatros = new javax.swing.JComboBox<>();
        fecha = new com.toedter.calendar.JDateChooser();
        modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        guardar.setText("Guardar");
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

        nombre.setName(""); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Datos de la función");

        jLabel5.setText("Precio");

        jLabel6.setText("Teatro");

        precio.setName(""); // NOI18N
        precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha");

        jComboBoxTeatros.setModel(modeloComboBoxTeatros);
        jComboBoxTeatros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTeatrosActionPerformed(evt);
            }
        });

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
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(modificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(guardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelar))
                        .addComponent(jComboBoxTeatros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTeatros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(guardar)
                    .addComponent(modificar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        System.out.println("Dentro de GUARDAR.");
        
        java.util.Date fechaUtil = fecha.getDate();
        java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());

        this.controller = new FuncionController(
                fechaSql,
                nombre.getText(),
                (Double) Double.parseDouble(precio.getText().replace(",", ".")),
                ((Teatro) modeloComboBoxTeatros.getSelectedItem()).getId()
        );        
        
        this.controller.insert();
        this.formulario.updateForm();
        this.clear();
        this.setVisible(false);
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.clear();
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioActionPerformed

    private void jComboBoxTeatrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTeatrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTeatrosActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        java.util.Date fechaUtil = fecha.getDate();
        java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
        
        System.out.println("Precio: " + (Double) Double.parseDouble(precio.getText().replace(",", ".")));

        this.controller = new FuncionController(
            this.idFuncion,
            fechaSql,
            nombre.getText(),
            (Double) Double.parseDouble(precio.getText().replace(",", ".")),
            ((Teatro) modeloComboBoxTeatros.getSelectedItem()).getId()
        );
        
//        System.out.println("idFuncion: " + this.idFuncion);
//        System.out.println("fechaSql: " + fechaSql);
//        System.out.println("nombre: " + nombre.getText());
//        System.out.println("Precio: " + (Double) Double.parseDouble(precio.getText().replace(",", ".")));
//        System.out.println("idTeatro: " + ((Teatro) modeloComboBoxTeatros.getSelectedItem()).getId());
        
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
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton guardar;
    private javax.swing.JComboBox<String> jComboBoxTeatros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables

    /**
     * Limpia todos los campos de texto la clase InsertFuncionForm.
     */
    void clear() {
        this.fecha.setDate(new java.util.Date());
        this.nombre.setText("");
        this.precio.setText("");
    }

    /**
     * Completa los campos de texto.
     * 
     * @param idFuncion
     * @param fecha
     * @param nombre
     * @param precio
     * @param idTeatro
     */
    public void completar(
            Long idFuncion, 
            Date fecha, 
            String nombre, 
            String precio,
            Long idTeatro
    ) {
        this.idFuncion = idFuncion;
        this.nombre.setText(nombre);
        this.fecha.setDate(fecha);
        this.precio.setText(precio);
        elegirItem(jComboBoxTeatros, idTeatro);
    }

    public void mostrarBotonModificar(Boolean mostrar) {
        this.modificar.setVisible(mostrar);
    }

    public void mostrarBotonGuardar(Boolean mostrar) {
        this.guardar.setVisible(mostrar);
    }
}
