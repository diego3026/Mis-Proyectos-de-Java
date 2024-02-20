/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

/**
 *
 * @author asus
 */
public class Nodo<Tdato> {
    private Tdato dato;
    private Nodo next;

    public Nodo(Tdato dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    /**
     * @return the dato
     */
    public Tdato getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Tdato dato) {
        this.dato = dato;
    }

    /**
     * @return the next
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
