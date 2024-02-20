/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import datos.Alumno;
import datos.ArbinAlumno;
import datos.ArbinDeAlumnos;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Prueba {
    public static void main(String[] args) {
        ArbinDeAlumnos arb = new ArbinDeAlumnos();
        ArbinAlumno<Alumno> raiz = arb.crearArbol();
        arb.inOrden(raiz);
        String cb=JOptionPane.showInputDialog("Cedula a buscar:");
        int cob=Integer.parseInt(cb);
        boolean v=arb.buscarCedula(raiz, cob);
        if(v==true){
            JOptionPane.showMessageDialog(null, "Cedula encontrada");
        }else{
            JOptionPane.showMessageDialog(null, "Cedula no encontrada");
        }
    }
}
