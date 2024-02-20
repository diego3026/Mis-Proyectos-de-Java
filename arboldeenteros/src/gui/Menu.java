/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.ArbolEnt;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Menu {
    public static void main(String[] args) {
        new Menu().menu();
    }
    
    public void menu(){
        String men="1.Agregar\n2.mostrar\n3.Eliminar\n4.Buscar\n5.mayor\n6.salir";
        ArbolEnt a=new ArbolEnt();
        
        fin:do {
            String m=JOptionPane.showInputDialog(men);
            int op = Integer.parseInt(m);
            switch(op){
                case 1:
                    String ag=JOptionPane.showInputDialog("ingresar valor a agregar: ");
                    int agr = Integer.parseInt(ag);
                    a.insertar(agr);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,a.inorden(a.getRaiz()));
                    break;
                case 3:
                    String el = JOptionPane.showInputDialog("ingresar valor a eliminar: ");
                    int eli = Integer.parseInt(el);
                    a.eliminar(eli);
                    JOptionPane.showMessageDialog(null, "valor eliminado");
                    break;
                case 4:
                    String bu = JOptionPane.showInputDialog("ingresar valor a buscar: ");
                    int bus = Integer.parseInt(bu);
                    if(a.buscar(bus)==false){
                        JOptionPane.showMessageDialog(null, "el valor no esta");
                    }else{
                        JOptionPane.showMessageDialog(null, "valor si esta");
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "el numero mayor es: "+a.mayor(a.getRaiz()).obtener());
                    break;
                case 6: 
                    break fin;
            }
        } while (true);
    }
}
