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


public class Personal {
    
        /*Se definen las variables para manejo de los datos*/
    int Id_personal;
    String Nombre;
    String Apellido;
    String Fecha_nacimiento;
    String Fecha_ingreso;
    String Direccion;
    String Email;
    String Fecha_retiro;
    String celular;
    String Eps;
    String Arls;
    String Estado;
    String Cargo;
    

    /**
     * Area Getters y Setters Get: obtiene el valor Set: incorpora el valor
     *
     */
    
    public String getFecha_nacimiento()  {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public String getFecha_ingreso() {
        return Fecha_ingreso;
    }

    public void setFecha_ingreso(String Fecha_ingreso) {
        this.Fecha_ingreso = Fecha_ingreso;
    }

    public String getFecha_retiro() {
        return Fecha_retiro;
    }

    public void setFecha_retiro(String Fecha_retiro) {
        this.Fecha_retiro = Fecha_retiro;
    }

    public int getId_personal() {
        return Id_personal;
    }

    public void setId_personal(int Id_personal) {
        this.Id_personal = Id_personal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getcelular() {
        return celular;
    }

    public void setcelular(String celular) {
        this.celular = celular;
    }

    public String getEps() {
        return Eps;
    }

    public void setEps(String Eps) {
        this.Eps = Eps;
    }

    public String getArls() {
        return Arls;
    }

    public void setArls(String Arls) {
        this.Arls = Arls;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo ) {
        this.Cargo = Cargo;
    }

    public void InsertarPersonas(JTextField texidp, JTextField texnombre, JTextField texapellido, JTextField TexFechanac, JTextField TexFechaing, JTextField TexFecharet,
            JTextField texdirec, JTextField texemail, JTextField texcel, JTextField texeps, JTextField texcargo,JTextField texarls, JComboBox jComboBoxestado) {

        /*Se incorporan los valores de los controles*/
        
        setId_personal(Integer.parseInt(texidp.getText()));
        setNombre(texnombre.getText());
        setApellido(texapellido.getText());
        setFecha_nacimiento(TexFechanac.getText());
        setFecha_ingreso(TexFechaing.getText());
        setDireccion(texdirec.getText());
        setFecha_retiro(TexFecharet.getText());
        setEmail(texemail.getText());
        setcelular(texcel.getText());
        setEps(texeps.getText());
        setArls(texarls.getText());
        setEstado(jComboBoxestado.getSelectedItem().toString());
        setCargo(texcargo.getText());

//          Se crea objeto de tipo conexion  
        
        conexion objetoconexion = new conexion();

        /*Se crea una consulta para insertar los datos*/
        
        String consulta = "INSERT INTO Personal ( Id_Personal, Nombre, Apellido,Fecha_nacimiento,"
                + "Fecha_ingreso,Dirección,Email, Fecha_retiro, celular,Eps,Arls,Estado, Cargo) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            /*Se enlaza la conexion con la consulta anterior*/
            
            CallableStatement cs;
            
            cs = objetoconexion.conectar().prepareCall(consulta);
            /*Se incorporan los parámetros*/
            
            cs.setInt(1, getId_personal());
            cs.setString(2, getNombre());
            cs.setString(3, getApellido());
            cs.setString(4, getFecha_nacimiento());
            cs.setString(5, getFecha_ingreso());
            cs.setString(6, getDireccion());
            cs.setString(7, getEmail());
            cs.setString(8, getFecha_retiro());
            cs.setString(9, getcelular());
            cs.setString(10, getEps());
            cs.setString(11, getArls());
            cs.setString(12, getEstado());
            cs.setString(13, getCargo());

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

        sql = "select * from personal;";
        
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
    
    public void Seleccionarpersona(JTable tbtotalpersonas, JTextField texidp, JTextField texnombre, JTextField texapellido, JTextField TexFechanac, JTextField TexFechaing, JTextField TexFecharet,
            JTextField texdirec, JTextField texemail, JTextField texcel, JTextField texeps, JTextField texarls, JComboBox jComboBoxestado,JTextField texcargo) {

        try {
            int fila = tbtotalpersonas.getSelectedRow();

            if (fila >= 0) {

                texidp.setText((tbtotalpersonas.getValueAt(fila, 0).toString()));
                texnombre.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
                texapellido.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
                TexFechanac.setText((tbtotalpersonas).getValueAt(fila, 3).toString());
                TexFechaing.setText((tbtotalpersonas).getValueAt(fila, 4).toString());
                texdirec.setText((tbtotalpersonas.getValueAt(fila, 5).toString()));
                texemail.setText((tbtotalpersonas.getValueAt(fila, 6).toString()));
                TexFecharet.setText((tbtotalpersonas.getValueAt(fila, 7).toString()));
                texcel.setText((tbtotalpersonas.getValueAt(fila, 8).toString()));
                texeps.setText((tbtotalpersonas.getValueAt(fila, 9).toString()));
                texarls.setText((tbtotalpersonas.getValueAt(fila, 10).toString()));
                jComboBoxestado.setSelectedItem((tbtotalpersonas.getValueAt(fila, 11).toString()));
                texcargo.setText((tbtotalpersonas.getValueAt(fila, 12).toString()));

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de seleccion, error: " + e.toString());
        }

    }

    /*Función para modificar los datos de persona*/
    
    public void ActualizarPersonas(JTable tbtotalpersonas, JTextField texnombre, JTextField texidp, JTextField texapellido, JTextField TexFechanac, JTextField TexFechaing, JTextField TexFecharet,
            JTextField texdirec, JTextField texemail, JTextField texcel, JTextField texeps, JTextField texarls, JComboBox jComboBoxestado,JTextField texcargo) {

        /*Convierte de texto a int*/
        
        setId_personal(Integer.parseInt(texidp.getText()));

        /*Toma los valores de texto*/
        
        setNombre(texnombre.getText());
        setApellido(texapellido.getText());
        setFecha_nacimiento(TexFechanac.getText());
        setFecha_ingreso(TexFechaing.getText());
        setDireccion(texdirec.getText());
        setEmail(texemail.getText());
        setFecha_retiro(TexFecharet.getText());
        setcelular(texcel.getText());
        setEps(texeps.getText());
        setArls(texarls.getText());
        setEstado(jComboBoxestado.getSelectedItem().toString());
        setCargo(texcargo.getText());

        conexion objetoconexion = new conexion();

        String consulta = "UPDATE personal SET personal.Nombre = ?, personal.Apellido =?, personal.Fecha_nacimiento=?, personal.Fecha_ingreso=?, personal.Dirección =?, personal.Email =?,personal.Fecha_retiro=?, personal.Celular =?, personal.Eps =?, personal.Arls =?, personal.Estado =?, personal.Cargo =? WHERE personal.Id_Personal =?;";

        try {

            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);

            
            cs.setString(1, getNombre());
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
            cs.execute ();

            JOptionPane.showMessageDialog(null, "Se eliminó correctamente la Persona");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }

    }

    public void ConsultaPersonas(JTable tbtotalpersonas,JTextField id) {
        
         conexion objetoconexion = new conexion();

         String consulta ="SELECT * FROM `personal`";
        

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
              
                           
       } catch( SQLException ex ) {
           
            JOptionPane.showMessageDialog(null, "No se encontro los registros, error: " + ex.toString());
           }
        }
} 
