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
public class GrafoDinam<V,A> implements Grafo<V, A>{
    ArrayList<Vertice<V,A>> vertices = new ArrayList<>();
    
    @Override
    public void insVertice(V x) {
        vertices.add(new Vertice<>(x));
    }

    @Override
    public V obtVertice(int pos) {
        if(pos>=0 && pos<=vertices.size()){
            return vertices.get(pos).getVertice();
        }
        return null;
    }

    @Override
    public void insArista(V verticeInicial, V verticeFinal, A costo) {
        int posInicial = obtPosicion(verticeInicial);
        int posFinal = obtPosicion(verticeFinal);
        V verticeA = obtVertice(posFinal);
        vertices.get(posInicial).getAristas().add(new Aristas<>(verticeA, costo));
    }

    @Override
    public void modificarArista(V verticeInicial, V verticeFinal, A costo) {
        int posInicial = obtPosicion(verticeInicial);
        int posFinal = obtPosicion(verticeFinal);
        V verticeF = obtVertice(posFinal);
        ArrayList<Aristas<V,A>> aristas = vertices.get(posInicial).getAristas();
        for (int i = 0; i < aristas.size(); i++) {
            if(aristas.get(i).getSucesor().equals(verticeF)){
                aristas.set(i, new Aristas<>(verticeF,costo));
            }
        }
    }

    @Override
    public A obtArista(int vi, int vf) {
        V verticeF = obtVertice(vf);
        ArrayList<Aristas<V,A>> aristas = vertices.get(vi).getAristas();
        for (int i = 0; i < aristas.size(); i++) {
            if(aristas.get(i).getSucesor().equals(verticeF)){
                return aristas.get(i).getCosto();
            }
        }
        return null;
    }

    @Override
    public int orden() {
        return vertices.size();
    }

    @Override
    public String mostrar() {
        String lis = "";
        for (int i = 0; i < vertices.size(); i++) {
            lis+=""+vertices.get(i).getVertice()+"[";
            ArrayList<Aristas<V,A>> arista = vertices.get(i).getAristas();
            for (int j = 0; j < arista.size(); j++) {
                lis+="("+arista.get(j).getSucesor()+","+arista.get(j).getCosto()+");";
            }
            lis+="]\n";
        }
        return lis;
    }

    @Override
    public ArrayList<V> sucesores(int pos) {
        ArrayList<V> suce = new ArrayList<>();
        ArrayList<Aristas<V,A>> aristas = vertices.get(pos).getAristas();
        for (int i = 0; i < aristas.size(); i++) {
            suce.add(aristas.get(i).getSucesor());
        }
        return suce;
    }

    private int obtPosicion(V vert) {
        for (int i = 0; i < vertices.size(); i++) {
            if(vertices.get(i).getVertice().equals(vert)){
                return i;
            }
        }
        return -1;
    }    
}
