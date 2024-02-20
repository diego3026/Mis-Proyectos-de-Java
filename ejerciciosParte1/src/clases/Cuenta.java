package clases;

public class Cuenta {
    private String nombreDelCliente;
    private String numeroDeCuenta;
    private double tipoDeInteres;
    private double saldo;
    
    public Cuenta(){
        this.nombreDelCliente = "";
        this.numeroDeCuenta = "";
        this.tipoDeInteres = 0;
        this.saldo = 0;
    }
    
    public Cuenta(String nombreDelCliente, String numeroDeCuenta, double tipoDeInteres, double saldo) {
        this.nombreDelCliente = nombreDelCliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.tipoDeInteres = tipoDeInteres;
        this.saldo = saldo;
    }
    
    public Cuenta(Cuenta cuenta) {
        this.nombreDelCliente = cuenta.nombreDelCliente;
        this.numeroDeCuenta = cuenta.numeroDeCuenta;
        this.saldo = cuenta.saldo;
        this.tipoDeInteres = cuenta.tipoDeInteres;
    }
    
    public void ingreso(double cantidad){
        if(cantidad>0){
            this.saldo+=cantidad;
        }
    } 

    public boolean reintegro(double cantidad){
        if(this.saldo-cantidad>0 && cantidad>0){
            this.saldo-=cantidad;
            return true;
        }
        return false;
    }
    
    public void transferencia(Cuenta cuenta,double importe){
        if(reintegro(importe)==false){
            cuenta.ingreso(importe);
        }else{
            System.out.println("Fondo insuficiente");
        }
    }
    
    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
