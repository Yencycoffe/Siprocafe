/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siprocafe;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class frm_usuario1 extends javax.swing.JFrame {

      public frm_usuario1() {
        
        initComponents();
        
          setLocationRelativeTo(null);
          
          
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        textusuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ingreso = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("USUARIO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jPassword.setText("jPasswordField1");
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 119, -1));

        textusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textusuarioActionPerformed(evt);
            }
        });
        jPanel2.add(textusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 119, -1));

        jLabel3.setBackground(new java.awt.Color(51, 204, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("BIENVENIDOS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 260, -1));

        ingreso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ingreso.setText("INGRESAR");
        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoActionPerformed(evt);
            }
        });
        jPanel2.add(ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("CONTRASEÑA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 102, 0));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("SIPROCAFE");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 39));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 360, 320));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomenus.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 560));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 560));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 290, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoActionPerformed

        String user =textusuario.getText();
        String clave=jPassword.getUIClassID();
        
        String SSQL="SELECT * FROM `usuario`'WHERE `Contraseña='"+clave+"'AND`login='"+user+"';";
        
        try {
            conexion objetocon = new conexion();
            PreparedStatement ps;
            ps = objetocon.conectar().prepareStatement(SSQL);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
//                SI USUARIO SI EXISTE

                    
                    String Cont= rs.getString("Contraseña");
                    String rol = rs.getString("Rol") ;
                    String Usu = rs.getString("login");
                    
                    if(clave.equals(Cont)){
                        
//                        vamos a ir al formulario principal

                            frm_Menu_Principal_1 ventanan1 = new frm_Menu_Principal_1();
                            ventanan1.setVisible(true);

                        if(rol.equals("Administrador Sistema")){
                            
                            frm_Menu_Principal_1 ventanan2 = new frm_Menu_Principal_1();
                            ventanan2.setVisible(true);
                                                   
                           }else{
                        
                                JOptionPane.showMessageDialog(null, "La Contraseña no es Correcta " );
                    
                                }
                        
                     }else{
                        
                    //                SI USUARIO NO EXISTE

                JOptionPane.showMessageDialog(null, "No se encontro el usuario no existe: " );
                    
            }
            }
                       
          } catch (SQLException ex) {
             
              JOptionPane.showMessageDialog(null, "No se encontro el usuario, error: " + ex.toString());
          }
        
        
        
        
        

    }//GEN-LAST:event_ingresoActionPerformed

    private void textusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textusuarioActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    
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
            java.util.logging.Logger.getLogger(frm_usuario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_usuario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_usuario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_usuario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_usuario1().setVisible(true);
            }
        });
         }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField textusuario;
    // End of variables declaration//GEN-END:variables
}
