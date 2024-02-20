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
public interface ArbinA<E>{
    ArbinA<E> izq();
    ArbinA<E> der();
    void enlIzq(ArbinA<E> x);
    void enlDer(ArbinA<E> x);
    E obtener();
    void cambiar(E x);
}
