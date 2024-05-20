package Tema14;

import java.sql.*;

public class prac1 {
    static Statement sentencia;
    static Connection conexion;
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/instituto";
        try {
            conexion = DriverManager.getConnection(url, "root", "1234");
            sentencia = conexion.createStatement();

            obtenerAlumnos();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void obtenerAlumnos(){
        String sql = "select idAlumno, nombre from alumnos";
        try {
            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                System.out.println(id + " " + nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
