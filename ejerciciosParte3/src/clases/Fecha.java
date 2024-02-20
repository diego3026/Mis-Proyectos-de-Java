/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(){
    }
    
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", año=" + año + '}';
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public boolean comprobarFechaCorrecta(){
        if(año>0 && mes<=12 && mes>0 && dia<=31 && dia>0){
            return true;
        }
        return false;
    }
    
    public void modificarFechaPorDiaSiguiente(){
        año=año+1;
        mes=mes+1;
        dia=dia+1;
    }
}
