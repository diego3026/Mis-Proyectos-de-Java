/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Videojuego implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;
    
    @Override
    public String toString(){
        return "Videojuego->{titulo: "+this.titulo+",horas estimadas: "+this.horasEstimadas+",genero: "+this.genero+",compañia: "+this.compañia+",entregado: "+this.entregado+"}";
    }
    
    public Videojuego(){
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }
    
    public Videojuego(String titulo, int horasEstimadass){
        this.horasEstimadas = horasEstimadass;
        this.titulo = titulo;
        this.entregado = false;
        this.genero = "";
        this.compañia = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
    
}
