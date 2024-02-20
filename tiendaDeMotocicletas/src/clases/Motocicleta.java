/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Motocicleta {
    private int numeroDeSerie;
    private int modelo;
    private String marca;
    private long precio;

    public Motocicleta(int numeroDeSerie, int modelo, String marca, long precio) {
        this.numeroDeSerie = numeroDeSerie;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "numeroDeSerie=" + numeroDeSerie + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + '}';
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }
    
}
