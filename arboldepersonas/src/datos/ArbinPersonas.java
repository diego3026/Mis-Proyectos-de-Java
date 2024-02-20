/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.LinkedList;

/**
 *
 * @author ESTUDIANTE
 */
public class ArbinPersonas {
    public Arbin<Persona> crearArbol(){
        Arbin<Persona> raiz = new ArbinIm<>(new Persona("diego", 19, "colombia"));
        raiz.enlDer(new ArbinIm<>(new Persona("jose", 17, "colombia")));
        raiz.enlIzq(new ArbinIm<>(new Persona("luna", 14, "colombia")));
        raiz.der().enlDer(new ArbinIm<>(new Persona("aldair", 30, "españa")));
        raiz.izq().enlDer(new ArbinIm<>(new Persona("laila", 18, "colombia")));
        return raiz;
    }
    
    public void inOrden(Arbin<Persona> r){
        if(r!=null){in
            inOrden(r.izq());
            System.out.println(""+r.obtener());
            inOrden(r.der());
        }
    }
    
    public void listasPersonasP(Arbin<Persona> r, String x){
        LinkedList<Arbin<Persona>> paises = new LinkedList<>();
        if(r!=null){
            if(r.obtener().getPais()==x){
                paises.add(r);
            }else{
                listasPersonasP(r.izq(), x);
                listasPersonasP(r.der(), x);
            }
        }
        for (int i = 0; i < paises.size(); i++) {
            System.out.println(""+paises.get(i).obtener());
        }
    }
    
    public float promedio(Arbin<Persona> r){
        float promedio=0;
        float suma=0;
        int c=0;
        
        if(r==null){
            return 0;
        }else{
            c++;
            promedio(r.izq());
            promedio(r.der());
            suma+=r.obtener().getEdad();
        }
        promedio=(suma/c);
        return promedio;
    }
    
    int sinReferidos=0;
    public void visita(Arbin<Persona> r){
        if(r.izq()==null && r.der()==null){
            sinReferidos++;
        }
    }
    
    public int referidos(Arbin<Persona> r){
        if(r!=null){
            visita(r);
            referidos(r.izq());
            referidos(r.der());
        }
        return sinReferidos;
    }
    Arbin<Persona> b;
    
    public Arbin<Persona> buscarPersona(Arbin<Persona> r, String x){
        if(r!=null){
            verificarPersona(r,x);
            buscarPersona(r.izq(), x);
            buscarPersona(r.der(), x);
        }
        return b;
    }
    
    public void verificarPersona(Arbin<Persona> r, String x){
        if(r.obtener().getNombre().equals(x)){
            b=r;
        }
    }
    
    public int peso(Arbin<Persona> r){
        if(r==null){
            return 0;
        }else{
            return 1+peso(r.izq())+peso(r.der());
        }
    }
    
    public void verificarSiEsta(Arbin<Persona> r,Persona x){
        if(r.obtener()==x){
            if(r.izq()==null){
                
            }else if(r.der()==null){
                
            }else{
                verificarSiEsta(r.izq(), x);
                verificarSiEsta(r.der(), x);
            }
        }
    }
    
    public void insertarMultinivel(Arbin<Persona> r, Persona x){
        if(r!=null){
            insertarMultinivel(r.izq(), x);
            insertarMultinivel(r.der(), x);
            verificarSiEsta(r,x);
        }
    }

    public static void main(String[] args) {
        ArbinPersonas arb = new ArbinPersonas();
        Arbin<Persona> raiz = arb.crearArbol();
        arb.inOrden(raiz);
        System.out.println("\nlista de personas por pais\n");
        arb.listasPersonasP(raiz, "españa");
        System.out.println("promedio de edades es: "+arb.promedio(raiz));
        System.out.println("personas sin referidos es: "+arb.referidos(raiz));
        
        Arbin<Persona> personita = arb.buscarPersona(raiz, "diego");
        if(personita!=null){
            int ganancias=(arb.peso(personita)-1)*100;
            System.out.println("las ganancias por los descendiente de "+personita.obtener().getNombre()+" es: "+ganancias);
        }
        
        Persona y = (new Persona("pepito", 20, "colombia"));

    }
}    