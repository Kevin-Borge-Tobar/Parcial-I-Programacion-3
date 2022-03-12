package gt.edu.umg.progra3.parcial1;

import java.util.Arrays;
import java.util.Collections;

public class StaticStructureManager<T> {

    T[] values ;

    public StaticStructureManager(T[] values) {
        this.values = values;
    }

    public T[] ordenar(){
        Arrays.sort(values);
        return values;
    }

    public T[] ordenarInversa(){
    	Arrays.sort(values);
        Collections.reverse(Arrays.asList(values));
        return values;
    }

}