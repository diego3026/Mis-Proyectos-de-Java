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
public class Lista<E extends Comparable<E>>{
    private Nodo<E> inicio;
    private int tamaño;
    
    public Lista(){
        inicio = null;
        tamaño = 0;
    }
    
    public boolean isVacia(){
        return inicio == null;
    }
    
    public void agregarInicio(E dato){
        Nodo<E> nuevo = new Nodo(dato);
        if (isVacia()){
            inicio = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamaño++;
    }
    
    public void agregarAlFinal(E dato){
        Nodo<E> nuevo = new Nodo(dato);
        
        if(isVacia()){
            inicio = nuevo;
        }else{
            Nodo<E> aux = inicio;
            while(aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }
    
    public void agregarOrdenado(E dato){
        Nodo<E> nuevo = new Nodo(dato);
        if(isVacia()){
            inicio = nuevo;
        }else{
            Nodo<E> aux = inicio;
            
            if(nuevo.getDato().compareTo(inicio.getDato())<0){
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }else{
                while(aux.getSiguiente()!=null){
                    Nodo<E> ant = aux;
                    Nodo<E> sig = aux.getSiguiente();
                    if(nuevo.getDato().compareTo(aux.getDato())<0){
                        ant.setSiguiente(nuevo);
                        nuevo.setSiguiente(aux);
                    }else{
                        aux.setSiguiente(nuevo);
                        nuevo.setSiguiente(sig);
                    }
                    aux = aux.getSiguiente();
                }
            }
        }
        tamaño++;
    }
    
    public String listar(){
        String listar = "";

        if(!isVacia()){
            Nodo aux = inicio;
            int contador = 0;
            while(aux!=null){
                listar+=""+contador+". -> ["+aux.getDato()+"] ";
                aux = aux.getSiguiente();
                contador++;
            }
        }
        return listar;
    }
}
