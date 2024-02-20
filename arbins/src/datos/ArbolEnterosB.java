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
public class ArbolEnterosB {
    public ArbinB<Integer> crearArbol(){
        ArbinB<Integer> raiz = new ArbinEntB<>(2);
        raiz.enlIzq(new ArbinEntB<>(3));
        raiz.enlDer(new ArbinEntB<>(4));
        raiz.der().enlIzq(new ArbinEntB<>(5));
        raiz.izq().enlIzq(new ArbinEntB<>(6));
        return raiz;
    }
    
    public void inOrden(ArbinB<Integer> r){
        if(r!=null){
            inOrden(r.izq());
            System.out.println(""+r.obtener());
            inOrden(r.der());
        }
    }
    
    public boolean buscar(ArbinB<Integer> r, ArbinA<Integer> a){
        if(r==null){
            return false;
        }else{
            if(r.obtener()==a.obtener()){
                return true;
            }else{
                return (buscar(r.izq(), a)||buscar(r.der(), a));
            }
        }
    }
    
    public boolean AenB(ArbinB<Integer> r, ArbinA<Integer> f){
        if(r==null){
            return true;
        }else{
            return (AenB(r.izq(), f)&&AenB(r.der(), f));
        }
    }
    
    public static void main(String[] args) {
        ArbolEnterosB arbB = new ArbolEnterosB();
        ArbolEnterosA arbA = new ArbolEnterosA();
        ArbinB<Integer> raizB = arbB.crearArbol();
        ArbinA<Integer> raizA = arbA.crearArbol();
        System.out.println("Arbol B");
        arbB.inOrden(raizB);
        System.out.println("\nArbol A");
        arbA.inOrden(raizA);
        if(arbB.AenB(raizB, raizA)){
            System.out.println("\nmisma vaina");
        }else{
            System.out.println("no son iguales");
        }
        
    }
}
