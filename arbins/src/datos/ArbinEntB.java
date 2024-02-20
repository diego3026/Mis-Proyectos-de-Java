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
public class ArbinEntB<E> implements ArbinB<E>{
    E dato;
    ArbinB<E> i;
    ArbinB<E> d;

    public ArbinEntB(E dato) {
        this.dato = dato;
    }
    
    
    
    @Override
    public ArbinB<E> izq() {
        return i;
    }

    @Override
    public ArbinB<E> der() {
        return d;
    }

    @Override
    public void enlIzq(ArbinB<E> x) {
        i=x;
    }

    @Override
    public void enlDer(ArbinB<E> x) {
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
