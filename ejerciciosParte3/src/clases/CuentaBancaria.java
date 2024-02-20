/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Random;

/**
 *
 * @author asus
 */
public class CuentaBancaria {
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;
    
    public CuentaBancaria(String nombreDelTitular, double saldoDeCuenta){
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = (long)(Math.random()*(1000000-0+1));
    }
    
    public void setIngreso(double ingresos){
        if(ingresos>0)
            saldoDeCuenta = saldoDeCuenta + ingresos;
        else
            System.out.println("Ingrese una cantidad valida");
    }
    
    public void setReintegro(double reIntegros){
        if(reIntegros>=0)
            saldoDeCuenta = saldoDeCuenta - reIntegros;
        else
            System.out.println("Ingrese una cantidad valida");
    }
    
    public double getSaldoCuenta(){
        return saldoDeCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "saldoDeCuenta=" + saldoDeCuenta + ", nombreDelTitular=" + nombreDelTitular + ", numeroDeCuenta=" + numeroDeCuenta + '}';
    }
    
    public String transferencia(CuentaBancaria origen, CuentaBancaria destino, double cantidad){
        if(cantidad<0){
            return "Cantidad invalida";
        }
        if(origen.getSaldoCuenta()<cantidad){
            return "Saldo insuficiente";
        }
        origen.setReintegro(cantidad);
        destino.setIngreso(cantidad);
        return "Transferencia exitosa";
    }
    
    
    
}
