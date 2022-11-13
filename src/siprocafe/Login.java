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
    
    int idUsuario;
    String usuario=null;
    int idPersonal;
    String password=null;
    String rol=null;
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

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

    
    public void InsertarUsuario(JTextField txtId_personal ,JTextField txtusuario,JTextField jTpossword,JComboBox JCRol){

        /*Se incorporan los valores de los controles*/
        
        setIdUsuario(Integer.parseInt(txtusuario.getText()));
        setPassword(jTpossword.getText());
        setIdPersonal(Integer.parseInt(txtId_personal.getText()));
        setRol(JCRol.getSelectedItem().toString());

        /*Se crea una consulta para insertar los datos*/
        
        String consulta = "INSERT INTO usuario ( Id_usuario,Contraseña, Id_Personal, Rol) values (?,?,?,?)";

        try {
            /*Se enlaza la conexion con la consulta anterior*/
            
            CallableStatement cs;
            
            cs = objetoconexion.conectar().prepareCall(consulta);
            /*Se incorporan los parámetros*/
            
            cs.setInt(1, getIdUsuario());
            cs.setString(2, getPassword());
            cs.setInt(3,getIdPersonal());
            cs.setString(4, getRol());
            
            cs.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente la información");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se insertó correctamente, error: " + e.toString());
        }
    }
    /*Función para modificar los datos de persona*/
    
    public void Modificarusuario(JTextField txtId_personal ,JTextField txtusuario,JTextField jTpossword,JComboBox JCRol) {
        
        conexion objetoconexion = new conexion();
        
        setIdUsuario(Integer.parseInt(txtusuario.getText()));
        setPassword(jTpossword.getText());
        setIdPersonal(Integer.parseInt(txtId_personal.getText()));
        setRol(JCRol.getSelectedItem().toString());

        String consulta = "UPDATE `usuario` SET `Contraseña`='?',`Id_Personal`='?',`Rol`='?' WHERE `Id_usuario`='?'";

        try {

            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);

           
            cs.setInt(1, getIdUsuario());
            cs.setString(2, getPassword());
            cs.setInt(3, getIdPersonal());
            cs.setString(4, getRol());
           
            cs.executeUpdate();

            JOptionPane.showMessageDialog(null, "Modificación exitosa");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se modificó, error:" + e.toString());
                   }
       
    }

    public void Eliminarusuario(JTextField jTusuario) {

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
    
    public boolean validarUsuario(JTextField textusuario,JPasswordField jPassword,JComboBox JCRol) {
    
        
        try {
            
            // Preparamos la consulta
            
            String consulta =("SELECT * FROM usuario WHERE Id_usuario='" + textusuario + "' AND Contraseña='" + jPassword + "' AND Rol='" + JCRol + "'");
            
            CallableStatement cs;
            
            cs = objetoconexion.conectar().prepareCall(consulta);

            
            ResultSet resultadosConsulta = cs.executeQuery(consulta);
             
            String id_usuarios = textusuario.getTex();
             
            // si es valido el primer reg. hay una fila,  el usuario y su pw existen
            
            if (resultadosConsulta.next()) {
                
              idUsuario = cs.getString(1);
                password = cs.getString(2);
                               
            }
//            Administrador Sistema
//            Administrador
//            Usuario

//                 Si se ha obtenido un usuario y password y ademas esta es coincidente
                    
            if (jTusuario != null && password != null && && password.equals(jTpossword)) {
                if (JCRol != null) {
                    if (JCRol.equals("Administrador Sistema")) {
                        frm_Menu_Principal_1 vm = new frm_Menu_Principal_1();
                        vm.setVisible(true);
                        
                    } else if (JCRol.equals("Administrador")) {
                        frm_Menu_Principal_1 vm = new frm_Menu_Principal_1();
                        vm.setVisible(true);

                    } else if (JCRol.equals("Usuario")) {
                         frm_Menu_Principal_1 vm = new frm_Menu_Principal_1();
                        vm.setVisible(true);

                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        } finally {
            
            return true;        
                
            }
    }
}
