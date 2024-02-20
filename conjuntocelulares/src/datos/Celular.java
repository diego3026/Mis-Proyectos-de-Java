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
public class Celular implements Comparable<Celular>{
    private String marca;
    private int numero;
    private int rom;
    private int ram;

    public Celular(String marca, int numero, int rom, int ram) {
        this.marca = marca;
        this.numero = numero;
        this.rom = rom;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Celular{" + "marca=" + marca + ", numero=" + numero + ", rom=" + rom + ", ram=" + ram + '}';
    }

    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the rom
     */
    public int getRom() {
        return rom;
    }

    /**
     * @param rom the rom to set
     */
    public void setRom(int rom) {
        this.rom = rom;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    int comparador(Celular aux) {
        int res=0;
        
        if(this.rom>aux.getRom()){
            res=1;
        }
        if(this.rom<aux.getRom()){
            res=-1;
        }
        return res;
    }

    @Override
    public int compareTo(Celular o) {
        return this.marca.compareTo(o.marca);
    }
    
}
