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
public class ArbinAl<Alumno> implements ArbinAlumno<Alumno>{
    Alumno dato;
    ArbinAlumno<Alumno> i;
    ArbinAlumno<Alumno> d;
    
    public ArbinAl(Alumno dato) {
        this.dato = dato;
    }
    
    @Override
    public ArbinAlumno<Alumno> izq() {
        return i;
    }

    @Override
    public ArbinAlumno<Alumno> der() {
        return d;
    }

    @Override
    public void enlIzq(ArbinAlumno<Alumno> x) {
        i=x;
    }

    @Override
    public void enlDer(ArbinAlumno<Alumno> x) {
        d=x;
    }

    @Override
    public Alumno obtener() {
        return dato;
    }

    @Override
    public void cambiar(Alumno x) {
        dato=x;
    }
    
}
