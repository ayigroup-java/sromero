package projects.genericsSample.genericCustom;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsCustom< T > implements Iterable < T > {

    private ArrayList < T > lista = new ArrayList < T > ();

    private int tope;

    public GenericsCustom(int tope) {
        super();
        this.tope = tope;
    }

    public void add(T objeto) {
        if (lista.size() <= tope) {
            lista.add(objeto);
        } else {
            throw new RuntimeException("no caben mas");
        }
    }

    public Iterator < T > iterator() {
        return lista.iterator();
    }
}
