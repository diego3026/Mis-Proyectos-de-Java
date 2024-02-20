/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasGeometricas;

/**
 *
 * @author asus
 */
public class Cilindro extends Circulo{
    private int valor2;
    
    public Cilindro(int valor1,int valor2){
        super(valor1);
        this.valor2 = valor2;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
}
