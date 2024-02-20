/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author asus
 */
public class Nodo<E,V> {
    E dato;
    Nodo<E,V> sig;
    NodoSub<V> inf;
    
    public Nodo(E dato) {
        this.dato = dato;
    }
    
}

