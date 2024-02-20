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
public class Hotel implements Comparable<Hotel>{
    private String nombre;
    private String direccion;
    private int estrellas;
    private String ciudad;

    public Hotel(String nombre, String direccion, int estrellas, String ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", direccion=" + direccion + ", estrellas=" + estrellas + ", ciudad=" + ciudad + '}';
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the estrellas
     */
    public int getEstrellas() {
        return estrellas;
    }

    /**
     * @param estrellas the estrellas to set
     */
    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }  

    @Override
    public int compareTo(Hotel o) {
        return this.nombre.compareTo(o.nombre);
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    int comparador(Hotel aux) {
        return this.nombre.compareTo(aux.nombre);
        
    }

    int comparador1(String dir) {
        return this.nombre.compareTo(dir);
    }
}
