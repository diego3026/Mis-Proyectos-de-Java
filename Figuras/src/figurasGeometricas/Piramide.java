/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasGeometricas;

/**
 *
 * @author asus
 */
public class Piramide extends Triangulo{
    private int valor3;
    
    public Piramide(int valor1,int valor2, int valor3){
        super(valor1, valor2);
        this.valor3 = valor3;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }    
    
}
