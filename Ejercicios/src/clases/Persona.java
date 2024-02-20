/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Objects;

/**
 *
 * @author asus
 */
public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private String sexo;
    private float peso;
    private float altura;
    
    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = "";
        this.peso = 0.0f;
        this.altura = 0.0f;
    }
    
    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        if(comprobarSexo(sexo)){
            this.sexo = sexo;
        }else{
            System.out.println("Ingrese un sexo valido H para hombre y M para mujer");
        }
        this.peso = 0.0f;
        this.altura = 0.0f;
    }
    
    public Persona(String nombre, int edad, int dni,String sexo, float peso, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        
        if(comprobarSexo(sexo)){
            this.sexo = sexo;
        }else{
            this.sexo = "H";
        }
    }
    
    public int calcularIMC(float peso, float altura){
        float pesoIdeal = (float) (peso/(Math.pow(altura, 2)));
        
        if(pesoIdeal<20)
            return -1;
        else if (pesoIdeal>20 && pesoIdeal<25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
        return this.edad>=18;
    }
    
    public static boolean comprobarSexo(String sexo){
        return (sexo.equals("H")|| "M".equals(sexo));
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public int generarDNI(){
        return (int) (Math.random()*8);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setSexo(String sexo){
        if(comprobarSexo(sexo))
            this.sexo = sexo;
        else
            this.sexo = "M";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + this.edad;
        hash = 29 * hash + this.dni;
        hash = 29 * hash + Objects.hashCode(this.sexo);
        hash = 29 * hash + Float.floatToIntBits(this.peso);
        hash = 29 * hash + Float.floatToIntBits(this.altura);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.dni != other.dni) {
            return false;
        }
        if (Float.floatToIntBits(this.peso) != Float.floatToIntBits(other.peso)) {
            return false;
        }
        if (Float.floatToIntBits(this.altura) != Float.floatToIntBits(other.altura)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.sexo, other.sexo);
    }
    
}
