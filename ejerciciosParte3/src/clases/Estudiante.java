/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Estudiante {
    private String nombre;
    private int id;
    private ArrayList<Asignatura> asignaturas;

    public Estudiante(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", id=" + id + ", asignaturas=" + asignaturas + '}';
    }
    
    public void getPromedioNotasDeAsignaturas(){
        for (Asignatura asignatura : asignaturas) {
            System.out.printf("nombre de asignatura = %s y nota = %f \n",asignatura.getNombreAsignatura(),asignatura.getNotaDefinitiva());
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addAsignatura(String nombre){
        asignaturas.add(new Asignatura(nombre));
    }
    public void addAsignatura(String nombre,float primeraNota,float segundaNota, float terceraNota){
        asignaturas.add(new Asignatura(nombre, primeraNota, segundaNota, terceraNota));
    }
}
