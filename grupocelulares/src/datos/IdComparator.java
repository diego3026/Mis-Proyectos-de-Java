
package datos;

import java.util.Comparator;

public class IdComparator implements Comparator<Celular>{

    @Override
    public int compare(Celular t, Celular t1) {
        return t.getId()-t1.getId();
    }
    
    
}
