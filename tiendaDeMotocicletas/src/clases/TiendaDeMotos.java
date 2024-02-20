/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class TiendaDeMotos {
    private String nombreDeLaTienda;
    private ArrayList<Motocicleta> inventario;

    public TiendaDeMotos(String nombreDeLaTienda) {
        this.inventario = new ArrayList<>();
        this.nombreDeLaTienda = nombreDeLaTienda;
    }

    public String listaDeMotocicletas(){
        String lista = "";
        
        for (Motocicleta motocicleta : inventario) {
            lista+=motocicleta.toString()+"\n";
        }
        
        return lista;
    }
    
    public void agregarMotocicleta(int numeroDeSerie,int modelo, String marca, long precio) throws Validacion{
        if(buscarMotocicleta(numeroDeSerie)){
            throw new Validacion("El numero de serie de la moto ya esta en uso");
        }else{
            inventario.add(new Motocicleta(numeroDeSerie, modelo, marca, precio));
        }
    }
    
    private boolean buscarMotocicleta(int numeroDeSerie){
        boolean encontrado = false;
        
        for (Motocicleta motocicleta : inventario) {
            if(motocicleta.getNumeroDeSerie() == numeroDeSerie){
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public void actualizarPrecioMotocicleta(int numeroDeSerie,long precioNuevo) throws Validacion{
        
        if(!buscarMotocicleta(numeroDeSerie)){
            throw new Validacion("La motocicleta no esta disponible");
        }
        
        for (Motocicleta motocicleta : inventario) {
            if(motocicleta.getNumeroDeSerie() == numeroDeSerie){
                motocicleta.setPrecio(precioNuevo);
            }
        }        
    }
    
    public void venderMotocicleta(int numeroDeSerie) throws Validacion{        
        
        if(!buscarMotocicleta(numeroDeSerie)){
            throw new Validacion("La motocicleta no esta disponible");
        }
        
        for (int i = 0; i < inventario.size(); i++) {
            Motocicleta get = inventario.get(i);
            if(get.getNumeroDeSerie() == numeroDeSerie){
                inventario.remove(get);
            }
        }
    }
    
    public String getNombreDeLaTienda() {
        return nombreDeLaTienda;
    }

    public void setNombreDeLaTienda(String nombreDeLaTienda) {
        this.nombreDeLaTienda = nombreDeLaTienda;
    }

    public ArrayList<Motocicleta> getMotocicletas() {
        return inventario;
    }  
}
