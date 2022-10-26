/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siprocafe;

import java.sql.Connection;
import javax.swing.JTable;
import siprocafe.Personal ;
import siprocafe.conexion;


public class frm_Analisis_suelo extends javax.swing.JFrame {
    
        public frm_Analisis_suelo(){
        
        initComponents();
        
        /*Centra el formulario*/
        
        this.setLocationRelativeTo(null);
        
//        texidp.setEnabled(false);
//        texnombre.setEnabled(false);
//        texapellido.setEnabled(false);
//        txtfecha.setEnabled(false);
//        fingreso.setEnabled(false);
//        ffretiro.setEnabled(false);
//        texdirec.setEnabled(false);
//        texemail.setEnabled(false);
//        texcel.setEnabled(false);
//        texeps.setEnabled(false);
//        texarls.setEnabled(false);
//        estado.setEnabled(false);
       
        /* conexion objetoconexion =new conexion();
        objetoconexion.conectar();
        */
     
//     Elemento_dotacion objetoElemento_dotacion = new Elemento_dotacion();
//     objetoElemento_dotacion.insertar_fecha(jSPelemdot);
//     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        texidelem_dot = new javax.swing.JTextField();
        texid_producto = new javax.swing.JTextField();
        texid_personal = new javax.swing.JTextField();
        jBguardar1 = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        texfecdevo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        texfecdevo1 = new javax.swing.JTextField();
        texid_personal1 = new javax.swing.JTextField();
        texfecdevo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        texid_personal2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        texfecdevo3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        texid_personal3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        texfecdevo4 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        texid_personal4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBconexion = new javax.swing.JButton();
        jtsalir = new javax.swing.JButton();
        jSPelemdot = new javax.swing.JScrollPane();
        tbtotalpersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel14.setBackground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Id_Analisis Suelo");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        texidelem_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texidelem_dotActionPerformed(evt);
            }
        });

        texid_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texid_productoActionPerformed(evt);
            }
        });

        texid_personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texid_personalActionPerformed(evt);
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

        texfecdevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfecdevoActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Fecha mueatra");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jLabel16.setBackground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Fecha Analisis");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jLabel17.setBackground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Fecha Reporte");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jLabel18.setBackground(new java.awt.Color(0, 0, 255));
        jLabel18.setText("Id_personal");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jLabel19.setBackground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("Edad_cultivo");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        jLabel20.setBackground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("I_prodcuto");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        texfecdevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfecdevo1ActionPerformed(evt);
            }
        });

        texid_personal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texid_personal1ActionPerformed(evt);
            }
        });

        texfecdevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfecdevo2ActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(0, 0, 255));
        jLabel21.setText("Determinaciòn");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        texid_personal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texid_personal2ActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("Metodo");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        texfecdevo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfecdevo3ActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(0, 0, 255));
        jLabel23.setText("Recomendaciòn");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        texid_personal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texid_personal3ActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(0, 0, 255));
        jLabel24.setText("Rango_Adeciado");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        texfecdevo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfecdevo4ActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(0, 0, 255));
        jLabel25.setText("Resultado");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 204), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 51, 255), new java.awt.Color(0, 102, 255)));

        texid_personal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texid_personal4ActionPerformed(evt);
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
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jBmodificar)
                        .addGap(76, 76, 76)
                        .addComponent(jBguardar1)
                        .addGap(41, 41, 41)
                        .addComponent(jBeliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(texid_personal4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(texidelem_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(117, 117, 117))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(texid_personal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(texid_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(33, 33, 33)))
                                    .addComponent(texid_personal1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texid_personal2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texid_personal3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(texfecdevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texfecdevo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texfecdevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texfecdevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texfecdevo3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(96, 96, 96))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(texidelem_dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texid_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texid_personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(texid_personal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(texid_personal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texid_personal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel19))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(texfecdevo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(texfecdevo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(texfecdevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(texfecdevo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(texfecdevo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(texid_personal4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBmodificar)
                    .addComponent(jBguardar1)
                    .addComponent(jBeliminar))
                .addGap(20, 20, 20))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Analisis de Suelo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        tbtotalpersonas.setBackground(new java.awt.Color(153, 153, 153));
        tbtotalpersonas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla Elementos de dotacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
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
                .addComponent(jSPelemdot, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texidelem_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texidelem_dotActionPerformed
                 // TODO add your handling code here:
    }//GEN-LAST:event_texidelem_dotActionPerformed

    private void texid_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texid_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texid_productoActionPerformed

    private void texid_personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texid_personalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texid_personalActionPerformed

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
//        Personal objetoPersonas = new Personal();
//        objetoPersonas.InsertarPersonas(texid_producto, texid_personal, texid_personal,texid_personal);
//        /*Actualiza los datos y muestra*/
//        objetoPersonas.MostrarPersonas(tbtotalpersonas);
    }//GEN-LAST:event_jBguardar1ActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
//        // TODO add your handling code here:
//        Personal objetoPersonas=new Personal();
//        objetoPersonas.ModificarPersonas(texid_personal, tbtotalpersonas, texid_producto, texid_personal, texid_personal, texid_personal);
//        /*Actualiza los datos y muestra*/
//        objetoPersonas.MostrarPersonas(tbtotalpersonas);
     
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
//        // TODO add your handling code here:
//        Personal objetoPersonas=new Personal();
//        objetoPersonas.EliminarPersonas(texid_personal);
//        /*Actualiza los datos y muestra*/
//        objetoPersonas.MostrarPersonas(tbtotalpersonas);
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void texfecdevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texfecdevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texfecdevoActionPerformed

    private void texfecdevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texfecdevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texfecdevo1ActionPerformed

    private void texid_personal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texid_personal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texid_personal1ActionPerformed

    private void texfecdevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texfecdevo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texfecdevo2ActionPerformed

    private void texid_personal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texid_personal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texid_personal2ActionPerformed

    private void texfecdevo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texfecdevo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texfecdevo3ActionPerformed

    private void texid_personal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texid_personal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texid_personal3ActionPerformed

    private void texfecdevo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texfecdevo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texfecdevo4ActionPerformed

    private void texid_personal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texid_personal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texid_personal4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBconexion;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar1;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jSPelemdot;
    private javax.swing.JButton jtsalir;
    private javax.swing.JTable tbtotalpersonas;
    private javax.swing.JTextField texfecdevo;
    private javax.swing.JTextField texfecdevo1;
    private javax.swing.JTextField texfecdevo2;
    private javax.swing.JTextField texfecdevo3;
    private javax.swing.JTextField texfecdevo4;
    private javax.swing.JTextField texid_personal;
    private javax.swing.JTextField texid_personal1;
    private javax.swing.JTextField texid_personal2;
    private javax.swing.JTextField texid_personal3;
    private javax.swing.JTextField texid_personal4;
    private javax.swing.JTextField texid_producto;
    private javax.swing.JTextField texidelem_dot;
    // End of variables declaration//GEN-END:variables
}
