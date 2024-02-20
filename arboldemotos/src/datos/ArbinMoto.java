package datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public interface ArbinMoto<Moto> {
    ArbinMoto<Moto> izq();
    ArbinMoto<Moto> der();
    void enlIzq(ArbinMoto<Moto> x);
    void enlDer(ArbinMoto<Moto> x);
    Moto obtener();
    void cambiar(Moto x);
}
