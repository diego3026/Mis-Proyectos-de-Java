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
public interface ArbinB<E> {
    ArbinB<E> izq();
    ArbinB<E> der();
    void enlIzq(ArbinB<E> x);
    void enlDer(ArbinB<E> x);
    E obtener();
    void cambiar(E x);
}
