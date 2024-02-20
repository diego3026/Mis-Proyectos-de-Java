/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class ListaOrdenada<E>{
    private ArrayList<E> lista;
    
    public ListaOrdenada(){
        lista = new ArrayList<>();
    }
    
    public void add(E objeto){
        if(isEmpty()){
           lista.add(objeto);
        }else{
            lista.add(objeto);
        }
        ordenar(objeto);
    }
    
    public E get(int index){
        if(index<0){
            return (E) "error en indice";
        }
        return lista.get(index);
    }
    
    public int size(){
        return lista.size();
    }
    
    public boolean isEmpty(){
        return lista.size()==0;
    }
    
    public boolean remove(E objeto){
        return lista.remove(objeto);
    }
    
    public String toString(){
        String cadena="";
        for (E e : lista) {
            cadena+=e.toString()+"\n";
        }
        return cadena;
    }
    
    public int indexOf(E objeto){
        for (int i = 0; i < lista.size(); i++) {
            E get = lista.get(i);
            if(get.equals(objeto)){
                return i;
            }
        }
        return -1;
    }

    private void ordenar(E objeto) {
        for (int i = 0; i < lista.size(); i++) {
            if(objeto.toString().compareTo(lista.get(i).toString())<0){
                continue;
            }
        }
        lista.sort(null);  
    }  
   
}
