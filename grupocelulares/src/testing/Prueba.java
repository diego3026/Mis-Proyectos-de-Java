
package testing;

import datos.Celular;
import datos.Tienda;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Prueba {
    public static void main(String[] args){
        Tienda tienda = new Tienda("tienda insana");
        tienda.addCelular(new Celular(11, "samsung", 50000, "ww", 2023));
        tienda.addCelular(new Celular(33, "xiaomi", 50000, "ee", 2020));
        tienda.addCelular(new Celular(14, "huagei", 50000, "zz", 2018));
        tienda.addCelular(new Celular(1121, "samsung", 50000, "yy", 2022));
        System.out.println(" "+tienda.listar());
        //tienda.burbuja();
        //tienda.seleccion();
        //Collections.sort(tienda.getCelulares());
        tienda.ordenarPorId();
        System.out.println(" "+tienda.listar());
        System.out.println(" "+tienda.celularesMarca("samsung").toString());
        System.out.println(" "+tienda.celularesModelo("zz").toString());
        System.out.println(" "+tienda.hallarMarcas().toString());  
        tienda.ordenarPorId();
        System.out.println(""+tienda.busquedaBinaria(11));
        System.out.println(""+tienda.busquedaBinaria("ww"));
        
        
        Collections.sort(tienda.getCelulares());
        int indice=Collections.binarySearch(tienda.getCelulares(), new Celular("zz"));
        System.out.println(" "+indice);
//        //calcular de promedio de precios
//        float prom= tienda.promedio();
//        System.out.println("promedio es "+prom);
//        //eliminar celular por id
//        int id = 33;
//        tienda.borrarCel(id);
//        System.out.println("\nBorrado "+tienda.listar());
//        
//        //listar celulares samsung
//        String marca="samsung";
//        ArrayList<Celular>res= tienda.celularesMarca(marca);
//        System.out.println("Imprimiendo por marca "+res.toString());
    }
    
            
}
