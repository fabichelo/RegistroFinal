/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.edu.cientifica.view;

import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.edu.cientifica.daoImp.AutorDaoImp;
import pe.edu.cientifica.daoImp.EditorialDaoImp;
import pe.edu.cientifica.daoImp.IdiomaDaoImp;
import pe.edu.cientifica.daoImp.LibroDaoImp;
import pe.edu.cientifica.model.Autor;
import pe.edu.cientifica.model.Editorial;
import pe.edu.cientifica.model.Idioma;
import pe.edu.cientifica.model.Libro;
/**
 *
 * @author José
 */
public class Registro_LibroForm extends javax.swing.JFrame {

    private AutorDaoImp adi = new AutorDaoImp();
    private EditorialDaoImp ddi = new EditorialDaoImp();
    private IdiomaDaoImp idi = new IdiomaDaoImp();
    private LibroDaoImp ldi = new LibroDaoImp();
    private DefaultTableModel model;
    private DefaultComboBoxModel modelCombo;
    private int fila=-1;
    int idau =0;
    int idedi=0;
    int ididi=0;
    int idlib=0;
    /**
     * Creates new form Registro_LibroForm
     */
    public Registro_LibroForm() {
        initComponents();
        setLocationRelativeTo(null);       
        cargarCombo();
        cargarCombo2();
        cargarCombo3();
        listarRegistro();
        inicio();
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
        cboAutor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboEditorial = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txttitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpaginas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboIdioma = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtedicion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        txtidautor = new javax.swing.JTextField();
        txtideditorial = new javax.swing.JTextField();
        txtididioma = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbdatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Autor:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 30, -1, -1));

        cboAutor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboAutorItemStateChanged(evt);
            }
        });
        cboAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAutorActionPerformed(evt);
            }
        });
        jPanel1.add(cboAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 53, 420, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Editorial:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 30, -1, -1));

        cboEditorial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboEditorialItemStateChanged(evt);
            }
        });
        jPanel1.add(cboEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 53, 281, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Titulo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 92, -1, -1));
        jPanel1.add(txttitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 115, 186, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("N° de Páginas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 92, -1, -1));
        jPanel1.add(txtpaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 115, 82, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Idioma:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 92, -1, -1));

        cboIdioma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboIdiomaItemStateChanged(evt);
            }
        });
        jPanel1.add(cboIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 115, 435, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Edición:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 149, -1, -1));
        jPanel1.add(txtedicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 169, 186, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Fecha Publicación:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 149, -1, -1));
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 169, 535, -1));

        txtidautor.setEditable(false);
        txtidautor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtidautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        txtideditorial.setEditable(false);
        jPanel1.add(txtideditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 25, -1, -1));

        txtididioma.setEditable(false);
        jPanel1.add(txtididioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 87, 65, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 795, 199));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnnuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 18, 173, 27));

        btnguardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 57, 173, 27));

        btnmodificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 98, 173, 27));

        btneliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 137, 173, 27));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 190, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "IDLi", "Libro", "IDAu", "Autor", "Apellido", "IDId", "Idioma", "IDEd", "Editorial", "Direccion", "Email", "Fecha de P.", "Edición", "Páginas"
            }
        ));
        tbdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        String tit = txttitulo.getText();
        String pag = txtpaginas.getText();
        String edi = txtedicion.getText();
        String fecha = txtfecha.getText();
        if(ididi>0 || idau>0 || idedi>0){
            ldi.create(new Libro(idlib, tit, pag, edi, fecha, ididi, idedi, idau));
            JOptionPane.showMessageDialog(rootPane, "Libro Guardado Correctamente...!");
                    limpiarFormulario();
                    limpiar_table();
                    listarRegistro();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingresar Datos");

        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        String tit = txttitulo.getText();
        String pag = txtpaginas.getText();
        String edi = txtedicion.getText();
        String fecha = txtfecha.getText();
        if(fila>=0){
            int result = JOptionPane.showConfirmDialog(this,"Realmente desea modificar el Libro?", "Swing Tester",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    ldi.update(new Libro(idlib, tit, pag, edi, fecha, ididi, idedi, idau));
                    limpiar_table();
                    listarRegistro();
                    cargarCombo();
                    cargarCombo2();
                    cargarCombo3();
                    limpiarFormulario();
                    JOptionPane.showMessageDialog(rootPane, "Se ha Actualizado Correctamente...!");
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(rootPane, "No se ha Actualizado el Libro");
                    break;
                default:
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Seleccionar Producto");
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void cboAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAutorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cboAutorActionPerformed

    private void cboAutorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboAutorItemStateChanged
        // TODO add your handling code here:
        Autor au = (Autor) cboAutor.getSelectedItem();
        idau = au.getIdautor();
        txtidautor.setText(""+idau);
    }//GEN-LAST:event_cboAutorItemStateChanged

    private void cboEditorialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboEditorialItemStateChanged
        // TODO add your handling code here:
        Editorial edi = (Editorial) cboEditorial.getSelectedItem();
        idedi = edi.getIdeditorial();
        txtideditorial.setText(""+idedi);
    }//GEN-LAST:event_cboEditorialItemStateChanged

    private void cboIdiomaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboIdiomaItemStateChanged
        // TODO add your handling code here:
        Idioma vdi = (Idioma) cboIdioma.getSelectedItem();
        ididi = vdi.getIdidioma();
        txtididioma.setText(""+ididi);
    }//GEN-LAST:event_cboIdiomaItemStateChanged

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if(fila>=0){
            int result = JOptionPane.showConfirmDialog(this,"Realmente desea eliminar el Libro?", "Swing Tester",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    ldi.delete(idlib);
                    limpiar_table();
                    listarRegistro();
                    limpiarFormulario();
                    cargarCombo();
                    cargarCombo2();
                    cargarCombo3();
                    JOptionPane.showMessageDialog(rootPane, "Se ha eliminado Correctamente...!");
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(rootPane, "No se ha Eliminado el Libro");
                    break;
                default:
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Seleccionar Producto");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        btnguardar.setEnabled(true);
        btneliminar.setEnabled(false);
        btnmodificar.setEnabled(false);
        limpiarFormulario();
        limpiar_table();
        listarRegistro();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void tbdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdatosMouseClicked
        // TODO add your handling code here:btnguardar.setEnabled(false);
        btneliminar.setEnabled(true);
        btnmodificar.setEnabled(true);
        modelCombo = new DefaultComboBoxModel();
        cboAutor.setModel(modelCombo);
        cboEditorial.setModel(modelCombo);
        cboIdioma.setModel(modelCombo);       
        fila = tbdatos.getSelectedRow();
        Autor au = adi.read(Integer.parseInt(tbdatos.getValueAt(fila, 3).toString()));
        Editorial di = ddi.read(Integer.parseInt(tbdatos.getValueAt(fila, 8).toString()));
        Idioma ii = idi.read(Integer.parseInt(tbdatos.getValueAt(fila, 6).toString()));
        idlib = Integer.parseInt(tbdatos.getValueAt(fila, 1).toString());
        cargarCombo();
        cargarCombo2();
        cargarCombo3();
        txttitulo.setText(tbdatos.getValueAt(fila, 2).toString());
        txtedicion.setText(tbdatos.getValueAt(fila, 13).toString());
        txtpaginas.setText(tbdatos.getValueAt(fila, 14).toString());
        txtfecha.setText(tbdatos.getValueAt(fila, 12).toString());
    }//GEN-LAST:event_tbdatosMouseClicked

    private void inicio(){
        btnguardar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnmodificar.setEnabled(false);
    }
    private void cargarCombo(){
        modelCombo = new DefaultComboBoxModel();
        cboAutor.setModel(modelCombo);
        List<Autor> lista1 = adi.readAll();
        Autor car  = new Autor();
        cboAutor.removeAllItems();
        modelCombo.addElement(new Autor(0,"Seleccionar Autor",""));
        for(int i=0;i<lista1.size();i++){
            modelCombo.addElement(new Autor(lista1.get(i).getIdautor(),lista1.get(i).getNombres(),lista1.get(i).getApellidos()));
        }
    }
    private void cargarCombo2(){
        modelCombo = new DefaultComboBoxModel();
        cboEditorial.setModel(modelCombo);
        List<Editorial> lista1 = ddi.readAll();
        Editorial di  = new Editorial();
        cboEditorial.removeAllItems();
        modelCombo.addElement(new Editorial(0,"Seleccionar Editorial","",""));
        for(int i=0;i<lista1.size();i++){
            modelCombo.addElement(new Editorial(lista1.get(i).getIdeditorial(),lista1.get(i).getNombre(),lista1.get(i).getDireccion(),lista1.get(i).getEmail()));
        }
    }
    private void cargarCombo3(){
        modelCombo = new DefaultComboBoxModel();
        cboIdioma.setModel(modelCombo);
        List<Idioma> lista1 = idi.readAll();
        Idioma idi  = new Idioma();
        cboIdioma.removeAllItems();
        modelCombo.addElement(new Idioma(0,"Seleccionar Idioma"));
        for(int i=0;i<lista1.size();i++){
            modelCombo.addElement(new Idioma(lista1.get(i).getIdidioma(),lista1.get(i).getNombre()));
        }
    }
    private void limpiar_table(){
        for(int i=0; i<tbdatos.getRowCount();i++){
            model.removeRow(i);
            i=-1;
        }    
    }
    private void limpiarFormulario(){
        cboAutor.setSelectedIndex(0);
        cboEditorial.setSelectedIndex(0);
        cboIdioma.setSelectedIndex(0);
        txtedicion.setText("");
        txtfecha.setText("");
        txtpaginas.setText("");
        txttitulo.setText("");
        idau=0;
        idedi=0;
        ididi=0;
        idlib=0;
    }
    private void listarRegistro(){
        limpiar_table();
        model = (DefaultTableModel)tbdatos.getModel();
        List<Map<String, Object>> lista = ldi.readAll2();
        List<Map<String, Object>> lista2 = ldi.readAll3();
        List<Map<String, Object>> lista3 = ldi.readAll4();
        
        Object datos[] =new Object[15];
        int x=1;
        for(int i=0;i<lista.size();i++){
            datos[0]=x;
            datos[1]=lista.get(i).get("idlibro");
            datos[2]=lista.get(i).get("libro");
            datos[3]=lista3.get(i).get("idautor");
            datos[4]=lista3.get(i).get("autor");
            datos[5]=lista3.get(i).get("apellidos");
            datos[6]=lista2.get(i).get("ididioma");
            datos[7]=lista2.get(i).get("idioma");
            datos[8]=lista.get(i).get("ideditorial");
            datos[9]=lista.get(i).get("editorial");
            datos[10]=lista.get(i).get("direccion");
            datos[11]=lista.get(i).get("email");
            datos[12]=lista.get(i).get("fecha_publicacion");
            datos[13]=lista.get(i).get("edicion");
            datos[14]=lista.get(i).get("npaginas");
            model.addRow(datos);
            x++;
        }
        tbdatos.setModel(model);
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
            java.util.logging.Logger.getLogger(Registro_LibroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_LibroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_LibroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_LibroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_LibroForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cboAutor;
    private javax.swing.JComboBox<String> cboEditorial;
    private javax.swing.JComboBox<String> cboIdioma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbdatos;
    private javax.swing.JTextField txtedicion;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtidautor;
    private javax.swing.JTextField txtideditorial;
    private javax.swing.JTextField txtididioma;
    private javax.swing.JTextField txtpaginas;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
