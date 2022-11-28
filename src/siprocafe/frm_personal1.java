/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siprocafe;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import siprocafe.Personal;
import siprocafe.conexion;
import java.sql.CallableStatement;
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
        
        setLocationRelativeTo(null);
        //estabelezcon conección con mi bd
        
        conexion objetoconexion = new conexion();
        objetoconexion.conectar();
        
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
        Actualizar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        texeps = new javax.swing.JTextField();
        jBsalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbtotalpersonas = new javax.swing.JTable();
        Consulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 49));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Dirección");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 16));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jL.setBackground(new java.awt.Color(204, 204, 204));
        jL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jL.setText("Fecha_Nacimiento");
        jPanel2.add(jL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 24));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Fecha_Retiro");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 24));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Fecha_Ingreso");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 24));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Id_Personal");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Email");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 16, -1, -1));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Celular");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Eps");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Arls");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Estado");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        texidp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texidpActionPerformed(evt);
            }
        });
        jPanel2.add(texidp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, 20));

        texdirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texdirecActionPerformed(evt);
            }
        });
        jPanel2.add(texdirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 171, -1));

        texemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texemailActionPerformed(evt);
            }
        });
        jPanel2.add(texemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 13, 163, -1));

        texarls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texarlsActionPerformed(evt);
            }
        });
        jPanel2.add(texarls, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 163, -1));

        texnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texnombreActionPerformed(evt);
            }
        });
        jPanel2.add(texnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 171, -1));

        texapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texapellidoActionPerformed(evt);
            }
        });
        jPanel2.add(texapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 171, -1));

        texcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texcelActionPerformed(evt);
            }
        });
        jPanel2.add(texcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 163, -1));

        texcargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texcargoActionPerformed(evt);
            }
        });
        jPanel2.add(texcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 163, -1));

        jBguardar1.setBackground(new java.awt.Color(0, 153, 153));
        jBguardar1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBguardar1.setText("Guardar");
        jBguardar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBguardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jBguardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jBeliminar.setBackground(new java.awt.Color(0, 153, 153));
        jBeliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));
        jPanel2.add(TexFechaing, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 171, -1));

        TexFechanac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexFechanacActionPerformed(evt);
            }
        });
        jPanel2.add(TexFechanac, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 171, -1));
        jPanel2.add(TexFEcharet, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 171, -1));

        jComboBoxestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jComboBoxestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxestadoActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 163, -1));

        Actualizar.setBackground(new java.awt.Color(0, 153, 153));
        Actualizar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("cargo");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        texeps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texepsActionPerformed(evt);
            }
        });
        jPanel2.add(texeps, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 163, -1));

        jBsalir.setBackground(new java.awt.Color(0, 153, 153));
        jBsalir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel2.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 67, -1));

        tbtotalpersonas.setBackground(new java.awt.Color(204, 204, 255));
        tbtotalpersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbtotalpersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtotalpersonasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbtotalpersonas);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 347, 740, 170));

        Consulta.setBackground(new java.awt.Color(0, 153, 153));
        Consulta.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Consulta.setText("Consulta");
        Consulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(Consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 740, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        objetoPersonas.EliminarPersonas(tbtotalpersonas, texidp);
        /*Actualiza los datos y muestra*/
        objetoPersonas.MostrarPersonas(tbtotalpersonas);
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void TexFechanacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexFechanacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexFechanacActionPerformed

    private void jComboBoxestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxestadoActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
        Personal objetoPersonas=new Personal();
        objetoPersonas.ActualizarPersonas(tbtotalpersonas, texnombre, texidp, texapellido, TexFechanac, TexFechaing, TexFEcharet, texdirec, texemail, texcel, texeps, texarls, jComboBoxestado, texcargo);
        
        /*Actualiza los datos y muestra*/
        objetoPersonas.MostrarPersonas(tbtotalpersonas);

    }//GEN-LAST:event_ActualizarActionPerformed

    private void texepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texepsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texepsActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
         frm_Menu_Principal_1 formulario1=new frm_Menu_Principal_1();
        formulario1.setVisible(true);
         this.setVisible(false);
           
    }//GEN-LAST:event_jBsalirActionPerformed

    private void texidpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texidpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texidpActionPerformed

    private void tbtotalpersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtotalpersonasMouseClicked
        Personal objetoPersonas=new Personal();
        objetoPersonas.Seleccionarpersona(tbtotalpersonas, texidp, texnombre, texapellido, TexFechanac, TexFechaing, TexFEcharet, texdirec, texemail, texcel, texeps, texarls, jComboBoxestado, texcargo);
        
    }//GEN-LAST:event_tbtotalpersonasMouseClicked

    private void ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaActionPerformed
        
           
       frm_Consulta formulario1=new frm_Consulta();
        formulario1.setVisible(true);
         this.setVisible(false);
        
                
    }//GEN-LAST:event_ConsultaActionPerformed
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
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Consulta;
    private javax.swing.JTextField TexFEcharet;
    private javax.swing.JTextField TexFechaing;
    private javax.swing.JTextField TexFechanac;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar1;
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
