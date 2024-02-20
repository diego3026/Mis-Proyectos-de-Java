/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public interface Grafo<V,A>{
    void insVertice(V x);
    V obtVertice(int pos);
    void insArista(V vi, V vf, A costo);
    void modificarArista(V vi, V vf, A costo);
    A obtArista(int vi, int vf);
    int orden();
    String mostrar();
    ArrayList<V> sucesores(int pos);
}
