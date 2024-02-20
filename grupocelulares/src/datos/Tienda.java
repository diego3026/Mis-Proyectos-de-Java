
package datos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Tienda {

    private String nombre; // primer atributo   
    private ArrayList<Celular> celulares=new ArrayList<>(); //aca hay dos atributos

    public LinkedList<String> hallarMarcas(){
        LinkedList<String> marcas=new LinkedList<>();
        HashSet<String> sinrepetir=new HashSet<>();
        for(Celular celulare:celulares){
            sinrepetir.add(celulare.getMarca());
        }
        marcas.addAll(sinrepetir);
        return marcas;
    }
    public int busquedaBinaria(int id){
        int inf=0;
        int sup=celulares.size()-1;
        while(inf<=sup){
            int piv=(inf+sup)/2;
            if(celulares.get(piv).getId()==id){
                return piv;
            }else{
                if(id<celulares.get(piv).getId()){
                    sup=piv-1;
                }else{
                    inf=piv+1;
                }
                    
            }
        }
        return -1;
    }
    
        public int busquedaBinaria(String modelo){
        int inf=0;
        int sup=celulares.size()-1;
        while(inf<=sup){
            int piv=(inf+sup)/2;
            if(celulares.get(piv).getModelo().compareTo(modelo)==0){
                return piv;
            }else{
                if(celulares.get(piv).getModelo().compareTo(modelo)>0){
                    sup=piv-1;
                }else{
                    inf=piv+1;
                }  
            }
        }
        return -1;
    }

            
            
    public int busquedaLineal(String marca){
        for (int i = 0; i < celulares.size(); i++) {
            Celular get = celulares.get(i);
            if(get.getMarca().equals(marca)){
                return i;
            }
        }
        return -1;
    }
    //todos los celulares de un modelo 
    public ArrayList<Celular> celularesModelo(String modelo){
        ArrayList<Celular> celus=new ArrayList<>();
        for (Celular celulare : celulares) {
            if(celulare.getModelo().equals(modelo)){
                celus.add(celulare);
            }
            
        }
        return celus;
    }
            
    public void burbuja(){
        for (int i = 0; i < getCelulares().size(); i++) {
            for (int j = 0; j < getCelulares().size()-1; j++) {
                if(getCelulares().get(j).getMarca().compareTo(getCelulares().get(j+1).getMarca())>0){
                 Celular t= getCelulares().get(j);
                    getCelulares().set(j, getCelulares().get(j+1));
                    getCelulares().set(j+1, t);
                }
                
            }
            
        }
    }
    
    public void seleccion(){
        for (int i = 0; i < getCelulares().size(); i++) {
            int imen = i;
            int imenor=getCelulares().get(i).getId();
            for (int j = i+1; j < getCelulares().size(); j++) {
                if(getCelulares().get(j).getId()<imenor){
                    imen =j;
                }
                
            }
            //viene el intercambio
            Celular t= getCelulares().get(i);
            getCelulares().set(i, getCelulares().get(imen));
            getCelulares().set(imen, t);
        }
    } 
    public static void quicksort(ArrayList<Integer> celulares,int vi,int vf){
     int pivote= celulares.get((vi+vf)/2);
        int i=vi;
        int j=vf;
        while(i<j){
            
        }
    }
    
    public void ordenarPorId(){
        Collections.sort(celulares, new IdComparator());
    }
    
    public void ordenarPorPrecio(){
        Collections.sort(celulares, new PrecioComparator());
    }

    public Tienda(String nombre) {
        this.nombre = nombre;
    }
    public void addCelular(Celular x){
        getCelulares().add(x);
    }
    
    public String listar(){
        String lis="";
        for (int i = 0; i < getCelulares().size(); i++) {
            Celular ob = getCelulares().get(i);
            lis+=" "+ob.toString()+"\n";
        }
        return lis;
    }
            

    //encapsulacion 
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float promedio() {
        float sum=0;
        for (Celular c : getCelulares()) {
            sum += c.getPrecio();
        }
        return sum/getCelulares().size();
    }

    public void borrarCel(int id) {
        Celular cb=null;
        for (Celular celulare : getCelulares()) {
            if(celulare.getId()==id){
                cb=celulare;
                break;
            }
       
        }
        getCelulares().remove(cb);
    }

    public ArrayList<Celular> celularesMarca(String marca) {
        ArrayList<Celular> res=new ArrayList<>();
        for (Celular celulare :getCelulares()){
            if(celulare.getMarca().equals(marca)){
                res.add(celulare);
            }
            
        }
        return res;
    }

    /**
     * @return the celulares
     */
    public ArrayList<Celular> getCelulares() {
        return celulares;
    }
    
}    
