/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author asus
 */
public enum Continente {
    AFRICA(54),
    EUROPA(50),
    AMERICA(35),
    ASIA(48),
    OCEANIA(14);
    
    private final int paises;
    
    private Continente(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
