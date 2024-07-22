/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Nicolas
 */
public class UtilsDB {

    public static final String URL = "jdbc:mysql://localhost:3306/ej_cantantes";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static Connection Conectar() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return conexion;

    }

    public static void traerCantante(String nombre, JTextField f_nombre, JTextField f_disco, JTextField f_vistas) {
        Connection conexion;

        String sql = "SELECT * FROM cantantes WHERE nombre_cantante LIKE \"" + nombre + "%\"";

        try {
            conexion = Conectar();

            Statement stat = conexion.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                int id = res.getInt("id");
                String nombre_cantan = res.getString("nombre_cantante");
                String disco = res.getString("nombre_disco_ventas");
                long cant = res.getLong("cantidad_ventas");

                f_nombre.setText(nombre_cantan);
                f_disco.setText(disco);
                f_vistas.setText(String.valueOf(cant));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void crearCantante(String nombre, String disco, String n_ventas) {
        Connection conexion;

        try {
            conexion = Conectar();

            PreparedStatement query = conexion.prepareStatement("INSERT INTO cantantes (nombre_cantante, nombre_disco_ventas, cantidad_ventas) VALUES (?,?,?)");
            query.setString(1, nombre.toUpperCase());
            query.setString(2, disco.toUpperCase());
            query.setString(3, n_ventas);

            int res = query.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Agregado!");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }

            conexion.close();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void eliminarCantante(String nombre) {
        Connection conexion;

        try {

            conexion = Conectar();

            String sql_query = "DELETE FROM cantantes WHERE nombre_cantante LIKE \"" + nombre.charAt(0) + nombre.charAt(1) + "%\"";

            PreparedStatement query = conexion.prepareStatement(sql_query);

            int res = query.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, nombre + " Eliminado!");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }

            conexion.close();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void editarCantante(String nombre, String nuevo_nombre, String nuevo_disco, String nuevo_c_discos) {
        Connection conexion;

        String sql_update = "UPDATE cantantes SET nombre_cantante = ?, nombre_disco_ventas = ?, cantidad_ventas = ? WHERE nombre_cantante LIKE \"" + nombre.charAt(0) + nombre.charAt(1) + "%\"";

        try {
            conexion = Conectar();

            PreparedStatement query = conexion.prepareStatement(sql_update);
            query.setString(1, nuevo_nombre);
            query.setString(2, nuevo_disco);
            query.setString(3, nuevo_c_discos);

            int nm = query.executeUpdate();

            if (nm > 0) {
                JOptionPane.showMessageDialog(null, nombre + " Editado!");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }

            conexion.close();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
