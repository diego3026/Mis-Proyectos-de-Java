/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Comparator;

/**
 *
 * @author ESTUDIANTE
 */
public class OrdenarPrecio implements Comparator<Computador>{

    @Override
    public int compare(Computador t, Computador t1) {
        return t.getPrecio()-t1.getPrecio();
    }
    
}
