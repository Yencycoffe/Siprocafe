/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siprocafe;

import java.sql.Connection;
import javax.swing.JComboBox;
import javax.swing.*;
import javax.swing.JTextField;
import siprocafe.Personal;
import siprocafe.conexion;
/**
 *
 * @author USER
 */
public class frm_personal1 extends javax.swing.JFrame {

    /**
     * Creates new form frm_personal1
     */
    public frm_personal1() {
        initComponents();
        
        Personal objetoPersonas = new Personal();
     objetoPersonas.MostrarPersonas(tbtotalpersonas);
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
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        texidp = new javax.swing.JTextField();
        texdirec = new javax.swing.JTextField();
        texemail = new javax.swing.JTextField();
        texarls = new javax.swing.JTextField();
        texnombre = new javax.swing.JTextField();
        texapellido = new javax.swing.JTextField();
        texcel = new javax.swing.JTextField();
        texcargo = new javax.swing.JTextField();
        jBguardar1 = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        TexFechaing = new javax.swing.JTextField();
        TexFechanac = new javax.swing.JTextField();
        TexFEcharet = new javax.swing.JTextField();
        jComboBoxestado = new javax.swing.JComboBox<>();
        jBmodificar1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        texeps = new javax.swing.JTextField();
        jBsalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbtotalpersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(612, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 718, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Dirección");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombre");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Apellido");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jL.setBackground(new java.awt.Color(204, 204, 204));
        jL.setText("Fecha_Nacimiento");
        jL.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Fecha_Retiro");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Fecha_Ingreso");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Id_Personal");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Email");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Celular");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Eps");
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Arls");
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Estado");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        texidp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texidpActionPerformed(evt);
            }
        });

        texdirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texdirecActionPerformed(evt);
            }
        });

        texemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texemailActionPerformed(evt);
            }
        });

        texarls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texarlsActionPerformed(evt);
            }
        });

        texnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texnombreActionPerformed(evt);
            }
        });

        texapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texapellidoActionPerformed(evt);
            }
        });

        texcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texcelActionPerformed(evt);
            }
        });

        texcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texcargoActionPerformed(evt);
            }
        });

        jBguardar1.setBackground(new java.awt.Color(204, 204, 204));
        jBguardar1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBguardar1.setText("Guardar");
        jBguardar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardar1ActionPerformed(evt);
            }
        });

        jBeliminar.setBackground(new java.awt.Color(204, 204, 204));
        jBeliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        TexFechanac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexFechanacActionPerformed(evt);
            }
        });

        jComboBoxestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jComboBoxestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxestadoActionPerformed(evt);
            }
        });

        jBmodificar1.setBackground(new java.awt.Color(204, 204, 204));
        jBmodificar1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBmodificar1.setText("Actualizar");
        jBmodificar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBmodificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificar1ActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("cargo");
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        texeps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texepsActionPerformed(evt);
            }
        });

        jBsalir.setBackground(new java.awt.Color(204, 204, 204));
        jBsalir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texnombre)
                            .addComponent(texidp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texemail, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(texcel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(texeps, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(texarls, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxestado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TexFechanac, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(TexFechaing)
                                    .addComponent(TexFEcharet))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(texcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texdirec, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBguardar1)
                            .addComponent(jBmodificar1)
                            .addComponent(jBeliminar)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jBsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(texidp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(texemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(texnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jBmodificar1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(texapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(texeps, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(texdirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TexFechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TexFechaing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(texarls, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TexFEcharet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(texcargo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20)
                                            .addComponent(jBsalir)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jBguardar1)
                        .addGap(26, 26, 26)
                        .addComponent(jBeliminar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 718, -1));

        tbtotalpersonas.setBackground(new java.awt.Color(204, 204, 255));
        tbtotalpersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbtotalpersonas);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 311, 718, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texidpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texidpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texidpActionPerformed

    private void texdirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texdirecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texdirecActionPerformed

    private void texemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texemailActionPerformed

    private void texarlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texarlsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texarlsActionPerformed

    private void texnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texnombreActionPerformed

    private void texapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texapellidoActionPerformed

    private void texcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texcelActionPerformed

    private void texcargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texcargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texcargoActionPerformed

    private void jBguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardar1ActionPerformed
        // TODO add your handling code here

        Personal objetoPersonas = new Personal();
        objetoPersonas.InsertarPersonas(texidp, texnombre, texapellido, TexFechanac, TexFechaing, TexFEcharet, texdirec, texemail, texcel, texeps, texcargo, texarls, jComboBoxestado);

        /*Actualiza los datos y muestra*/

        objetoPersonas.MostrarPersonas(tbtotalpersonas);
    }//GEN-LAST:event_jBguardar1ActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        Personal objetoPersonas=new Personal();
        objetoPersonas.EliminarPersonas(texidp);
        /*Actualiza los datos y muestra*/
        objetoPersonas.MostrarPersonas(tbtotalpersonas);
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void TexFechanacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexFechanacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexFechanacActionPerformed

    private void jComboBoxestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxestadoActionPerformed

    private void jBmodificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificar1ActionPerformed
        // TODO add your handling code here:
        Personal objetoPersonas=new Personal();
        objetoPersonas.MostrarPersonas(tbtotalpersonas);
        objetoPersonas.ModificarPersonas(texnombre, texidp, texapellido, TexFechanac, TexFechaing, TexFEcharet, texdirec, texemail, texcel, texeps, texarls, jComboBoxestado, texcargo);
        /*Actualiza los datos y muestra*/
        objetoPersonas.MostrarPersonas(tbtotalpersonas);

    }//GEN-LAST:event_jBmodificar1ActionPerformed

    private void texepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texepsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texepsActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
         formulario_Principal formulario1=new formulario_Principal();
        formulario1.setBounds(10,20,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    }//GEN-LAST:event_jBsalirActionPerformed

    /**|
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
            java.util.logging.Logger.getLogger(frm_personal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_personal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_personal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_personal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_personal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TexFEcharet;
    private javax.swing.JTextField TexFechaing;
    private javax.swing.JTextField TexFechanac;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar1;
    private javax.swing.JButton jBmodificar1;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jComboBoxestado;
    private javax.swing.JLabel jL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbtotalpersonas;
    private javax.swing.JTextField texapellido;
    private javax.swing.JTextField texarls;
    private javax.swing.JTextField texcargo;
    private javax.swing.JTextField texcel;
    private javax.swing.JTextField texdirec;
    private javax.swing.JTextField texemail;
    private javax.swing.JTextField texeps;
    private javax.swing.JTextField texidp;
    private javax.swing.JTextField texnombre;
    // End of variables declaration//GEN-END:variables
}
