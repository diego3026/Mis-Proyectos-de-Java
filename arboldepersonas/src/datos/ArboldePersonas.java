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
public class ArboldePersonas {
    private Arbin<Persona> raiz;
    
    public void insertar(Persona x){
        if(raiz==null){
            raiz = new ArbinIm<>(x);
        }else{
            insertar(raiz,x);
        }
    }
    
    public String mostrar(Arbin<Persona> r){
        if(r!=null){
            return ""+mostrar(r.izq())+r.obtener()+mostrar(r.der());
        }
        return "";
    }
    
    /**
     * @return the raiz
     */
    public Arbin<Persona> getRaiz() {
        return raiz;
    }

    private void insertar(Arbin<Persona> r, Persona x) {
        if(x.getEdad()<r.obtener().getEdad()){
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
    
    public Arbin<Persona> mayor(Arbin<Persona> r){
        if(r.der()==null){
            return r;
        }else{
            return mayor(r.der());
        }
    }
    
    public Persona buscarEdad(int x){
        if(raiz==null){
            return null;
        }else{
            return buscarEdad(raiz,x);
        }
    }

    private Persona buscarEdad(Arbin<Persona> r, int x) {
        if(r.obtener().getEdad()==x){
            return r.obtener();
        }else{
            if(x<r.obtener().getEdad()){
                if(r.izq()!=null){
                    return buscarEdad(r.izq(), x);
                }else{
                    return null;
                }
            }else{
                if(r.der()!=null){
                    return buscarEdad(r.der(), x);
                }else{
                    return null;
                }
            }
        }
    }
    
    public Persona buscarNombre(Arbin<Persona> r, String x){
        if(raiz!=null){
            buscarNombre(r.izq(),x);
            if(r.obtener().getNombre().equals(x)){
                return r.obtener();
            }
            buscarNombre(r.der(), x);
        }
        return null;
    }
    
    public void eliminar(int x){
        if(buscarEdad(x)!=null){
            raiz=eliminar(raiz,x);
        }
    }

    private Arbin<Persona> eliminar(Arbin<Persona> r, int x) {
        if(r.obtener().getEdad()==x){
            return borrar(r);
        }else{
            if(x<r.obtener().getEdad()){
                r.enlIzq(eliminar(r.izq(), x));
            }else{
                r.enlDer(eliminar(r.der(), x));
            }
            return r;
        }
    }

    private Arbin<Persona> borrar(Arbin<Persona> r) {
        if(r.izq()==null && r.der()==null){
            return null;
        }else{
            if(r.izq()==null){
                return r.izq();
            }else if(r.der()==null){
                return r.der();
            }else{
                Arbin<Persona> may = mayor(r);
                r.cambiar(may.obtener());
                r.enlIzq(eliminar(r.izq(), may.obtener().getEdad()));
                return r;
            }
        }
    }
}
