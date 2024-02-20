/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ESTUDIANTE
 */
public class Juego {
    private int valor;
    private int numeroGenerado;
    private int intentos;
    
    public Juego(){
        this.valor = 0;
        this.numeroGenerado = (int)(Math.random()*(500-1+1)+1);
        this.intentos = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public boolean adivinar(){
        if(valor==numeroGenerado){
            System.out.println("Numero adivinado en "+intentos+" intentos");
            return true;
        }else{
            if(valor>numeroGenerado){
                intentos++;
                System.out.println("Numero ingresado es mayor");
                return false;
            }else{
                intentos++;
                System.out.println("Numero ingresado es menor");
                return false;
            }
        }
    }

    
    
}
