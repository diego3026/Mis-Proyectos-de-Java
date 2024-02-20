/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.Celular;
import datos.ListadoCelulares;
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
        String men="\n1.Agregar celular  \n2.Listar  \n3.Ordenar por numero \n4.Ordenar por ram \n5.Ordenar por rom \n6.Ordenar por marca \n7.Ordenar por numero Comparator \n8.Buscar por marca \n9.Organizar por numero QS  \n10.Busqueda binaria \n11.Salir";
        ListadoCelulares cel = new ListadoCelulares();
        int c=0;
                
        fin:do {            
            String m=JOptionPane.showInputDialog(men);
            int op=Integer.parseInt(m);
            switch (op){
                case 1:
                    String ma=JOptionPane.showInputDialog("digita marca");
                    String num=JOptionPane.showInputDialog("ingresar numero de telefono");
                    int nu=Integer.parseInt(num);
                    String rom=JOptionPane.showInputDialog("digita memoria ROM");
                    int ro=Integer.parseInt(rom);
                    String ram=JOptionPane.showInputDialog("digita memoria RAM");
                    int ra=Integer.parseInt(ram);
                    
                    Celular x=new Celular(ma, nu, ro, ra);
                    cel.addCelular(x);
                    c++;
                    JOptionPane.showMessageDialog(null, "Celular agregado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, cel.listar());
                    break;
                case 3:
                    cel.ordenarNumero();
                    break;
                case 4:
                    cel.ordenarRam();
                    break;
                case 5:
                    cel.organizarRom();
                    break;
                case 6:
                    cel.ordenarNombre();
                    break;
                case 7:
                    cel.ordenarNumeroComparator();
                    break;
                case 8:
                    String mb=JOptionPane.showInputDialog("marca a buscar");
                    if(cel.buscarMarca(mb)==null){
                        JOptionPane.showMessageDialog(null, "celular no encontrado");
                    }else{
                        JOptionPane.showMessageDialog(null, cel.buscarMarca(mb).toString());
                    }
                    break;
                case 9:  
                    cel.ordenarNumeroQS(0,c-1);
                    break;
                case 10:
                    String rb=JOptionPane.showInputDialog("Ram a buscar");
                    int rab=Integer.parseInt(rb);
                    if(cel.BusquedaBinaria(rab)==null){
                        JOptionPane.showMessageDialog(null,"Ram no encontrada");
                    }else{
                        JOptionPane.showMessageDialog(null,cel.BusquedaBinaria(rab).toString());
                    }
                    
                    break;
                case 11:    
                    break fin;
                    
            }       
        } while (true);
    }
}
