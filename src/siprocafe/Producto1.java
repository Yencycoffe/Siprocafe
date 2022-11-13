/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package siprocafe;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Santi
 */
public class Producto1 {
    
//        /*Se definen las variables para manejo de los datos*/
//    int Id_Producto;
//    String Tipo;
//    String Nombre;
//    String Fecha_ingreso;
//    String Fecha_recoleccion;
//    String Fecha_lavado;
//    String Tiempo_inicial_lavado;
//    String Tiempo_final_lavado;
//    int Cantidad;
//    int Numero_secadero;
//    String Clasificacion;
//    int Orden_venta;
//    int Id_personal;
//    int Id_factura ;
//
//    
///**
//     * Area Gettersy Setters Get: obtiene el valor Set: incorpora el valor
//     *
//     */
//    
//    public int getId_Producto() {
//
//        return Id_Producto;
//    }
//
//    public void setId_Producto(int Id_Producto) {
//        this.Id_Producto = Id_Producto;
//    }
//
//    public String getTipo() {
//        return Tipo;
//    }
//
//    public void setTipo(String Tipo) {
//        this.Tipo = Tipo;
//    }
//
//    public String getNombre() {
//        return Nombre;
//    }
//
//    public void setNombre(String Nombre) {
//        this.Nombre = Nombre;
//    }
//
//    public String getFecha_ingreso() {
//        return Fecha_ingreso;
//    }
//
//    public void setFecha_ingreso(String Fecha_ingreso) {
//        this.Fecha_ingreso = Fecha_ingreso;
//    }
//
//    public String getFecha_recoleccion() {
//        return Fecha_recoleccion;
//    }
//
//    public void setFecha_recoleccion(String Fecha_recoleccion) {
//        this.Fecha_recoleccion = Fecha_recoleccion;
//    }
//
//    public String getFecha_lavado() {
//        return Fecha_lavado;
//    }
//
//    public void setFecha_lavado(String Fecha_lavado) {
//        this.Fecha_lavado = Fecha_lavado;
//    }
//
//    public String getTiempo_inicial_lavado() {
//        return Tiempo_inicial_lavado;
//    }
//
//    public void setTiempo_inicial_lavado(String Tiempo_inicial_lavado) {
//        this.Tiempo_inicial_lavado = Tiempo_inicial_lavado;
//    }
//
//    public String getTiempo_final_lavado() {
//        return Tiempo_final_lavado;
//    }
//
//    public void setTiempo_final_lavado(String Tiempo_final_lavado) {
//        this.Tiempo_final_lavado = Tiempo_final_lavado;
//    }
//
//    public int getCantidad() {
//        return Cantidad;
//    }
//
//    public void setCantidad(int Cantidad) {
//        this.Cantidad = Cantidad;
//    }
//
//    public int getNumero_secadero() {
//        return Numero_secadero;
//    }
//
//    public void setNumero_secadero(int Numero_secadero) {
//        this.Numero_secadero = Numero_secadero;
//    }
//
//    public String getClasificacion() {
//        return Clasificacion;
//    }
//
//    public void setClasificacion(String Clasificacion) {
//        this.Clasificacion = Clasificacion;
//    }
//
//    public int getOrden_venta() {
//        return Orden_venta;
//    }
//
//    public void setOrden_venta(int Orden_venta) {
//        this.Orden_venta = Orden_venta;
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
//    public int getId_factura() {
//        return Id_factura;
//    }
//
//    
//    public void setId_factura(int Id_factura) {    
//        this.Id_factura = Id_factura;
//    }
//
//    
//   
//    public void InsertarProducto(JTextField texidproducto, JTextField texitipo, JTextField texnombre, JTextField texfecha_de_ingreso, JTextField texfecha_de_recoleccion, JTextField texfecha_de_lavado, JTextField textiempo_inicial_lavado, JTextField texid_factura, JTextField textiempo_final_lavado, JTextField texcantidad, JTextField texnumero_secadero, JTextField texclasificacion,JTextField texorden_venta,JTextField texid_personal) {
//    
//        /*Se incorporan los valores de los controles*/
//        
//        setId_Producto(Integer.parseInt(texidproducto.getText()));
//        setTipo(texitipo.getText());
//        setNombre(texnombre.getText());
//        setFecha_recoleccion(texfecha_de_recoleccion.getText());
//        setFecha_lavado(texfecha_de_lavado.getText());
//        setTiempo_inicial_lavado(textiempo_inicial_lavado.getText());
//        setTiempo_final_lavado(textiempo_final_lavado.getText());
//        setCantidad(Integer.parseInt(texcantidad.getText()));
//        setNumero_secadero(Integer.parseInt(texnumero_secadero.getText()));
//        setClasificacion(texclasificacion.getText());
//        setOrden_venta(Integer.parseInt(texorden_venta.getText()));
//        setId_factura(Integer.parseInt(texid_factura.getText()));
//        setId_personal(Integer.parseInt(texid_personal.getText()));
////          Se crea objeto de tipo conexion
//
//conexion objetoconexion = new conexion();
//
///*Se crea una consulta para insertar los datos*/
//
//String consulta = "INSERT INTO producto ( Id_Producto, tipo, Nombre, Fecha_ingreso,Fecha_recoleccion, Fecha_lavado, tiempo_inicial_lavado, tiempo_final_lavado, Cantidad, Numero_secadero, Clasificación,Orden_venta, Id_Factura,Id_Personal) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//
//try {
//    /*Se enlaza la conexion con la consulta anterior*/
//    
//    CallableStatement cs;
//    
//    cs = objetoconexion.conectar().prepareCall(consulta);
//    
//    /*Se incorporan los parámetros*/
//    
//    cs.setInt(1, getId_Producto());
//    cs.setString(2, getTipo());
//    cs.setString(3, getNombre());
//    cs.setString(4, getFecha_ingreso());
//    cs.setString(5, getFecha_recoleccion());
//    cs.setString(6, getFecha_lavado());
//    cs.setString(7, getTiempo_inicial_lavado());
//    cs.setString(8, getTiempo_final_lavado());
//    cs.setInt(9, getCantidad());
//    cs.setInt(10, getNumero_secadero());
//    cs.setString(11, getClasificacion());
//    cs.setInt(12, getOrden_venta());
//    cs.setInt(13, getId_factura());
//    cs.setInt(14, getId_personal());
//    
//    
//    cs.executeUpdate();
//    
//    JOptionPane.showMessageDialog(null, "Se insertó correctamente la información");
//    
//} catch (Exception e) {
//    JOptionPane.showMessageDialog(null, "No se insertó correctamente, error: " + e.toString());
//}
//    }
//        
//    public void MostrarProducto(JTable tbtotalpersonas) {
//
//        /*Se crea un modelo de tabla*/
//
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
//        modelo.addColumn("Id_Producto");
//        modelo.addColumn("Tipo");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Fecha_ingreso");
//        modelo.addColumn("Fecha_recoleccion");
//        modelo.addColumn("Fecha_lavado");
//        modelo.addColumn("Tiempo_inicial_lavado");
//        modelo.addColumn("Tiempo_final_lavado");
//        modelo.addColumn("Cantidad");
//        modelo.addColumn("Numero_secadero");
//        modelo.addColumn("Clasificacion");
//        modelo.addColumn("Orden_venta");
//        modelo.addColumn("Id_factura");
//        modelo.addColumn("Id_personal");
//
//        tbtotalpersonas.setModel(modelo);
//
//        sql = "select * from producto;";
//        
//        /*Se crea un arreglo*/
//
//        String[] datos = new String[14];
//
//        Statement st;
//
//        try {
//            st = objetoconexion.conectar().createStatement();
//            ResultSet rs = st.executeQuery(sql);
//
//            /*Se recorre el arreglo*/
//            while (rs.next()) {
//                datos[0] = rs.getString(1);
//                datos[1] = rs.getString(2);
//                datos[2] = rs.getString(3);
//                datos[3] = rs.getString(4);
//                datos[4] = rs.getString(5);
//                datos[5] = rs.getString(6);
//                datos[6] = rs.getString(7);
//                datos[7] = rs.getString(8);
//                datos[8] = rs.getString(9);
//                datos[9] = rs.getString(10);
//                datos[10] = rs.getString(11);
//                datos[11] = rs.getString(12);
//                datos[12] = rs.getString(13);
//                datos[13] = rs.getString(14);
//
//
//                modelo.addRow(datos);
//
//            }
//
//            tbtotalpersonas.setModel(modelo);
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());
//
//        }
//}
//
//    /*Función para seleccionar un registro */
//    
//    public void Seleccionarproducto(JTable tbtotalpersonas, JTextField texidproducto, JTextField texitipo, JTextField texnombre, JTextField texfecha_de_ingreso, JTextField texfecha_de_recoleccion, JTextField texfecha_de_lavado, JTextField textiempo_inicial_lavado, JTextField texid_factura, JTextField textiempo_final_lavado, JTextField texcantidad, JTextField texnumero_secadero, JTextField texclasificacion,JTextField texorden_venta,JTextField texid_personal) {
//
//        try {
//            int fila = tbtotalpersonas.getSelectedRow();
//
//            if (fila >= 0) {
//
//                texidproducto.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
//                texitipo.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
//                texnombre.setText((tbtotalpersonas.getValueAt(fila, 3).toString()));
//                texfecha_de_ingreso.setText((tbtotalpersonas).getValueAt(fila, 4).toString());
//                texfecha_de_recoleccion.setText((tbtotalpersonas).getValueAt(fila, 5).toString());
//                texfecha_de_lavado.setText((tbtotalpersonas.getValueAt(fila, 6).toString()));
//                textiempo_inicial_lavado.setText((tbtotalpersonas.getValueAt(fila, 7).toString()));
//                textiempo_final_lavado.setText((tbtotalpersonas.getValueAt(fila, 8).toString()));
//                texcantidad.setText((tbtotalpersonas.getValueAt(fila, 9).toString()));
//                texnumero_secadero.setText((tbtotalpersonas.getValueAt(fila, 10).toString()));
//                texclasificacion.setText((tbtotalpersonas.getValueAt(fila, 11).toString()));
//                texorden_venta.setText((tbtotalpersonas.getValueAt(fila, 12).toString()));
//                texid_factura.setText((tbtotalpersonas.getValueAt(fila, 13).toString()));
//                texid_personal.setText((tbtotalpersonas.getValueAt(fila, 14).toString()));
//               
//                
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
//    /*Función para modificar los datos de producto*/
//    
//    public void ModificarProduto(JTextField texidproducto, JTextField texitipo, JTextField texnombre, JTextField texfecha_de_ingreso, JTextField texfecha_de_recoleccion, JTextField texfecha_de_lavado, JTextField textiempo_inicial_lavado, JTextField texid_factura, JTextField textiempo_final_lavado, JTextField texcantidad, JTextField texnumero_secadero, JTextField texclasificacion, JTextField texorden_venta, JTextField texid_personal) {
//
//        /*Convierte de texto a int*/
//        
//        setId_Producto(Integer.parseInt(texidproducto.getText()));
//
//        /*Toma los valores de texto*/
//        
//        setTipo(texitipo.getText());
//        setNombre(texnombre.getText());
//        setFecha_ingreso(texfecha_de_ingreso.getText());
//        setFecha_recoleccion(texfecha_de_recoleccion.getText());
//        setFecha_lavado(texfecha_de_lavado.getText());
//        setTiempo_inicial_lavado(textiempo_inicial_lavado.getText());
//        setTiempo_final_lavado(textiempo_final_lavado.getText());
//        setCantidad(Integer.parseInt(texcantidad.getText()));
//        setNumero_secadero(Integer.parseInt(texnumero_secadero.getText()));
//        setClasificacion(texclasificacion.getText());
//        setOrden_venta(Integer.parseInt(texorden_venta.getText()));
//        setId_factura(Integer.parseInt(texid_factura.getText()));
//        setId_personal(Integer.parseInt(texid_personal.getText()));
//        
//
//        conexion objetoconexion = new conexion();
//
//        String consulta = "UPDATE producto SET producto.tipo = ?,  producto.Nombre =?, Producto.Fecha_ingreso=?, producto.Fecha_recoleccion=?, producto.Fecha_lavado =?, producto.tiempo_inicial_lavado =?, producto.tiempo_final_lavado=?, producto.Cantidad =?, producto.Numero_secadero =?, producto.Clasificación =?, producto.Orden_venta=?, producto.Id_Factura =?,producto.Id_Personal =? WHERE producto.Id_Producto =?;";
//
//        try {
//
//            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
//
//            cs.setInt(1, getId_Producto());
//            cs.setString(2, getTipo());
//            cs.setString(3, getNombre());
//            cs.setString(4, getFecha_ingreso());
//            cs.setString(5, getFecha_recoleccion());
//            cs.setString(6, getFecha_lavado());
//            cs.setString(7, getTiempo_inicial_lavado());
//            cs.setString(8, getTiempo_final_lavado());
//            cs.setInt(9, getCantidad());
//            cs.setInt(10, getNumero_secadero());
//            cs.setString(11, getClasificacion());
//            cs.setInt(12, getOrden_venta());
//            cs.setInt(13, getId_factura());
//            cs.setInt(14, getId_personal());
//
//            cs.executeUpdate(consulta);
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
//    public void EliminarProductos(JTextField texidproducto) {
//
//        /*Convertir la cadena a Integer*/
//        
//        setId_Producto(Integer.parseInt(texidproducto.getText()));
//
//        conexion objetoconexion = new conexion();
//
//        String consulta = "DELETE FROM producto WHERE producto.Id_Producto=?;";
//
//        try {
//            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
//            cs.setInt(1, getId_Producto());
//            cs.execute();
//
//            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el producto");
//
//        } catch (SQLException e) {
//
//            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
//        }
//
//    }


}