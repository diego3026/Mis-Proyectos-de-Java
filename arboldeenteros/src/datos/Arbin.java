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
public interface Arbin<E> {
    E obtener();
    Arbin<E> izq();
    Arbin<E> der();
    void enlDer(Arbin<E> x);
    void enlIzq(Arbin<E> x);
    void cambiar(E x);
}
