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

    /**
     * Area Getters y Setters Get: obtiene el valor Set: incorpora el valor
     *
     */
    public String getFecha_muestra(String Fecha_muestra) {
        return Fecha_muestra;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_muestra = Fecha_nacimiento;
    }

    public String getFecha_ingreso(String Fecha_analisis) {
        return Fecha_analisis;
    }

    public void setFecha_ingreso(String Fecha_analisis) {
        this.Fecha_analisis = Fecha_analisis;
    }

    public String getFecha_Reporte() {
        return Fecha_Reporte;
    }

    public void setFecha_reporte(String Fecha_reporte) {
        this.Fecha_Reporte = Fecha_reporte;
    }

    public int getId_analisis_suelo(int Id_analisis_suelo) {
        return Id_analisis_suelo;
    }

    public void setanalisis_suelo(int Id_analisis_suelo) {
        this.Id_analisis_suelo = Id_analisis_suelo;
    }

    public String getdeterminacion() {
        return Determinaciòn;
    }

    public void setdeterminacion(String determinacion) {
        this.Determinaciòn = determinacion;
    }

    public String getresultado() {
        return Resultado;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }

    public String getRecomendacion() {
        return Recomendaciòn;
    }

    public void setRecomendacion(String Recomenacion) {
        this.Recomendaciòn = Recomenacion;
    }

    public String getEdad_cultivo() {
        return Edad_cultivo;
    }

    public void setEdad_cultivo(String Edad_cultivo) {
        this.Edad_cultivo = Edad_cultivo;
    }

    public String getI_producto() {
        return I_prodcuto;
    }

    public void setI_producto(String I_producto) {
        this.I_prodcuto = I_producto;
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

    public String getRango_adeciado() {
        return Rango_Adeciado;
    }

    public void setRango_adeciado(String Rango_adeciado) {
        this.Rango_Adeciado = Rango_adeciado;
    }

    public void InsertarPersonas(JTextField texidelem_dot, JTextField texid_producto, JTextField texid_personal, JTextField texid_personal1, JTextField texid_personal2, JTextField texid_personal3,
            JTextField texfecdevo2, JTextField texfecdevo1, JTextField texfecdevo, JTextField texfecdevo4, JTextField texfecdevo3) {

        /*Se incorporan los valores de los controles*/
        
        
//        setId_analisis_suelo;Integer.parseInt(texidelem_dot.getText()));
//        
//        setfecha_muestra(texid_producto.getText());
//        setfecha_analisis(texid_personal.getText());
//        setFecha_reporte(texid_personal1.getText());
//        setdeterminacion(texid_personal2.getText());
//        setResultado(texid_personal3.getText());
//        setEdad_cultivo(texfecdevo2.getText());
//        setI_producto(texfecdevo1.getText());
//        setId_personal(texfecdevo.getText());
//        setMetodo(texfecdevo4.getText());
//        setRango_adeciado(texfecdevo3.getText());

//          Se crea objeto de tipo conexion  
        conexion objetoconexion = new conexion();

        /*Se crea una consulta para insertar los datos*/
        String consulta = "INSERT INTO Personal ( Id_Personal, Nombre, Apellido,Fecha_nacimiento,Fecha_ingreso,Dirección,Email, Fecha_retiro, celular,Eps,Arls,Estado) values (?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            /*Se enlaza la conexion con la consulta anterior*/
            CallableStatement cs;
            cs = objetoconexion.conectar().prepareCall(consulta);

            /*Se incorporan los parámetros*/
             
//            cs.setInt(1, getId_analisis_suelo(Id_analisis_suelo));
//            cs.setString(2, getFecha_muestra(Fecha_muestra));
//            cs.setString(3, getFecha_analisis());
//            cs.setString(4, getFecha_Reporte());
//            cs.setString(5, getdeterminacion());
//            cs.setString(6, getresultado());
//            cs.setString(7, getEdad_cultivo());
//            cs.setString(8, getI_producto());
//            cs.setString(9, getId_personal());
//            cs.setString(10, getMetodo());
//            cs.setString(11, getRango_adeciado());
//
//            cs.executeUpdate();

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
        modelo.addColumn("fecha_muestra");
        modelo.addColumn("fecha_analisis");
        modelo.addColumn("Fecha_reporte");
        modelo.addColumn("determinacion");
        modelo.addColumn("resultado");
        modelo.addColumn("edad_cultivo");
        modelo.addColumn("I_producto");
        modelo.addColumn("Id_personalr");
        modelo.addColumn("metodo");
        modelo.addColumn("rango_adeciado");

        tbtotalpersonas.setModel(modelo);

        sql = "select * from personal;";
        /*Se crea un arreglo*/

        String[] datos = new String[12];

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

                modelo.addRow(datos);

            }

            tbtotalpersonas.setModel(modelo);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());

        }

    }

    /*Función para seleccionar un registro */
    public void Seleccionarpersona(JTable tbtotalpersonas,JTextField texidelem_dot, JTextField texid_producto, JTextField texid_personal, JTextField texid_personal1, JTextField texid_personal2, JTextField texid_personal3,
            JTextField texfecdevo2, JTextField texfecdevo1, JTextField texfecdevo, JTextField texfecdevo4, JTextField texfecdevo3) {

        try {
            int fila = tbtotalpersonas.getSelectedRow();

            if (fila >= 0) {

                texidelem_dot.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
                texid_producto.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
                texid_personal.setText((tbtotalpersonas.getValueAt(fila, 3).toString()));
                texid_personal1.setText((tbtotalpersonas).getValueAt(fila,4).toString()) ;
                texid_personal2.setText((tbtotalpersonas).getValueAt(fila,5).toString()) ;
                texid_personal3.setText((tbtotalpersonas.getValueAt(fila, 6).toString()));
                texfecdevo2.setText((tbtotalpersonas.getValueAt(fila, 7).toString()));
                texfecdevo1.setText((tbtotalpersonas.getValueAt(fila, 8).toString()));
                texfecdevo.setText((tbtotalpersonas.getValueAt(fila, 9).toString()));
                texfecdevo4.setText((tbtotalpersonas.getValueAt(fila, 10).toString()));
                texfecdevo3.setText((tbtotalpersonas.getValueAt(fila, 11).toString()));

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de seleccion, error: " + e.toString());
        }

    }

    /*Función para modificar los datos de persona*/
    
    public void ModificarPersonas(JTextField texidelem_dot, JTextField texid_producto, JTextField texid_personal, JTextField texid_personal1, JTextField texid_personal2, JTextField texid_personal3,
            JTextField texfecdevo2, JTextField texfecdevo1, JTextField texfecdevo, JTextField texfecdevo4, JTextField texfecdevo3) {
               
        /*Convierte de texto a int*/
         
//        setInteger.parseInt(texidelem_dot.getText()));
//
//        /*Toma los valores de texto*/
//        setfecha_muestra(texid_producto.getText());
//        setfecha_analisis(texid_personal.getText());
//        setFecha_reporte(texid_personal1.getText());
//        setdeterminacion(texid_personal2.getText());
//        setResultado(texid_personal3.getText());
//        setEdad_cultivo(texfecdevo2.getText());
//        setI_producto(texfecdevo1.getText());
//        setId_personal(texfecdevo.getText());
//        setMetodo(texfecdevo4.getText());
//        setRango_adeciado(texfecdevo3.getText());
//
//        conexion objetoconexion = new conexion();
//
//        String consulta = "UPDATE Personal SET personal.Nombre = ?, personal.Apellido =?,personal.Fecha_nacimiento =?,personal.Fecha_nacimiento,personal.Fecha_ingreso personal.Dirección =?, personal.Email =?,personal.Fecha_retiro,personal.celular =?,personal.Eps =?,personal.Arls =?,personal.Estado =? WHERE personal.Id_Personal =?;";
////        
//        try{
////            
//            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
//  
//            cs.setInt(1, getId_analisis_suelo(Id_analisis_suelo));
//            cs.setString(2, getFecha_muestra(Fecha_muestra));
//            cs.setString(3, getFecha_ingreso(Fecha_analisis));
//            cs.setString(4, getFecha_Reporte());
//            cs.setString(5, getdeterminacion());
//            cs.setString(6, getresultado());
//            cs.setString(7, getEdad_cultivo());
//            cs.setString(8, getI_producto());
//            cs.setString(9, getId_personal());
//            cs.setString(10, getMetodo());
//            cs.setString(11, getRango_adeciado());
//
//            cs.execute();
//
//            JOptionPane.showMessageDialog(null, "Modificación exitosa");
//            
//            } catch (SQLException e) {
//            
//            JOptionPane.showMessageDialog(null, "No se modificó, error:" + e.toString());
//        }
//        
//    }
//
//    public void EliminarPersonas(JTextField texidp) {
//        
//        /*Convertir la cadena a Integer*/
//        
//        setId_analisis_suelo Integer.parseInt(texidp.getText()));
//
//        conexion objetoconexion = new conexion();
//
//        String consulta = "DELETE FROM personal WHERE personal.Id_personal=?;";
//
//        try {
//            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
//            cs.setInt(1, getId_analisis_suelo());
//            cs.execute();
//
//            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la Persona");
//
//        } catch (SQLException e) {
//
//            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
//        }
//
//    }  
}
}
