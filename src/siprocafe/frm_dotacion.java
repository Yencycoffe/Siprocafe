/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siprocafe;

import java.sql.Connection;
import javax.swing.JTable;
import siprocafe.Personal ;
import siprocafe.conexion;


public class frm_dotacion extends javax.swing.JFrame {
    
        public frm_dotacion(){
        
        initComponents();
        
        /*Centra el formulario*/
        
        this.setLocationRelativeTo(null);
        
//        texidelem_dot.setEnabled(false);
        
        /* conexion objetoconexion =new conexion();
        objetoconexion.conectar();
        */
     
     Elemento_dotacion objetoElemento_dotacion = new Elemento_dotacion();
     objetoElemento_dotacion.Mostrarelementos(tbtotalpersonas);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        texidelem_dot = new javax.swing.JTextField();
        texfechpres = new javax.swing.JTextField();
        texfecdev = new javax.swing.JTextField();
        jBguardar1 = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jCBestadodevo = new javax.swing.JComboBox<>();
        txtidpers = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jCBClase = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        texnomele = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        texcant = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jCBestado1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBconexion = new javax.swing.JButton();
        jtsalir = new javax.swing.JButton();
        jSPelemdot = new javax.swing.JScrollPane();
        tbtotalpersonas = new javax.swing.JTable();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        jLabel14.setBackground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Id_Elementos de dotacion");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        texidelem_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texidelem_dotActionPerformed(evt);
            }
        });

        texfechpres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfechpresActionPerformed(evt);
            }
        });

        texfecdev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfecdevActionPerformed(evt);
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

        jBmodificar.setBackground(new java.awt.Color(204, 204, 204));
        jBmodificar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBmodificar.setText("Modificar");
        jBmodificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
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

        jCBestadodevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entregado", "Devuelto ", "Debaja", " " }));
        jCBestadodevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBestadodevoActionPerformed(evt);
            }
        });

        txtidpers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpersActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Fecha prestamo");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jLabel16.setBackground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Fecha Devolución");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jLabel17.setBackground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Estado devolucion ");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jLabel18.setBackground(new java.awt.Color(0, 0, 255));
        jLabel18.setText("Id_personal");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jLabel19.setBackground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("Estado");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jCBClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Devolutivo", "No devolutivo", " " }));
        jCBClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBClaseActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(0, 0, 255));
        jLabel21.setText("Nombre Elem Dot");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        texnomele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texnomeleActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("Cantidad");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        texcant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texcantActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(0, 0, 255));
        jLabel23.setText("Clase");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jCBestado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inctativo", " " }));
        jCBestado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBestado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21)
                    .addComponent(jLabel15)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBmodificar)
                        .addGap(36, 36, 36)
                        .addComponent(jBguardar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texnomele, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(texidelem_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(117, 117, 117))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(texfechpres, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jCBestado1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCBClase, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texcant)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texfecdev, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jBeliminar)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBestadodevo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidpers, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(texidelem_dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jCBestado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texfechpres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(texfecdev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(texnomele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(jCBClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(texcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtidpers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jCBestadodevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBmodificar)
                            .addComponent(jBguardar1)
                            .addComponent(jBeliminar))
                        .addGap(31, 31, 31))))
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Elementos de Dotación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBconexion.setBackground(new java.awt.Color(204, 204, 204));
        jBconexion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBconexion.setText("Conexion");
        jBconexion.setToolTipText("");
        jBconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconexionActionPerformed(evt);
            }
        });

        jtsalir.setBackground(new java.awt.Color(204, 204, 204));
        jtsalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtsalir.setText("Salir");
        jtsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jBconexion)
                .addGap(56, 56, 56)
                .addComponent(jtsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBconexion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tbtotalpersonas.setBackground(new java.awt.Color(204, 204, 255));
        tbtotalpersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jSPelemdot.setViewportView(tbtotalpersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSPelemdot)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSPelemdot, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texidelem_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texidelem_dotActionPerformed
                 // TODO add your handling code here:
    }//GEN-LAST:event_texidelem_dotActionPerformed

    private void texfechpresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texfechpresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texfechpresActionPerformed

    private void texfecdevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texfecdevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texfecdevActionPerformed

    private void jBconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconexionActionPerformed
    
    conexion mysql = new conexion();

    mysql.conectar ();

//    throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }//GEN-LAST:event_jBconexionActionPerformed

    private void jtsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtsalirActionPerformed
       /*Salir del programa*/
        System.exit(0);      
    }//GEN-LAST:event_jtsalirActionPerformed

    private void jBguardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardar1ActionPerformed
        // TODO add your handling code here:
        Elemento_dotacion objetoelemen_dota = new Elemento_dotacion();
        objetoelemen_dota.Insertarelemnetos(texidelem_dot, texnomele, texcant, texfechpres, texfecdev, txtidpers, jCBestadodevo, jCBClase, jCBestado1);
        /*Actualiza los datos y muestra*/
        objetoelemen_dota.Mostrarelementos(tbtotalpersonas);
    }//GEN-LAST:event_jBguardar1ActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        // TODO add your handling code here:
        Elemento_dotacion objetoElemento_dotacion = new Elemento_dotacion();
        objetoElemento_dotacion.Modificarelementos(tbtotalpersonas, texidelem_dot, texfechpres, texfecdev, txtidpers, texnomele, texcant, jCBestadodevo, jCBClase, jCBestado1);
        /*Actualiza los datos y muestra*/
        objetoElemento_dotacion.Mostrarelementos(tbtotalpersonas);
     
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        Elemento_dotacion objetoElemento_dotacion = new Elemento_dotacion();
        objetoElemento_dotacion.EliminarElementos(texidelem_dot);
        /*Actualiza los datos y muestra*/
        objetoElemento_dotacion.Mostrarelementos(tbtotalpersonas);
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void txtidpersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpersActionPerformed

    private void jCBestadodevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBestadodevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBestadodevoActionPerformed

    private void jCBClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBClaseActionPerformed

    private void texnomeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texnomeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texnomeleActionPerformed

    private void texcantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texcantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texcantActionPerformed

    private void jCBestado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBestado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBestado1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBconexion;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar1;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JComboBox<String> jCBClase;
    private javax.swing.JComboBox<String> jCBestado1;
    private javax.swing.JComboBox<String> jCBestadodevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jSPelemdot;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jtsalir;
    private javax.swing.JTable tbtotalpersonas;
    private javax.swing.JTextField texcant;
    private javax.swing.JTextField texfecdev;
    private javax.swing.JTextField texfechpres;
    private javax.swing.JTextField texidelem_dot;
    private javax.swing.JTextField texnomele;
    private javax.swing.JTextField txtidpers;
    // End of variables declaration//GEN-END:variables
}
