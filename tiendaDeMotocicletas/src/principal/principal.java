/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import clases.TiendaDeMotos;
import clases.Validacion;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class principal {
    public static void main(String[] args) throws Validacion {
        TiendaDeMotos tienda = new TiendaDeMotos("Motos el diego");
        Scanner lector = new Scanner(System.in);
        
        String menu = "1.Agregar una motocicleta\n2.Mostrar\n3.Vender motocicleta\n4.Actualizar precio\n5.Salir";
        int opcion;        
        
        fin:do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "menu",JOptionPane.QUESTION_MESSAGE));
            
            switch(opcion){
                case 1 -> {
                    a:while(true){
                        try{
                            int numeroDeSerie = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de serie: ","",JOptionPane.QUESTION_MESSAGE));
                            int modelo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el modelo: ","",JOptionPane.QUESTION_MESSAGE));
                            String marca = JOptionPane.showInputDialog(null,"Ingrese la marca: ","",JOptionPane.QUESTION_MESSAGE);
                            long precio = Long.parseLong(JOptionPane.showInputDialog(null,"Ingrese el precio: ","",JOptionPane.QUESTION_MESSAGE));
                            
                            tienda.agregarMotocicleta(numeroDeSerie, modelo, marca, precio);
                            JOptionPane.showMessageDialog(null,"La moto se ha agregado exitosamente","Exitoso",JOptionPane.INFORMATION_MESSAGE);
                            break a;
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                            String continuar = JOptionPane.showInputDialog(null,"¿Desea continuar? responda si o no","",JOptionPane.QUESTION_MESSAGE);

                            if(continuar.equalsIgnoreCase("no")){
                                break a;
                            }else{
                                if(!continuar.equalsIgnoreCase("si")){
                                    break a;
                                }
                            }
                        }
                    }
                    break;
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, tienda.listaDeMotocicletas(),"Listado de motocicletas",JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                case 3 -> {
                    b:while(true){
                        try{
                            int numeroDeSerie = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de serie: ","",JOptionPane.QUESTION_MESSAGE));
                            
                            tienda.venderMotocicleta(numeroDeSerie);
                            JOptionPane.showMessageDialog(null, "La moto se ha vendido exitosamente","Exitoso",JOptionPane.INFORMATION_MESSAGE);
                            break b;
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                            String continuar = JOptionPane.showInputDialog(null,"¿Desea continuar? responda si o no","",JOptionPane.QUESTION_MESSAGE);

                            if(continuar.equalsIgnoreCase("no")){
                                break b;
                            }else{
                                if(!continuar.equalsIgnoreCase("si")){
                                    break b;
                                }
                            }
                        }
                    }   
                    break;
                }
                case 4 -> {
                    b:while(true){
                        try{
                            int numeroDeSerie = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de serie: ","",JOptionPane.QUESTION_MESSAGE));
                            long precioNuevo = Long.parseLong(JOptionPane.showInputDialog(null,"Ingrese el nuevo precio: ","",JOptionPane.QUESTION_MESSAGE));

                            tienda.actualizarPrecioMotocicleta(numeroDeSerie, precioNuevo);
                            JOptionPane.showMessageDialog(null,"El precio se ha actualizado correctamente","Exitoso",JOptionPane.INFORMATION_MESSAGE);
                            break b;
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                            String continuar = JOptionPane.showInputDialog(null,"¿Desea continuar? responda si o no","",JOptionPane.QUESTION_MESSAGE);

                            if(continuar.equalsIgnoreCase("no")){
                                break b;
                            }else{
                                if(!continuar.equalsIgnoreCase("si")){
                                    break b;
                                }
                            }
                        }
                    }
                    break;
                }
                case 5 -> {
                    break fin;
                }
            }
        }while(true);
    }    
}
