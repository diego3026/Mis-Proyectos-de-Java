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
 * @author ESTUDIANTE
 */
public class Universidad {
    private ArrayList<Alumno> alumnos=new ArrayList<>();
    
    public void addAlumno(Alumno x){
        alumnos.add(x);
    }
    
    public void agruparCarreras(){;
        ArrayList<Alumno> carreras = new ArrayList<>();
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno get = alumnos.get(i);
            if(get.getCarrera()==carreras.get(i).getCarrera()){
                carreras.add(get);
            }else{
                
            }
        }
    }
    
    public void borrarAlumnFBRA(){
        LinkedList<Alumno> aux=new LinkedList<>();
        
        for (Alumno alumno : alumnos) {
            if(alumno.getPromedio()<300){
                aux.add(alumno);//no se puede remove en este tipo de for
            }
        }
        alumnos.removeAll(aux);//guardamos todo lo que vas a borrar en la collection linkendlist
    }
    
    //buscar nombre secuencial
    public Alumno buscarNombre(String nombre){
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equals(nombre)){
                return alumno;
            }
        }
        return null;
    }
    
    public void burbuja(){
        for (int i = 0; i < alumnos.size(); i++) {
            for (int j = 0; j < alumnos.size()-1; j++) {
                if(alumnos.get(j).getCodigo()>alumnos.get(j+1).getCodigo()){
                    //es set,intercambio
                    Alumno t=alumnos.get(j);
                    alumnos.set(j, alumnos.get(j+1));
                    alumnos.set(j+1, t);
                }
            }
        }
    }
    
    public String listar(){
        String lis="";
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno ob = alumnos.get(i);
            lis+=" "+ob.toString()+"\n";
        }
        return lis;
    }
    
    public void eliminarAlumno(int codigo){
        Alumno alel=null;
        
        for (Alumno alumno : alumnos) {
            if(alumno.getCodigo()==codigo){
                alel=alumno;
                break;
            }
        }
        alumnos.remove(alel);
    }
    //organizar por cadenas intentar y arreglar quicksort
    public int busquedaBinaria(int x){
        int ini=0;
	int fin=alumnos.size()-1;
	int i=ini;
	int j=fin;
           
	while(i<=j){
            int p=(i+j)/2;
            if(alumnos.get(p).getCodigo()==x){
                return p;
            }else{
                if(x>alumnos.get(p).getCodigo()){
                    i=p+1;
                }else{
                    j=p-1;
                }
            }	
	}
	return -1;
    }
    
    public String buscar(String nombre){
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equals(nombre)){
                return alumno.toString();
            }
        }
        return null;
    }
    
    /**
     * @return the alumnos
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }   

    public void ordenarPorNombre() {
        Collections.sort(alumnos); // Para ordenar cadenas
    }

    public void ordenarPorEdad() {
        Collections.sort(alumnos, new EdadComparator());//para ordenar enteros o reales
    }

    public void ordenarPromedio() {
        Collections.sort(alumnos, new PromedioComparator());
    }
}
