/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Repartidor extends Empleado{
    private String zona;

    public Repartidor(String zona, String nombre, int edad, float salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public boolean plus() {
        if(super.getEdad()<25 && zona.equals("zona 3")){
            super.setSalario(super.getSalario()+plus);
            return true;
        }
        return false;
    }
    
    
}
