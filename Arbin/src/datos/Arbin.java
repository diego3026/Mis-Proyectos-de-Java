/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

/**
 *
 * @author EQUIPO
 */
public interface Arbin<E> {
    Arbin<E> izq();
    Arbin<E> der();
    void enLIzq (Arbin<E> x);
    void enDer (Arbin<E> x);
    
    E obtener();
    void cambiar(E x);
     
    
}
