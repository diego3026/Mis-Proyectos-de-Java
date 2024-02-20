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
public class NodoSub<E> {
    E dato;
    NodoSub<E> inf;

    public NodoSub(E dato) {
        this.dato = dato;
    }
    
}
