/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiReloj;

import datosrel.ConjuntoRelojes;
import datosrel.Reloj;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import serializacion.Persistencia;

/**
 *
 * @author ESTUDIANTE
 */
public class Menu {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        menu();
    }
    
    public static void menu() throws IOException, FileNotFoundException, ClassNotFoundException{
        String m="1.Agregar\n2.mostrar\n3.mas costoso\n4.salir";
        int op=0;
        
        File archivo = new File("relojes.ob");
        ConjuntoRelojes relo;
        
        if(!archivo.exists()){
            relo = new ConjuntoRelojes();
        }else{
            relo=new Persistencia().recuperar();
        }
        
        do {
            String c=JOptionPane.showInputDialog(m);
            op=Integer.parseInt(c);
            switch(op){
                case 1:
                    String ref="REF"+(int)(Math.random()*1000);
                    float costo = (float)(Math.random()*1000);
                    int modelo = (int)(Math.random()*1000);
                    relo.insertar(new Reloj(ref, costo, modelo));
                    JOptionPane.showMessageDialog(null, "reloj insertado");
                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, relo.mostrar());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "el reloj mas caro"+relo.masCaro());  
                    break;
            }   
        } while (op!=4);
        new Persistencia().guardar(relo);
    }
}
