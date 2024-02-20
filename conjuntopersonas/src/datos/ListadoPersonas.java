/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class ListadoPersonas {
    private ArrayList<Personad> persona = new ArrayList<>();

    public void addPersona(Personad x){
        persona.add(x);
    }
    
    public String listar(){
        String lis="";
        for (int i = 0; i < persona.size(); i++) {
            Personad getl = persona.get(i);
            lis+=""+getl.toString()+"\n";
        }
        return lis;
    }
    
    public void ordenarPorDocumento(){
        int p,j;
        Personad aux;
        for (p = 1; p < persona.size(); p++){              
                aux = persona.get(p);    
                j = p - 1;                      
                while ((j >= 0) && (persona.get(j).CompareTo1(aux))==1){
                            persona.set(j+1, persona.get(j));
                            j--;                                     
                }
              persona.set(j+1, aux);
        }
    }
    
    /**
     * @return the persona
     */
    public ArrayList<Personad> getPersona() {
        return persona;
    }
    
}
