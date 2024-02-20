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
public class ArbolDeMotos {
    public ArbinMoto<Moto> crearArbol(){
        ArbinMoto<Moto> raiz = new ArbinM<>(new Moto("Tt", 100));
        raiz.enlIzq(new ArbinM<>(new Moto("pulsar", 20000)));
        raiz.enlDer(new ArbinM<>(new Moto("kawasaki", 12121)));
        raiz.der().enlIzq(new ArbinM<>(new Moto("rtx", 3000)));
        raiz.izq().enlIzq(new ArbinM<>(new Moto("x8", 12222)));
        return raiz;
    }
    
    public void preOrden(ArbinMoto<Moto> r){//R I D
        if(r!=null){
            System.out.println(" "+r.obtener());
            preOrden(r.izq());
            preOrden(r.der());
            
        }
    }
    
    public void posOrden(ArbinMoto<Moto> r){//R I D
        if(r!=null){
            preOrden(r.izq());
            preOrden(r.der());
            System.out.println(" "+r.obtener());
        }
    }
    
    public void inOrden(ArbinMoto<Moto> r){
        if(r!=null){
            inOrden(r.izq());
            System.out.println(""+r.obtener());
            inOrden(r.der());
        }
    }
    
    Moto mo;
    public void visitaPrecio(ArbinMoto<Moto> r){
        if(r.obtener().getPrecio()>mayor){
            mayor=r.obtener().getPrecio();
            mo=r.obtener();
        }
    }
    float mayor=0;
    public Moto mayor(ArbinMoto<Moto> r){
        if(r!=null){
            visitaPrecio(r);
            mayor(r.izq());
            mayor(r.der());
        }
        return mo;
    }
    
    public static void main(String[] args) {
        ArbolDeMotos arb = new ArbolDeMotos();
        ArbinMoto raiz = arb.crearArbol();
        arb.inOrden(raiz);
        System.out.println("La moto mas cara es: "+arb.mayor(raiz));
    }
}
