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
public class Carrera implements Comparable<Carrera>{
    private int codigo;
    private String nombre;
    private int semestres;
    private int creditos;

    public Carrera(int codigo, String nombre, int semestres, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestres = semestres;
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", semestres=" + semestres + ", creditos=" + creditos + '}';
    }

    /**
     * @return the semestres
     */
    public int getSemestres() {
        return semestres;
    }

    /**
     * @param semestres the semestres to set
     */
    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    int comparador(Carrera aux) {
        int res=0;
        if(this.codigo<aux.getCodigo()){
            res=-1;
        }
        if(this.codigo>aux.getCodigo()){
            res=1;
        }
        return res;
    }    

    @Override
    public int compareTo(Carrera o) {
        return this.nombre.compareTo(o.nombre);
    }
    
}
