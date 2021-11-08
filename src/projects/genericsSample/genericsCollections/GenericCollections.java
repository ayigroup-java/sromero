package projects.genericsSample.genericsCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericCollections {

    public static void main(String[] args) {
        hashMapImp();
    }

    static void listImp() {
        List miLista = new ArrayList<>();

        miLista.add("santi");
        miLista.add("santi");
        miLista.add(123);
        miLista.add(2.0);

        imprimirCollection(miLista);
    }

    static void hashSetImp() {
        Set<String> miSet = new HashSet<>();
        miSet.add("3");
        miSet.add("1");
        miSet.add("2");

        imprimirCollection(miSet);
    }

    static void hashMapImp() {
        Map<String, String> miMapa = new HashMap<>();

        miMapa.put("valor1", "santi");
        miMapa.put("3", "romero");
        miMapa.put("2", "santi");

        imprimirCollection(miMapa.values());

    }

    static void imprimirCollection(Collection<String> collection) {
        System.out.println(collection);
    }
}
