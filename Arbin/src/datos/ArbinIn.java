/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author EQUIPO
 */
public class ArbinIn<E> implements  Arbin<E>{
    E dato;
    Arbin<E> i;
    Arbin<E> d;

    public ArbinIn(E dato) {
        this.dato = dato;
    }
    
    @Override
    public Arbin<E> izq() {
        return i;
    }

    @Override
    public Arbin<E> der() {
        return d;
    }

    @Override
    public void enLIzq(Arbin<E> x) {
        i=x;
    }

    @Override
    public void enDer(Arbin<E> x) {
        d=x;
    }

    @Override
    public E obtener() {
        return dato;
    }

    @Override
    public void cambiar(E x) {
        dato=x;
    }
    
    
    
}
