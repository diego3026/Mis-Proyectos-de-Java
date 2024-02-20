package datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public interface ArbinAlumno<Alumno> {
    ArbinAlumno<Alumno> izq();
    ArbinAlumno<Alumno> der();
    void enlIzq(ArbinAlumno<Alumno> x);
    void enlDer(ArbinAlumno<Alumno> x);
    
    Alumno obtener();
    void cambiar(Alumno x);
}
