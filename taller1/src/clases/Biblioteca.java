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
public class Biblioteca {
    private String nombreDeBiblioteca;
    private Libro[] libros = new Libro[100];
    private Usuario[] usuarios = new Usuario[100];
    private int cantidadDeLibros=0;
    private int cantidadUsuarios=0;
   
    public Biblioteca(String nombreDeBiblioteca) {
        this.nombreDeBiblioteca = nombreDeBiblioteca;
    }
    
    public void añadirLibro(Libro libro){
        this.libros[cantidadDeLibros]=libro;
        this.cantidadDeLibros++;
    }
    
    public void agregarUsuario(Usuario user){
        usuarios[cantidadUsuarios]=user;
        cantidadUsuarios++;
    }
    
    public String getNombreDeBiblioteca() {
        return nombreDeBiblioteca;
    }

    public void setNombreDeBiblioteca(String nombreDeBiblioteca) {
        this.nombreDeBiblioteca = nombreDeBiblioteca;
    }

    public Libro[] getLibros() {
        return libros;
    }
    
    public Libro obtLibro(int pos){
        return this.libros[pos];
    }
    
    public Usuario obtUsuario(int pos){
        return usuarios[pos];
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public int getCantidadDeLibro() {
        return this.cantidadDeLibros;
    }

    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }
    
    public void añadirCantidadUsuarios(int cantidadUsuarios) {
        this.cantidadUsuarios += cantidadUsuarios;
    }
    
    public void añadirCantidadLibros(int cantidadLibros) {
        this.cantidadDeLibros += cantidadLibros;
    }

    public void setLibros(int pos,Libro libro) {
        this.libros[pos] = libro;
    }

    public void setUsuarios(int pos,Usuario usuario) {
        this.usuarios[pos] = usuario;
    }
    
}
