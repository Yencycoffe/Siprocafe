/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprocafe;


import java.sql.PreparedStatement;
import java.sql.Statement;
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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Karen Yency Pinedo
 */
public class Login {

//    // Se define variables e incializamos variables
    
    int idUsuario;
    String login;
    String Contraseña=null;
    int idPersona;
    String rol=null;
    
//    sSe generan los getteres y setteres
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
      // Metodo que conecta con el servidor MYSQL y valida los usuarios
    
    conexion objetoconexion = new conexion();

    
    public void InsertarUsuario(JTextField txtId_personal ,JTextField txtId_usuario,JTextField txtusuario,JTextField jTpossword,JComboBox JCRol){

        /*Se incorporan los valores de los controles*/
        
        setIdUsuario(Integer.parseInt(txtId_usuario.getText()));
        setLogin(txtusuario.getText());
        setContraseña(jTpossword.getText());
        setIdPersona(Integer.parseInt(txtId_personal.getText()));
        setRol(JCRol.getSelectedItem().toString());

        /*Se crea una consulta para insertar los datos*/
        
        String consulta = "INSERT INTO usuario ( Id_usuario, login, Contraseña, Id_Personal, Rol) values (?,?,?,?,?)";

        try {
            /*Se enlaza la conexion con la consulta anterior*/
            
            CallableStatement cs;
            
            cs = objetoconexion.conectar().prepareCall(consulta);
            /*Se incorporan los parámetros*/
            
            cs.setInt(1, getIdUsuario());
            cs.setString(2, getLogin());
            cs.setString(3, getContraseña());
            cs.setInt(4,getIdPersona());
            cs.setString(5, getRol());
            
            cs.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se insertó correctamente la información");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se insertó correctamente, error: " + e.toString());
        }
    }
    /*Función para modificar los datos de persona*/
    
    public void Modificarusuario(JTextField txtId_personal ,JTextField txtusuario,JTextField jTpossword,JComboBox JCRol) {
        
        conexion objetoconexion = new conexion();
        
        
        setContraseña(jTpossword.getText());
        setIdPersona(Integer.parseInt(txtId_personal.getText()));
        setRol(JCRol.getSelectedItem().toString());
        setIdUsuario(Integer.parseInt(txtusuario.getText()));

        String consulta = "UPDATE `usuario` SET `Id_usuario`='[?]',`login`='[?]',`Contraseña`='[?]',`Id_Personal`='[?]',`Rol`='[?]' WHERE 1";

        try {

            CallableStatement cs = objetoconexion.conectar().prepareCall(consulta);

           
            
            cs.setString(1, getContraseña());
            cs.setString(2, getLogin());
            cs.setInt(3, getIdPersona());
            cs.setString(4, getRol());
            cs.setInt(5, getIdUsuario());
           
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
            cs.setInt(1, getIdUsuario());
            cs.execute ();

            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el usuario");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo eliminar, error: " + e.toString());
        }

    }

    
//        public int validar_ingreso(){
//
//            conexion objetocon = new conexion();
//
//
//            String usuario = textusuario. getText();
//            String clave = String.valueOf(frm_usuario1.jPassword.getPassword());
//
//            int resultado=0;
//
//            String SSQL="SELECT `usuario`, `Contraseña`,`Rol` FROM `usuario` WHERE 1;";
//
//            Connection conect = null;
//
//            try {
//
//                conect = objetocon.conectar();
//                Statement st = conect.createStatement();
//                ResultSet rs = st.executeQuery(SSQL);
//
//                if(rs.next()){
//
//                    resultado=1;
//
//                }
//
//            } catch (SQLException ex) {
//
//                JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
//
//            }finally{
//
//
//                try {
//
//                    conect.close();
//
//                } catch (SQLException ex) {
//
//                    JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
//
//                }
//
//            }
//
//        return resultado;
//
//        }

}




