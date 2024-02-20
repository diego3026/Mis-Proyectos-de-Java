package com.mycompany.mensajes;

import java.sql.*;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/mensajes_db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "3174748557Dd";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL,USER, PASSWORD);
    }
    
    public static void cerrar(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void cerrar(PreparedStatement ps) throws SQLException{
        ps.close();
    }
    
    public static void cerrar(Connection conn) throws SQLException{
        conn.close();
    }
}

