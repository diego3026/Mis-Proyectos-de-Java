/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Password {
    private int longitud;
    private String contraseña;
    
    public Password(){
        this.contraseña = "";
        this.longitud = 8;
    }
    
    public Password(int longitud){
        this.contraseña = Math.random()*longitud+"";
    }
    
    public boolean esFuerte(){
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWYXZ";
        String minusculas = "ABCDEFGHIJKLMNOPQRSTUVWYXZ".toLowerCase();
        String numeros = "123456789";
        
        int contadorMayusculas = 0;        
        int contadorMinusculas = 0;
        int contadorNumero = 0;

        
        for (int i = 0; i < this.longitud; i++) {
            for (int j = 0; j <= mayusculas.length(); j++) {
                if(this.contraseña.charAt(i) == mayusculas.charAt(j)){
                    contadorMayusculas++;
                }
                if(this.contraseña.charAt(i) == minusculas.charAt(j)){
                    contadorMinusculas++;
                }
            }
            
            for (int j = 0; j <= numeros.length(); j++) {
                if(this.contraseña.charAt(i)== numeros.charAt(j)){
                    contadorNumero++;
                }
            }
        }
        
        return (contadorMayusculas>2 && contadorMinusculas>1 && contadorNumero>5);
    }
    
    public void generarPassword(){
        
    }
}
