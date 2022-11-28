/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprocafe;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Calendar;
import javax.swing.JComboBox;

public class Pago {

    /*Se definen las variables para manejo de los datos*/
    int Id_pagos;
    int Id_personal;
    int Id_bloques;
    String valor_pagos;
    int Id_usuarios;

    /**
     * Area Getters y Setters Get: obtiene el valor Set: incorpora el valor
     *
     */
    public int getId_pagos() {

        return Id_pagos;
    }

    public void setId_pagos(int Id_pagos) {
        this.Id_pagos = Id_pagos;
    }

    public int getId_personal() {
        return Id_personal;
    }

    public void setId_personal(int Id_personal) {
        this.Id_personal = Id_personal;
    }

    public int getId_bloques() {
        return Id_bloques;
    }

    public void setId_bloques(int Id_bloques) {
        this.Id_bloques = Id_bloques;
    }

    public String getValor_pagos() {
        return valor_pagos;
    }

    public void setValor_pagos(String valor_pagos) {
        this.valor_pagos = valor_pagos;
    }

    public int getId_usuarios() {
        return Id_usuarios;
    }

    public void setId_usuarios(int Id_usuarios) {
        this.Id_usuarios = Id_usuarios;
    }

    public void InsertarPersonas(JTextField texidpagos, JTextField texid_personal, JTextField texid_bloque, JTextField texvalorpago, JTextField texid_usuario) {
        
        /*Se incorporan los valores de los controles*/

        setId_pagos(Integer.parseInt(texidpagos.getText()));
        setId_personal(Integer.parseInt(texid_personal.getText()));
        setId_bloques(Integer.parseInt(texid_bloque.getText()));
        setValor_pagos(texvalorpago.getText());
        setId_usuarios(Integer.getInteger(texid_usuario.getText()));
        

//          Se crea objeto de tipo conexion

        conexion objetoconexion = new conexion();

        /*Se crea una consulta para insertar los datos*/
        
        String consulta = "INSERT INTO `pagos`(`Id_pagos`,`Id_personal`, `Id_bloque`, `Valor_pagos`, `Id_usuario`) VALUES (?,?,?,?,?)";

        try {
            
            /*Se enlaza la conexion con la consulta anterior*/

            CallableStatement cs;

            cs = objetoconexion.conectar().prepareCall(consulta);
            /*Se incorporan los parámetros*/

            cs.setInt(1, getId_pagos());
            cs.setInt(2, getId_bloques());
            cs.setInt(3, getId_personal());
            cs.setString(4, getValor_pagos());
            cs.setInt(5, getId_usuarios());

            cs.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente la información");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se insertó correctamente, error: " + e.toString());
        }
    }

    public void MostrarPersonas(JTable tbtotalpersonas) {

        /*Se crea un modelo de tabla*/
        
        conexion objetoconexion = new conexion();
        DefaultTableModel modelo = new DefaultTableModel();

        /*Ordenar tabla*/
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        tbtotalpersonas.setRowSorter(OrdenarTabla);

        String sql = " ";

        /*Se crean los encabezados de las columnas*/
        
        modelo.addColumn("Id_pagos");
        modelo.addColumn("Id_personal");
        modelo.addColumn("Id_bloque");
        modelo.addColumn("Valor_pagos");
        modelo.addColumn("Id_usuario");
        
        tbtotalpersonas.setModel(modelo);

        sql = "SELECT * FROM `pagos`";

        /*Se crea un arreglo*/
        
        String[] datos = new String[5];

        Statement st;

        try {
            st = objetoconexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);

            /*Se recorre el arreglo*/
            while (rs.next()) {
                
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                            

                modelo.addRow(datos);

            }

            tbtotalpersonas.setModel(modelo);

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());

        }
    }

    /*Función para seleccionar un registro */
    public void Seleccionarpersona(JTable tbtotalpersonas,JTextField texidpagos, JTextField texid_personal, JTextField texid_bloque, JTextField texvalorpago, JTextField texid_usuario) {

        try {
            int fila = tbtotalpersonas.getSelectedRow();

            if (fila >= 0) {

                texidpagos.setText((tbtotalpersonas.getValueAt(fila, 0).toString()));
                texid_bloque.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
                texid_personal.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
                texvalorpago.setText((tbtotalpersonas).getValueAt(fila, 3).toString());
                texid_usuario.setText((tbtotalpersonas).getValueAt(fila, 4).toString());
                
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de seleccion, error: " + e.toString());
        }

    }

    /*Función para modificar los datos de persona*/
    public void ActualizarPersonas(JTextField texidpagos, JTextField texid_personal, JTextField texid_bloque, JTextField texvalorpago, JTextField texid_usuario) {

        /*Convierte de texto a int*/
        setId_pagos(Integer.parseInt(texidpagos.getText()));

        /*Toma los valores de texto*/
        
        setId_bloques(Integer.parseInt(texid_bloque.getText()));
        setId_personal(Integer.parseInt(texid_personal.getText()));
        setValor_pagos(texvalorpago.getText());
        setId_usuarios(Integer.parseInt(texid_usuario.getText()));
                
        conexion objetoconexion = new conexion();

        String consulta = "UPDATE `pagos` SET `Id_personal`= '?' ,`Id_bloque`='?',`Valor_pagos`='?',`Id_usuario`='?' WHERE `pagos.Id_pagos`='?';";

        try {

            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);

            cs.setInt(1, getId_pagos());
            cs.setInt(2, getId_bloques());
            cs.setInt(3, getId_personal());
            cs.setString(4, getValor_pagos());
            cs.setInt(5, getId_usuarios());
            

            cs.execute();

            JOptionPane.showMessageDialog(null, "Modificación exitosa");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se modificó, error:" + e.toString());
        }

    }

    public void EliminarPersonas(JTable tbtotalpersonas, JTextField texidpagos) {

        /*Convertir la cadena a Integer*/
        setId_pagos(Integer.parseInt(texidpagos.getText()));

        conexion objetoconexion = new conexion();

        String consulta = "DELETE FROM `pagos` WHERE pagos.Id_pagos=?;";

        try {
            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
            cs.setInt(1, getId_pagos());
            cs.execute();

            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la Persona");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }

    }

    public void ConsultaPersonas(JTable tbtotalpersonas, JTextField texidpagos) {

        conexion objetoconexion = new conexion();

        String consulta = "SELECT * FROM `pagos` WHERE pagos.Id_pagos=?;";

        try {

            Statement cs = objetoconexion.conectar().createStatement();

            ResultSet rs = cs.executeQuery(consulta);
            /*Convertir la cadena a Integer*/
            setId_pagos(Integer.parseInt(texidpagos.getText()));

            DefaultTableModel modelo = new DefaultTableModel();
            JTable tabla = new JTable(modelo);

            /*Se crean los encabezados de las columnas*/
            
            modelo.addColumn("Id_pagos");
            modelo.addColumn("Id_personal");
            modelo.addColumn("Id_bloque");
            modelo.addColumn("Valor_pagos");
            modelo.addColumn("Id_usuario");
            
            tbtotalpersonas.setModel(modelo);

            /*Se crea un arreglo*/
            String[] datos = new String[5];

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                
                
                modelo.addRow(datos);

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontro los registros, error: " + ex.toString());
        }
    }

}

