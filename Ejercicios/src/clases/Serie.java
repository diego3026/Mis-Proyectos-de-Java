package clases;

public class Serie implements Entregable{
    private String titulo;
    private int numeroDetemporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    
    public Serie(){
        this.titulo = "";
        this.numeroDetemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroDetemporadas = 3;
        this.entregado = false;
        this.genero = "";
    }

    public Serie(String titulo, int numeroDetemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDetemporadas = numeroDetemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDetemporadas() {
        return numeroDetemporadas;
    }

    public void setNumeroDetemporadas(int numeroDetemporadas) {
        this.numeroDetemporadas = numeroDetemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString(){
        return "Serie->{titulo: "+this.titulo+",numero de temporadas: "+this.numeroDetemporadas+",entregado: "+this.entregado+",genero: "+this.genero+",creador: "+this.creador+"}";
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
