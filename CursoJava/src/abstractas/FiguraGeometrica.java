
package abstractas;

public abstract class FiguraGeometrica {
    protected String tipoDeFigura;
    
    protected FiguraGeometrica(String tipoDeFigura){
        this.tipoDeFigura = tipoDeFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoDeFigura=" + tipoDeFigura + '}';
    }
    
    public abstract void dibujar(); 

    public String getTipoDeFigura() {
        return tipoDeFigura;
    }

    public void setTipoDeFigura(String tipoDeFigura) {
        this.tipoDeFigura = tipoDeFigura;
    }
    
}
