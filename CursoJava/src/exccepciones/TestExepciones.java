/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exccepciones;

import java.util.*;

/**
 *
 * @author asus
 */
public class TestExepciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean continuarEjecucion = true;

        do {
            try {
                System.out.print("Ingrese n1: ");
                int n1 = leer.nextInt();
                System.out.print("Ingrese n2: ");
                int n2 = leer.nextInt();

                int resultado = dividir(n1, n2);
                System.out.println("Resultado = " + resultado);
                
                continuarEjecucion = false;
            } catch (InputMismatchException e) {
                System.err.println("Ocurrio un error: Ingrese numeros enteros");
                leer.nextLine();
            } catch (OperadorExcepcion e) {
                System.err.println("Error: "+e.getMessage());
            } catch (Exception e) {
                e.printStackTrace(System.err);
            } finally {
                System.out.println("Se reviso la division");
            }
        } while (continuarEjecucion);
    }
    
    static int dividir(int numerador, int denominador){
        if (denominador == 0){
            throw new OperadorExcepcion("Division entre cero");
        }
        return numerador/denominador;
    }
}
