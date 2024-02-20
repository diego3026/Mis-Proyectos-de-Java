
package com.mycompany.mensajes;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        //insertarRegistro("hola desde java", "diego");
        //editarRegistro("segundo hola desde java", "diego", 5);
        listarRegistro();
        eliminarRegistro(7);
        listarRegistro();
    }
    
    
    public static void listarRegistro() throws SQLException{
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
                "root", 
                "3174748557Dd"
        );
        
        System.out.println("Conexion exitosa");
        
        String sql = "SELECT * FROM mensajes";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ResultSet resultado = ps.executeQuery();
        
        while (resultado.next()) {            
            int id = resultado.getInt("idMensaje");
            String mensaje = resultado.getString("mensaje");
            String autor = resultado.getString("autor");
            String fecha = resultado.getString("fecha");
            System.out.printf("id = %d; mensaje = %s; autor = %s; fecha = %s\n",id,mensaje,autor,fecha);
        }
        ps.close();
        resultado.close();
        conectar.close();
    }
    
    public static void insertarRegistro(String mensaje, String autor) throws SQLException{
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
                "root", 
                "3174748557Dd"
        );
                
        String sql = "INSERT INTO mensajes(mensaje,autor,fecha) VALUES (?,?,CURRENT_TIME())";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.executeUpdate();

        ps.close();
        conectar.close();
    }
    
    public static void editarRegistro(String mensaje, String autor, int idMensaje) throws SQLException{
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
                "root", 
                "3174748557Dd"
        );
        
        System.out.println("Conexion exitosa");
        
        String sql = "UPDATE mensajes SET mensaje = ?, autor = ? WHERE idMensaje = ?";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setString(1, mensaje);
        ps.setString(2, autor);
        ps.setInt(3, idMensaje);
        ps.executeUpdate();

        ps.close();
        conectar.close();
    }
    
    public static void eliminarRegistro(int idMensaje) throws SQLException{
        Connection conectar = DriverManager.getConnection(
                "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC", 
                "root", 
                "3174748557Dd"
        );
        
        System.out.println("Conexion exitosa");
        
        String sql = "DELETE FROM mensajes WHERE idMensaje = ?";
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.setInt(1, idMensaje);
        ps.executeUpdate();

        ps.close();
        conectar.close();
    }
}

