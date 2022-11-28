/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprocafe;

/**
 * Se importan todas las clases de la clase sql
 */
import java.sql.*;
import javax.swing.JOptionPane;
import java.time.*;

/**
 *
 * @author Usuario
 */

/**
 * Aquí se realiza la conexión a la BD
 */
public class conexion {
    
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
      /**
     * Se declara una variable tipo Connection
     */
    Connection conectar = null;

    /**
     * Se declaran las variables de acceso a la BD
     */
    String usuario = "root";
    String contrasena = "Karen1211";
    String bd = "emcafe";
    String ip = "localhost";
    String puerto = "3306";

    /**
     * Se crea una variable tipo String para concatenar los datos de acceso a la BD
     */
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    /**
     * Crea la funcion conectar() a la BD
     */
    public Connection conectar() {
        try {
            /**
             * Ruta del Driver sql
             */
            Class.forName("com.mysql.jdbc.Driver");

            /**
             * Se incorporan los valores neecsarios para la conexión
             */
            conectar = DriverManager.getConnection(cadena, usuario, contrasena);

            /**
             * Muestra ventana con mensaje de conexión exitosa
             */
//            //OJO! Este se activa para verificar
            JOptionPane.showMessageDialog(null, "Conexión exitosa a la BD: " + bd, "Ejemplo conexión a BD", JOptionPane.INFORMATION_MESSAGE);

        } catch (ClassNotFoundException | SQLException e) {
            /**
             * Muestra ventana con mensaje de conexión no exitosa y el error
             */
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la BD: " + bd + "  " + e, "Ejemplo conexión a BD", JOptionPane.ERROR_MESSAGE);
        }
        return conectar;

    }

   }
