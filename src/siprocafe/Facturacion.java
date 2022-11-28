/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprocafe;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Karen Yency Pinedo
 */
public class Facturacion {
    
    

    /*Se definen las variables para manejo de los datos*/
    
    int ID_factura;
    int producto;
    String cantidad;
    String valor_unidad;
    Date fecha_elaboracion;
    String descripciones;
    Date fechapago;
    int valor_total;
    String forma_pago;
    String vendedor;
    private int cliente;
    private String Id_Producto;
    private Date Fechaelaboracion;


    //se crean geteres y seteres

    public int getID_factura() {

        return ID_factura;
    }

    public void setID_factura(int ID_factura) {
        this.ID_factura = ID_factura;
    }

    public int getProducto() {
        return cliente;
    }

    public void setProducto(int cliente) {
        this.cliente = cliente;
    }

    public String getproducto() {
        return Id_Producto;
    }

    public void setCantidad(String Id_producto) {
        this.Id_Producto = Id_producto;
    }

    public String getValor_cantidad() {
        return cantidad;
    }

    public void setValor_unidad(String cantidad) {
        this.cantidad = cantidad;
    }

//    public String getvalor unidad() {
//        return.valor_unidad= Valor unidad;
//    }

    

    public String getDescripciones() {
        return descripciones;
    }

    public void setDescripciones(String descripciones) {
        this.descripciones = descripciones;
    }

    public Date getFechaelaboracion() {
        return Fechaelaboracion;
    }

    public void setFechaelaboracion(Date Fechaelaboracion) {
        this.Fechaelaboracion = Fechaelaboracion;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public String getVendedor() {
        return vendedor;
    }

    /**
     * Area Getters y Setters Get: obtiene el valor Set: incorpora el valor
     *
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void Insertarfacturacion(JTextField texidfact, JTextField texcliente, JTextField texidproducto, JTextField Texcantidad, JTextField Texvalor_unit, JTextField TexDescripcion, JComboBox texFecha_elab, JComboBox texFecha_pago, JComboBox texvalor_total, JComboBox texForma_pago, JComboBox texid_personal) {
        /*Se incorporan los valores de los controles*/
        
//        setID_factura(Integer.parseInt(texidfact.getText()));
//        setcliente(texcliente.getText());
//        setProducto (Integer.parseInt(texidproducto.getText()));
//        setCantidad(Texcantidad.getText(producto, cliente));
//        setValor_unidad(Texvalor_unit.getText());
//        setDescripciones(TexDescripcion.getText());
//        setFechaelaboracion (texFecha_elab.getToolTipText());
//        setFechapago(texFecha_pago().getClass());
//        setId_personal(Integer.parseInt(txtidpers.getText()));
//        setValor_total setTipo(   setTipo(exvalor_total.getText());
//        setForma_pago setTipo(texForma_pago.getText());;
//        setVendedor setTipo(texid_personal.getText());;
//        
//          Se crea objeto de tipo conexion
conexion objetoconexion = new conexion();

/*Se crea una consulta para insertar los datos*/
String consulta = "INSERT INTO elementos_dotacion (Id_elementos_dotacion, Nombre_elem_dot, Clase, Estado_devolucion, Fecha_prestamo, Fecha_devolucion, Estado,Cantidad, Id_personal) values (?,?,?,?,?,?,?,?,?)";

try {
    
    /*Se enlaza la conexion con la consulta anterior*/
    java.sql.CallableStatement cs;
    cs = objetoconexion.conectar().prepareCall(consulta);
    
    /*Se incorporan los parámetros*/
    cs.setInt(1, getID_factura());
    cs.setString(2, getproducto());
    cs.setString(3, getproducto());
    cs.setString(4, getcantidad());
    cs.setString(5, getvalor_unidad());
    cs.setString(6, getFecha_elaboracion());
    cs.setString(7, getDescripciones());
    cs.setString(8, getfecha_pago());
    cs.setInt(9, getValor_total());
    cs.setString(10, getForma_pago());
    cs.setString(11, getVendedor());
    cs.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Se insertó correctamente la información");
    
} catch (HeadlessException | SQLException e) {
    JOptionPane.showMessageDialog(null, "No se insertó correctamente, error: " + e.toString());
}
    }

    public void Mostrarelementos(JTable tbtotalpersonas) {

        /*Se crea un modelo de tabla*/
        conexion objetoconexion = new conexion();
        DefaultTableModel modelo = new DefaultTableModel();

        /*Ordenar tabla*/
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<>(modelo);
        tbtotalpersonas.setRowSorter(OrdenarTabla);

        String sql = " ";

        /*Se crean los encabezados de las columnas*/
        modelo.addColumn("Id_factura");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Valor_unidad");
        modelo.addColumn("Fecha_elaboracion");
        modelo.addColumn("Descripiones");
        modelo.addColumn("Fecha_pago");
        modelo.addColumn("Valor_total");
        modelo.addColumn("Forma_pago");
        modelo.addColumn("Vendedor");
        tbtotalpersonas.setModel(modelo);

        sql = "select * from elementos_dotacion;";

        /*Se crea un arreglo*/
        String[] datos = new String[9];

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

                modelo.addRow(datos);

            }

            tbtotalpersonas.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());

        }
    }

    /*Función para seleccionar un registro */
    public void Seleccionarelementos(JTable tbtotalpersonas, JTextField texidelem_dot, JTextField texfechpres, JTextField texfecdev, JTextField txtidpers, JTextField texnomele, JTextField texcant, JComboBox jCBestadodevo, JComboBox jComboBoxjCBClase, JComboBox jComboBoxestado) {

        try {
            int fila = tbtotalpersonas.getSelectedRow();

            if (fila >= 0) {

                texidelem_dot.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
                texnomele.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
                jComboBoxjCBClase.setSelectedItem((tbtotalpersonas.getValueAt(fila, 3).toString()));
                jCBestadodevo.setSelectedItem((tbtotalpersonas.getValueAt(fila, 4).toString()));
                texfechpres.setText((tbtotalpersonas.getValueAt(fila, 5).toString()));
                texfecdev.setText((tbtotalpersonas.getValueAt(fila, 6).toString()));
                jComboBoxestado.setSelectedItem((tbtotalpersonas.getValueAt(fila, 7).toString()));
                texcant.setText((tbtotalpersonas).getValueAt(fila, 8).toString());
                txtidpers.setText((tbtotalpersonas).getValueAt(fila, 9).toString());

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de seleccion, error: " + e.toString());
        }

    }

    /*Función para modificar los datos de persona*/
    
    public void Modificarelementos(JTextField texidfact, JTextField texcliente, JTextField texidproducto, JTextField Texcantidad, JTextField Texvalor_unit, JTextField TexDescripcion, JComboBox texFecha_elab, JComboBox texFecha_pago, JComboBox texvalor_total, JComboBox texForma_pago, JComboBox texid_personal) {

        /*Convierte de texto a int*/
        
        setID_factura(Integer.parseInt(texidfact.getText()));

        /*Toma los valores de texto*/
//  
//        setcliente(texcliente.getText());
//        setProducto (Integer.parseInt(texidproducto.getText()));
//        setCantidad(Texcantidad.getText(producto, cliente));
//        setValor_unidad(Texvalor_unit.getText());
//        setDescripciones(TexDescripcion.getText());
//        setFechaelaboracion (texFecha_elab.getdate());
//        setFechapago(texFecha_pago().getdate;
//        setId_personal(Integer.parseInt(txtidpers.getText()));
//        setValor_total setTipo(   setTipo(exvalor_total.getText());
//        setForma_pago setTipo(texForma_pago.getText());;
//        setVendedor setTipo(texid_personal.getText());;

        conexion objetoconexion = new conexion();

        String consulta = "UPDATE elementos_dotacion SET elementos_dotacion.Nombre_elem_dot = ?, elementos_dotacion.Clase = ?, elementos_dotacion.Estado_devolucion = ?, elementos_dotacion.Fecha_prestamo =?, elementos_dotacion.Fecha_devolucion = ?, elementos_dotacion.Estado =? , elementos_dotacion.Cantidad = ?,elementos_dotacion.Id_personal = ? WHERE elementos_dotacion.Id_elementos_dotacion = ?";

        try {

            java.sql.CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);

            cs.setInt(1, getID_factura());
            cs.setString(2, getcliente());
            cs.setString(3, getproducto());
            cs.setString(4, getcantidad());
            cs.setString(5, getvalor_unidad());
            cs.setString(6, getDescripciones());
            cs.setDate(7, (java.sql.Date) getFechaelaboracion());
            cs.setDate(8, (java.sql.Date) getFechapago());
            cs.setInt(9, getId_personal());
            cs.setInt(10, getValor_total());
            cs.setString(11, getForma_pago());
            cs.setString(11, getVendedor());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Modificación exitosa");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se modificó, error:" + e.toString());
        }

    }

    public void EliminarElementos(JTextField texidelem_dot) {

        /*Convertir la cadena a Integer*/
        setId_factura(Integer.parseInt(texidelem_dot.getText()));

        conexion objetoconexion = new conexion();

        String consulta = "DELETE FROM elementos_dotacion WHERE elementos_dotacion.Id_elementos_dotacion=?;";

        try {
            java.sql.CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
            cs.setInt(1, getID_factura());
            cs.execute();

            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la Persona");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }
    }


    private String getFecha_elaboracion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getvalor_unidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getcantidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getfecha_pago() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object texFecha_pago() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setcliente(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setId_factura(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getcliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setId_personal(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getId_personal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
