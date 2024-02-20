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
public class ArbinM<Moto> implements ArbinMoto<Moto>{
    Moto dato;
    ArbinMoto<Moto> i;
    ArbinMoto<Moto> d;

    public ArbinM(Moto dato) {
        this.dato = dato;
    }
    
    @Override
    public ArbinMoto<Moto> izq() {
        return i;
    }

    @Override
    public ArbinMoto<Moto> der() {
        return d;
    }

    @Override
    public void enlIzq(ArbinMoto<Moto> x) {
        i=x;
    }

    @Override
    public void enlDer(ArbinMoto<Moto> x) {
        d=x;
    }

    @Override
    public Moto obtener() {
        return dato;
    }

    @Override
    public void cambiar(Moto x) {
        dato=x;
    }
}
