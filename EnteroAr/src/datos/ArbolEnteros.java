/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import static java.time.Clock.system;

/**
 *
 * @author CARLOS
 */
public class ArbolEnteros {
    private Arbin<Integer> raiz; 
    
    public void insertar(int x){
        if(getRaiz()==null){
            raiz=new ArbolEnl<>(x);
        }else{
            insertar(getRaiz(),x);
        }
    
    }
   public Arbin<Integer> crearArbol(){
       Arbin<Integer> raiz=new ArbolEnl<>(2);
       Arbin<Integer> izq=new ArbolEnl<>(7);
       raiz.enlIzq(izq);
       raiz.enlDer(new ArbolEnl<>(5));
       izq.enlDer(new ArbolEnl<>(6));
       raiz.der().enlDer(new ArbolEnl<>(9));
       
       return raiz;
       
   }
   // pre orden r-i-d
    public void preorden(Arbin<Integer> r){
        if(r!=null){
            System.out.println(" "+r.obtener());
            preorden(r.izq());
            preorden(r.der());
        }
    }
    public void inorden(Arbin<Integer> r){
       if(r!=null){
           inorden(r.izq());
           System.out.println(" "+r.obtener());
           inorden(r.der());
       }
   }
   //inorde
   //posorden
   //peso del arbol
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
       ArbolEnteros ob=new ArbolEnteros();
       //Arbin<Integer> raiz = ob.crearArbol();
       //ob.preorden(raiz);
      
        //System.out.println(" Peso es "+pes);
        ob.insertar(10);
        ob.insertar(4);
        ob.insertar(20);
        ob.insertar(3);
        ob.insertar(12);
        
        ob.inorden(ob.getRaiz());
        int pes=ob.peso(ob.getRaiz());
        System.out.println("peso es "+pes);
        System.out.println("el numero esta ? "+ob.buscar(5));
        ob.eliminar(3);
        ob.inorden(ob.getRaiz());
    }
    
    public void eliminar(int x){
        if(buscar(x)){
            raiz=eliminar(raiz,x);
        }
    }
    
    public Arbin<Integer> mayor(Arbin<Integer> r){
        if(r.der()==null){
            return r;
        }else{
            return mayor(r.der());
        }
    }
    
    public boolean buscar(int x){
        if(raiz!=null){
            return buscar(raiz,x);
        }
        return false;
    }

    private void insertar(Arbin<Integer> r, int x) {
        if(x<r.obtener()){
            if(r.izq()==null)
                r.enlIzq(new ArbolEnl<>(x));
            else{
                insertar(r.izq(),x);   
            }
        }else{
            if(r.der()==null)
                r.enlDer(new ArbolEnl<>(x));
            else 
                insertar(r.der(),x);
        }
    }

    /**
     * @return the raiz
     */
    public Arbin<Integer> getRaiz() {
        return raiz;
    }

    private boolean buscar(Arbin<Integer> r, int x) {
        if(r.obtener()==x)
            return true;
        else{
            if(x<r.obtener()){
                if(r.izq()!=null){
                    return buscar(r.izq(), x);
                }else{
                    return false;
                }    
            }else{
                if(r.der()!=null){
                    return buscar(r.der(), x);
                }else{
                    return false;
                }
            }
        }
    }

    private Arbin<Integer> eliminar(Arbin<Integer> r, int x) {
        if(r.obtener()==x){
            return borrar(r);
        }else{
            if(x<r.obtener()){
                r.enlIzq(eliminar(r.izq(), x));
            }else{
                r.enlDer(eliminar(r.der(), x));
            }
            return r;
        }
    }

    private Arbin<Integer> borrar(Arbin<Integer> r) {
        if(r.izq()==null && r.der()==null){
            return null;//es una hoja
        }else{
            if(r.izq()==null)
                return r.der();
            else if(r.der()==null){
                return r.izq();
            }else{
                //tiene dos hijos
                Arbin<Integer> may=mayor(r.izq());
                r.cambiar(may.obtener());
                r.enlIzq(eliminar(r.izq(), may.obtener()));
                return r;
            }
        }
    }
}
