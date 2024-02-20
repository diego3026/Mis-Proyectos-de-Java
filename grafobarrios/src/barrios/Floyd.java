/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barrios;

import datos.Grafo;

/**
 *
 * @author Estudiante
 */
public class Floyd {
    double floyd[][];
    int ruta[][];
    Grafo<String,Double> grafo;
    
    public String mostrar(){
        String list=" ";
        for (int i = 0; i < floyd.length; i++) {
            for (int j = 0; j < floyd.length; j++) {
                list+=" "+floyd[i][j];
                
            }
            list+="\n";
        }
        return list;
    }

    public double costoRuta(int vi, int vf){
        return floyd[vi][vf];
    }
    
    public Floyd(Grafo<String, Double> grafo) {
        this.grafo = grafo;
        int n=grafo.orden();
        floyd=new double[n][n];
        ruta= new int [n][n];
        //inicializarmatriz floyd y ruta
        for (int i = 0; i < floyd.length; i++) {
            for (int j = 0; j < floyd.length; j++) {
                 floyd[i][j]=grafo.obtArista(i, j);
                 ruta[i][j]=-1;
                 
                
            }
            
        }
        costoMinimo();
    }

    public  void ruta(Grafo<String,Double> g,int i, int j){
        int k=ruta[i][j];
        if(k!=-1){
            ruta(g,i,k);
            System.out.println(" "+g.obtVertice(k));
            ruta(g,k,j);
        }
    }
    
    private void costoMinimo() {
        for (int k = 0; k < floyd.length; k++) {
            for (int i = 0; i < floyd.length; i++) {
                for (int j = 0; j < floyd.length; j++) {
                    if (floyd[i][k]+floyd[k][j]<floyd[i][j]) {
                        floyd[i][j]=floyd[i][k]+floyd[k][j];
                        ruta[i][j]=k;
                    } 
                }
            }
        }
    }
}
