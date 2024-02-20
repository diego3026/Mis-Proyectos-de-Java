/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class BebidaAzucarada extends Bebida{
    private float porcentajeDeAzucar;
    private boolean promocion;

    public BebidaAzucarada(float porcentajeDeAzucar, boolean promocion, int identificador, int cantidadDeLitros, float precio, String marca) {
        super(identificador, cantidadDeLitros, precio, marca);
        this.porcentajeDeAzucar = porcentajeDeAzucar;
        this.promocion = promocion;
    }

    public float getPorcentajeDeAzucar() {
        return porcentajeDeAzucar;
    }

    public void setPorcentajeDeAzucar(float porcentajeDeAzucar) {
        this.porcentajeDeAzucar = porcentajeDeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    @Override
    public float getPrecio() {
        if(isPromocion()){
            return (float) (super.getPrecio()*0.9);
        }else{
            return super.getPrecio();
        }
    }

    @Override
    public String toString() {
        return super.toString()+",BebidaAzucarada{" + "porcentajeDeAzucar=" + porcentajeDeAzucar + ", promocion=" + promocion + '}';
    }

    
    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }
    
}
