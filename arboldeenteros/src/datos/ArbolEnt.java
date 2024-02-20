/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author asus
 */
public class ArbolEnt {
    private Arbin<Integer> raiz;
    
    public String inorden(Arbin<Integer> r){
        if(r!=null){
            return ""+inorden(r.izq())+r.obtener()+"\n"+inorden(r.der());
        }
        return "";
    }
    
    public int peso(Arbin<Integer> r){
        if(r==null)
            return 0;
        
        return 1+peso(r.izq())+peso(r.der());
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
    
    public Arbin<Integer> menor(Arbin<Integer> r){
        if(r.izq()==null){
            return r;
        }else{
            return menor(r.izq());
        }
    }
    
    public boolean buscar(int x){
        if(raiz!=null){
            return buscar(raiz,x);
        }
        return false;
    }
    
    public void insertar(int x){
        if(getRaiz()==null)
            raiz=new ArbinIm<>(x);
        else{
           insertar(getRaiz(),x); 
        }   
    }
 
    /**
     * @return the raiz
     */
    public Arbin<Integer> getRaiz() {
        return raiz;
    }

    private void insertar(Arbin<Integer> r, int x) {
        if(x<r.obtener()){
            if(r.izq()==null){
                r.enlIzq(new ArbinIm<>(x));
            }else{
                insertar(r.izq(), x);
            }
        }else{
            if(r.der()==null){
                r.enlDer(new ArbinIm<>(x));
            }else{
                insertar(r.der(), x);
            }
        }
    }

    private boolean buscar(Arbin<Integer> r, int x) {
        if(r.obtener()==x){
            return true;
        }else{
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
        if(r.izq()==null&&r.der()==null){ 
            return null;
        }else{
            if(r.izq()==null){
                return r.der();
            }else if(r.der()==null){
                return r.izq();
            }else{
                Arbin<Integer> may=mayor(r.izq());
                r.cambiar(may.obtener());
                r.enlIzq(eliminar(r.izq(), may.obtener()));
                return r;
            }
        }
    }
}
