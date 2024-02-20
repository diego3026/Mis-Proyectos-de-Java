/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

/**
 *
 * @author asus
 */
public class Cola<Tdato> {
    private Nodo inicio;
    private Nodo termino;
    
    public Cola(){
        inicio=null;
        termino=null;
    }
    
     public void insertar(int dato){
        Nodo i=new Nodo(dato);
        i.setNext(null);
        if(inicio==null & termino==null){
            inicio=i;
            termino=i;
        }
        termino.setNext(i);
        termino=termino.getNext();
    }
     
    //Metodo extraer dato
    public Tdato extraer(){
        Tdato dato=(Tdato) inicio.getDato();
        inicio=inicio.getNext();
        return dato;
    }

    //Metodo para comprobar que la cola no esta vacia
    public boolean estaVacia(){
        boolean cola=false;
        if(inicio==null & termino==null){
            cola=true;
            System.out.println("La cola esta vacia");
        }
        else{
            System.out.println("La cola no esta vacia");
            cola=false;
        }
        return cola;
    }

    public int contar(){
        int contador=0;
        Nodo c=this.inicio;
        while(c!=null){
            contador++;
            c=c.getNext();
        }
        System.out.println("Numero de datos en la cola: "+contador);
        return contador;
    }

    public String toString(){
        Nodo c=this.inicio;
        String s="";
        while(c!=null){
            s=s+c.toString();
            c=c.getNext();
        }
        return s;
    } 
}
