
package datos;

import java.util.Comparator;


public class PrecioComparator implements Comparator<Celular>{
    
    @Override
    public int compare(Celular o1, Celular o2) {
        return (int) (o1.getPrecio()-o2.getPrecio());
    }
}
