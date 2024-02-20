/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import clases.Biblioteca;
import clases.Libro;
import clases.Usuario;


public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        Biblioteca biblio = new Biblioteca("roblo");
        main.agregarLibro("diego", "d1", 0, 1, biblio);
        main.agregarLibro("blue", "xd", 1, 3, biblio);        
        main.agregarLibro("odisea", "german", 2, 2, biblio);
        
        Usuario user = new Usuario("david","donate");
        main.agregarUsuario(user, biblio);
        main.prestarLibro("blue", "xd", 1, user, biblio);
        
        System.out.println(main.consultarLibrosPrestados(user, biblio));
        
        System.out.println("-----------------");
        System.out.println(main.consultarLibros(biblio));
        
        main.devolverLibro("blue", "xd", 1, user, biblio);
        System.out.println("-----------------");
        System.out.println(main.consultarLibros(biblio));
        
        System.out.println(main.consultarLibrosUsuario(user, biblio));

        
    }
    
    void agregarLibro(String titulo, String autor, int isbn, int cantidad,Biblioteca biblio){
        Libro libro = new Libro(titulo, autor, isbn,cantidad);
        
        if(validarLibro(titulo,autor,isbn,biblio)){
            biblio.añadirLibro(libro);
        }else{
            for (int i = 0; i < biblio.getCantidadDeLibro(); i++) {
                if (biblio.obtLibro(i).getTitulo().equals(titulo) && biblio.obtLibro(i).getAutor().equals(autor) && biblio.obtLibro(i).getAutor().equals(isbn)){
                   biblio.obtLibro(i).sumarCantidad(cantidad);
                }
            }
        }
    }
    
    public void devolverLibro(String titulo, String autor, int isbn, Usuario user,Biblioteca biblio){
        Libro[] librosPrestadosPorUsuario = user.getLibrosPrestados();
        int posicionDelLibro=-1;
        
        for (int i = 0; i < user.getCantidadDeLibrosPrestados(); i++) {
            if (!librosPrestadosPorUsuario[i].getTitulo().equals(titulo) && !librosPrestadosPorUsuario[i].getAutor().equals(autor) && !librosPrestadosPorUsuario[i].getAutor().equals(isbn)){
                System.err.println("El libro no esta en la lista del usuario");
            }else{
                posicionDelLibro = i;
            }
        }
        biblio.añadirLibro(librosPrestadosPorUsuario[posicionDelLibro]);
        user.EliminarLibroPrestado(titulo, autor, isbn);
        user.sumarCantidadDeLibrosPrestados(-1);
    }
    
    public void agregarUsuario(Usuario user,Biblioteca biblio){
        biblio.agregarUsuario(user);
    } 
    
    public String consultarLibros(Biblioteca biblio){
        String libros ="Libros en biblioteca -> ";
        
        for (int i = 0; i < biblio.getCantidadDeLibro(); i++) {
            libros += "\n titulo: "+biblio.getLibros()[i].getTitulo();
        }
        libros+="\nLibros prestados ->";
        for (int i = 0; i < biblio.getCantidadUsuarios(); i++) {
            Usuario usuario = biblio.getUsuarios()[i];
            Libro[] librosPrestados= usuario.getLibrosPrestados();
            for (int j = 0; j < usuario.getCantidadDeLibrosPrestados(); j++) {
                libros += "\n titulo: "+librosPrestados[i].getTitulo();
            }
        }
        return libros;
    } 
    
    public String consultarLibrosPrestados(Usuario user,Biblioteca biblio){
        
        String libros = "";
        for (int i = 0; i < biblio.getCantidadUsuarios(); i++) {
            if (user.getNombre().equals(biblio.getUsuarios()[i].getNombre()) && user.getEmail().equals(biblio.getUsuarios()[i].getEmail())){
                libros = "\nLibros prestados por el usuario->";
                Libro[] librosPrestados= biblio.getUsuarios()[i].getLibrosPrestados();
                for (int j = 0; j < biblio.getUsuarios()[i].getCantidadDeLibrosPrestados(); j++) {
                    libros += "\n titulo: "+librosPrestados[i].getTitulo();
                }
            }else{
                libros = "\nUsuario no tiene libros prestados";
            }
        }
        
        return libros;
    } 
    
    public String consultarLibrosUsuario(Usuario user,Biblioteca biblio){
        
        String libros = "";
        for (int i = 0; i < biblio.getCantidadUsuarios(); i++) {
            if (user.getNombre().equals(biblio.getUsuarios()[i].getNombre()) && user.getEmail().equals(biblio.getUsuarios()[i].getEmail())){
                libros = "\nLibros que han sido prestados por el usuario->";
                Libro[] antiguosLibrosPrestados = biblio.getUsuarios()[i].getAntiguoslibrosPrestados();
                System.out.println(antiguosLibrosPrestados[0].getTitulo());
                for (int j = 0; j < biblio.getUsuarios()[i].getAntiguaCantidadDeLibrosPrestados(); j++) {
                    libros += "\n titulo: "+antiguosLibrosPrestados[i].getTitulo();
                }
            }else{
                libros = "\nUsuario no ha prestado ningun libro";
            }
        }
        return libros;
    } 
    
    public void prestarLibro(String titulo, String autor, int isbn, Usuario user,Biblioteca biblio){
        if(user!=null){
            if(buscarLibro(titulo,autor,isbn,biblio)){
                int posicionLibro = obtenerLibro(titulo, autor, isbn,biblio);
                if(posicionLibro!=-1){
                    user.añadirListaDeLibrosPrestados(biblio.obtLibro(posicionLibro));
                    System.out.println("El libro ha sido prestado exitosamente");
                }
                eliminarLibro(titulo,autor,isbn,biblio);
            }else{
                System.err.println("El libro no esta disponible");
            }
        }
    }
    
    //metodos aparte

    public boolean buscarLibro(String titulo, String autor, int isbn,Biblioteca biblio) {
        for (int i = 0; i < biblio.getCantidadDeLibro(); i++) {
            if (biblio.obtLibro(i).getTitulo().equals(titulo) && biblio.obtLibro(i).getAutor().equals(autor) && isbn==biblio.obtLibro(i).getISBN()){
                return true;
            }
        }
        return false;
    }
    
    public int obtenerLibro(String titulo, String autor, int isbn,Biblioteca biblio) {
        for (int i = 0; i < biblio.getCantidadDeLibro(); i++) {
            if (biblio.obtLibro(i).getTitulo().equals(titulo) && biblio.obtLibro(i).getAutor().equals(autor) && isbn==biblio.obtLibro(i).getISBN()){
                return i;
            }
        }
        return -1;
    }

    public void eliminarLibro(String titulo, String autor, int isbn,Biblioteca biblio) {
        for (int i = 0; i < biblio.getCantidadDeLibro(); i++) {
            if (biblio.obtLibro(i).getTitulo().equals(titulo) && biblio.obtLibro(i).getAutor().equals(autor) && isbn==biblio.obtLibro(i).getISBN()){
                Libro aux = biblio.obtLibro(i);
                biblio.setLibros(i, biblio.obtLibro(i+1));
                biblio.setLibros(i+1, aux);
            }
        }
        biblio.añadirCantidadLibros(-1);
        
    }
    
    public boolean validarLibro(String titulo, String autor, int isbn,Biblioteca biblio) {    
        if(biblio.getCantidadDeLibro()==0){
            return true;
        }else{
            for (int i = 0; i < biblio.getCantidadDeLibro(); i++) {
                if (biblio.obtLibro(i).getTitulo().equals(titulo) && biblio.obtLibro(i).getAutor().equals(autor) && biblio.obtLibro(i).getAutor().equals(isbn)){
                    return false;
                }
            } 
        }
        return true;
    }
    
}


