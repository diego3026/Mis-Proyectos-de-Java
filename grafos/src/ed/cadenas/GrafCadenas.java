/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cadenas;

import ed.datos.Bfs;
import ed.datos.Dfs;
import ed.datos.Grafo;
import ed.datos.GrafoMat;
import java.util.Arrays;

/**
 *
 * @author Estudiante
 */
public class GrafCadenas {

    private static float porOcupacion(Grafo<String, Double> grafo) {
        int c=0;
        int n=grafo.orden()*(grafo.orden()-1);
        for (int i = 0; i < grafo.orden(); i++) {
            for (int j = 0; j < grafo.orden(); j++) {
                Double numero = grafo.costoArista(i, j);
                if(numero!=GrafoMat.inf && numero!=0.0){
                    c++;
                }
            }
        }
        return (float)c/n*100;
    }
    
    //generar grafo aleatorio 
    public Grafo<String,Double> generateGrafo(int n){
        Grafo<String,Double> graf=new GrafoMat<>();
        for (int i = 0; i < n; i++) {
            graf.insVertice("vert "+ i);
        }
        int nAristas = n*(n-1);
        for (int i = 0; i < nAristas; i++) {
            int vi = (int) (Math.random()*n);
            int vf = (int) (Math.random()*n);
            if(vi!=vf){
                double costo = (int) (Math.random()*1000);
                graf.insArista(vi, vf, costo);
            }
        }
        return graf;
    }
    
    //vertices con menos salidas
    public String menosSalidas(Grafo<String,Double> g){
        int menor=9999;
        String verticeMen="";
        for (int i = 0; i < g.orden(); i++) {
            if(g.sucesores(i).size()<menor){
                menor=g.sucesores(i).size();
                verticeMen=g.obtVertice(i);
            }
        }
        return verticeMen;
    }
    
    public double aristaMasCostosa(Grafo<String,Double> g){
        double mayor=0;
        
        for (int i = 0; i < g.orden(); i++) {
            for (int j = 0; j < g.orden(); j++) {
                double arista = g.costoArista(i, j);
                if(arista!=GrafoMat.inf){
                    if(arista>mayor){
                        mayor=arista;
                    }
                }
            }
        }
        return mayor;
    }
    
    public boolean verticeComplet(Grafo<String,Double> g, String vertice){
        int posVertice=buscarVertice(g, vertice);
        
        if(posVertice!=-1){
            for (int i = 0; i < g.orden(); i++) {
                if(g.costoArista(posVertice, i)==GrafoMat.inf){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public void aislarVertice(Grafo<String,Double> g, String v){
        int pos = buscarVertice(g, v);
        if(pos!=-1){   
            for (int i = 0; i < g.orden(); i++) {
                g.setArista(pos, i, GrafoMat.inf);
                g.setArista(i, pos, GrafoMat.inf);
            }
        }
    }
    
    private int buscarVertice(Grafo<String,Double> g, String v){
        for (int i = 0; i < g.orden(); i++) {
            if(g.obtVertice(i).equals(v)){
                return i;
            }
        }
        return -1;
    }
    
    public Grafo<String,Double> crearGrafo(){
        Grafo<String,Double> grafo=new GrafoMat<>();
        grafo.insVertice("A");
        grafo.insVertice("B");
        grafo.insVertice("C");
        grafo.insVertice("D");
        grafo.insVertice("E");
        
        grafo.insArista(0, 1, 12.0);
        grafo.insArista(0, 2, 8.0);
        grafo.insArista(0, 3, 87.0);
        grafo.insArista(0, 4, 87.0);
        grafo.insArista(1, 4, 11.0);
        grafo.insArista(2, 0, 19.0);
        grafo.insArista(3, 2, 10.0);
        grafo.insArista(3, 1, 23.0);
        grafo.insArista(4, 3, 43.0);
        return grafo;
    }
    
    public void invertirAristasVertice(Grafo<String,Double> g, int v){
        double aux;
        for (int i = 0; i < g.orden(); i++) {
            aux = g.costoArista(i, v);
            g.insArista(i, v, g.costoArista(v, i));
            g.insArista(v, i, aux);   
        }
    }
    
    public boolean aristasVerticeTodasAristas(Grafo<String,Double> g, int v){
        for (int i = 0; i < g.orden(); i++) {
            if(g.costoArista(i, v).equals(GrafoMat.inf) && g.costoArista(v, i).equals(GrafoMat.inf)){
                return false;
            }
        }
        return true;
    }
    
    //hallar antecesores
    public static void main(String[] args) {
        GrafCadenas gra= new GrafCadenas();
        Grafo<String,Double> grafo = gra.crearGrafo();
        //Grafo<String,Double> grafo = gra.generateGrafo(10);
        System.out.println(" "+grafo.mostrar());
        gra.invertirAristasVertice(grafo, 0);
        System.out.println(" "+grafo.mostrar());
        System.out.println(" "+gra.aristasVerticeTodasAristas(grafo, 0));
        for (int i = 0; i < grafo.orden(); i++) {
            Dijkstra d = new Dijkstra(grafo, i);
            System.out.println(" resultado "+Arrays.toString(Dijkstra.d));
        }
        Floyd floyd=new Floyd(grafo);
        System.out.println(" "+floyd.mostrar());
        System.out.println("Ruta...");
        floyd.ruta(0,4);
        
        /*
        System.out.println(" "+grafo.sucesores(0).toString());
        float por=porOcupacion(grafo);
        System.out.println("Ocupacion: "+ por+"%");
        System.out.println("menos salida "+gra.menosSalidas(grafo));
        System.out.println("Arista mayor "+gra.aristaMasCostosa(grafo));
        System.out.println(""+gra.verticeComplet(grafo, "vert 1"));
        */
        /*
        Dfs<String,Double> rec = new Dfs<>();
        Bfs<String,Double> anch = new Bfs<>();
        anch.limpiar();
        rec.limpiar();
        rec.profundidad(grafo, "A");
        System.out.println("--------------");
        anch.anchura(grafo, "A");
        */
    }
}
