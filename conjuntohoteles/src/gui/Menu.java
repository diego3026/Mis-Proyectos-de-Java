/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.Conjuntodehoteles;
import datos.Hotel;
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
        String men="\n1.Agregar hotel  \n2.Listar  \n3.Ordenar por direccion \n4.Buscar nombre \n5.Ordenar por nombre \n6.Buscar direccion \n7.Ordenar por numero de estrellas \n8.Borrar hoteles de menos de 3 estrellas \n9.Buscar hotel por ciudad  \n10.Salir";
        Conjuntodehoteles ch = new Conjuntodehoteles();
        int c=0;
                
        fin:do {            
            String m=JOptionPane.showInputDialog(men);
            int op=Integer.parseInt(m);
            switch (op){
                case 1:
                    String nh=JOptionPane.showInputDialog("Nombre de hotel");
                    String dir=JOptionPane.showInputDialog("ingresar direccion");
                    String es=JOptionPane.showInputDialog("Ingresar numero de estrellas");
                    int est=Integer.parseInt(es);
                    String ci=JOptionPane.showInputDialog("ingresar ciudad del hotel");
                    Hotel h = new Hotel(nh, dir, est, ci);
                    ch.addHotel(h);
                    c++;
                    JOptionPane.showMessageDialog(null, "Hotel agregado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, ch.listar());
                    break;
                case 3:
                    ch.ordenarDireccion();
                    break;
                case 4:
                    String nb=JOptionPane.showInputDialog("Nombre de hotel a buscar");
                    if(ch.buscarNombre(nb)==null){
                        JOptionPane.showMessageDialog(null, "Hotel no encontrado");
                    }else{
                        JOptionPane.showMessageDialog(null,ch.buscarNombre(nb).toString());
                    }
                    break;
                case 5:
                    ch.ordenarNombre();
                    break;
                case 6:
                    String db=JOptionPane.showInputDialog("Direccion de hotel a buscar");
                    if(ch.buscarDireccion(db)==null){
                        JOptionPane.showMessageDialog(null, "Hotel no encontrado");
                    }else{
                       JOptionPane.showMessageDialog(null,ch.buscarDireccion(db).toString());
                    }
                    break;
                case 7:
                    ch.ordenarEstrellas(0,c-1);
                    break;
                case 8:
                    ch.borrarHotel();
                    break;
                case 9:  
                    String cib=JOptionPane.showInputDialog("ingresar ciudad a buscar hotel");
                    JOptionPane.showMessageDialog(null, ch.buscarPorCiudad(cib));
                    break;
                case 10:    
                    break fin;
                    
            }       
        } while (true);
    }
}
