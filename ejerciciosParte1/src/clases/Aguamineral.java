/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Aguamineral extends Bebida{
    private String origen;

    public Aguamineral(String origen, int identificador, int cantidadDeLitros, float precio, String marca) {
        super(identificador, cantidadDeLitros, precio, marca);
        this.origen = origen;
    }
    
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Aguamineral{" + "origen=" + origen + "}";
    }

    
    
    
}
