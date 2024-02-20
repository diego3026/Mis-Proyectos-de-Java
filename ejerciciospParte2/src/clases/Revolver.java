package clases;

class Revolver {
    private int posicionActual;
    private int posicionBala;

    public Revolver(int posicionActual, int posicionBala) {
        this.posicionActual = posicionActual;
        this.posicionBala = posicionBala;
    }
    
    public Revolver(){
        this.posicionActual = (int) (Math.random()*7);        
        this.posicionBala = (int) (Math.random()*7);
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionBala=" + posicionBala + '}';
    }
    
    public boolean disparar(){
        boolean exito = false;
        
        if (posicionBala==posicionActual){
            exito = true;
        }
        
        siguienteBala();
        
        return exito;
    }
    
    public void siguienteBala(){
        if (posicionActual == 6){
            posicionActual = 1;
        }else{
            posicionActual++;
        }
    }
    
    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }
    
}
