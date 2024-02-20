/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafodecadenas;

import datos.Grafo;
import datos.GrafoDinam;

/**
 *
 * @author asus
 */
public class GrafoCadena {
    Grafo<String, Double> grafo = new GrafoDinam<>();
    
    public void insertarVertice(String x){
        grafo.insVertice(x);
    }
    
    public void insertarArista(String vi, String vf, double costo){
        grafo.insArista(vi, vf, costo);
    }
    
    public String mostrar(){
        return grafo.mostrar();
    }
    
    public void modificarArista(String vi, String vf, double costo){
        grafo.modificarArista(vi, vf, costo);
    }
}
