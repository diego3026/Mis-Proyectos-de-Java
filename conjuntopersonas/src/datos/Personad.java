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
public class Personad {
    private String nombre;
    private int edad;
    private int documento;

    public Personad(String nombre, int edad, int documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Personad{" + "nombre=" + nombre + ", edad=" + edad + ", documento=" + documento + '}';
    }

    public int CompareTo1(Personad x){
        int res = 0;
        if (this.documento < x.getDocumento()) {
            res = -1;
        }
        if (this.documento > x.getDocumento()) {
            res = 1;
        }
        return res;
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

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the documento
     */
    public int getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
}
