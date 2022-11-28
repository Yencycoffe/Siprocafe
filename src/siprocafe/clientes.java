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

public class clientes {
//
//    /*Se definen las variables para manejo de los datos*/
//    int Id_cliente;
//    String Nombre;
//    String Apellido;
//    String Fecha_nacimiento;
//    String Fecha_ingreso;
//    String Direccion;
//    String Email;
//    String celular;
//    String Nombre_empresa;
//    String Nit_empresa;
//    String Email_empresa;
//    String Cargo;
//    String Estado;
//    String Id_personal;
//    String Id_Factura;
//
//        /**
//     * Area Getters y Setters Get: obtiene el valor Set: incorpora el valor
//     *
//     */
//
//    public void setId_cliente(int Id_cliente) {
//        this.Id_cliente = Id_cliente;
//    }
//
//    public void setNombre(String Nombre) {
//        this.Nombre = Nombre;
//    }
//
//    public void setApellido(String Apellido) {
//        this.Apellido = Apellido;
//    }
//
//    public void setFecha_nacimiento(String Fecha_nacimiento) {
//        this.Fecha_nacimiento = Fecha_nacimiento;
//    }
//
//    public void setFecha_ingreso(String Fecha_ingreso) {
//        this.Fecha_ingreso = Fecha_ingreso;
//    }
//
//    public void setDireccion(String Direccion) {
//        this.Direccion = Direccion;
//    }
//
//    public void setEmail(String Email) {
//        this.Email = Email;
//    }
//
//    public void setCelular(String celular) {
//        this.celular = celular;
//    }
//
//    public void setNombre_empresa(String Nombre_empresa) {
//        this.Nombre_empresa = Nombre_empresa;
//    }
//
//    public void setNit_empresa(String Nit_empresa) {
//        this.Nit_empresa = Nit_empresa;
//    }
//
//    public void setEmail_empresa(String Email_empresa) {
//        this.Email_empresa = Email_empresa;
//    }
//
//    public void setCargo(String Cargo) {
//        this.Cargo = Cargo;
//    }
//
//    public void setEstado(String Estado) {
//        this.Estado = Estado;
//    }
//
//    public void setId_personal(String Id_personal) {
//        this.Id_personal = Id_personal;
//    }
//
//    public void setId_Factura(String Id_Factura) {
//        this.Id_Factura = Id_Factura;
//    }
//
//    public int getId_cliente() {
//
//        return Id_cliente;
//    }
//
//    public String getNombre() {
//        return Nombre;
//    }
//
//    public String getApellido() {
//        return Apellido;
//    }
//
//    public String getFecha_nacimiento() {
//        return Fecha_nacimiento;
//    }
//
//    public String getFecha_ingreso() {
//        return Fecha_ingreso;
//    }
//
//    public String getDireccion() {
//        return Direccion;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public String getCelular() {
//        return celular;
//    }
//
//    public String getNombre_empresa() {
//        return Nombre_empresa;
//    }
//
//    public String getNit_empresa() {
//        return Nit_empresa;
//    }
//
//    public String getEmail_empresa() {
//        return Email_empresa;
//    }
//
//    public String getCargo() {
//        return Cargo;
//    }
//
//    public String getEstado() {
//        return Estado;
//    }
//
//    public String getId_personal() {
//        return Id_personal;
//    }
//        public String getId_Factura() {
//        return Id_Factura;
//    }
//
//    public void InsertarPersonas(JTextField texidc, JTextField texnombre, JTextField texapellido, JTextField TexFechanac, JTextField TexFechaing, JTextField texdirec, JTextField texemail, JTextField texcel, JTextField texNomempresa, JTextField texNitempre, JTextField texEmailempre, JTextField texCargo, JComboBox jComboBoxestado, JTextField texidFactura, JTextField texIdpersonal) {
//        
//        /*Se incorporan los valores de los controles*/
//
//        setId_cliente(Integer.parseInt(texidc.getText()));
//        setNombre(texnombre.getText());
//        setApellido(texapellido.getText());
//        setFecha_nacimiento(TexFechanac.getText());
//        setFecha_ingreso(TexFechaing.getText());
//        setDireccion(texdirec.getText());
//        setEmail(texemail.getText());
//        setCelular(texcel.getText());
//        setNombre_empresa(texNomempresa.getText());
//        setNit_empresa(texNitempre.getText());
//        setEmail_empresa(texEmailempre.getText());
//        setCargo(texCargo.getText());
//        setEstado(jComboBoxestado.getSelectedItem().toString());
//        setId_Factura(texidFactura.getText());
//        setId_personal(texIdpersonal.getText());
//
//        //          Se crea objeto de tipo conexion
//        
//    conexion objetoconexion = new conexion();
//
//        /*Se crea una consulta para insertar los datos*/
//        String consulta = "INSERT INTO clientes ( Id_Cliente, Nombre, Apellido, Fecha_nacimiento, Fecha_ingreso, Dirección, Email, Celular, Nombre_empresa, NIT_empresa, Email_empresa, Cargo, Estado, Id_Factura,Id_Personal) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//
//        try {
//            /*Se enlaza la conexion con la consulta anterior*/
//            CallableStatement cs;
//            cs = objetoconexion.conectar().prepareCall(consulta);
//
//            /*Se incorporan los parámetros*/
//            cs.setInt(1, getId_cliente());
//            cs.setString(2, getNombre());
//            cs.setString(3, getApellido());
//            cs.setString(4, getFecha_nacimiento());
//            cs.setString(5, getFecha_ingreso());
//            cs.setString(6, getDireccion());
//            cs.setString(7, getEmail());
//            cs.setString(8, getCelular());
//            cs.setString(9, getNombre_empresa());
//            cs.setString(10, getNit_empresa());
//            cs.setString(11, getEmail_empresa());
//            cs.setString(12, getCargo());
//            cs.setString(13, getEstado());
//            cs.setString(14, getId_Factura());
//            cs.setString(15, getId_personal());
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
//    public void MostrarPersonas(JTable tbtotalpersonas) {
//
//        /*Se crea un modelo de tabla*/
//        
//        conexion objetoconexion = new conexion();
//        DefaultTableModel modelo = new DefaultTableModel();
//
//        /*Ordenar tabla*/
//        
//        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
//        tbtotalpersonas.setRowSorter(OrdenarTabla);
//
//        String sql = "";
//
//        /*Se crean los encabezados de las columnas*/
//        modelo.addColumn("Id_Cliente");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Apellido");
//        modelo.addColumn("Fecha_macimiento");
//        modelo.addColumn("Fecha_ingreso");
//        modelo.addColumn("Dirección");
//        modelo.addColumn("Email");
//        modelo.addColumn("celular");
//        modelo.addColumn("Nombre_empresa");
//        modelo.addColumn("Nit-empresa");
//        modelo.addColumn("Email-empresa");
//        modelo.addColumn("Cargo");
//        modelo.addColumn("Estado");
//        modelo.addColumn("Id_Factura");
//        modelo.addColumn("Id_Personal");
//
//        tbtotalpersonas.setModel(modelo);
//
//        sql = "select * from clientes;";
//        /*Se crea un arreglo*/
//
//        String[] datos = new String[15];
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
//                datos[14] = rs.getString(15);
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
//
//    }
//
//    /*Función para seleccionar un registro */
//    public void Seleccionarpersona(JTable tbtotalpersonas,JTextField texidc, JTextField texnombre, JTextField texapellido, JTextField TexFechanac, JTextField TexFechaing, JTextField texdirec, JTextField texemail, JTextField texcel, JTextField texNomempresa, JTextField texNitempre, JTextField texEmailempre, JTextField texCargo, JComboBox jComboBoxestado, JTextField texidFactura, JTextField texIdpersonal) {
//
//        try {
//            int fila = tbtotalpersonas.getSelectedRow();
//
//            if (fila >= 0) {
//
//                texidc.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
//                texnombre.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
//                texapellido.setText((tbtotalpersonas.getValueAt(fila, 3).toString()));
//                TexFechanac.setText((tbtotalpersonas).getValueAt(fila, 4).toString());
//                TexFechaing.setText((tbtotalpersonas).getValueAt(fila, 5).toString());
//                texdirec.setText((tbtotalpersonas.getValueAt(fila, 6).toString()));
//                texemail.setText((tbtotalpersonas.getValueAt(fila, 7).toString()));
//                texcel.setText((tbtotalpersonas.getValueAt(fila, 8).toString()));
//                texNomempresa.setText((tbtotalpersonas.getValueAt(fila, 9).toString()));
//                texNitempre.setText((tbtotalpersonas.getValueAt(fila, 10).toString()));
//                texEmailempre.setText((tbtotalpersonas.getValueAt(fila, 11).toString()));
//                texCargo.setText((tbtotalpersonas.getValueAt(fila, 12).toString()));
//                jComboBoxestado.setSelectedItem((tbtotalpersonas.getValueAt(fila, 13).toString()));
//                texidFactura.setText((tbtotalpersonas.getValueAt(fila, 14).toString()));
//                texIdpersonal.setText((tbtotalpersonas.getValueAt(fila, 15).toString()));
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
//    public void ModificarPersonas(JTextField texidc, JTextField texnombre, JTextField texapellido, JTextField TexFechanac, JTextField TexFechaing, JTextField texdirec, JTextField texemail, JTextField texcel, JTextField texNomempresa, JTextField texNitempre, JTextField texEmailempre, JTextField texCargo, JComboBox jComboBoxestado, JTextField texidFactura, JTextField texIdpersonal) {
//
//        /*Convierte de texto a int*/
//        setId_cliente(Integer.parseInt(texidc.getText()));
//
//        /*Toma los valores de texto*/
//        
//        setId_cliente(Integer.parseInt(texidc.getText()));
//        setNombre(texnombre.getText());
//        setApellido(texapellido.getText());
//        setFecha_nacimiento(TexFechanac.getText());
//        setFecha_ingreso(TexFechaing.getText());
//        setDireccion(texdirec.getText());
//        setEmail(texemail.getText());
//        setCelular(texcel.getText());
//        setNombre_empresa(texNomempresa.getText());
//        setNit_empresa(texNitempre.getText());
//        setEmail_empresa(texEmailempre.getText());
//        setCargo(texCargo.getText());
//        setEstado(jComboBoxestado.getSelectedItem().toString());
//        setId_Factura(texidFactura.getText());
//        setId_personal(texIdpersonal.getText());
//
//        conexion objetoconexion = new conexion();
//
//        String consulta = "UPDATE clientes SET clientes.Nombre = ?, clientes.Apellido =?,clientes.Fecha_nacimiento =?,clientes.Fecha_ingreso=?, clientes.Dirección =?, clientes.Email =?,clientes.celular =?,clientes.Nombre_empresa =?,clientes.NIT_empresa =?,clientes.Email_empresa =?,clientes.Cargo=? ,clientes.Estado =?,clientes.Id_Factura=?,clientes.Id_Personal =? WHERE clientes.Id_Cliente =?;";
//
//        try {
//
//            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
//
//            cs.setInt(1, getId_cliente());
//            cs.setString(2, getNombre());
//            cs.setString(3, getApellido());
//            cs.setString(4, getFecha_nacimiento());
//            cs.setString(5, getFecha_ingreso());
//            cs.setString(6, getDireccion());
//            cs.setString(7, getEmail());
//            cs.setString(8, getCelular());
//            cs.setString(9, getNombre_empresa());
//            cs.setString(10, getNit_empresa());
//            cs.setString(11, getEmail_empresa());
//            cs.setString(12, getCargo());
//            cs.setString(13, getEstado());
//            cs.setString(14, getId_Factura());
//            cs.setString(15, getId_personal());
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
//    public void EliminarPersonas(JTextField texidp) {
//
//        /*Convertir la cadena a Integer*/
//        setId_cliente(Integer.parseInt(texidp.getText()));
//
//        conexion objetoconexion = new conexion();
//
//        String consulta = "DELETE FROM clientes WHERE clientes.Id_Cliente=?;";
//
//        try {
//            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
//            
//            cs.setInt(1, getId_cliente());
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
//
}
