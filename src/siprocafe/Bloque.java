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

public class Bloque {
    
        /*Se definen las variables para manejo de los datos*/
    int Id_bloque;
    String ubicacion;
    String densidad;
    String Fabonado;
    String Fproabonada;
    String Id_analisuelo;
    String Id_personal;

    /**
     * Area Getters y Setters Get: obtiene el valor Set: incorpora el valor
     *
     */

    public int getId_bloque() {

        return Id_bloque;
    }

    public void setId_bloque(int Id_bloque) {
        this.Id_bloque = Id_bloque;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDensidad() {
        return densidad;
    }

    public void setDensidad(String densidad) {
        this.densidad = densidad;
    }

    public String getFabonado() {
        return Fabonado;
    }

    public void setFabonado(String Fabonado) {
        this.Fabonado = Fabonado;
    }

    public String getFproabonada() {
        return Fproabonada;
    }

    public void setFproabonada(String Fproabonada) {
        this.Fproabonada = Fproabonada;
    }

    public String getId_analisuelo() {
        return Id_analisuelo;
    }

    public void setId_analisuelo(String Id_analisuelo) {
        this.Id_analisuelo = Id_analisuelo;
    }

    public String getId_personal() {
        return Id_personal;
    }

    
    public void setId_personal(String Id_personal) {    
        this.Id_personal = Id_personal;
    }

    public void Insertarbloque(JTextField texidbloque, JTextField texubicacion, JTextField texdensidad, JTextField texfproabonada, JTextField texidanalisissuelo, JTextField texidpersonal, JTextField texfabonado) {
        /*Se incorporan los valores de los controles*/

        setId_bloque(Integer.parseInt(texidbloque.getText()));
        setUbicacion(texubicacion.getText());
        setDensidad(texdensidad.getText());
        setFabonado(texfabonado.getText());
        setFproabonada(texfproabonada.getText());
        setId_analisuelo(texidanalisissuelo.getText());
        setId_personal(texidpersonal.getText());

//          Se crea objeto de tipo conexion
        conexion objetoconexion = new conexion();

        /*Se crea una consulta para insertar los datos*/
        String consulta = "INSERT INTO `bloque`(`Id_bloque`, `ubicacion`, `Densidad`, `Fabonado`, `F_pro_abonada`, `id_analisis_suelo`, `Id_personal`)"
                + " VALUES ('?','?','?','?','?','?','?')";

        try {
            /*Se enlaza la conexion con la consulta anterior*/

            CallableStatement cs;

            cs = objetoconexion.conectar().prepareCall(consulta);
            /*Se incorporan los parámetros*/

            cs.setInt(1, getId_bloque());
            cs.setString(2, getUbicacion());
            cs.setString(3, getDensidad());
            cs.setString(4, getFabonado());
            cs.setString(5, getFproabonada());
            cs.setString(6, getId_analisuelo());
            cs.setString(7, getId_personal());

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
        
        modelo.addColumn("Id_bloque");
        modelo.addColumn("Ubicaciion");
        modelo.addColumn("Densidad");
        modelo.addColumn("Fabonada");
        modelo.addColumn("Fproabonada");
        modelo.addColumn("Id_analisis_suelo");
        modelo.addColumn("Id_personal");
       
        tbtotalpersonas.setModel(modelo);

        sql = "SELECT * FROM `bloque` ";

        /*Se crea un arreglo*/
        
        String[] datos = new String[7];

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
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                
                modelo.addRow(datos);

            }

            tbtotalpersonas.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());

        }
    }

    /*Función para seleccionar un registro */
    public void Seleccionarpersona(JTable tbtotalpersonas, JTextField texidbloque, JTextField texubicacion, JTextField texdensidad, JTextField texfproabonada, JTextField texidanalisissuelo, JTextField texidpersonal, JTextField texfabonado) {

        try {
            int fila = tbtotalpersonas.getSelectedRow();

            if (fila >= 0) {

                texidbloque.setText((tbtotalpersonas.getValueAt(fila, 0).toString()));
                texubicacion.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
                texdensidad.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
                texfabonado.setText((tbtotalpersonas).getValueAt(fila, 3).toString());
                texfproabonada.setText((tbtotalpersonas).getValueAt(fila, 4).toString());
                texidanalisissuelo.setText((tbtotalpersonas.getValueAt(fila, 5).toString()));
                texidpersonal.setText((tbtotalpersonas.getValueAt(fila, 6).toString()));
                

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de seleccion, error: " + e.toString());
        }

    }

    /*Función para modificar los datos de persona*/
    public void ActualizarPersonas(JTable tbtotalpersonas, JTextField texidbloque, JTextField texubicacion, JTextField texdensidad, JTextField texfproabonada, JTextField texidanalisissuelo, JTextField texidpersonal, JTextField texfabonado) {

        /*Convierte de texto a int*/
        setId_bloque(Integer.parseInt(texidbloque.getText()));

        /*Toma los valores de texto*/
        setUbicacion(texubicacion.getText());
        setDensidad(texdensidad.getText());
        setFabonado(texfabonado.getText());
        setFproabonada(texfproabonada.getText());
        setId_analisuelo(texidanalisissuelo.getText());
        setId_personal(texidpersonal.getText());
        
        conexion objetoconexion = new conexion();

        String consulta = "UPDATE `bloque` SET `ubicacion`='?',`Densidad`='?',`Fabonado`='?',`F_pro_abonada`='?',`id_analisis_suelo`='?',`Id_personal`='?' WHERE bloque.Id_bloque`='?'";

        try {

            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);

            cs.setString(1, getId_bloque());
            cs.setString(2, getApellido());
            cs.setString(3, getFecha_nacimiento());
            cs.setString(4, getFecha_ingreso());
            cs.setString(5, getDireccion());
            cs.setString(6, getEmail());
            cs.setString(7, getFecha_retiro());
            cs.setString(8, getcelular());
            cs.setString(9, getEps());
            cs.setString(10, getArls());
            cs.setString(11, getEstado());
            cs.setString(12, getCargo());
            cs.setInt(13, getId_personal());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Modificación exitosa");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se modificó, error:" + e.toString());
        }

    }

    public void EliminarPersonas(JTable tbtotalpersonas, JTextField texidp) {

        /*Convertir la cadena a Integer*/
        setId_personal(Integer.parseInt(texidp.getText()));

        conexion objetoconexion = new conexion();

        String consulta = "DELETE FROM personal WHERE personal.Id_Personal=?;";

        try {
            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
            cs.setInt(1, getId_personal());
            cs.execute();

            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la Persona");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }

    }

    public void ConsultaPersonas(JTable tbtotalpersonas, JTextField id) {

        conexion objetoconexion = new conexion();

        String consulta = "SELECT * FROM `personal`";

        try {

            Statement cs = objetoconexion.conectar().createStatement();

            ResultSet rs = cs.executeQuery(consulta);
            /*Convertir la cadena a Integer*/
            setId_personal(Integer.parseInt(id.getText()));

            DefaultTableModel modelo = new DefaultTableModel();
            JTable tabla = new JTable(modelo);

            /*Se crean los encabezados de las columnas*/
            modelo.addColumn("Id_personal");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Fecha_nacimiento");
            modelo.addColumn("Fecha_ingreso");
            modelo.addColumn("Direccion");
            modelo.addColumn("Email");
            modelo.addColumn("Fecha_retiro");
            modelo.addColumn("celular");
            modelo.addColumn("Eps");
            modelo.addColumn("Arls");
            modelo.addColumn("Estado");
            modelo.addColumn("Cargo");

            tbtotalpersonas.setModel(modelo);

            /*Se crea un arreglo*/
            String[] datos = new String[13];

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);

                modelo.addRow(datos);

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se encontro los registros, error: " + ex.toString());
        }
    }
}

