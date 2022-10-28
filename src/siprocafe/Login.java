/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprocafe;


import java.io.IOException;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Karen Yency Pinedo
 */
public class Login {

    
    
//    // Se define variables e incializamos variables
    
    String usuario=null;
    String password=null;
    String rol=null;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

      // Metodo que conecta con el servidor MYSQL y valida los usuarios
    
    conexion objetoconexion = new conexion();

    
    public void InsertarUsuario( JTextField jTusuario,JTextField jPasswordusurio,JComboBox JCRol){

        /*Se incorporan los valores de los controles*/
        
        setUsuario(jTusuario.getText());
        setPassword(jPasswordusurio.getText());
        setRol(JCRol.getSelectedItem().toString());

        /*Se crea una consulta para insertar los datos*/
        
        String consulta = "INSERT INTO usuario ( Id_usuario, Possword, Rol) values (?,?,?)";

        try {
            /*Se enlaza la conexion con la consulta anterior*/
            
            CallableStatement cs;
            
            cs = objetoconexion.conectar().prepareCall(consulta
);
            /*Se incorporan los parámetros*/
            
            cs.setString(1, getUsuario());
            cs.setString(2, getUsuario());
            cs.setString(3, getRol());
            
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
        modelo.addColumn("Id_usuario");
        modelo.addColumn("Possword");
        modelo.addColumn("Rol");
        

        tbtotalpersonas.setModel(modelo);

        sql = "select * from usuario;";
        
        /*Se crea un arreglo*/

        String[] datos = new String[3];

        java.sql.Statement st;

        try {
            st = objetoconexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);

            /*Se recorre el arreglo*/
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                

                modelo.addRow(datos);

            }

            tbtotalpersonas.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " + e.toString());

        }
}

    /*Función para seleccionar un registro */
    
    public void Seleccionarpersona(JTable tbtotalpersonas,JTextField jTusuario,JTextField jPasswordusurio,JComboBox JCRol) {

        try {
            int fila = tbtotalpersonas.getSelectedRow();

            if (fila >= 0) {

                jTusuario.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
                jPasswordusurio.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
                JCRol.setSelectedItem((tbtotalpersonas.getValueAt(fila, 3).toString()));
                               

            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error de seleccion, error: " + e.toString());
        }

    }

    /*Función para modificar los datos de persona*/
    
    public void ModificarPersonas(JTable tbtotalpersonas,JTextField jTusuario,JTextField jPasswordusurio,JComboBox JCRol) {

        /*Convierte de texto a int*/
        
//        setId_personal(Integer.parseInt(texidp.getText()));

        /*Toma los valores de texto*/
        
        setUsuario(jTusuario.getText());
        setPassword(jPasswordusurio.getText());
        setRol(JCRol.getSelectedItem().toString());

        conexion objetoconexion = new conexion();

        String consulta = "UPDATE usuario SET usuario.Id_usuario = ?, usuario.Contraseña = ?, usuario.Rol = ? WHERE usuario.Id_usuario =?;";

        try {

            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);

//            cs.setInt(1, getId_personal());
            cs.setString(1, getUsuario());
            cs.setString(2, getPassword());
            cs.setString(2, getRol());
           
            cs.executeUpdate();

            JOptionPane.showMessageDialog(null, "Modificación exitosa");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se modificó, error:" + e.toString());
        }

    }

    public void EliminarPersonas(JTextField jTusuario) {

        /*Convertir la cadena a Integer*/
//        setId_personal(Integer.parseInt(texidp.getText()));

        conexion objetoconexion = new conexion();

        String consulta = "DELETE FROM usuario WHERE usuario.Id_usuario=?;";

        try {
            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);
            cs.setString(1, getUsuario());
            cs.execute ();

            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el usuario");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }

    }
    
    public boolean validarUsuario(JTextField jTusuario, JTextField jPasswordusurio, JComboBox JCRol) {
    
        try {
            
            // Preparamos la consulta
            
            String consulta =("SELECT * FROM usuarios WHERE usuario='" + jTusuario + "' AND password='" + jPasswordusurio + "' AND Rol='" + JCRol + "'");
            
            CallableStatement cs;
            
            cs = objetoconexion.conectar().prepareCall(consulta);

            
            ResultSet resultadosConsulta = cs.executeQuery(consulta);

            // si es valido el primer reg. hay una fila, tons el usuario y su pw existen
            
            if (resultadosConsulta.first()) 
            {
                //usuario validado correctamente
                return true;        
                
            } else {
                
                //usuario validado incorrectamente
                return false;        
            }
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
        }

    }

  }



