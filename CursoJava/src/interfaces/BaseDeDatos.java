/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author asus
 */
public interface BaseDeDatos {
    int MAXIMO_DATOS=10;
    
    void insertar();  
    void listar();
    void actualizar();
    void eliminar(); 
}
