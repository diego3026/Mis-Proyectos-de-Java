/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author asus
 */
public class Conjuntodehoteles {
    private ArrayList<Hotel> hoteles = new ArrayList<>();

    public void addHotel(Hotel x){
        hoteles.add(x);
    }
    
    public String listar(){
        String lis=" ";
        for (Hotel hotele : hoteles) {
            lis+=""+hotele.toString()+"\n";
        }
        return lis;
    }
    
    public void borrarHotel(){//borrar hoteles de menos de tres estrellas
        LinkedList<Hotel> aux=new LinkedList<>();
        for (Hotel hotel : hoteles) {
            if(hotel.getEstrellas()<3){
                aux.add(hotel);//no se puede remove en este tipo de for
            }
        }
        hoteles.removeAll(aux);
    }
    
    public String buscarPorCiudad(String ciudad){
        String lb="";
        for (Hotel hotele : hoteles) {
            if(hotele.getCiudad().equals(ciudad)){
                lb+=""+hotele.toString()+"\n";
            }
        }
        return lb;
    }
    
    
    public void ordenarDireccion(){//algoritmo propio
        int p,j;
        Hotel aux;
        for (p = 1; p < hoteles.size(); p++){              
                aux = hoteles.get(p);     
                j = p - 1;                      
                while ((j >= 0) && ((hoteles.get(j).compareTo(aux))>1)){               
                            hoteles.set(j+1, hoteles.get(j));
                            j--;                                     
                }
                hoteles.set(j+1, aux);                        
        }
    }
    
    public Hotel buscarDireccion(String dir){
        int ini=0;
	int fin=hoteles.size()-1;
	int i=ini;
	int j=fin;
        
	while(i<=j){
            int p=(i+j)/2;
            if(hoteles.get(p).getDireccion().equals(dir)){
                Hotel c=hoteles.get(p);
                return c;
            }else{
                if(hoteles.get(p).comparador1(dir)<1){
                    i=p+1;
                }else{
                    j=p-1;
                }
            }	
	}
        return null;
    }
    
    public Hotel buscarNombre(String nombre){
        for (int i = 0; i < hoteles.size(); i++) {
            Hotel get = hoteles.get(i);
            if(get.getNombre().equals(nombre)){
                return get;
            }
        }
        return null;
    }
    
    public void ordenarEstrellas(int izq, int der) {
        int piv=hoteles.get((izq+der)/2).getEstrellas();
        int i=izq;
        int j=der;
        while(i<j){
            while(hoteles.get(i).getEstrellas()<piv)i++;
            while(hoteles.get(j).getEstrellas()>piv)j--;
            if(i<=j){
                Hotel t=hoteles.get(i);
                hoteles.set(i, hoteles.get(j));
                hoteles.set(j, t);
                i++;
                j--;
            }    
        }
        if(izq<j){
            ordenarEstrellas(izq, j);
        }
        if(i<der){
            ordenarEstrellas(i, der);
        }
    }
    
    /**
     * @return the hoteles
     */
    public ArrayList<Hotel> getHoteles() {
        return hoteles;
    }

    public void ordenarNombre() {
        Collections.sort(hoteles);
    }
    
}
