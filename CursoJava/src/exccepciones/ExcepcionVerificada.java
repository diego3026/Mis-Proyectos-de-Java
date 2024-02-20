/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exccepciones;

import java.io.*;

/**
 *
 * @author asus
 */
public class ExcepcionVerificada {
    public static void main(String[] args) throws FileNotFoundException {
        readFile1();  
    }
    
    public static void readFile1(){
        File file = new File("C://file.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException ex) {
            System.err.println("EL archivo no se pudo leer"); 
        }
    }
}
