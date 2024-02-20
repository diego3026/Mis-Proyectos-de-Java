/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Bebida {
    private int identificador;
    private int cantidadDeLitros;
    private float precio;
    private String marca;
    
    public Bebida(int identificador,int cantidadDeLitros, float precio, String marca){
        this.identificador = identificador;
        this.cantidadDeLitros = cantidadDeLitros;
        this.precio = precio;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Bebida->" + "identificador=" + identificador + ", cantidadDeLitros=" + cantidadDeLitros + ", precio=" + precio + ", marca=" + marca + "";
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCantidadDeLitros() {
        return cantidadDeLitros;
    }

    public void setCantidadDeLitros(int cantidadDeLitros) {
        this.cantidadDeLitros = cantidadDeLitros;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
