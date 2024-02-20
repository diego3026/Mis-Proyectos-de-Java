/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cadenas;

import ed.datos.Grafo;
import java.util.HashSet;

/**
 *
 * @author ESTUDIANTE
 */
public class Dijkstra {
    public static double d[];
    Grafo<String, Double> grafo;
    HashSet<Integer> s = new HashSet<>();

    public Dijkstra(Grafo<String, Double> grafo, int vertice) {
        this.grafo = grafo;
        d = new double[grafo.orden()];
        for (int i = 0; i < d.length; i++) {
            d[i] = grafo.costoArista(vertice, i);
        }
        caminoMinimo(vertice);
    }

    private void caminoMinimo(int vertice) {
        s.add(vertice);
        for (int i = 0; i < d.length; i++) {
            int v = menor();
            s.add(v);
            for (int w = 0; w < d.length; w++) {
                if(!s.contains(w)){
                    d[w] = Double.min(d[w], d[v]+grafo.costoArista(v, w));
                }
            }
        }
    }

    private int menor() {
        double menor = 99999;
        int vm = 0;//indice menor es decir el vertice del menor
        for (int i = 0; i < d.length; i++) {
            if(!s.contains(i)){
                if(d[i]<menor){
                    menor=d[i];
                    vm=i;
                }
            }
        }
        return vm;
    }
    
    
}
