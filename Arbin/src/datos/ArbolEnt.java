/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author ESTUDIANTE
 */
public class ArbolEnt {
    public Arbin<Integer> crearArbol(){
        Arbin<Integer> raiz = new ArbinIn<>(2);
        Arbin<Integer> izq = new ArbinIn<>(7);
        raiz.enLIzq(izq);
        raiz.enDer(new ArbinIn<>(5));
        izq.enDer(new ArbinIn<>(6));
        raiz.der().enDer(new ArbinIn<>(9));
        return raiz;
    }
    
    public void preOrden(Arbin<Integer> r){//R I D
        if(r!=null){
            System.out.println(" "+r.obtener());
            preOrden(r.izq());
            preOrden(r.der());
            
        }
    }
    
    public void inOrden(Arbin<Integer> r){//I R D
        if(r!=null){
            inOrden(r.izq());
            System.out.println(""+r.obtener());
            inOrden(r.der());
        }
    }
    
    public void postOrden(Arbin<Integer> r){//I D R
        if(r!=null){
            postOrden(r.izq());
            postOrden(r.der());
            System.out.println(""+r.obtener());
        }
    }
    
    public int sumaDatos(Arbin<Integer> r){
        int suma=0;
        if(r!=null){
            sumaDatos(r.izq());
            sumaDatos(r.der());
            suma+=r.obtener();
        }
        return suma;
    }
    
    int mayor=0;
    public int mayor(Arbin<Integer> r){
       if(r!=null){
           visita(r);
           mayor(r.izq());
           mayor(r.der());
       }
       return mayor;
    }
    
    public boolean buscar(Arbin<Integer> r, int x){
        if(r==null)
            return false;
        else{
            if(r.obtener()==x){
                return true;
            }else{
                return(buscar(r.der(), x)||buscar(r.izq(), x));
            }
        }            
    }
    
    
    
    int c=0;
    public int peso(Arbin<Integer> r){
        if(r!=null){
            c++;
            peso(r.izq());
            peso(r.der());
        }
        return c;
    }
    
    public static void main(String[] args) {
        ArbolEnt ob=new ArbolEnt();
        Arbin<Integer> raiz= ob.crearArbol();
        //ob.preOrden(raiz); 
        //ob.inOrden(raiz);
        ob.postOrden(raiz);
        int pes =ob.peso(raiz);
        System.out.println(" Peso es "+pes);
        System.out.println("La suma de todos los valores es: "+ob.sumaDatos(raiz));
        System.out.println(ob.buscar(raiz,5));
        ob.reflejo(raiz);
        ob.postOrden(raiz);
        System.out.println(ob.eshoja(raiz, 9));
    }
    int pos;
    boolean eshoja(Arbin<Integer> r, int x){
        pos=0;
        if(r!=null){
            visita(r,x);
        }
        return visita(r,x);
    }
    
    Arbin<Integer> aux;
     
    public Arbin<Integer> reflejo(Arbin<Integer> r){
        if(r!=null){
            aux=r.der();
            r.enDer(r.izq());
            r.enLIzq(aux);
            
            reflejo(r.izq());
            reflejo(r.der());
        }
        return r;
    }
    
    public int visita(Arbin<Integer> r) {
        if(r.obtener()>mayor){
            mayor=r.obtener();
        }
        return mayor;
    }

    private boolean visita(Arbin<Integer> r, int x) {
        if(r!=null){
            if(pos==x && r.izq()==null && r.der()==null){
                return true;
            }
            visita(r.izq(),x);
            visita(r.der(),x);
            pos++;
        }
        return false;
    }
}

//recorrido inorden y posorden
//sumar todos los datos 