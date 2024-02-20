/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.ListadoPersonas;
import datos.Personad;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Menu {
    public static void main(String[] args){
        new Menu().menu();
    }
    
    public void menu(){
        String men="\n1.Agregar persona  \n2.Listar  \n3.Ordenar por documento \n4.Salir ";
        ListadoPersonas p=new ListadoPersonas();
        
        fin:do {            
            String m=JOptionPane.showInputDialog(men);
            int op=Integer.parseInt(m);
            switch (op){
                case 1:
                    String no=JOptionPane.showInputDialog("Nombre ");
                    
                    String eda=JOptionPane.showInputDialog("Edad ");
                    int ed=Integer.parseInt(eda);
                            
                    String doc=JOptionPane.showInputDialog("Documento ");
                    int docu=Integer.parseInt(doc);
                    
                    Personad lp = new Personad(no, ed, docu);
                    p.addPersona(lp);
                    JOptionPane.showMessageDialog(null, "Persona agregada");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, p.listar());
                    break;
                case 3:
                    p.ordenarPorDocumento();
                    break;
                case 4:   
                    break fin;
            }     
        } while (true);
    }
}
