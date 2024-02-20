/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//interface grafica de usuario

import datos.Alumno;
import datos.EdadComparator;
import datos.Universidad;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Menu {
    public static void main(String[] args){
        new Menu().menu();
    }
    public void menu(){
        String men="\n1.Agregar alumno  \n2.Listar  \n3.Eliminar  \n4.Buscar  \n5.Ordenar por codigo \n6.Ordenar por nombre \n7.Ordenar edad  \n8.Ordenar promedios \n9.Borrar por FBRA \n10.Ordenar por nombre profe \n11.Busqueda lineal \n12.Salir";
        Universidad uni=new Universidad();
        
        fin:do {            
            String m=JOptionPane.showInputDialog(men);
            int op=Integer.parseInt(m);
            switch (op){
                case 1:
                    String co=JOptionPane.showInputDialog("Codigo ");
                    int cod=Integer.parseInt(co);
                    
                    String nom=JOptionPane.showInputDialog("Nombre ");
                    
                    String ed=JOptionPane.showInputDialog("Edad ");
                    int edad=Integer.parseInt(ed);
                    
                    String pr=JOptionPane.showInputDialog("Promedio ");
                    float prom=Float.parseFloat(pr);
                    
                    String car=JOptionPane.showInputDialog("Carrera ");
                    
                    Alumno al=new Alumno(cod, nom, edad, prom, car);
                    uni.addAlumno(al);
                    JOptionPane.showMessageDialog(null, "Alumno creado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, uni.listar());
                    break;
                case 3:
                    String el=JOptionPane.showInputDialog("Codigo de alumno a eliminar ");
                    int eli=Integer.parseInt(el);
                    uni.eliminarAlumno(eli);
                    JOptionPane.showMessageDialog(null, "Alumno eliminado");
                    break;
                case 4:
                    String bu=JOptionPane.showInputDialog("Nombre de alumno a buscar ");
                    JOptionPane.showMessageDialog(null,uni.buscar(bu));
                    break;
                case 5:
                    uni.burbuja();
                    break;
                case 6:
                    uni.ordenarPorNombre();
                    break;
                case 7:
                    uni.ordenarPorEdad();
                    break;
                case 8:
                    uni.ordenarPromedio();
                    break;
                case 9: 
                    uni.borrarAlumnFBRA();
                    break;
                case 10:
                    String nombre=JOptionPane.showInputDialog("digita nombre a buscar");
                    Alumno x = uni.buscarNombre(nombre);
                    if(x==null){
                        JOptionPane.showMessageDialog(null, "Alumno no encontrado");
                    }else{
                        JOptionPane.showMessageDialog(null, x.toString());
                    }
                    break;
                case 11:
                    String cb=JOptionPane.showInputDialog("codigo a buscar");
                    int cob=Integer.parseInt(cb);
                    JOptionPane.showMessageDialog(null,"el alumno esta en la posicio: "+uni.busquedaBinaria(cob));
                    break;
                case 12:
                    break fin;
            }     
        } while (true);
    }
}