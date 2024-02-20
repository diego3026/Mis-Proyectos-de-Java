/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.util.Arrays;

public class Vector {
    public static void llenarVector(int v[]){
        for (int i = 0; i < v.length; i++) {
            v[i]= (int) (Math.random()*10000);
            
        }
    }
    
    public static int busquedaBinaria(int v[],int x){
        int ini=0;
	int fin=v.length-1;
	int i=ini;
	int j=fin;

	while(i<=j){
            int p=(i+j)/2;
            if(v[p]==x){
		return p;
            }else{
                if(x>v[p]){
                    i=p+1;
                }else{
                    j=p-1;
                }
            }	
	}
	return -1;
    }
    
    public static void seleccion (int v[]){
        for (int i = 0; i < v.length; i++) {
            int imin = i;
            int vmin= v[i];
            for (int j = i+1; j < v.length; j++) {
                if(v[j]<vmin){
                    vmin=v[j];
                    imin=j;
                }
            }
            if(vmin<v[i]){
                int t=v[i];
                v[i]=v[imin];
                v[imin]=t;
            }
        }
    }
    
    public static void quicksort(int v[],int izq,int der){
        int piv=v[(izq+der)/2];
        int i=izq;
        int j=der;
        while(i<j){
            while(v[i]<piv) i++;
                while(v[j]>piv) j--;
                    if(i<=j){
                        int t=v[i];
                        v[i]=v[j];
                        v[j]=t;
                        i++;
                        j--;
                    }
        }
        if(izq<j)
            quicksort(v, izq, j);
        if(i<der){
            quicksort(v, i, der);
        }
    }
    
    public static void burbuja(int v[]){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length-1; j++) {
                if(v[j]>v[j+1]){
                    int t=v[j];
                    v[j]=v[j+1];
                    v[j+1]=t;
                }   
            }
        }
    }
    
    public static void inserccionShort(int v[]){
        int p,j;
        int aux;
        for (p = 1; p < v.length; p++){ // desde el segundo elemento hasta
                aux = v[p];           // el final, guardamos el elemento y
                j = p - 1;            // empezamos a comprobar con el anterior
                while ((j >= 0) && (aux < v[j])){ // mientras queden posiciones y el                                
                                                // valor de aux sea menor que los
                            v[j + 1] = v[j];   // de la izquierda, se desplaza a
                            j--;               // la derecha
                }
              v[j + 1] = aux;       // colocamos aux en su sitio
        }
    }
            
    public static void main(String[] args) {
        int v[]=new int[100000];
        llenarVector(v);
        System.out.println(""+Arrays.toString(v));
        //burbuja(v);
        //System.out.println("ordenado burbuja"+Arrays.toString(v));
        //seleccion(v);
        //System.out.println("ordenado seleccion"+Arrays.toString(v));
        //quicksort(v, 0, v.length-1);
        //System.out.println("ordenado quicksort"+Arrays.toString(v));
        inserccionShort(v);
        System.out.println("ordenado inserccion"+Arrays.toString(v));
        System.out.println("El numero buscado esta en la posicio: "+busquedaBinaria(v, 0));
    }
}

