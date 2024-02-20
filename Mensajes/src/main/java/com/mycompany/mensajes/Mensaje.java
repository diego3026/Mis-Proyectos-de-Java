/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes;

/**
 *
 * @author asus
 */
public class Mensaje {
    private int id;
    private String mensaje;
    private String autor;
    private String fecha;

    public Mensaje() {
    }

    public Mensaje(int id) {
        this.id = id;
    }

    public Mensaje(String mensaje, String autor) {
        this.mensaje = mensaje;
        this.autor = autor;
        this.fecha = fecha;
    }

    public Mensaje(int id, String mensaje, String autor) {
        this.id = id;
        this.mensaje = mensaje;
        this.autor = autor;
    }

    public Mensaje(int id, String mensaje, String autor, String fecha) {
        this.id = id;
        this.mensaje = mensaje;
        this.autor = autor;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", mensaje=" + mensaje + ", autor=" + autor + ", fecha=" + fecha + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
