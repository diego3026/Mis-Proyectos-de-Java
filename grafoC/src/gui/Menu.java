/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import grafodecadenas.GrafoCadena;
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
        String men = "1.Ingresar Vertice \n2.Ingresar Arista \n3.Mostrar \n4.Modificar Arista \n5.Salir";
        GrafoCadena gra = new GrafoCadena();
        fin:do {            
            int op = Integer.parseInt(JOptionPane.showInputDialog(men));
            switch(op){
                case 1:
                    String vertice = JOptionPane.showInputDialog("Vertice a ingresar:");
                    gra.insertarVertice(vertice);
                    break;
                case 2:
                    String VertInicial = JOptionPane.showInputDialog("vertice inicial: ");
                    String vertFinal = JOptionPane.showInputDialog("vertice final: ");
                    double costo = Double.parseDouble(JOptionPane.showInputDialog("costo:"));
                    gra.insertarArista(VertInicial, vertFinal, costo);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, gra.mostrar());
                    break;
                case 4:
                    String VerticeInicial = JOptionPane.showInputDialog("vertice inicial: ");
                    String verticeFinal = JOptionPane.showInputDialog("vertice final: ");
                    double costoM = Double.parseDouble(JOptionPane.showInputDialog("costo a modificar:"));
                    gra.insertarArista(VerticeInicial, verticeFinal, costoM);
                    break;
                case 5:
                    break fin;
            }
        } while (true);
    }
}
