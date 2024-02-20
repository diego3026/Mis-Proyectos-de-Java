/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import datos.Arbin;
import datos.ArbolCaracter;


/**
 *
 * @author EQUIPO
 */
public class Prueba {
    public static void main(String[] args) {
        ArbolCaracter arb=new ArbolCaracter();
        Arbin<String> raiz=arb.crear();
       System.out.print("El peso es  " +arb.peso(raiz));
       arb.inorden(raiz);
        
    }
}
