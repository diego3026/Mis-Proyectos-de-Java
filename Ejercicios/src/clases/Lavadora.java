/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Lavadora extends Electrodomestico{
    private float carga;
    
    public Lavadora(){
        super();
        this.carga=5f;
    }
    
    public Lavadora(float precio, float peso){
        super(precio, peso);
        this.carga=5f;
    }

    public Lavadora(float carga, float precio, String color, char consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    public float getCarga(){
        return this.carga;
    }

    @Override
    public float precioFinal() {
        if (this.carga>30){
            return super.precioFinal()+50;
        }else
            return super.precioFinal(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
