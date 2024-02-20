/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.Carrera;
import datos.Conjuntocarreras;
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
        String men="\n1.Agregar carrera  \n2.Listar  \n3.Ordenar por codigo  \n4.Buscar por nombre \n5.Ordenar por nombre \n6.Buscar por codigo \n7. borrar todas las carreras tecnica \n8.Salir";
        Conjuntocarreras c=new Conjuntocarreras();
        
        fin: do {
            String m=JOptionPane.showInputDialog(men);
            int op=Integer.parseInt(m);
            switch (op){
                case 1:
                    String co=JOptionPane.showInputDialog("Codigo ");
                    int cod=Integer.parseInt(co);
                    
                    String nom=JOptionPane.showInputDialog("Nombre carrera ");
                    
                    String se=JOptionPane.showInputDialog("Semestres ");
                    int sem=Integer.parseInt(se);
                    
                    String cr=JOptionPane.showInputDialog("Creditos ");
                    int cre=Integer.parseInt(cr);
                    
                    Carrera ca=new Carrera(cod, nom, sem, cre);
                    c.addCarrera(ca);
                    JOptionPane.showMessageDialog(null, "Carrera creada");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, c.listar());
                    break;
                case 3:
                    c.ordenarcodigoIS();
                    break;
                case 4:
                    String nb=JOptionPane.showInputDialog("ingresar nombre de carrera a buscar ");
                    if(c.buscarNombre(nb)==null){
                        JOptionPane.showMessageDialog(null, "Carrera no encontrada");
                    }else{
                        JOptionPane.showMessageDialog(null, c.buscarNombre(nb).toString());
                    }
                    break;
                case 5:
                    c.ordenarNombreJV();
                    break;
                case 6:
                    String cb=JOptionPane.showInputDialog("ingresar codigo a buscar");
                    int cob=Integer.parseInt(cb);
                    if(c.buscarPorCodigo(cob)==-1){
                        JOptionPane.showMessageDialog(null, "carrera no encontrada");
                    }else{
                        JOptionPane.showMessageDialog(null,"La carrera esta en la posicion: "+c.buscarPorCodigo(cob));
                    }
                    break;
                case 7:
                    c.borrarCarreras();
                    break;
                case 8:
                    break fin;
            }
        } while (true);
    }
}
