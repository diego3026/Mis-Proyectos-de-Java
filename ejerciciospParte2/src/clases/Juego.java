
package clases;

public class Juego {
    Jugador[] jugadores;
    Revolver revolver;
    
    public Juego(Revolver revolver,int numeroDeJugadores) {
        validarCantidadJugadores(numeroDeJugadores);
        this.revolver = new Revolver();
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    public boolean finDelJuego(){
        for (Jugador jugador : jugadores) {
            if(!jugador.isVivo()){
                return true;
            }
        }
        return false;
    }
    
    public void ronda(){
        for (Jugador jugador : jugadores) {
            jugador.disparar(revolver);
        }
    }

    private void validarCantidadJugadores(int numeroDeJugadores) {
        if(numeroDeJugadores>1 && numeroDeJugadores<=6){
            this.jugadores = new Jugador[numeroDeJugadores];
        }else{
            this.jugadores = new Jugador[6];
        }
    }
}
