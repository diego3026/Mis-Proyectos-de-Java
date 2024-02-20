package datos;
 
public class Celular implements Comparable<Celular>{
    private int id;
    private String marca;
    private float precio;
    private String modelo;
    private int anno;

    public Celular(int id, String marca, float precio, String modelo, int anno) {
        this.id = id;
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.anno = anno;
    }

    public Celular(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    @Override
    public String toString() {
        return "Celular{" + "id=" + id + ", marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", anno=" + anno + '}';
    }
    
     
 
    public int getId() {
        return id;
    }

 
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }
 
    public void setPrecio(float precio) {
        this.precio = precio;
    }
 
    public String getModelo() {
        return modelo;
    }

 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public int getAnno() {
        return anno;
    }
 
    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public int compareTo(Celular t) {
            return this.modelo.compareTo(t.getModelo());
    }

}

