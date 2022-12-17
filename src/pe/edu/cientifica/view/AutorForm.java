/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.edu.cientifica.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.edu.cientifica.daoImp.AutorDaoImp;
import pe.edu.cientifica.model.Autor;

/**
 *
 * @author José
 */
public class AutorForm extends javax.swing.JFrame {
    private AutorDaoImp adi = new AutorDaoImp();
    private DefaultTableModel model;
    private int fila=-1;
    private int idc=-1;
    /**
     * Creates new form AutorForm
     */
    public AutorForm() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtapellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btneditorial = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Autor\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 800, 32));

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 112, 32));

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jPanel1.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 112, 32));

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 112, 32));
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 108, 800, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Apellido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 88, -1, -1));

        btneditorial.setText("Registrar Editorial");
        btneditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditorialActionPerformed(evt);
            }
        });
        jPanel1.add(btneditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, 29));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 860, 260));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Autores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tbdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido"
            }
        ));
        tbdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 268, 859, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        String nom = txtnombre.getText();
        String ape = txtapellido.getText();
        if(!nom.equals("")||!ape.equals("")){
            adi.create(new Autor(0,nom,ape));
            limpiar_table();
            listar();
            limpiat_txt();
            JOptionPane.showMessageDialog(rootPane, "Autor Rgistrado Correctamente...!");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingresar Autor");
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        if(fila>=0){
            int result = JOptionPane.showConfirmDialog(this,"Realmente desea modificar el autor?", "Swing Tester",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                adi.update(new Autor(idc,txtnombre.getText(),txtapellido.getText()));
                limpiar_table();
                listar();
                limpiat_txt();
                JOptionPane.showMessageDialog(rootPane, "Se ha Actualizado Correctamente...!");
            }else if (result == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(rootPane, "No se ha Actualizado la Categoría");
            }else {

            }

        }else{
            JOptionPane.showMessageDialog(rootPane, "Seleccionar la Fila");
        }
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if(fila>=0){
            int result = JOptionPane.showConfirmDialog(this,"Realmente desea eliminar al Autor?", "Swing Tester",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                adi.delete(idc);
                limpiar_table();
                listar();
                limpiat_txt();
                JOptionPane.showMessageDialog(rootPane, "Se ha eliminado Correctamente...!");
            }else if (result == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(rootPane, "No se ha Eliminado al Autor");
            }else {

            }

        }else{
            JOptionPane.showMessageDialog(rootPane, "Seleccionar la Fila");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void tbdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdatosMouseClicked
        // TODO add your handling code here:
        fila = tbdatos.getSelectedRow();
        idc = Integer.parseInt(tbdatos.getValueAt(fila, 0).toString());
        txtnombre.setText(tbdatos.getValueAt(fila, 1).toString());
        txtapellido.setText(tbdatos.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tbdatosMouseClicked

    private void btneditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditorialActionPerformed
        // TODO add your handling code here:
        EditorialForm ini=new EditorialForm();
        this.dispose();
        ini.setVisible(true);
    }//GEN-LAST:event_btneditorialActionPerformed

    private void listar(){
        model = (DefaultTableModel)tbdatos.getModel();
        List<Autor> lista = adi.readAll();
        Object datos[] = new Object[4];
        for(int i=0;i<lista.size();i++){
            datos[0] = lista.get(i).getIdautor();
            datos[1] = lista.get(i).getNombres();
            datos[2] = lista.get(i).getApellidos();
            model.addRow(datos);       
        }
        tbdatos.setModel(model);
    }
    private void limpiar_table(){
        for(int i=0; i<tbdatos.getRowCount();i++){
            model.removeRow(i);
            i=-1;
        }
    }
    private void limpiat_txt(){
        txtnombre.setText(null);
        txtapellido.setText(null);
        txtnombre.requestFocus();
    }
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
            java.util.logging.Logger.getLogger(AutorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneditorial;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdatos;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
