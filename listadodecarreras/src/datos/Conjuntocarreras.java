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
 * @author asus
 */
public class Conjuntocarreras {
    private ArrayList<Carrera> carreras = new ArrayList<>();
    
    public void addCarrera(Carrera x){
        carreras.add(x);
    }
    
    public String listar(){
        String lis=" ";
        for (int i = 0; i < carreras.size(); i++) {
            Carrera get = carreras.get(i);
            lis+=" "+get.toString()+"\n";
        }
        return lis;
    }
    
    public void ordenarcodigoIS(){
        int p,j;
        Carrera aux;
        for (p = 1; p < carreras.size(); p++){              
            aux = carreras.get(p);
            j = p - 1;
            while ((j >= 0) && ((carreras.get(j).comparador(aux))==1)){
                carreras.set(j+1, carreras.get(j));
                j--;
            }
            carreras.set(j+1, aux);                        
        }
    }
    
    public Carrera buscarNombre(String x){//secuencial
        for (Carrera carrera : carreras) {
            if(carrera.getNombre().equalsIgnoreCase(x)){
                return carrera;
            }
        }
        return null;
    }
    
    /**
     * @return the carreras
     */
    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void ordenarNombreJV() {
        Collections.sort(carreras);
    }

    public int buscarPorCodigo(int codigo) {//binaria
        int ini=0;
	int fin=carreras.size()-1;
	int i=ini;
	int j=fin;
           
	while(i<=j){
            int p=(i+j)/2;
            if(carreras.get(p).getCodigo()==codigo){
                return p;
            }else{
                if(codigo>carreras.get(p).getCodigo()){
                    i=p+1;
                }else{
                    j=p-1;
                }
            }	
	}
	return -1;
    }

    public void borrarCarreras() {
        carreras.removeAll(carreras);
    }
}
