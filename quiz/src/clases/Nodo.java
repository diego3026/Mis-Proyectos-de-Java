/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 * @param <E>
 */
public class Nodo<E>{
    private E dato;
    private Nodo siguiente;
    
    public Nodo(E dato){
        this.dato = dato;
        this.siguiente = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
