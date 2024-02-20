/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ESTUDIANTE
 */
public class Usuario {
    private String nombre;
    private String Email;
    private Libro[] librosPrestados = new Libro[100];    
    private Libro[] AntiguoslibrosPrestados = new Libro[100];
    private int cantidadDeLibrosPrestados=0;    
    private int AntiguaCantidadDeLibrosPrestados=0;


    public Usuario(String nombre, String Email) {
        this.nombre = nombre;
        this.Email = Email;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Libro[] getLibrosPrestados() {
        return librosPrestados;
    }

    public int getCantidadDeLibrosPrestados() {
        return cantidadDeLibrosPrestados;
    }

    public void sumarCantidadDeLibrosPrestados(int cantidadDeLibrosPrestados) {
        this.cantidadDeLibrosPrestados += cantidadDeLibrosPrestados;
    }

    public void sumarAntiguaCantidadDeLibrosPrestados(int AntiguaCantidadDeLibrosPrestados) {
        this.AntiguaCantidadDeLibrosPrestados += AntiguaCantidadDeLibrosPrestados;
    }
    
    
    public void añadirListaDeLibrosPrestados(Libro libro){
        librosPrestados[cantidadDeLibrosPrestados]=libro;
        this.cantidadDeLibrosPrestados++;
    }
    
    public void EliminarLibroPrestado(String titulo,String autor,int isbn){
        int contador = 0;
        for (int i = 0; i < cantidadDeLibrosPrestados; i++) {
            if (librosPrestados[i].getTitulo().equals(titulo) && librosPrestados[i].getAutor().equals(autor) && isbn==librosPrestados[i].getISBN()){
                if(contador == 0){
                    AntiguoslibrosPrestados[AntiguaCantidadDeLibrosPrestados] = librosPrestados[i];
                    AntiguaCantidadDeLibrosPrestados++;
                    contador=-1;
                }
                Libro aux = librosPrestados[i];
                librosPrestados[i]= librosPrestados[i+1];
                librosPrestados[i+1]=aux;
            }
        }
    }

    public Libro[] getAntiguoslibrosPrestados() {
        return AntiguoslibrosPrestados;
    }

    public int getAntiguaCantidadDeLibrosPrestados() {
        return AntiguaCantidadDeLibrosPrestados;
    }
    
    
    
}
