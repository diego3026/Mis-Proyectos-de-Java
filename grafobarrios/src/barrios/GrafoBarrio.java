/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barrios;

import datos.Grafo;
import datos.GrafoMatriz;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class GrafoBarrio {
    
    public String barriosParaVisitar(Grafo<String,Double> g, String v){
        String listar = "";
        int pos = buscarPosVertice(g, v);
        ArrayList<String> barrios = g.sucesores(pos);
        
        if(pos!=-1){
            for (int i = 0; i < barrios.size(); i++) {
                listar+=" "+barrios.get(i)+" ";
            }
        }
        return listar;
    }
    
    public String barrioMasSalidas(Grafo<String,Double> g){
        int mayor=-1;
        String barrioMS="";//barrio mas salidas
        for (int i = 0; i < g.orden(); i++) {
            if(g.sucesores(i).size()>mayor){
                mayor=g.sucesores(i).size();
                barrioMS=g.obtVertice(i);
            }
        }
        return barrioMS;
    }
    
    public void aislarBarrio(Grafo<String,Double> g, String v){
        int pos = buscarPosVertice(g, v);
        if(pos!=-1){   
            for (int i = 0; i < g.orden(); i++) {
                g.modificarArista(pos, i, GrafoMatriz.inf);
                g.modificarArista(i, pos, GrafoMatriz.inf);
            }
        }
    }
    
    private int buscarPosVertice(Grafo<String, Double> g, String v) {
        for (int i = 0; i < g.orden(); i++) {
            if(g.obtVertice(i).equals(v)){
                return i;
            }
        }
        return -1;
    }
    
    public Grafo<String,Double> crearGrafo(){
        Grafo<String,Double> grafo=new GrafoMatriz<>();
        grafo.insVertice("B1");
        grafo.insVertice("B2");
        grafo.insVertice("B3");
        grafo.insVertice("B4");
        grafo.insVertice("B5");
        grafo.insVertice("B6");
        grafo.insVertice("B7");
        grafo.insVertice("B8");
        grafo.insVertice("B9");
        grafo.insVertice("B10");
      
        grafo.insArista(0, 1, 5.0);
        grafo.insArista(0, 2, 8.0);
        grafo.insArista(0, 7, 20.0);
        grafo.insArista(1, 6, 15.0);
        grafo.insArista(2, 3, 25.0);
        grafo.insArista(2, 5, 9.0);
        grafo.insArista(3, 0, 12.0);
        grafo.insArista(3, 7, 9.0);
        grafo.insArista(3, 4, 3.0);
        grafo.insArista(4, 7, 6.0);
        grafo.insArista(5, 3, 7.0);
        grafo.insArista(6, 3, 4.0);
        grafo.insArista(6, 7, 18.0);
        grafo.insArista(6, 9, 10.0);
        grafo.insArista(7, 8, 5.0);
        grafo.insArista(7, 6, 10.0);
        grafo.insArista(8, 5, 13.0);
        grafo.insArista(9, 7, 7.0);
        grafo.insArista(9, 8, 17.0);
        
        return grafo;
    }
    
    public static void main(String[] args) {
        GrafoBarrio gra = new GrafoBarrio();
        Grafo<String, Double> grafo = gra.crearGrafo();
        Floyd floyd = new Floyd(grafo);
        //mostrar
        System.out.println(" "+grafo.mostrar());
        //barrio mas salidas
        System.out.println("El barrio con mas salidas es: "+gra.barrioMasSalidas(grafo));
        //aislar barrio
        gra.aislarBarrio(grafo, "B1");
        System.out.println("\n"+grafo.mostrar());
        //Barrios a visitar dado un barrio
        System.out.println("Desde el barrio b7 se puede visitar: "+gra.barriosParaVisitar(grafo, "B7"));

        //hallar ruta y costo minimo

        System.out.println("\npasa por los barrios: ");
        //posiciones de los barrios
        //0=B1 1=B2 2=B3 3=B4 4=B5 5=B6 6=B7 7=B8 8=B9 9=B10");
        floyd.ruta(grafo,9, 2);
        double costo = floyd.costoRuta(9, 2);//guardamos el costo
        System.out.println("costo de la carrera es: "+costo*2000);
    }
}
