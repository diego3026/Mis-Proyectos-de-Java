/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Electrodomestico {
    private float precio;
    private String color;
    private char consumoEnergetico;
    private float peso;
    
    public Electrodomestico(){
        this.precio = 100f;
        this.color = "blanco".toLowerCase();
        this.peso = 5f;
        this.consumoEnergetico = 'F';
    }
    
    public Electrodomestico(float precio, float peso){
        this.precio = precio;
        this.peso = peso;
        this.color = "blanco".toLowerCase();
        this.consumoEnergetico = 'F';
    }

    public Electrodomestico(float precio, String color, char consumoEnergetico, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char consumoEnergetico){
        if(consumoEnergetico>65 && consumoEnergetico<=70){
            this.consumoEnergetico = consumoEnergetico;
        }else{
            this.consumoEnergetico = 'F';
        }
    }
    
    public void comprobarColor(String color){
        String colores[] = {"blanco","negro","rojo","azul","gris"};
        boolean encontrado = false;
        
        for (int i = 0; i < colores.length && !encontrado; i++) {
            if(colores[i].equals(color)){
                encontrado = true;
            }
        }
        
        if(encontrado){
            this.color = color;
        }else{
            this.color = "blanco";
        }
    }
    
    public float precioFinal(){
        switch (this.consumoEnergetico) {
            case 'A' -> this.precio+=100f;
            case 'B' -> this.precio+=80f;
            case 'C' -> this.precio+=60f;
            case 'D' -> this.precio+=50f;
            case 'E' -> this.precio+=30f;
            case 'F' -> this.precio+=10f;
        }
        
        if (this.precio>0 && this.precio<19){
            this.precio+=10f;
        }else if (this.precio>20 && this.precio<49){
            this.precio+=50f;
        }else if (this.precio>50 && this.precio<79){
            this.precio+=80f;
        }else if (this.precio>80){
            this.precio+=100f;
        }
        
        return this.precio;
    }
    
    public float getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }
    
    
}
