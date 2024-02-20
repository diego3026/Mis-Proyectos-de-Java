/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author EQUIPO
 */
public class ArbolCaracter {
    public Arbin<String>crear(){
        Arbin<String>raiz=new ArbinIn<String>("a");
        
        Arbin<String>iz=new ArbinIn<String>("b");
        Arbin<String>der=new ArbinIn<String>("c");
        
        raiz.enLIzq(iz);
        raiz.enDer(der);
        
        raiz.izq().enDer(new ArbinIn<String>("d"));
        raiz.der().enLIzq(new ArbinIn<String>("e"));
        
        
        return raiz;
    }
    
    public int peso(Arbin<String> r){
        if(r==null)
            return 0;
        else
            return 1+peso(r.izq())+peso(r.der());
        
    } 
    
    public void inorden(Arbin<String> r){
        if(r!=null){
            inorden(r.izq());
            System.out.println(r.obtener());
            inorden(r.der());
        }
    }
}

