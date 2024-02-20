/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Almacen {
    Bebida[][] bebidas;
    
    public Almacen(int filas, int columnas){
        bebidas = new Bebida[filas][columnas];
    }
    
    public Almacen(){
        bebidas = new Bebida[10][10];
    }

    public Bebida[][] getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida[][] bebidas) {
        this.bebidas = bebidas;
    }
    
    public float precioTotalDeBebidas(){
        float precioTotal = 0;
        for (int i = 0; i < bebidas.length; i++) {
            for (int j = 0; j < bebidas[0].length; j++) {
                precioTotal+=bebidas[i][j].getPrecio();
            }
        }
        return precioTotal;
    }
    
    public float precioTotalDeMarcaDeBebidas(String marca){
        float precioTotal = 0;
        
        for (int i = 0; i < bebidas.length; i++) {
            for (int j = 0; j < bebidas[0].length; j++) {
                String marcaBebida = bebidas[i][j].getMarca();
                if(marcaBebida.equalsIgnoreCase(marca)){
                    precioTotal+=bebidas[i][j].getPrecio();
                }
            }
        }
        return precioTotal;
    }
    
    public float precioTotalDeEstanteria(int columna){
        float precioTotal = 0;
        
        for (int i = 0; i < bebidas.length; i++) {
            for (int j = 0; j < bebidas[0].length; j++) {
                if(j==columna){
                    precioTotal+=bebidas[i][j].getPrecio();
                }
            }
        }
        return precioTotal;
    }
    
    public void agregarProducto(Bebida bebida){
        boolean repetido = false;
        boolean agregado = false;
        
        for (int i = 0; i < bebidas.length; i++) {
            for (int j = 0; j < bebidas[0].length; j++) {
                int identificadorBebida = bebidas[i][j].getIdentificador();
                if(identificadorBebida == bebida.getIdentificador()){
                    repetido = true;
                }
            }
        }
        
        for (int i = 0; i < bebidas.length && !agregado; i++) {
            for (int j = 0; j < bebidas[0].length && !agregado; j++) {
                if(bebidas[i][j]==null){
                    bebidas[i][j]=bebida;
                    System.out.println("AGREGADO");
                }
            }
        }
    }
    
    public void eliminarProducto(int identificador){
        boolean eliminado = false;
        
        for (int i = 0; i < bebidas.length && !eliminado; i++) {
            for (int j = 0; j < bebidas[0].length && !eliminado; j++) {
                if(bebidas[i][j].getIdentificador()==identificador){
                    bebidas[i][j]=null;
                    System.out.println("ElIMINADO");
                }
            }
        }
    }
    
    public void mostrarBebidas() {
        for (int i = 0; i < bebidas.length; i++) {
            for (int j = 0; j < bebidas[0].length; j++) {
                if (bebidas[i][j] != null) {
                    System.out.println("fila " + i + ", columna: " + j + " Bebida: " + bebidas[i][j].toString());
                }
            }
        }
 
    }
    
}
