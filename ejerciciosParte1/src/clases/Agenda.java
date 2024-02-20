/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Agenda {
    Contacto[] contactos;
    
    public Agenda(int cantidadContactos){
        contactos = new Contacto[cantidadContactos];
    }
    
    public Agenda(){
        contactos = new Contacto[10];
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }
    
    public void añadirContacto(Contacto contacto){
        boolean añadido = false;
        if(existeContacto(contacto)){
            System.out.println("El contacto ya existe");
        }else if (agendaLlena()){
            System.out.println("La agenda esta llena");
        }else{
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i]==null){
                    contactos[i] = contacto;
                    añadido=true;
                }
            }
            if (añadido){
                System.out.println("El contacto ha sido añadido");
            }else{
                System.out.println("El contacto no ha sido añadido");
            }
        }
    }
    
    public void listarContactos(){
        for (Contacto contacto : contactos) {
            if (contacto != null){
                System.out.println(contacto.toString());
            }
        }
    }
    
    public boolean buscarContacto(String nombre){
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }
    
    public void eliminarContacto(Contacto c){
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].getNombre().equals(c.getNombre())){
                Contacto aux = contactos[i];
                contactos[i] = contactos[i+1];
                contactos[i+1] = aux;
            }
        }
        contactos[contactos.length-1] = null;
    }
    
    public int huecosLibres(){
        int contadorDeHuecosLibres = 0;
        
        for (Contacto contacto : contactos) {
            if (contacto==null){
                contadorDeHuecosLibres++;
            }
        }
        return contadorDeHuecosLibres;
    }
    

    public boolean existeContacto(Contacto c) {
        for (Contacto contacto : contactos) {
            if(contacto!=null && contacto.getNombre().equalsIgnoreCase(c.getNombre())){
                return true;
            }
        }
        return false;
    }

    private boolean agendaLlena() {
        for (Contacto contacto : contactos) {
            if (contacto == null){
                return false;
            }
        }
        return true;
    }
}
