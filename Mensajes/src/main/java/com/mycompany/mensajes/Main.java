/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MensajeDao mensajeDao = new MensajeDao();
        /*
        Mensaje msn = new Mensaje("Hola desde Main", "main");
        int registro = mensajeDao.insertar(msn);
        System.out.println("Se inserto " + registro + "registro");
         */
        
        Mensaje msnEdit = new Mensaje(4, "Hola desde java web", "java web");
        int editado = mensajeDao.editar(msnEdit);
        System.out.println("Se ha editado " + editado + " registro");
        
        List<Mensaje> mensajes = mensajeDao.seleccionar();

        for (Object mensaje : mensajes) {
            System.out.println(mensaje);
        } 
        
        Mensaje msnEliminar = new Mensaje(5);
        int eliminado = mensajeDao.eliminar(msnEliminar);
        mensajes = mensajeDao.seleccionar();
        System.out.println("Se ha eliminado " + eliminado + " registro");

        for (Object mensaje : mensajes) {
            System.out.println(mensaje);
        } 
        
    }
}
