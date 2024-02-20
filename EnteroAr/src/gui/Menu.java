/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.ArbolEnteros;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Menu {
    public static void main(String[] args) {
        new Menu().menu();
    }
    
    public void menu(){
        String men="1.Agregar\n 2.mostrar\n 3.Eliminar\n 4.Buscar\n 5.mayor \n6.salir";
        ArbolEnteros a=new ArbolEnteros();
        fin:do {
            String m=JOptionPane.showInputDialog(men);
            int op = Integer.parseInt(m);
            switch(op){
                case 1:
                    String ag=JOptionPane.showInputDialog("ingresar valor a agregar: ");
                    int agr = Integer.parseInt(ag);
                    a.insertar(agr);
                case 2:
                    a.inorden(a.getRaiz());
                case 3:
                    String el = JOptionPane.showInputDialog("ingresar valor a eliminar: ");
                    int eli = Integer.parseInt(el);
                    a.eliminar(eli);
                case 4:
                    String bu = JOptionPane.showInputDialog("ingresar valor a buscar: ");
                    int bus = Integer.parseInt(bu);
                    if(a.buscar(bus)){
                        JOptionPane.showMessageDialog(null, "el valor si esta");
                    }else{
                        JOptionPane.showMessageDialog(null, "valor no encontrado");
                    }
                case 5:
                    
                case 6: 
                    break fin;
            }
        } while (true);
    }
}
