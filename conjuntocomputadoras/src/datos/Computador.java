/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author ESTUDIANTE
 */
public class Computador implements Comparable<Computador>{
    private String marca;
    private int referencia;
    private int precio;

    public Computador(String marca, int referencia, int precio) {
        this.marca = marca;
        this.referencia = referencia;
        this.precio = precio;
    }


    
    @Override
    public String toString() {
        return "Computador{" + "marca=" + marca + ", referencia=" + getReferencia() + ", precio=" + getPrecio() + '}';
    }
    
    public int comparador(Computador p) {
        int res = 0;
        if (this.referencia < p.getReferencia()) {
            res = -1;
        }
        if (this.referencia > p.getReferencia()) {
            res = 1;
        }
        return res;
    }
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the referencia
     */
    

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Computador t) {
        return this.marca.compareTo(t.marca);
    }

    /**
     * @return the referencia
     */
    public int getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the precio
     */
    
    
}
