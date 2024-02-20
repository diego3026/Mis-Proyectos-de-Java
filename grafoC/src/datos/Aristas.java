/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author asus
 */
class Aristas<V, A> {
    private V sucesor;
    private A costo;

    public Aristas(V sucesor, A costo) {
        this.sucesor = sucesor;
        this.costo = costo;
    }

    /**
     * @return the sucesor
     */
    public V getSucesor() {
        return sucesor;
    }

    /**
     * @param sucesor the sucesor to set
     */
    public void setSucesor(V sucesor) {
        this.sucesor = sucesor;
    }

    /**
     * @return the costo
     */
    public A getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(A costo) {
        this.costo = costo;
    }
    
    
}
