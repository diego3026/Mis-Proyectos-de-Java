/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import clases.Producto;
import java.util.*;

/**
 *
 * @author asus
 */
public class Inventario {
    private List<Producto> inventario;
    
    public Inventario(){
        inventario = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto){
        inventario.add(producto);
    }
    
    public boolean editarProducto(Producto productoNuevo, int idProducto){
        boolean editado = false;
        int indiceList;
        
        for (int i = 0; i < inventario.size(); i++) {
            Producto get = inventario.get(i);
            if(get.getIdProducto() == idProducto){
                indiceList = i;
                inventario.set(indiceList, productoNuevo);
                editado = true;
            }
        }
        return editado;
    }
    
    public boolean borrarProducto(Producto productoBorrar, int idProducto){
        boolean borrado = false;
        int indiceList;
        
        for (int i = 0; i < inventario.size(); i++) {
            Producto get = inventario.get(i);
            if(get.getIdProducto() == idProducto){
                indiceList = i;
                inventario.remove(indiceList);
                borrado = true;
            }
        }
        return borrado;
    }
    
}
