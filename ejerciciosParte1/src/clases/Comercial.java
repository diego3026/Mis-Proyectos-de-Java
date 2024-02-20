/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Comercial extends Empleado{
    private double comision;

    public Comercial(double comision, String nombre, int edad, float salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public boolean plus() {
        int edad = super.getEdad();
        float salario = super.getSalario();
        
        if(edad>30 && comision>200){
            super.setSalario(salario+plus);
            return true;
        }
        return false;
    }
    
    
}
