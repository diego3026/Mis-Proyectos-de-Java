/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Estudiante
 */
public class ConjuntoAutos {
    private Auto autos[]=new Auto[10000];
    private int na=0; //numero autos

    public ConjuntoAutos() {
    }
    //insertar auto
    public void addAuto(Auto x){
        autos[na]=x;
        na++;        
    }
    
    public void selection(){
        for (int i = 0; i < na; i++) {
            int minimo=i;
            int vmin=autos[i].getModelo();
            
            for (int j = i+1; j < na; j++) {
                if(autos[j].getModelo()<vmin){
                    vmin=autos[j].getModelo();
                    minimo=j;
                }
            }
            if(vmin<autos[i].getModelo()){
                int t=autos[i].getModelo();
                autos[i].setModelo(autos[minimo].getModelo());
                autos[minimo].setModelo(t);
            }
        }
    }
    
    public void burbuja(){
        for (int i = 0; i < na; i++) {
            for (int j = 0; j < na-1; j++) {
                if(autos[j].getModelo()>autos[j+1].getModelo()){
                    int t=autos[j].getModelo();
                    autos[j].setModelo(autos[j+1].getModelo());
                    autos[j+1].setModelo(t);
                }   
            }
        }
    }
    
    public void inserccionsort(){
        int p,j;
        int aux;
        for (p = 1; p < na; p++){               
                aux = autos[p].getModelo();     
                j = p - 1;                      
                while ((j >= 0) && (aux < autos[j].getModelo())){
                    autos[j+1].setModelo(autos[j].getModelo());
                    j--;                                     
                }
              autos[j + 1].setModelo(aux);
        }
    }
    
    public void quicksort(int izq,int der){
        int piv=autos[(izq+der)/2].getModelo();
        int i=izq;
        int j=der;
        while(i<j){
            while(autos[i].getModelo()<piv) i++;
                while(autos[j].getModelo()>piv) j--;
                    if(i<=j){
                        int t=autos[i].getModelo();
                        autos[i].setModelo(autos[j].getModelo());
                        autos[j].setModelo(t);
                        i++;
                        j--;
                    }
        }
        if(izq<j)
            quicksort(izq, j);
        if(i<der){
            quicksort(i, der);
        }
    }
    
    public float autoCaro(){
        float mayor=0;
        
        if(mayor==0){
            mayor=autos[0].getPrecio();
        }
        
        for (int i = 0; i < na; i++) {
            if(autos[i].getPrecio()>mayor){
                mayor=autos[i].getPrecio();
            }
        }
        return mayor;
    }
    
    public float promedio(){
        float sum=0;
        for (int i = 0; i < na; i++) {
            sum=sum+autos[i].getPrecio();
        }
        float prom=sum/na;
        return prom;
    }
    
    public void searchCarro(String x){
        for (int i = 0; i < na; i++) {
            if(autos[i].getPlaca()==x){
                System.out.println("Auto Encontrado");
                return;
            }
        }
        System.out.println("Auto No Encontrado");
    }
    
    public void borrar(Auto x){ 
        for (int i = 0; i < na; i++) {
            if(autos[i]==x){
                for (int j = i+1; j < na; j++) {
                    autos[i]=autos[i+1];
                }
            }
        }
        na--;
    }
    
    public String listar(){
        String lis="";
        for (int i = 0; i < na; i++) {
            lis=lis+" "+autos[i].toString()+"\n";
            
        }
        return lis;
    }
    
    

    /**
     * @return the autos
     */
    public Auto[] getAutos() {
        return autos;
    }

    /**
     * @return the na
     */
    public int getNa() {
        return na;
    }
    
    
}
