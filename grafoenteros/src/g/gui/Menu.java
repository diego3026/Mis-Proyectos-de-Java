/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g.gui;

import g.cadenas.GrafoCadenas;
import g.datos.Grafo;
import g.datos.GrafoMat;
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
        String men = "1.Ingresar vertice \n2.Ingresar Arista \n3.Mostrar \n4.porcentaje de ocupacion grafo \n5.Salir";
        GrafoCadenas graf = new GrafoCadenas();
        Grafo<String, Double> grafo = new GrafoMat<>();
        fin:do { 
            int op = Integer.parseInt(JOptionPane.showInputDialog(men));
            switch(op){
                case 1:
                    String vert = JOptionPane.showInputDialog("Vertice a insertar:");
                    graf.insVertice(vert);
                    break;
                case 2:
                    int vi = Integer.parseInt(JOptionPane.showInputDialog("posicion del vertice inicial: "));
                    int vf = Integer.parseInt(JOptionPane.showInputDialog("posicion del vertice final: "));
                    double arista = Double.parseDouble(JOptionPane.showInputDialog("Arista a agregar: "));
                    graf.insArista(vi, vf, arista);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, graf.mostrar());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, graf.porOcupacion());
                    break;
                case 5:
                    break fin;
            }
        } while (true);
    }
}
