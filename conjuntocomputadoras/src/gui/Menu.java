/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.Computador;
import datos.Computadores;
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
        String men="\n1.Agregar pc  \n2.Listar  \n3.Ordenar por referencia  \n4.Ordenar por marca  \n5.Ordenar por precio \n6.Ordenar referencia por IS \n7.Salir ";
        Computadores pc=new Computadores();
        
        fin:do {            
            String m=JOptionPane.showInputDialog(men);
            int op=Integer.parseInt(m);
            switch (op){
                case 1:
                    String ma=JOptionPane.showInputDialog("Marca ");
                    
                    String ref=JOptionPane.showInputDialog("Referencia ");
                    int re=Integer.parseInt(ref);
                            
                    String pre=JOptionPane.showInputDialog("Precio ");
                    int pr=Integer.parseInt(pre);
                    
                    Computador co=new Computador(ma, re, pr);
                    pc.addComputador(co);
                    JOptionPane.showMessageDialog(null, "Computador agregado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, pc.listar());
                    break;
                case 3:
                    pc.burbuja();
                    break;
                case 4:
                    pc.ordenarMarca();
                    break;
                case 5:
                    pc.ordenarPrecio();
                    break;
                case 6:
                    pc.inserccionsort();
                    break;
                case 7:    
                    break fin;
            }     
        } while (true);
    }
}
