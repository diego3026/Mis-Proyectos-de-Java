/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasGeometricas;

/**
 *
 * @author asus
 */
public abstract class FiguraGeometrica {
    protected int valor1;
    
    public FiguraGeometrica(int valor1){
        this.valor1 = valor1;
    }
    
    public void setValor1(int valor1){
        this.valor1 = valor1;
    }
    
    public int getValor1(){
        return valor1;
    }
    
    public abstract double getArea();
}
