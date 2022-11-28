/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siprocafe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class frm_Menu_Principal_1 extends javax.swing.JFrame {

     
    public frm_Menu_Principal_1() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//            //Línea 1
//        this.setSize(new Dimension(300, 300));
//        
//        //Línea 2
//        this.setMinimumSize(new Dimension(200, 200));

        
        
            }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        producto = new javax.swing.JButton();
        elemento = new javax.swing.JButton();
        cliente = new javax.swing.JButton();
        pago = new javax.swing.JButton();
        bloque = new javax.swing.JButton();
        analisis = new javax.swing.JButton();
        ordenfac = new javax.swing.JButton();
        personal = new javax.swing.JButton();
        usuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(110, 1));
        setMinimumSize(new java.awt.Dimension(850, 533));
        setName("Menu Principal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(590, 479));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Siprocafé");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 0, 240, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logocc110x55.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 112, 71));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 60));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        producto.setBackground(new java.awt.Color(0, 153, 153));
        producto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        producto.setText("Producto");
        producto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });
        jPanel2.add(producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, -1));

        elemento.setBackground(new java.awt.Color(0, 153, 153));
        elemento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        elemento.setText("Elemento de Dotación");
        elemento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        elemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementoActionPerformed(evt);
            }
        });
        jPanel2.add(elemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, -1));

        cliente.setBackground(new java.awt.Color(0, 153, 153));
        cliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cliente.setText("Cliente");
        cliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        jPanel2.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, -1));

        pago.setBackground(new java.awt.Color(0, 153, 153));
        pago.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pago.setText("Pagos");
        pago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });
        jPanel2.add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, -1));

        bloque.setBackground(new java.awt.Color(0, 153, 153));
        bloque.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bloque.setText("Bloque");
        bloque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bloque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloqueActionPerformed(evt);
            }
        });
        jPanel2.add(bloque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, -1));

        analisis.setBackground(new java.awt.Color(0, 153, 153));
        analisis.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        analisis.setText("Analisis de Suelo");
        analisis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        analisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisisActionPerformed(evt);
            }
        });
        jPanel2.add(analisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, -1));

        ordenfac.setBackground(new java.awt.Color(0, 153, 153));
        ordenfac.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ordenfac.setText("Orden Factura");
        ordenfac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ordenfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenfacActionPerformed(evt);
            }
        });
        jPanel2.add(ordenfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, -1));

        personal.setBackground(new java.awt.Color(0, 153, 153));
        personal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        personal.setText("Personal");
        personal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalActionPerformed(evt);
            }
        });
        jPanel2.add(personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, -1));

        usuario.setBackground(new java.awt.Color(0, 153, 153));
        usuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usuario.setText("Usuario");
        usuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 119, 200, 420));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Menu Principal");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 810, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/14--renovacion_web-760x423-c-default.jpg"))); // NOI18N
        jLabel5.setLabelFor(pago);
        jLabel5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 610, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
        frm_registrousuario verformulario = new frm_registrousuario();
         verformulario.setVisible(true);
                this.setVisible(false);
        
    }//GEN-LAST:event_usuarioActionPerformed

    private void personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalActionPerformed
     frm_personal1 verformulario = new frm_personal1();
         verformulario.setVisible(true);   
               this.setVisible(false);
        
    }//GEN-LAST:event_personalActionPerformed

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
      frm_producto verformulario = new frm_producto();
         verformulario.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_productoActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
     frm_clientes verformulario = new frm_clientes();
         verformulario.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_clienteActionPerformed

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
      frm_pagos verformulario = new frm_pagos();
         verformulario.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_pagoActionPerformed

    private void elementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementoActionPerformed
        frm_eledotacion verformulario = new frm_eledotacion();
         verformulario.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_elementoActionPerformed

    private void ordenfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenfacActionPerformed
        frm_Ordenfactura verformulario = new frm_Ordenfactura();
         verformulario.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_ordenfacActionPerformed

    private void analisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisisActionPerformed
      frm_analisis verformulario = new frm_analisis();
         verformulario.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_analisisActionPerformed

    private void bloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloqueActionPerformed
       frm_bloques verformulario = new frm_bloques();
         verformulario.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_bloqueActionPerformed

  
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
            java.util.logging.Logger.getLogger(frm_Menu_Principal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Menu_Principal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Menu_Principal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Menu_Principal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Menu_Principal_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analisis;
    private javax.swing.JButton bloque;
    private javax.swing.JButton cliente;
    private javax.swing.JButton elemento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton ordenfac;
    private javax.swing.JButton pago;
    private javax.swing.JButton personal;
    private javax.swing.JButton producto;
    private javax.swing.JButton usuario;
    // End of variables declaration//GEN-END:variables
}
