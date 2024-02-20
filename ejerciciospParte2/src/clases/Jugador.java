
package clases;

public class Jugador {
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.vivo = true;
    }
    
    public void disparar(Revolver r){
        if (r.disparar() && this.vivo){
            this.vivo = false;
            System.out.println("Ha muerto");
        }else{
            System.out.println("Te salvaste");
        }
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }   
    
}
