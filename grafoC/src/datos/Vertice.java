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
class Vertice<V, A> {
    private V vertice;
    private ArrayList<Aristas<V,A>> aristas = new ArrayList<>();

    public Vertice(V vertice) {
        this.vertice = vertice;
    }

    /**
     * @return the vertice
     */
    public V getVertice() {
        return vertice;
    }

    /**
     * @param vertice the vertice to set
     */
    public void setVertice(V vertice) {
        this.vertice = vertice;
    }

    /**
     * @return the aristas
     */
    public ArrayList<Aristas<V,A>> getAristas() {
        return aristas;
    }
}
