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
public class ArbinEntA<E> implements ArbinA<E>{
    E dato;
    ArbinA<E> i;
    ArbinA<E> d;
    
    public ArbinEntA(E dato) {
        this.dato = dato;
    }
    
    
    @Override
    public ArbinA<E> izq() {
        return i;
    }

    @Override
    public ArbinA<E> der() {
        return d;
    }

    @Override
    public void enlIzq(ArbinA<E> x) {
        i=x;
    }

    @Override
    public void enlDer(ArbinA<E> x) {
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
