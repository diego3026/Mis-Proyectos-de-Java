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
public class ArbolStr {
    private Arbin<String> raiz;

    public void insertar(String x){
        if(raiz==null){
            raiz=new ArbolIm<>(x);
        }else{
            insertar(getRaiz(),x);
        }
    }
    
    public String mostrar(Arbin<String> r){
        if(r!=null){
            return ""+mostrar(r.izq())+r.obtener()+"\n"+mostrar(r.der());
        }
        return "";
    }
    
    public void eliminar(String x){
        if(buscar(x)){
            raiz=eliminar(raiz,x);
        }
    }
    
    public Arbin<String> mayor(Arbin<String> r){
        if(r.der()==null){
            return r;
        }else{
            return mayor(r.der());
        }
    }
    
    public boolean buscar(String x){
        if(raiz!=null){
            return buscar(raiz,x);
        }else{
            return false;
        }
    }
    
    /**
     * @return the raiz
     */
    public Arbin<String> getRaiz() {
        return raiz;
    }

    private void insertar(Arbin<String> r, String x) {
        if(r.obtener().compareTo(x)>1){
            if(r.izq()==null){
                r.enlIzq(new ArbolIm<>(x));
            }else{
                insertar(r.izq(), x);
            }
        }else{
            if(r.der()==null){
                r.enlDer(new ArbolIm<>(x));
            }else{
                insertar(r.der(), x);
            }
        }
    }

    private boolean buscar(Arbin<String> r, String x) {
        if(r.obtener().equals(x)){
            return true;
        }else{
            if(r.obtener().compareTo(x)>1){
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

    private Arbin<String> eliminar(Arbin<String> r, String x) {
        if(r.obtener().equals(x)){
            return borrar(r);
        }else{
            if(r.obtener().compareTo(x)>1){
                r.enlIzq(eliminar(r.izq(), x));
            }else{
                r.enlDer(eliminar(r.der(), x));
            }
            return r;
        }
    }

    private Arbin<String> borrar(Arbin<String> r) {
        if(r.izq()==null && r.der()==null){
            return null;
        }else{
            if(r.izq()==null){
                return r.der();
            }else if(r.der()==null){
                return r.izq();
            }else{
                Arbin<String> may = mayor(r.izq());
                r.cambiar(may.obtener());
                r.enlIzq(eliminar(r.izq(), may.obtener()));
                return r;
            }
        }
    }
    public static void main(String[] args) {
        ArbolStr ar = new ArbolStr();
        
        ar.insertar("diego");
        ar.insertar("jose");
        ar.insertar("laila");
        ar.insertar("luna");
        
        System.out.println(""+ar.mostrar(ar.getRaiz()));
        System.out.println("el mayor es -> "+ar.mayor(ar.getRaiz()).obtener());
        System.out.println("el valor esta? "+ar.buscar("diego"));
        ar.eliminar("laila");
        System.out.println(""+ar.mostrar(ar.getRaiz()));
    }
}
