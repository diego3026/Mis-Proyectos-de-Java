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
public class ArbinDeAlumnos {
    public ArbinAlumno<Alumno> crearArbol(){
        ArbinAlumno<Alumno> raiz = new ArbinAl<>(new Alumno(1234, "diego"));
        raiz.enlIzq(new ArbinAl<>(new Alumno(2345, "jose")));
        raiz.enlDer(new ArbinAl<>(new Alumno(3456, "luna")));
        raiz.der().enlDer(new ArbinAl<>(new Alumno(4567, "laila")));
        raiz.izq().enlDer(new ArbinAl<>(new Alumno(5678, "lula")));
        return raiz;
    }
    
    public void preOrden(ArbinAlumno<Alumno> r){//R I D
        if(r!=null){
            System.out.println(" "+r.obtener());
            preOrden(r.izq());
            preOrden(r.der());
            
        }
    }
    
    public void inOrden(ArbinAlumno<Alumno> r){//I R D
        if(r!=null){
            inOrden(r.izq());
            System.out.println(""+r.obtener());
            inOrden(r.der());
        }
    }
    
    public void postOrden(ArbinAlumno<Alumno> r){//I D R
        if(r!=null){
            postOrden(r.izq());
            postOrden(r.der());
            System.out.println(""+r.obtener());
        }
    }
    
    public int sumaDatosCedula(ArbinAlumno<Alumno> r){
        int suma=0;
        if(r!=null){
            sumaDatosCedula(r.izq());
            sumaDatosCedula(r.der());
            suma+=r.obtener().getCedula();
        }
        return suma;
    }
    
    public boolean buscarCedula(ArbinAlumno<Alumno> r, int x){
        if(r==null){
            return false;
        }else{
            if(r.obtener().getCedula()==x){
                return true;
            }else{
                return (buscarCedula(r.izq(), x)||buscarCedula(r.der(), x));
            }
        }
    }
}
