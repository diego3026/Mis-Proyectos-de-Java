/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ESTUDIANTE
 */
public class Computadores {
    private ArrayList<Computador> computadores= new ArrayList<>();

    public void addComputador(Computador x){
        computadores.add(x);
    }
    
    public String listar(){
        String lis="";
        for (int i = 0; i < computadores.size(); i++) {
            Computador l = computadores.get(i);
            lis+=" "+l.toString()+"\n";
        }
        return lis;
    }
    
    public void inserccionsort(){
        int p,j;
        Computador aux;
        for (p = 1; p < computadores.size(); p++){              
                aux = computadores.get(p);    
                j = p - 1;                      
                while ((j >= 0) && (computadores.get(j).comparador(aux))==1){
                            computadores.set(j+1, computadores.get(j));
                            j--;                                     
                }
              computadores.set(j+1, aux);
        }
    }
    
    public void burbuja(){
        for (int i = 0; i < computadores.size(); i++) {
            for (int j = 0; j < computadores.size()-1; j++) {
                if(computadores.get(j).getReferencia()>computadores.get(j+1).getReferencia()){
                    Computador t=computadores.get(j);
                    computadores.set(j, computadores.get(j+1));
                    computadores.set(j+1, t);
                }
            }
        }
    }
    
    /**
     * @return the computadores
     */
    public ArrayList<Computador> getComputadores() {
        return computadores;
    }

    public void ordenarMarca() {
        Collections.sort(computadores);
    }

    public void ordenarPrecio() {
        Collections.sort(computadores, new OrdenarPrecio());
    }
       
}
