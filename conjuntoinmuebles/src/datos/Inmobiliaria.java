/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Inmobiliaria {
    private ArrayList<Inmueble> inmuebles = new ArrayList<>();
    private int ne=0;
    
    public void addInmueble(Inmueble x){
        inmuebles.add(x);
        ne++;
    }
    
    public void burbuja(){
        for (int i = 0; i < inmuebles.size(); i++) {
            for (int j = 0; j < inmuebles.size()-1; j++) {
                if(inmuebles.get(j).getAño()>inmuebles.get(j+1).getAño()){
                    Inmueble t=inmuebles.get(j);
                    inmuebles.set(j, inmuebles.get(j+1));
                    inmuebles.set(j+1, t);
                }
            }
        }
    }
    
    public String listar(){
        String lis="";
        
        for (int i = 0; i < inmuebles.size(); i++) {
            Inmueble get = inmuebles.get(i);
            lis+=" "+get.toString()+"\n";
        }
        return lis;
    }
    
    public String buscar(int codigo){
        for (Inmueble inmueble : inmuebles) {
            if(inmueble.getCodigo()==codigo){
                return inmueble.toString();
            }
        }
        return null;
    }
    
    public String listarCasas(){
        String lisC="";
        
        for (int i = 0; i < inmuebles.size(); i++) {
            if(inmuebles.get(i).getTipo().equals("casa")){
                Inmueble getC = inmuebles.get(i);
                lisC+=" "+getC.toString()+"\n";
            }
        }
        return lisC;
    }
    
    public String muebleCaro(){
        float mayor=0;
        int pos=0;
        
        if(mayor==0){
            mayor=inmuebles.get(0).getPrecio();
        }
        for (int i = 0; i < inmuebles.size(); i++) {
            if(inmuebles.get(i).getPrecio()>mayor){
                mayor=inmuebles.get(i).getPrecio();
                pos=i;
            }
        }
        Inmueble getM = inmuebles.get(pos);
        return getM.toString();
    }
    
    public void borrarInmueble(int codigo){
        Inmueble el=null;
        
        for (Inmueble inmueble : inmuebles) {
            if(inmueble.getCodigo()==codigo){
                el=inmueble;
                break;
            }
        }
        inmuebles.remove(el);
    }
    
    public void ModificarAño(int codigo,int año){
        for (Inmueble inmueble : inmuebles) {
            if(inmueble.getCodigo()==codigo){
                inmueble.setAño(año);
            }
        }
    }
    
    public float porcentajeMueble(){
        int Cm=0;
        float por=0;
        
        for (int i = 0; i < inmuebles.size(); i++) {
            Inmueble get = inmuebles.get(i);
            if(inmuebles.get(i).getAño()<2000){
                Cm++;
            }
        }
        por=(Cm/inmuebles.size())*100;
        return por;
    }
    
    public void selection(){
        for (int i = 0; i < inmuebles.size(); i++) {
            int minimo=i;
            int vmin=inmuebles.get(i).getCodigo();
            
            for (int j = i+1; j < inmuebles.size(); j++) {
                if(inmuebles.get(j).getCodigo()<vmin){
                    vmin=inmuebles.get(j).getCodigo();
                    minimo=j;
                }
            }
            if(vmin<inmuebles.get(i).getCodigo()){
                Inmueble t=inmuebles.get(i);
                inmuebles.set(i,inmuebles.get(minimo));
                inmuebles.set(minimo, t);
            }
        }
    }
    
    public void inserccionsort(){
        int p,j;
        Inmueble aux;
        for (p = 1; p < inmuebles.size(); p++){              
                aux = inmuebles.get(p);     
                j = p - 1;                      
                while ((j >= 0) && ((inmuebles.get(j).compareTo(aux))==1)){               
                            inmuebles.set(j+1, inmuebles.get(j));
                            j--;                                     
                }
                inmuebles.set(j+1, aux);                        
        }
    }
    
    public void quicksort(int izq,int der){
        int piv=inmuebles.get((izq+der)/2).getCodigo();
        int i=izq;
        int j=der;
        while(i<j){
            while(inmuebles.get(i).getCodigo()<piv)i++;
            while(inmuebles.get(j).getCodigo()>piv)j--;
            if(i<=j){
                Inmueble t=inmuebles.get(i);
                inmuebles.set(i, inmuebles.get(j));
                inmuebles.set(j, t);
                i++;
                j--;
            }
        }
        if(izq<j){
            quicksort(izq, j);
        }
        if(i<der){
            quicksort(i, der);
        }
    }
    
    /**
     * @return the inmuebles
     */
    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    /**
     * @return the ne
     */
    public int getNe() {
        return ne;
    }

    /**
     * @return the der
     */
}
