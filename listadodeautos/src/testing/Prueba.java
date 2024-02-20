/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import datos.Auto;
import datos.ConjuntoAutos;

/**
 *
 * @author Estudiante
 */
public class Prueba {
    public static void main(String[] args) {
        ConjuntoAutos con=new ConjuntoAutos();
        con.addAuto(new Auto("QHC-047", "Renault", 2022, 1000));
        con.addAuto(new Auto("xxx456", "Mazda", 2000, 5000));
        con.addAuto(new Auto("xxx789", "Tesla", 2025, 2000));
        Auto a5=new Auto("xxx123","Chevrolet", 2020, 3000);
        con.addAuto(a5);
        
        String listar = con.listar();
       
        System.out.println(" "+listar);
        
        float promedio = con.promedio();
        float autoCaro = con.autoCaro();
        System.out.println("El promedio es: "+promedio);
        System.out.println("El auto mas caro tiene un valor de: "+autoCaro);
        con.searchCarro("xxx123");
        con.borrar(a5);
        String listar1 = con.listar();
        System.out.println(" "+listar1);   
        //System.out.println("ordenamiento burbuja");
        //con.burbuja();
        //System.out.println("ordenamiento selection");
        //con.selection();
        //System.out.println("ordenaniemto quickshort");
        //con.quicksort(0, con.getNa()-1);
        System.out.println("ordenamiento inserccion");
        con.inserccionsort();
        String listar2 = con.listar();
        System.out.println(" "+listar2);
    }
}
//funcion que halle auto mas caro
//funcion que busque carro por placa
//funcion que borre auto

//TAREA --> crear conjunto de datos y resuelve problemas