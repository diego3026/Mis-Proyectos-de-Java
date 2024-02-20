/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongrafica2;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona {
    public int Id;
    public String Nombre;
    public String Email;

    public Persona() {
        
    }

    public Persona(int Id, String Nombre, String Email) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Email = Email;
    }

    @Override
    public String toString() {
        return Id+" - "+Nombre+" - "+Email+"\n";
    }
    
    
}
