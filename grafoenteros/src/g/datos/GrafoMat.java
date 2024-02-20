/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g.datos;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class GrafoMat<V,A> implements Grafo<V, A>{
    private ArrayList<V> vertices;
    Object aristas[][];
    public static double inf = 999999;

    public GrafoMat() {
        vertices = new ArrayList<>();
        aristas = new Object[100][100];
        for (int i = 0; i < aristas.length; i++) {
            for (int j = 0; j < aristas.length; j++) {
                if(i==j){
                    aristas[i][j]=0.0;
                }else{
                    aristas[i][j]=inf;
                }
            }
        }
    }
    
    @Override
    public void insVertice(V x) {
        vertices.add(x);
    }

    @Override
    public V obtVertice(int pos) {
        return vertices.get(pos);
    }

    @Override
    public void insArista(int vi, int vf, A costo) {
        aristas[vi][vf]=costo;
    }
   
    @Override
    public void modificarArista(int vi, int vf, A costo) {
        aristas[vi][vf]=costo;
    }

    @Override
    public A obtArista(int vi, int vf) {
        return (A) aristas[vi][vf];
    }

    @Override
    public int orden() {
        return vertices.size();
    }

    @Override
    public String mostrar() {
        String lis="";
        lis+=""+vertices.toString()+"\n";
        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < vertices.size(); j++) {
                lis+=" ["+aristas[i][j]+"] ";
            }
            lis+="\n";
        }
        return lis;
    }

    @Override
    public ArrayList<V> sucesores(int v) {
        ArrayList<V> suce = new ArrayList<>();
        for (int i = 0; i < orden(); i++) {
            if(v!=i && !aristas[v][i].equals(inf)){
                suce.add(obtVertice(i));
            }
        }
        return suce;
    }
}
