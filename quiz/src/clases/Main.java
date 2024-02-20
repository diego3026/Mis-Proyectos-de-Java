/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Main {
    public static void main(String[] args) {
        /*Scanner leer = new  Scanner(System.in);

        Juego adivinarNumero = new Juego();
        
        do {  
            System.out.println("Ingresar un numero entre el 1 y el 500");
            int valor = leer.nextInt();
            adivinarNumero.setValor(valor);
            
        }while(!adivinarNumero.adivinar());
        */
        
        Lista test = new Lista();
        
        test.agregarOrdenado(5);        
        test.agregarOrdenado(4);
        test.agregarOrdenado(2);
        test.agregarOrdenado(7);
        
        System.out.println(test.listar());

       
        
    }
}
