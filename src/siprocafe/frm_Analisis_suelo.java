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
        texfecdevo1 = new javax.swing.JTextField();
        texid_personal1 = new javax.swing.JTextField();
        texfecdevo2 = new javax.swing.JTextField();
        texid_personal2 = new javax.swing.JTextField();
        texfecdevo3 = new javax.swing.JTextField();
        texid_personal3 = new javax.swing.JTextField();
        texfecdevo4 = new javax.swing.JTextField();
        texid_personal4 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBconexion = new javax.swing.JButton();
        jtsalir = new javax.swing.JButton();
        jSPelemdot = new javax.swing.JScrollPane();
        tbtotalpersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Id_Analisis Suelo");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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

        texid_personal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texid_personal2ActionPerformed(evt);
            }
        });

        texfecdevo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfecdevo3ActionPerformed(evt);
            }
        });

        texid_personal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texid_personal3ActionPerformed(evt);
            }
        });

        texfecdevo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfecdevo4ActionPerformed(evt);
            }
        });

        texid_personal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texid_personal4ActionPerformed(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setText("Fecha Muestra");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setText("Fecha Analisis");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setText("Fecha Reporte");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setText("Determinación");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setText("Resultado");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setText("Recomendación");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setText("Edad Cultivo");
        jLabel32.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setText("Id Producto");
        jLabel33.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setText("Id Personal");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setText("Metodo");
        jLabel35.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel36.setText("Rango_Adeciado");
        jLabel36.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel31)
                        .addComponent(jLabel30)))
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
                                            .addComponent(texid_personal3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel34)
                                                .addComponent(jLabel32))
                                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(texid_personal1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(texid_personal2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel35)))
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(texidelem_dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texid_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texid_personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texid_personal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texid_personal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texid_personal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texfecdevo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texfecdevo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texfecdevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texfecdevo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texfecdevo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texid_personal4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBmodificar)
                    .addComponent(jBguardar1)
                    .addComponent(jBeliminar))
                .addGap(20, 20, 20))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Analisis de Suelo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
            .addComponent(jSPelemdot, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
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
