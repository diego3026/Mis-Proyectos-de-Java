/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractas;

/**
 *
 * @author asus
 */
public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String tipoDeFigura) {
        super(tipoDeFigura);
    }
    
    
    
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un: "+getClass().getSimpleName() );
    }
    
}
