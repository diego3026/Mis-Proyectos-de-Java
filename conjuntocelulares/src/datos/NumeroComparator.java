/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Comparator;

/**
 *
 * @author asus
 */
public class NumeroComparator implements Comparator<Celular>{

    @Override
    public int compare(Celular o1, Celular o2) {
        return o1.getNumero()-o2.getNumero();
    }
}
