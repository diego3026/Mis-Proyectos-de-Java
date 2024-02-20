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
public class ListadoCelulares {
    private ArrayList<Celular> celulares = new ArrayList<>();
    private int Ne=0;
    
    public void addCelular(Celular x){
        celulares.add(x);
        Ne++;
    }
    
    public String listar(){
        String lis="";
        for (int i = 0; i < celulares.size(); i++) {
            Celular get = celulares.get(i);
            lis+=" "+get.toString()+"\n";
        }
        return lis;
    }
    
    public void borrar(Celular x){
        celulares.remove(x);
    }
    
    public Celular BusquedaBinaria(int x){
        int ini=0;
	int fin=celulares.size()-1;
	int i=ini;
	int j=fin;
        
	while(i<=j){
            int p=(i+j)/2;
            if(celulares.get(p).getRam()==x){
                Celular c=celulares.get(p);
                return c;
            }else{
                if(x>celulares.get(p).getRam()){
                    i=p+1;
                }else{
                    j=p-1;
                }
            }	
	}
        return null;
    }  
    
    public Celular buscarMarca(String marca){//busqueda secuencial o lineal
        for (Celular celulare : celulares) {
            if(celulare.getMarca().equals(marca)){
                return celulare;
            }
        }
        return null;
    }
    
    public int BuscarRam(int ram){
        int ini=0;
	int fin=celulares.size()-1;
	int i=ini;
	int j=fin;
           
	while(i<=j){
            int p=(i+j)/2;
            if(celulares.get(p).getRam()==ram){
                return p;
            }else{
                if(ram>celulares.get(p).getRam()){
                    i=p+1;
                }else{
                    j=p-1;
                }
            }	
	}
	return -1;
    }
    
    public void ordenarNumero(){//burbuja
        for (int i = 0; i < celulares.size(); i++) {
            for (int j = 0; j < celulares.size()-1; j++) {
                if(celulares.get(j).getNumero()>celulares.get(j+1).getNumero()){
                    Celular aux=celulares.get(j);
                    celulares.set(j, getCelulares().get(j+1));
                    celulares.set(j+1, aux);
                }
            }
        }
    }
    
    public void ordenarRam(){//selection
        for (int i = 0; i < celulares.size(); i++) {
            int minimo=i;
            int vmin=celulares.get(i).getRam();
            
            for (int j = i+1; j < celulares.size(); j++) {
                if(celulares.get(j).getRam()<vmin){
                    vmin=celulares.get(j).getRam();
                    minimo=j;
                }
            }
            if(vmin<celulares.get(i).getRam()){
                Celular t=celulares.get(i);
                celulares.set(i,celulares.get(minimo));
                celulares.set(minimo, t);
            }
        }
    }
    
    public void organizarRom(){//inserccionsort
        int p,j;
        Celular aux;
        for (p = 1; p < celulares.size(); p++){              
                aux = celulares.get(p);     
                j = p - 1;                      
                while ((j >= 0) && ((celulares.get(j).comparador(aux))==1)){               
                            celulares.set(j+1, celulares.get(j));
                            j--;                                     
                }
                celulares.set(j+1, aux);                        
        }
    }
    
    public void ordenarNumeroQS(int izq,int der){//quicksort
        int piv=celulares.get((izq+der)/2).getNumero();
        int i=izq;
        int j=der;
        while(i<j){
            while(celulares.get(i).getNumero()<piv)i++;
            while(celulares.get(j).getNumero()>piv)j--;
            if(i<=j){
                Celular t=celulares.get(i);
                celulares.set(i, celulares.get(j));
                celulares.set(j, t);
                i++;
                j--;
            }    
        }
        if(izq<j){
            ordenarNumeroQS(izq, j);
        }
        if(i<der){
            ordenarNumeroQS(i, der);
        }
    }
    
    /**
     * @return the celulares
     */
    public ArrayList<Celular> getCelulares() {
        return celulares;
    }

    /**
     * @return the Ne
     */
    public int getNe() {
        return Ne;
    }

    public void ordenarNombre() {
        Collections.sort(celulares);//cadenas
    }

    public void ordenarNumeroComparator() {
        Collections.sort(celulares, new NumeroComparator());//enteros
    }
}
