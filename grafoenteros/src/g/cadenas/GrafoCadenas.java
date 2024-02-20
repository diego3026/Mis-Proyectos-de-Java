/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g.cadenas;

import g.datos.Grafo;
import g.datos.GrafoMat;

/**
 *
 * @author asus
 */
public class GrafoCadenas {
    private Grafo<String, Double> grafo = new GrafoMat<>();
    
    public void insVertice(String x){
        grafo.insVertice(x);
    }
    
    public void insArista(int vi, int vf, double costo){
        grafo.insArista(vi, vf, costo);
    }
    
    public String mostrar(){
        return grafo.mostrar();
    }
    
    public float porOcupacion() {
        int c=0;
        int n=grafo.orden()*(grafo.orden()-1);
        for (int i = 0; i < grafo.orden(); i++) {
            for (int j = 0; j < grafo.orden(); j++) {
                Double numero = grafo.obtArista(i, j);
                if(numero!=GrafoMat.inf && numero!=0.0){
                    c++;
                }
            }
        }
        return (float) c/n *100;
    }
    
    public boolean verticeComplet(String vertice){
        int posVertice=buscarVertice(vertice);
        if(posVertice!=-1){
            for (int i = 0; i < grafo.orden(); i++) {
                if(grafo.obtArista(posVertice, i)==GrafoMat.inf){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public void aislarVertice(String v){
        int pos = buscarVertice(v);
        if(pos!=-1){   
            for (int i = 0; i < grafo.orden(); i++) {
                grafo.modificarArista(pos, i, GrafoMat.inf);
                grafo.modificarArista(i, pos, GrafoMat.inf);
            }
        }
    }
    
    private int buscarVertice(String v){
        for (int i = 0; i < grafo.orden(); i++) {
            if(grafo.obtVertice(i).equals(v)){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * @return the grafo
     */
    public Grafo<String, Double> getGrafo() {
        return grafo;
    }
}
