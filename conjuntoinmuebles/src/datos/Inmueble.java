/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Estudiante
 */
public class Inmueble implements Comparable<Inmueble>{
    private int codigo;
    private String direccion;
    private int año;
    private String tipo;
    private float precio;

    public Inmueble(int codigo, String direccion, int año, String tipo, float precio) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.año = año;
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "codigo=" + codigo + ", direccion=" + direccion + ", a\u00f1o=" + año + ", tipo=" + tipo + ", precio=" + precio + '}';
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
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int compareTo(Inmueble o) {
        int res = 0;
        if (this.codigo < o.getCodigo()) {
            res = -1;
        }
        if (this.codigo > o.getCodigo()) {
            res = 1;
        }
        return res;
    }
    
}
