/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siprocafe;

/**
 *
 * @author USER
 */
public class frm_bloques extends javax.swing.JFrame {

    /**
     * Creates new form frm_bloques
     */
    public frm_bloques() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        texidbloque = new javax.swing.JTextField();
        texubicacion = new javax.swing.JTextField();
        texdensidad = new javax.swing.JTextField();
        jBguardar1 = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        texidpersonal = new javax.swing.JTextField();
        texfabonado = new javax.swing.JTextField();
        texfproabonada = new javax.swing.JTextField();
        texidanalisissuelo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jBeliminar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSPelemdot = new javax.swing.JScrollPane();
        tbtotalpersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Id_bloque");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        texidbloque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texidbloqueActionPerformed(evt);
            }
        });
        jPanel2.add(texidbloque, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, -1));

        texubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texubicacionActionPerformed(evt);
            }
        });
        jPanel2.add(texubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 171, -1));

        texdensidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texdensidadActionPerformed(evt);
            }
        });
        jPanel2.add(texdensidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 171, -1));

        jBguardar1.setBackground(new java.awt.Color(0, 153, 153));
        jBguardar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBguardar1.setText("Guardar");
        jBguardar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jBguardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jBmodificar.setBackground(new java.awt.Color(0, 153, 153));
        jBmodificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBmodificar.setText("Modificar");
        jBmodificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });
        jPanel2.add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jBeliminar.setBackground(new java.awt.Color(0, 153, 153));
        jBeliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBeliminar.setText("Salir");
        jBeliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 90, -1));

        texidpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texidpersonalActionPerformed(evt);
            }
        });
        jPanel2.add(texidpersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 170, -1));

        texfabonado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfabonadoActionPerformed(evt);
            }
        });
        jPanel2.add(texfabonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 171, -1));

        texfproabonada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texfproabonadaActionPerformed(evt);
            }
        });
        jPanel2.add(texfproabonada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 171, -1));

        texidanalisissuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texidanalisissueloActionPerformed(evt);
            }
        });
        jPanel2.add(texidanalisissuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 171, 20));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setText("Ubicación");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setText("Densidad");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setText("Fabonado");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setText("F pro abonado");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setText("Id Analisis suelo");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setText("Id Personal");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jBeliminar1.setBackground(new java.awt.Color(0, 153, 153));
        jBeliminar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBeliminar1.setText("Eliminar");
        jBeliminar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBeliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jBeliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bloques");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
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
            .addComponent(jSPelemdot, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPelemdot, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texidbloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texidbloqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texidbloqueActionPerformed

    private void texubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texubicacionActionPerformed

    private void texdensidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texdensidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texdensidadActionPerformed

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
       frm_Menu_Principal_1 form =new frm_Menu_Principal_1();
        form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void texidpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texidpersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texidpersonalActionPerformed

    private void texfabonadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texfabonadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texfabonadoActionPerformed

    private void texfproabonadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texfproabonadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texfproabonadaActionPerformed

    private void texidanalisissueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texidanalisissueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texidanalisissueloActionPerformed

    private void jBeliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeliminar1ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_bloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_bloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_bloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_bloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_bloques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBeliminar1;
    private javax.swing.JButton jBguardar1;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jSPelemdot;
    private javax.swing.JTable tbtotalpersonas;
    private javax.swing.JTextField texdensidad;
    private javax.swing.JTextField texfabonado;
    private javax.swing.JTextField texfproabonada;
    private javax.swing.JTextField texidanalisissuelo;
    private javax.swing.JTextField texidbloque;
    private javax.swing.JTextField texidpersonal;
    private javax.swing.JTextField texubicacion;
    // End of variables declaration//GEN-END:variables
}
