/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }
    
    public Television(float precio, float peso){
        super(precio, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(int resolucion, boolean sintonizadorTDT, float precio, String color, char consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public float precioFinal() {
        if (this.resolucion>40){
            return (float) (super.precioFinal()+(super.precioFinal())*0.03);
        }
        if (sintonizadorTDT){
            return super.precioFinal()+50;
        }
        return super.precioFinal(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    @Override
    public void comprobarConsumoEnergetico(char letra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void comprobarColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
