/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static com.mycompany.mensajes.Conexion.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */ 
public class MensajeDao {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Mensaje mensaje;
    
    public List<Mensaje> seleccionar() throws SQLException{
        String sql = "SELECT * FROM mensajes";
        List<Mensaje> mensajes = new ArrayList<>();
        try {
            this.con = getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.rs = this.ps.executeQuery();
            
            while (this.rs.next()) {                
                int id = this.rs.getInt("idMensaje");
                String mensaje = this.rs.getString("mensaje");
                String autor = this.rs.getString("autor");
                String fecha = this.rs.getString("fecha");
                
                this.mensaje = new Mensaje(id, mensaje, autor, fecha);
                mensajes.add(this.mensaje);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally{
            cerrar(this.rs);
            cerrar(this.ps);
            cerrar(this.con);
        }
        return mensajes;
    }
    
    public int insertar(Mensaje mensaje) throws SQLException{
        String sql = "INSERT INTO mensajes (mensaje,autor,fecha) VALUES (?,?,CURRENT_TIME())";
        int registros = 0;
        try {
            this.con = getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setString(1,mensaje.getMensaje());
            this.ps.setString(2,mensaje.getAutor());
            registros = this.ps.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally{
            cerrar(this.ps);
            cerrar(this.con);
        }
        return registros;
    }
    
    public int editar(Mensaje mensaje) throws SQLException{
        String sql = "UPDATE mensajes SET mensaje=?, autor=? WHERE idMensaje=?";
        int registros = 0;
        try {
            this.con = getConnection();
            this.ps = this.con.prepareStatement(sql);
            
            this.ps.setString(1,mensaje.getMensaje());
            this.ps.setString(2,mensaje.getAutor());
            this.ps.setInt(3, mensaje.getId());
            registros = this.ps.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally{
            cerrar(this.ps);
            cerrar(this.con);
        }
        return registros;
    }

    public int eliminar(Mensaje mensaje) throws SQLException{
        String sql = "DELETE FROM mensajes WHERE idMensaje=?";
        int registros = 0;
        try {
            this.con = getConnection();
            this.ps = this.con.prepareStatement(sql);
            
            this.ps.setInt(1, mensaje.getId());
            registros = this.ps.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally{
            cerrar(this.ps);
            cerrar(this.con);
        }
        return registros;
    }
}

 