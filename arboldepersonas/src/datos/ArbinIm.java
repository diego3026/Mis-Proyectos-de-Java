 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author ESTUDIANTE
 */
public class ArbinIm<E> implements Arbin<E>{
    E dato;
    Arbin<E> i;
    Arbin<E> d;
    
    public ArbinIm(E dato) {
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
    public void enlIzq(Arbin<E> x) {
        i=x;
    }

    @Override
    public void enlDer(Arbin<E> x) {
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
