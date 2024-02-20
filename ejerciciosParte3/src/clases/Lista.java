/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author asus
 */
public class Lista {
    private Nodo inicio;
    private int tamanio;
    
    public void Lista(){
        inicio = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlFinal(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else{
            Nodo aux = inicio;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }
       
    public void agregarAlInicio(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }
    
    public void insertarPorReferencia(int referencia, int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (!esVacia()) {
            if (buscar(referencia)) {
                Nodo aux = inicio;
                while (aux.getValor() != referencia) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(siguiente);
                
                tamanio++;
            }
        }
    }
    
    public void insertarPorPosicion(int posicion, int valor){
        if(posicion>=0 && posicion<=tamanio){
            Nodo nuevo = new Nodo();
            nuevo.setValor(valor);
            if(posicion == 0){
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            else{
                if(posicion == tamanio){
                    Nodo aux = inicio;
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);              
                }
                else{
                    Nodo aux = inicio;
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    Nodo siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamanio++;
        }
    }
    
    public int getValor(int posicion) throws Exception{
        if(posicion>=0 && posicion<tamanio){
            if (posicion == 0) {
                return inicio.getValor();
            }else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.getValor();
            }
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
    
    public boolean buscar(int referencia){
        Nodo aux = inicio;
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if (referencia == aux.getValor()){
                encontrado = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }
    
    public int getPosicion(int referencia) throws Exception{
        if (buscar(referencia)) {
            Nodo aux = inicio;
            int cont = 0;
            while(referencia != aux.getValor()){
                cont ++;
                aux = aux.getSiguiente();
            }
            return cont;
        } else {
            throw new Exception("Valor inexistente en la lista.");
        }
    }
    public void editarPorReferencia(int referencia, int valor){
        if (buscar(referencia)) {
            Nodo aux = inicio;
            while(aux.getValor() != referencia){
                aux = aux.getSiguiente();
            }
            aux.setValor(valor);
        }
    }
    
    public void editarPorPosicion(int posicion , int valor){
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                inicio.setValor(valor);
            }
            else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setValor(valor);
            }
        }
    }
    
    public void removerPorReferencia(int referencia){
        if (buscar(referencia)) {
            if (inicio.getValor() == referencia) {
                inicio = inicio.getSiguiente();
            } else{
                Nodo aux = inicio;
                while(aux.getSiguiente().getValor() != referencia){
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);  
            }
            tamanio--;
        }
    }
    
    public void removerPorPosicion(int posicion){
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                inicio = inicio.getSiguiente();
            }
            else{
                Nodo aux = inicio;
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamanio--;
        }
    }
    
    public void eliminar(){
        inicio = null;
        tamanio = 0;
    }
    public void listar(){
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while(aux != null){
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
}
