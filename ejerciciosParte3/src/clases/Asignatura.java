/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
class Asignatura {
    private String nombreAsignatura;
    private float primeraNota;
    private float segundaNota;
    private float terceraNota;
    
    public Asignatura(String nombreAsignatura){
        this.nombreAsignatura = nombreAsignatura;
    } 

    public Asignatura(String nombreAsignatura, float primeraNota, float segundaNota, float terceraNota) {
        this.nombreAsignatura = nombreAsignatura;
        this.primeraNota = primeraNota;
        this.segundaNota = segundaNota;
        this.terceraNota = terceraNota;
    }

    public float getNotaDefinitiva(){
        return (primeraNota + segundaNota + terceraNota)/3;
    }
    
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public float getPrimeraNota() {
        return primeraNota;
    }

    public void setPrimeraNota(float primeraNota) {
        this.primeraNota = primeraNota;
    }

    public float getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(float segundaNota) {
        this.segundaNota = segundaNota;
    }

    public float getTerceraNota() {
        return terceraNota;
    }

    public void setTerceraNota(float terceraNota) {
        this.terceraNota = terceraNota;
    }
    
    
}
