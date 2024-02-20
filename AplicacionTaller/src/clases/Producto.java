/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Producto {
    private int idProducto;
    private String descripcion;
    private float precio;
    private int cantidad;

    public Producto(int idProducto, String descripcion, float precio, int cantidad) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public Producto(String descripcion, float precio, int cantidad) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
