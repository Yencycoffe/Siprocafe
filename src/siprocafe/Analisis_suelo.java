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

public class Analisis_suelo {
    
    /*Se definen las variables para manejo de los datos*/
    
    String Fecha_Reporte;
    String Determinaciòn;
    String Resultado;
    String Recomendaciòn;
    String Edad_cultivo;
    String I_prodcuto;
    String Id_personal;
    String Metodo;
    String Rango_Adeciado;
    String Fecha_muestra;
    String Fecha_analisis;
    int Id_analisis_suelo;
    int Id_bloque;

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

    public void setId_analisis_suelo(int Id_analisis_suelo) {
        this.Id_analisis_suelo = Id_analisis_suelo;
    }

    public String getFecha_Reporte() {

        return Fecha_Reporte;
    }

    public void setFecha_Reporte(String Fecha_Reporte) {
        this.Fecha_Reporte = Fecha_Reporte;
    }

    public String getDeterminaciòn() {
        return Determinaciòn;
    }

    public void setDeterminaciòn(String Determinaciòn) {
        this.Determinaciòn = Determinaciòn;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }

    public String getRecomendaciòn() {
        return Recomendaciòn;
    }

    public void setRecomendaciòn(String Recomendaciòn) {
        this.Recomendaciòn = Recomendaciòn;
    }

    public String getEdad_cultivo() {
        return Edad_cultivo;
    }

    public void setEdad_cultivo(String Edad_cultivo) {
        this.Edad_cultivo = Edad_cultivo;
    }

    public String getI_prodcuto() {
        return I_prodcuto;
    }

    public void setI_prodcuto(String I_prodcuto) {
        this.I_prodcuto = I_prodcuto;
    }

    public String getId_personal() {
        return Id_personal;
    }

    public void setId_personal(String Id_personal) {
        this.Id_personal = Id_personal;
    }

    public String getMetodo() {
        return Metodo;
    }

    public void setMetodo(String Metodo) {
        this.Metodo = Metodo;
    }

    public String getRango_Adeciado() {
        return Rango_Adeciado;
    }

    public void setRango_Adeciado(String Rango_Adeciado) {
        this.Rango_Adeciado = Rango_Adeciado;
    }

    public String getFecha_muestra() {
        return Fecha_muestra;
    }

    public void setFecha_muestra(String Fecha_muestra) {
        this.Fecha_muestra = Fecha_muestra;
    }

    public String getFecha_analisis() {
        return Fecha_analisis;
    }

    public void setFecha_analisis(String Fecha_analisis) {
        this.Fecha_analisis = Fecha_analisis;
    }

    public int getId_analisis_suelo() {
        return Id_analisis_suelo;
    }

    public void InsertarPersonas(JTextField texidanalsuel, JTextField texidbloque, JTextField texFechamuestra, JTextField texfechaanaliss, JTextField texfecharep, JTextField Determi, JTextField texresult, JTextField texrecomen, JTextField texedadculti, JTextField texidproduct, JTextField texidpersonal, JTextField texmetodo, JTextField textrangAdec) {

        /*Se incorporan los valores de los controles*/
        
        setId_analisis_suelo(Integer.parseInt(texidanalsuel.getText()));
        setId_bloque(Integer.parseInt(texidbloque.getText()));
        setFecha_muestra(texFechamuestra.getText());
        setFecha_analisis(texfechaanaliss.getText());
        setFecha_Reporte(texfecharep.getText());
        setEdad_cultivo(texedadculti.getText());
        setDeterminaciòn(Determi.getText());
        setMetodo(texmetodo.getText());
        setI_prodcuto(texidproduct.getText());
        setId_personal(texidpersonal.getText());
        setResultado(texresult.getText());
        setRango_Adeciado(textrangAdec.getText());
        setRecomendaciòn(texrecomen.getText());

//          Se crea objeto de tipo conexion

        conexion objetoconexion = new conexion();

        /*Se crea una consulta para insertar los datos*/
        
        String consulta = "INSERT INTO `analisis_suelo`(`Id_Analisis_suelo`, `Id_bloque`, "
                + "`Fecha_muestra`, `Fecha_analisis`, `Fecha_report`, `Edad_cultivo`, `Determinaciòn`, `Metodo`, "
                + "`Id_producto`, `Id_Personal`, `Resultado`, `Rango_adecuado`, `REcomendación`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            /*Se enlaza la conexion con la consulta anterior*/
            
            CallableStatement cs;
            cs = objetoconexion.conectar().prepareCall(consulta);

            /*Se incorporan los parámetros*/
            cs.setInt(1, getId_analisis_suelo());
            cs.setInt(2, getId_bloque());
            cs.setString(3, getFecha_muestra());
            cs.setString(4, getFecha_analisis());
            cs.setString(5, getFecha_Reporte());
            cs.setString(6, getEdad_cultivo());
            cs.setString(7, getDeterminaciòn());
            cs.setString(8, getMetodo());
            cs.setString(9, getI_prodcuto());
            cs.setString(10, getId_personal());
            cs.setString(11, getResultado());
            cs.setString(12, getRango_Adeciado());
            cs.setString(13, getRecomendaciòn());

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
        
        modelo.addColumn("Id_analisis_suelo");
        modelo.addColumn("Id_bloque");
        modelo.addColumn("fecha_muestra");
        modelo.addColumn("fecha_analisis");
        modelo.addColumn("Fecha_reporte");
        modelo.addColumn("edad_cultivo");
        modelo.addColumn("determinacion");
        modelo.addColumn("metodo");
        modelo.addColumn("I_producto");
        modelo.addColumn("Id_personalr");
        modelo.addColumn("resultado");
        modelo.addColumn("rango_adeciado");
        modelo.addColumn("REcomendacion");

        tbtotalpersonas.setModel(modelo);

        sql = "SELECT * FROM `analisis_suelo`;";

        /*Se crea un arreglo*/
        String[] datos = new String[13];

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
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);

                modelo.addRow(datos);

            }

            tbtotalpersonas.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());

        }

    }

    /*Función para seleccionar un registro */
    public void Seleccionarpersona(JTable tbtotalpersonas, JTextField texidanalsuel, JTextField texidbloque, JTextField texFechamuestra, JTextField texfechaanaliss, JTextField texfecharep, JTextField Determi, JTextField texresult, JTextField texrecomen, JTextField texedadculti, JTextField texidproduct, JTextField texidpersonal, JTextField texmetodo, JTextField textrangAdec) {

        try {
            int fila = tbtotalpersonas.getSelectedRow();

            if (fila >= 0) {

                texidanalsuel.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
                texidbloque.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
                texFechamuestra.setText((tbtotalpersonas.getValueAt(fila, 3).toString()));
                texfechaanaliss.setText((tbtotalpersonas.getValueAt(fila, 4).toString()));
                texfecharep.setText((tbtotalpersonas).getValueAt(fila, 5).toString());
                texedadculti.setText((tbtotalpersonas.getValueAt(fila, 8).toString()));
                Determi.setText((tbtotalpersonas).getValueAt(fila, 6).toString());
                texmetodo.setText((tbtotalpersonas.getValueAt(fila, 11).toString()));
                texidproduct.setText((tbtotalpersonas.getValueAt(fila, 9).toString()));
                texidpersonal.setText((tbtotalpersonas.getValueAt(fila, 10).toString()));
                texresult.setText((tbtotalpersonas.getValueAt(fila, 7).toString()));
                textrangAdec.setText((tbtotalpersonas.getValueAt(fila, 12).toString()));
                texrecomen.setText(tbtotalpersonas.getValueAt(fila, 13).toString());

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de seleccion, error: " + e.toString());
        }

    }

    /*Función para modificar los datos de persona*/
    public void ModificarPersonas(JTextField texidanalsuel, JTextField texFechamuestra, JTextField texidbloque, JTextField texfechaanaliss, JTextField texfecharep, JTextField Determi, JTextField texresult, JTextField texrecomen, JTextField texedadculti, JTextField texidproduct, JTextField texidpersonal, JTextField texmetodo, JTextField textrangAdec) {

        /*Convierte de texto a int*/
        setId_analisis_suelo(Integer.parseInt(texidanalsuel.getText()));

        /*Toma los valores de texto*/
        setId_bloque(Integer.parseInt(texidbloque.getText()));
        setFecha_muestra(texFechamuestra.getText());
        setFecha_analisis(texfechaanaliss.getText());
        setFecha_Reporte(texfecharep.getText());
        setEdad_cultivo(texedadculti.getText());
        setDeterminaciòn(Determi.getText());
        setMetodo(texmetodo.getText());
        setI_prodcuto(texidproduct.getText());
        setId_personal(texidpersonal.getText());
        setResultado(texresult.getText());
        setRango_Adeciado(textrangAdec.getText());
        setRecomendaciòn(texrecomen.getText());
        

        conexion objetoconexion = new conexion();

        String consulta = "UPDATE `analisis_suelo` SET `Id_bloque`='?',"
                + "`Fecha_muestra`='?',`Fecha_analisis`='?',`Fecha_report`='?',"
                + "`Edad_cultivo`='?',`Determinaciòn`='?',`Metodo`='?',`Id_producto`='?',"
                + "`Id_Personal`='?',`Resultado`='?',`Rango_adecuado`='?',"
                + "`REcomendación`='?' WHERE analisis_suelo.Id_Analisis_suelo`='?'";
//        
        try {
//            
            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);

            
            cs.setInt(1, getId_bloque());
            cs.setString(2, getFecha_muestra());
            cs.setString(3, getFecha_analisis());
            cs.setString(4, getFecha_Reporte());
            cs.setString(5, getEdad_cultivo());
            cs.setString(6, getDeterminaciòn());
            cs.setString(7, getMetodo());
            cs.setString(8, getI_prodcuto());
            cs.setString(9, getId_personal());
            cs.setString(10, getResultado());
            cs.setString(11, getRango_Adeciado());
            cs.setString(12, getRecomendaciòn());
            cs.setInt(13, getId_analisis_suelo());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Modificación exitosa");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se modificó, error:" + e.toString());
        }

    }

    public void EliminarPersonas(JTextField texidanalsuel) {

        /*Convertir la cadena a Integer*/
        setId_analisis_suelo(Integer.parseInt(texidanalsuel.getText()));

        conexion objetoconexion = new conexion();

        String consulta = "DELETE FROM `analisis_suelo` WHERE `Id_Analisis_suelo`='?' ;";

        try {

            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
            cs.setInt(1, getId_analisis_suelo());
            cs.execute();

            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la Persona");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }

    }  
}