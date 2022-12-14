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
    int idPersonal;
    String password=null;
    String rol=null;

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }
    
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

    
    public void InsertarUsuario(JTextField jTidpersonal ,JTextField jTusuario,JTextField jTpossword,JComboBox JCRol){

        /*Se incorporan los valores de los controles*/
        
        setUsuario(jTusuario.getText());
        setPassword(jTpossword.getText());
        setIdPersonal(Integer.parseInt(jTidpersonal.getText()));
        setRol(JCRol.getSelectedItem().toString());

        /*Se crea una consulta para insertar los datos*/
        
        String consulta = "INSERT INTO usuario ( Id_usuario,Contrase??a, Id_Personal, Rol) values (?,?,?,?)";

        try {
            /*Se enlaza la conexion con la consulta anterior*/
            
            CallableStatement cs;
            
            cs = objetoconexion.conectar().prepareCall(consulta);
            /*Se incorporan los par??metros*/
            
            cs.setString(1, getUsuario());
            cs.setString(2, getPassword());
            cs.setInt(3, getIdPersonal());
            cs.setString(4, getRol());
            
            cs.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se insert?? correctamente la informaci??n");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se insert?? correctamente, error: " + e.toString());
        }
    }
        
//    public void MostrarPersonas(JTable tbtotalpersonas) {
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
//        modelo.addColumn("Id_usuario");
//        modelo.addColumn("Possword");
//        modelo.addColumn("Rol");
//        
//
//        tbtotalpersonas.setModel(modelo);
//
//        sql = "select * from usuario;";
//        
//        /*Se crea un arreglo*/
//
//        String[] datos = new String[3];
//
//        java.sql.Statement st;
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

    /*Funci??n para seleccionar un registro */
    
//    public void Seleccionarpersona(JTextField jTidpersonal ,JTextField jTusuario,JTextField jTpossword,JComboBox JCRol) {
//
//        try {
//            int fila = tbtotalpersonas.getSelectedRow();
//
//            if (fila >= 0) {
//
//                jTusuario.setText((tbtotalpersonas.getValueAt(fila, 1).toString()));
//                jTpossword.setText((tbtotalpersonas.getValueAt(fila, 2).toString()));
//                jTidpersonal.setText((tbtotalpersonas.getValueAt(fila, 3).toString()));
//                JCRol.setSelectedItem((tbtotalpersonas.getValueAt(fila,4).toString()));
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

    /*Funci??n para modificar los datos de persona*/
    
    public void ModificarPersonas(JTextField jTidpersonal ,JTextField jTusuario,JTextField jTpossword,JComboBox JCRol) {

        /*Convierte de texto a int*/
        
//        setId_personal(Integer.parseInt(texidp.getText()));

        /*Toma los valores de texto*/
        
        setUsuario(jTusuario.getText());
        setPassword(jTpossword.getText());
        setIdPersonal(Integer.parseInt(jTidpersonal.getText()));
        setRol(JCRol.getSelectedItem().toString());

        conexion objetoconexion = new conexion();

        String consulta = "UPDATE usuario SET usuario.Id_usuario = ?, usuario.Contrase??a = ?, usuario.Id_Personal = ?usuario.Rol = ? WHERE usuario.Id_usuario =?;";

        try {

            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);

//            cs.setInt(1, getId_personal());
            cs.setString(1, getUsuario());
            cs.setString(2, getPassword());
            cs.setInt(3, getIdPersonal());
            cs.setString(4, getRol());
           
            cs.executeUpdate();

            JOptionPane.showMessageDialog(null, "Modificaci??n exitosa");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se modific??, error:" + e.toString());
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

            JOptionPane.showMessageDialog(null, "Se elimin?? correctamente el usuario");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }

    }
    
    public boolean validarUsuario(JTextField jTidpersonal ,JTextField jTusuario,JTextField jTpossword,JComboBox JCRol) {
    
        try {
            
            // Preparamos la consulta
            
            String consulta =("SELECT * FROM usuarios WHERE usuario='" + jTusuario + "' AND password='" + jTidpersonal + "' AND Rol='" + JCRol + "'");
            
            CallableStatement cs;
            
            cs = objetoconexion.conectar().prepareCall(consulta);

            
            ResultSet resultadosConsulta = cs.executeQuery(consulta);
             
            cs.setString(1, usuario );
             
            // si es valido el primer reg. hay una fila,  el usuario y su pw existen
            
            if (resultadosConsulta.next()) {
                
                usuario = cs.getString(1);
                password = cs.getString(2);
                rol = cs.getString(3);
                idPersonal = cs.getInt(4);
            }
//            Administrador Sistema
//            Administrador
//            Usuario

                // Si se ha obtenido un usuario y password y ademas esta es coincidente
            if (jTusuario != null && password != null && password.equals(jTpossword)) {
                if (JCRol != null) {
                    if (JCRol.equals("Administrador Sistema")) {
                        fm_usuario vm = new fm_usuario();
//                        this.setVisible(false);
                        
                        vm.setVisible(true);
                        
                    } else if (JCRol.equals("Administrador")) {

                    } else if (JCRol.equals("Usuario")) {

                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contrase??a incorrectos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } finally {
            
            return true;        
                
            }
    }
}



