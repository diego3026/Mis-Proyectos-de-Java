/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author asus
 */
public class ArbolEnterosA {
    public ArbinA<Integer> crearArbol(){
        ArbinA<Integer> raiz = new ArbinEntA<>(2);
        raiz.enlIzq(new ArbinEntA<>(3));
        raiz.enlDer(new ArbinEntA<>(4));
        raiz.der().enlIzq(new ArbinEntA<>(5));
        raiz.izq().enlIzq(new ArbinEntA<>(6));
        return raiz;
    }
    
    public void inOrden(ArbinA<Integer> r){
        if(r!=null){
            inOrden(r.izq());
            System.out.println(""+r.obtener());
            inOrden(r.der());
        }
    }
    
}
