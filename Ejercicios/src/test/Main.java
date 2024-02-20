/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import clases.Persona;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args){
        /*
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un nombre: ");
        String nombre = leer.next();
        
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese el sexo: ");
        String sexo = leer.next();
        
        System.out.println("Ingrese el peso: ");
        float peso = leer.nextFloat();
        
        System.out.println("Ingrese la altura: ");
        float altura = leer.nextFloat();
        
        Persona persona1 = new Persona(nombre, edad, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        */
        
        Persona p1 = new Persona("diego", 20, "H");        
        Persona p2 = new Persona("diego", 20, "H");
        Persona p3 = p1;
        
        System.out.println(p1.equals(p2));

        
    }
}
 