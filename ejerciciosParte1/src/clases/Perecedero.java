/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Perecedero extends Producto{
   private int diasCaducacion;

    public Perecedero(int diasCaducacion, String nombre, float precio) {
        super(nombre, precio);
        this.diasCaducacion = diasCaducacion;
    }

    public int getDiasCaducacion() {
        return diasCaducacion;
    }

    public void setDiasCaducacion(int diasCaducacion) {
        this.diasCaducacion = diasCaducacion;
    }

    @Override
    public float calcular(int cantidad) {
        float precio = super.calcular(cantidad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        switch(diasCaducacion){
            case 1 -> precio = precio/4;
            case 2 -> precio = precio/3;
            case 3 -> precio = precio/2;
        }
        return precio;
    }

    
   
    
}
