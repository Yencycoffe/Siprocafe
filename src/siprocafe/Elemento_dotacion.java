
package siprocafe;


import java.util.Date;
import java.sql.*;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Elemento_dotacion {

    /*Se definen las variables para manejo de los datos*/
//    
//    int Id_elementos_dotacion;
//    int Id_personal;
//    int cantidad;
//    String Clase;
//    String nombre_elem_dot;
//    String Fecha_prestamo;
//    String Fecha_devolucion;
//    String Estado_devolucion;
//    String Estado;
//
//    /**
//     * Area Getters y Setters Get: obtiene el valor Set: incorpora el valor
//     *
//     */
//
//    public int getcantidad()  {
//        return cantidad;
//    }
//
//    public void setcantidad(int cantidad) {
//        this.cantidad = cantidad;
//    }
//    
//    public String getClase()  {
//        return Clase;
//    }
//
//    public void setClase(String Clase) {
//        this.Clase = Clase;
//    }
//
//    public String getnombre_elem_dot()  {
//        return nombre_elem_dot;
//    }
//
//    public void setnombre_elem_dot(String nombre_elem_dot) {
//        this.nombre_elem_dot = nombre_elem_dot;
//    }
//
//    
//    public int getId_elementos_dotacion()  {
//        return Id_elementos_dotacion;
//    }
//
//    public void setId_elementos_dotacion(int Id_elementos_dotacion) {
//        this.Id_elementos_dotacion = Id_elementos_dotacion;
//    }
//
//    public String getFecha_prestamo() {
//        return Fecha_prestamo;
//    }
//
//    public void setFecha_prestamo(String Fecha_prestamo) {
//        this.Fecha_prestamo = Fecha_prestamo;
//    }
//
//    public int getId_personal() {
//        return Id_personal;
//    }
//
//    public void setId_personal(int Id_personal) {
//        this.Id_personal = Id_personal;
//    }
//
//    public String getFecha_devolucion() {
//        return Fecha_devolucion;
//    }
//
//    public void setFecha_devolucion(String Fecha_devolucion) {
//        this.Fecha_devolucion= Fecha_devolucion;
//    }
//
//    public String getEstado_devolucion() {
//        return Estado_devolucion;
//    }
//
//    public void setEstado_devolucion(String Estado_devolucion) {
//        this.Estado_devolucion = Estado_devolucion;
//    }
//
//    public String getEstado() {
//        return Estado;
//    }
//
//    public void setEstado(String Estado) {
//        this.Estado = Estado;
//    }
//
//    public void Insertarelemnetos(JTextField texidelem_dot, JTextField texnomele, JTextField texcant, JTextField texfechpres, JTextField texfecdev, JTextField txtidpers, JComboBox jCBestadodevo, JComboBox jCBClase, JComboBox jComboBoxestado) {
//
//        /*Se incorporan los valores de los controles*/
//        
//        setId_elementos_dotacion(Integer.parseInt(texidelem_dot.getText()));
//        setnombre_elem_dot(texnomele.getText());
//        setClase(jCBClase.getSelectedItem().toString());
//        setEstado_devolucion(jCBestadodevo.getSelectedItem().toString());
//        setFecha_prestamo(texfechpres.getText());
//        setFecha_devolucion(texfecdev.getText());
//        setEstado(jComboBoxestado.getSelectedItem().toString());
//        setcantidad(Integer.parseInt(texcant.getText()));
//        setId_personal(Integer.parseInt(txtidpers.getText()));
//
////          Se crea objeto de tipo conexion  
//        conexion objetoconexion = new conexion();
//
//        /*Se crea una consulta para insertar los datos*/
//        String consulta = "INSERT INTO elementos_dotacion (Id_elementos_dotacion, Nombre_elem_dot, Clase, Estado_devolucion, Fecha_prestamo, Fecha_devolucion, Estado,Cantidad, Id_personal) values (?,?,?,?,?,?,?,?,?)";
//
//        try {
//
//            /*Se enlaza la conexion con la consulta anterior*/
//            java.sql.CallableStatement cs;
//            cs = objetoconexion.conectar().prepareCall(consulta);
//
//            /*Se incorporan los parámetros*/
//            cs.setInt(1, getId_elementos_dotacion());
//            cs.setString(2, getnombre_elem_dot());
//            cs.setString(3, getClase());
//            cs.setString(4, getEstado_devolucion());
//            cs.setString(5, getFecha_prestamo());
//            cs.setString(6, getFecha_devolucion());
//            cs.setString(7, getEstado());
//            cs.setInt(8, getcantidad());
//            cs.setInt(9, getId_personal());
//
//            cs.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Se insertó correctamente la información");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "No se insertó correctamente, error: " + e.toString());
//        }
//    }
//
//    public void Mostrarelementos(JTable tbtotalpersonas) {
//
//        /*Se crea un modelo de tabla*/
//        conexion objetoconexion = new conexion();
//        DefaultTableModel modelo = new DefaultTableModel();
//
//        /*Ordenar tabla*/
//        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
//        tbtotalpersonas.setRowSorter(OrdenarTabla);
//
//        String sql = " ";
//
//        /*Se crean los encabezados de las columnas*/
//        modelo.addColumn("Id_elementos_dotacion");
//        modelo.addColumn("Nombre_elem_dot");
//        modelo.addColumn("Clase");
//        modelo.addColumn("Estado_devolucion");
//        modelo.addColumn("Fecha_prestamo");
//        modelo.addColumn("Fecha_devolucion");
//        modelo.addColumn("Estado");
//        modelo.addColumn("Cantidad");
//        modelo.addColumn("Id_personal");
//
//        tbtotalpersonas.setModel(modelo);
//
//        sql = "select * from elementos_dotacion;";
//
//        /*Se crea un arreglo*/
//        String[] datos = new String[9];
//
//        Statement st;
//
//        try {
//            st = objetoconexion.conectar().createStatement();
//            ResultSet rs = st.executeQuery(sql);
//
//            /*Se recorre el arreglo*/
//            while (rs.next()) {
//
//                datos[0] = rs.getString(1);
//                datos[1] = rs.getString(2);
//                datos[2] = rs.getString(3);
//                datos[3] = rs.getString(4);
//                datos[4] = rs.getString(5);
//                datos[5] = rs.getString(6);
//                datos[6] = rs.getString(7);
//                datos[7] = rs.getString(8);
//                datos[8] = rs.getString(9);
//
//                modelo.addRow(datos);
//
//            }
//
//            tbtotalpersonas.setModel(modelo);
//
//        } catch (Exception e) {
//
//            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());
//
//        }
//    }
//
//    /*Función para seleccionar un registro */
//    public void Seleccionarelementos(JTable tbtotalpersonas, JTextField texidelem_dot, JTextField texfechpres, JTextField texfecdev, JTextField txtidpers, JTextField texnomele, JTextField texcant, JComboBox jCBestadodevo, JComboBox jComboBoxjCBClase, JComboBox jComboBoxestado) {
//
//        try {
//            int fila = tbtotalpersonas.getSelectedRow();
//
//            if (fila >= 0) {
//
//                texidelem_dot.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
//                texnomele.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
//                jComboBoxjCBClase.setSelectedItem((tbtotalpersonas.getValueAt(fila, 3).toString()));
//                jCBestadodevo.setSelectedItem((tbtotalpersonas.getValueAt(fila, 4).toString()));
//                texfechpres.setText((tbtotalpersonas.getValueAt(fila, 5).toString()));
//                texfecdev.setText((tbtotalpersonas.getValueAt(fila, 6).toString()));
//                jComboBoxestado.setSelectedItem((tbtotalpersonas.getValueAt(fila, 7).toString()));
//                texcant.setText((tbtotalpersonas).getValueAt(fila, 8).toString());
//                txtidpers.setText((tbtotalpersonas).getValueAt(fila, 9).toString());
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
//            }
//        } catch (Exception e) {
//
//            JOptionPane.showMessageDialog(null, "Error de seleccion, error: " + e.toString());
//        }
//
//    }
//
//    /*Función para modificar los datos de persona*/
//    
//    public void Modificarelementos(JTable tbtotalpersonas, JTextField texidelem_dot, JTextField texfechpres, JTextField texfecdev, JTextField txtidpers, JTextField texnomele, JTextField texcant, JComboBox jCBestadodevo, JComboBox jComboBoxjCBClase, JComboBox jComboBoxestado) {
//
//        /*Convierte de texto a int*/
//        
//        setId_elementos_dotacion(Integer.parseInt(texidelem_dot.getText()));
//
//        /*Toma los valores de texto*/
//        setnombre_elem_dot(texnomele.getText());
//        setClase(jComboBoxjCBClase.getSelectedItem().toString());
//        setEstado_devolucion(jCBestadodevo.getSelectedItem().toString());
//        setFecha_prestamo(texfechpres.getText());
//        setFecha_devolucion(texfecdev.getText());
//        setEstado(jComboBoxestado.getSelectedItem().toString());
//        setcantidad(Integer.parseInt(texcant.getText()));
//        setId_personal(Integer.parseInt(txtidpers.getText()));
//
//        conexion objetoconexion = new conexion();
//
//        String consulta = "UPDATE elementos_dotacion SET elementos_dotacion.Nombre_elem_dot = ?, elementos_dotacion.Clase = ?, elementos_dotacion.Estado_devolucion = ?, elementos_dotacion.Fecha_prestamo =?, elementos_dotacion.Fecha_devolucion = ?, elementos_dotacion.Estado =? , elementos_dotacion.Cantidad = ?,elementos_dotacion.Id_personal = ? WHERE elementos_dotacion.Id_elementos_dotacion = ?";
//
//        try {
//
//            java.sql.CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
//
//            cs.setInt(1, getId_elementos_dotacion());
//            cs.setString(2, getnombre_elem_dot());
//            cs.setString(3, getClase());
//            cs.setString(4, getEstado_devolucion());
//            cs.setString(5, getFecha_prestamo());
//            cs.setString(6, getFecha_devolucion());
//            cs.setString(7, getEstado());
//            cs.setInt(8, getcantidad());
//            cs.setInt(9, getId_personal());
//
//            cs.execute();
//
//            JOptionPane.showMessageDialog(null, "Modificación exitosa");
//
//        } catch (SQLException e) {
//
//            JOptionPane.showMessageDialog(null, "No se modificó, error:" + e.toString());
//        }
//
//    }
//
//    public void EliminarElementos(JTextField texidelem_dot) {
//
//        /*Convertir la cadena a Integer*/
//        setId_elementos_dotacion(Integer.parseInt(texidelem_dot.getText()));
//
//        conexion objetoconexion = new conexion();
//
//        String consulta = "DELETE FROM elementos_dotacion WHERE elementos_dotacion.Id_elementos_dotacion=?;";
//
//        try {
//            java.sql.CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
//            cs.setInt(1, getId_elementos_dotacion());
//            cs.execute();
//
//            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la Persona");
//
//        } catch (SQLException e) {
//
//            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
//        }
//    }
 }