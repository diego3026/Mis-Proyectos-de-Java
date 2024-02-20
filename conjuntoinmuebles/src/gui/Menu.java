/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;



import datos.Inmobiliaria;
import datos.Inmueble;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Menu {
    public static void main(String[] args){
        new Menu().menu();
    }
    
    public void menu(){
        String men="\n1.Agregar inmueble  \n2.Listar  \n3.Buscar  \n4.ListarCasas  \n5.InmuebleMasCaro  \n6.ModificarAño   \n7.PorcentajeImnuebles   \n8.Borrar  \n9.Ordenar por año burbuja \n10.Ordenar por codigo selection \n11.Ordenar por codigo quicksort \n12.Ordenar por codigo inserccion \n13.Salir";
        Inmobiliaria inmo=new Inmobiliaria();
        fin:do {            
            String m=JOptionPane.showInputDialog(men);
            int op=Integer.parseInt(m);
            switch (op){
                case 1:
                    String co=JOptionPane.showInputDialog("Codigo ");
                    int cod=Integer.parseInt(co);
                    String dir=JOptionPane.showInputDialog("Direccion ");
                    String añ=JOptionPane.showInputDialog("Año ");
                    int año=Integer.parseInt(añ);
                    String ti=JOptionPane.showInputDialog("Tipo ");
                    String pr=JOptionPane.showInputDialog("Precio ");
                    float prec=Float.parseFloat(pr);
                    
                    Inmueble in=new Inmueble(cod,dir,año,ti,prec);
                    inmo.addInmueble(in);
                    JOptionPane.showMessageDialog(null, "Inmueble añadido");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, inmo.listar());
                    break;
                case 3:
                    String cob=JOptionPane.showInputDialog("Ingresar codigo a buscar ");
                    int cobu=Integer.parseInt(cob);
                    JOptionPane.showMessageDialog(null, inmo.buscar(cobu));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, inmo.listarCasas());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, inmo.muebleCaro());
                    break;
                case 6:
                    String coM=JOptionPane.showInputDialog("Ingresar codigo del que modificaras año ");
                    int coMo=Integer.parseInt(coM);
                    String añoN=JOptionPane.showInputDialog("Ingresar año nuevo ");
                    int añoNu=Integer.parseInt(añoN);
                    inmo.ModificarAño(coMo, añoNu);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"El porcentaje de inmuebles de año menor que 2000 es "+inmo.porcentajeMueble());
                    break;
                case 8:
                    String coEl=JOptionPane.showInputDialog("Ingresar codigo de imnueble a eliminar ");
                    int coEli=Integer.parseInt(coEl);
                    inmo.borrarInmueble(coEli);
                    JOptionPane.showMessageDialog(null,"Inmueble eliminado");
                    break;
                case 9:
                    inmo.burbuja();
                    break;
                case 10:
                    inmo.selection();
                    break;
                case 11:
                    //JOptionPane.showMessageDialog(null, inmo.getNe());
                    inmo.quicksort(0, inmo.getNe());
                    break;
                case 12:
                    inmo.inserccionsort();
                    break;
                case 13:
                    break fin;
            }   
        } while (true);
    }
}

