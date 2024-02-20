/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta(String titular, float cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public Cuenta(String titular){
        this.titular = titular;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public double getCantidad(){
        return this.cantidad;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public void ingresar(double cantidad){
        if(cantidad>0){
            this.cantidad += cantidad;
        }
    }
    
    public void retirar(double cantidad){
        double valor = this.cantidad - cantidad;
        
        if(valor<0){
            System.out.println("la cantidad a retirar supera a la cantidad en la cuenta");
        }else{
            this.cantidad = valor;
            System.out.println("El saldo de la cuenta es: "+valor);
        }
       
    }
}
