/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprocafe;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Karen Yency Pinedo
 */
public class Consultas1 {

        public void ConsultaPersonas(JTextField texidp, JTextField texnombre, JTextField texapellido, JTextField TexFechanac, JTextField TexFechaing, JTextField TexFecharet,
            JTextField texdirec, JTextField texemail, JTextField texcel, JTextField texeps, JTextField texarls, JComboBox jComboBoxestado) {

        conexion objetoconexion = new conexion();

        Statement st;

        String consulta = "SELECT * FROM PERSONAL WHERE Id_personal = '?'";

        try {

            st = objetoconexion.conectar().createStatement();

            // Ejecute una consulta SQL en la tabla.
            ResultSet rs = st.executeQuery("consulta");

            if (rs.next()) {
//
//                texidp.setText(rs.getString(Id_personal));
//                texnombre.setText(rs.getString(Nombre));
//                texapellido.setText(rs.getString(Direccion));
//                TexFechanac.setText(rs.getString(Fecha_nacimiento));
//                TexFechaing.setText(rs.getString(Fecha_ingreso));
//                texdirec.setText(rs.getString(Direccion));
//                texemail.setText(rs.getString(Email));
//                TexFecharet.setText(rs.getString(Fecha_retiro));
//                texcel.setText(rs.getString(celular));
//                texeps.setText(rs.getString(Eps));
//                texarls.setText(rs.getString(Arls));
//                jComboBoxestado.setSelectedItem(rs.getString(Estado));
//
//            } else {

                JOptionPane.showMessageDialog(null, "No existe una persona con la Identidad digitada");
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo consultat, error: " + e.toString());
        }
    }


    
}
