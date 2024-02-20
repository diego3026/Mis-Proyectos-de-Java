/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author asus
 */
public class Moto {
    private String marca;
    private float precio;

    public Moto(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Moto{" + "marca=" + marca + ", precio=" + precio + '}';
    }
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
