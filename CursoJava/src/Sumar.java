
import java.util.Scanner;


public class Sumar {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int primerNumero = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int segundoNumero = leer.nextInt();
        
        int resultado = primerNumero + segundoNumero;
        
        System.out.println("El resultado es: "+resultado);
        System.out.printf("El resultado de la suma de %d y %d es igual a %d \n",primerNumero,segundoNumero,resultado);
        
    }
}
