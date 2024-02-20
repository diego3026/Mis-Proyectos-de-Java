/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosrel;

import datos.Arbin;
import datos.ArbolEnl;
import java.io.Serializable;

/**
 *
 * @author ESTUDIANTE
 */
public class ConjuntoRelojes implements Serializable{
    private Arbin<Reloj> raiz;
    private Reloj rel;
    private float mayor;

    public void insertar(Reloj x){
        if(raiz==null)
            raiz = new ArbolEnl<>(x);
        else{
            insertar(raiz,x);
        }
    }
    
    String con;
    public String mostrar(){
        con="";
        inorden(raiz);
        return con;
    }
    
    public Reloj masCaro(){
        mayor=0;
        masCostoso(raiz);
        return rel;
    }
    
    /**
     * @return the raiz
     */
    public Arbin<Reloj> getRaiz() {
        return raiz;
    }

    private void insertar(Arbin<Reloj> r, Reloj x) {
        if(x.getRef().compareTo(r.obtener().getRef())<0){
            if(r.izq()==null){
                r.enlIzq(new ArbolEnl<>(x));
            }else{
                insertar(r.izq(), x);
            }
        }else{
            if(x.getRef().compareTo(r.obtener().getRef())>0){
                if(r.der()==null){
                    r.enlDer(new ArbolEnl<>(x));
                }else{
                    insertar(r.der(), x);
                }
            }else{
                throw new UnsupportedOperationException("no se puede insertar");
            }
        }
    }

    private void inorden(Arbin<Reloj> r) {
        if(r!=null){
            inorden(r.izq());
            con+=r.obtener().toString()+"\n";
            inorden(r.der());
        }
    }

    private void masCostoso(Arbin<Reloj> r) {
        if(r!=null){
            if(r.obtener().getCosto()>mayor){
                mayor=r.obtener().getCosto();
                rel=r.obtener();
            }
            masCostoso(r.izq());
            masCostoso(r.der());
        }
    }
}
