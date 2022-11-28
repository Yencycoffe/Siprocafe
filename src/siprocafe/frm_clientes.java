/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siprocafe;

import java.sql.Connection;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import siprocafe.Personal ;
import siprocafe.conexion;


public class frm_clientes extends javax.swing.JFrame {
    
        public frm_clientes(){
        
        initComponents();
        
        /*Centra el formulario*/
        
        this.setLocationRelativeTo(null);
        
        
        /* conexion objetoconexion =new conexion();
        objetoconexion.conectar();
        */
     
//     clientes objetocliente = new clientes();
//     objetocliente.MostrarPersonas(tbtotalpersonas);
//     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        texidc = new javax.swing.JTextField();
        texdirec = new javax.swing.JTextField();
        texemail = new javax.swing.JTextField();
        texnombre = new javax.swing.JTextField();
        texapellido = new javax.swing.JTextField();
        texcel = new javax.swing.JTextField();
        jBguardar1 = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        TexFechaing = new javax.swing.JTextField();
        TexFechanac = new javax.swing.JTextField();
        jComboBoxestado = new javax.swing.JComboBox<>();
        jBmodificar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        texIdpersonal = new javax.swing.JTextField();
        texidFactura = new javax.swing.JTextField();
        TexNomempre = new javax.swing.JTextField();
        TexNitempre = new javax.swing.JTextField();
        texemailempre = new javax.swing.JTextField();
        texCargo = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbtotalpersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(588, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Dirección");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 175, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 46, -1, 16));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Apellido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jL.setBackground(new java.awt.Color(255, 255, 255));
        jL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jL.setText("Fecha_Nacimiento");
        jPanel2.add(jL, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 107, -1, 24));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Nombre_empresa");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 24));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Fecha_Ingreso");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 139, -1, 24));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Id_cliente");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setAutoscrolls(true);
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 18, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Email");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 210, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Celular");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 234, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Cargo");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setText("Estado");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        texidc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texidcActionPerformed(evt);
            }
        });
        jPanel2.add(texidc, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 13, 87, -1));

        texdirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texdirecActionPerformed(evt);
            }
        });
        jPanel2.add(texdirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 170, 163, -1));

        texemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texemailActionPerformed(evt);
            }
        });
        jPanel2.add(texemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 205, 163, -1));

        texnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texnombreActionPerformed(evt);
            }
        });
        jPanel2.add(texnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 42, 171, -1));

        texapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texapellidoActionPerformed(evt);
            }
        });
        jPanel2.add(texapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 83, 171, -1));

        texcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texcelActionPerformed(evt);
            }
        });
        jPanel2.add(texcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 234, 163, -1));

        jBguardar1.setBackground(new java.awt.Color(0, 153, 153));
        jBguardar1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBguardar1.setText("Guardar");
        jBguardar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jBguardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jBeliminar.setBackground(new java.awt.Color(0, 153, 153));
        jBeliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        jPanel2.add(TexFechaing, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 139, 171, -1));

        TexFechanac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexFechanacActionPerformed(evt);
            }
        });
        jPanel2.add(TexFechanac, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 107, 171, -1));

        jComboBoxestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jComboBoxestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxestadoActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 163, -1));

        jBmodificar1.setBackground(new java.awt.Color(0, 153, 153));
        jBmodificar1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBmodificar1.setText("Actualizar");
        jBmodificar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jBmodificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 51, 153));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("NIT_empresa");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, 24));

        jLabel20.setBackground(new java.awt.Color(0, 51, 153));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("Emaill_empresa");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 186, -1));

        jLabel21.setBackground(new java.awt.Color(0, 51, 153));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("Id_Personal");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 69, -1));

        jLabel22.setBackground(new java.awt.Color(0, 51, 153));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setText("Id_Factura");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        texIdpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texIdpersonalActionPerformed(evt);
            }
        });
        jPanel2.add(texIdpersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 163, -1));

        texidFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texidFacturaActionPerformed(evt);
            }
        });
        jPanel2.add(texidFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 163, -1));
        jPanel2.add(TexNomempre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 171, -1));
        jPanel2.add(TexNitempre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 171, -1));
        jPanel2.add(texemailempre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 171, -1));
        jPanel2.add(texCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 171, -1));

        salir.setBackground(new java.awt.Color(0, 153, 153));
        salir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        salir.setText("Salir");
        salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel2.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 80, -1));

        tbtotalpersonas.setBackground(new java.awt.Color(204, 204, 255));
        tbtotalpersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbtotalpersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificar1ActionPerformed
        // TODO add your handling code here:
//        clientes objetoclientes=new clientes();
//        objetoclientes.ModificarPersonas(texidc, texnombre, texapellido, TexFechanac, TexFechaing, texdirec, texemail, texcel, TexNomempre, TexNitempre, texemailempre,texCargo, jComboBoxestado, texidFactura, texIdpersonal);
//        /*Actualiza los datos y muestra*/
//        objetoclientes.MostrarPersonas(tbtotalpersonas);
    }//GEN-LAST:event_jBmodificar1ActionPerformed

    private void jComboBoxestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxestadoActionPerformed

    private void TexFechanacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexFechanacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexFechanacActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
//        clientes objetocliente=new clientes();
//        objetocliente.EliminarPersonas(texidc);
//        /*Actualiza los datos y muestra*/
//        objetocliente.MostrarPersonas(tbtotalpersonas);
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardar1ActionPerformed
        // TODO add your handling code here:
//        clientes objetoClientes = new clientes();
//        objetoClientes.InsertarPersonas(texidc, texnombre, texapellido, TexFechanac, TexFechaing, texdirec, texemail, texcel, TexNomempre, TexNitempre, texemailempre, texCargo, jComboBoxestado, texidFactura, texIdpersonal);
//        /*Actualiza los datos y muestra*/
//
//        objetoClientes.MostrarPersonas(tbtotalpersonas);
    }//GEN-LAST:event_jBguardar1ActionPerformed

    private void texcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texcelActionPerformed

    private void texapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texapellidoActionPerformed

    private void texnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texnombreActionPerformed

    private void texemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texemailActionPerformed

    private void texdirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texdirecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texdirecActionPerformed

    private void texidcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texidcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texidcActionPerformed

    private void texIdpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texIdpersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texIdpersonalActionPerformed

    private void texidFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texidFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texidFacturaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        frm_Menu_Principal_1 form =new frm_Menu_Principal_1();
        form.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TexFechaing;
    private javax.swing.JTextField TexFechanac;
    private javax.swing.JTextField TexNitempre;
    private javax.swing.JTextField TexNomempre;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar1;
    private javax.swing.JButton jBmodificar1;
    private javax.swing.JComboBox<String> jComboBoxestado;
    private javax.swing.JLabel jL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton salir;
    private javax.swing.JTable tbtotalpersonas;
    private javax.swing.JTextField texCargo;
    private javax.swing.JTextField texIdpersonal;
    private javax.swing.JTextField texapellido;
    private javax.swing.JTextField texcel;
    private javax.swing.JTextField texdirec;
    private javax.swing.JTextField texemail;
    private javax.swing.JTextField texemailempre;
    private javax.swing.JTextField texidFactura;
    private javax.swing.JTextField texidc;
    private javax.swing.JTextField texnombre;
    // End of variables declaration//GEN-END:variables
}
