package projects.collectionsSample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {

    public static void main(String[] args) {
        mapImp();
    }

    static void listImp() {
        List miLista = new ArrayList();

        miLista.add("santi");
        miLista.add("santi");
        miLista.add(123);
        miLista.add(2.0);

        //uso de lambdas
        miLista.forEach(dato -> {
            System.out.println(dato);
        });
    }

    static void setImp() {
        Set miSet = new HashSet();

        miSet.add("lunes");
        miSet.add("lunes");
        miSet.add("martes");
        miSet.add("miercoles");
        miSet.add("jueves");
        miSet.add("viernes");

        imprimirCollection(miSet);
    }

    static void mapImp() {
        Map miMapa = new HashMap();

        miMapa.put("1", "santi");
        miMapa.put("2", "romero");
        miMapa.put("3", "santi");

        imprimirCollection(miMapa.keySet());
        imprimirCollection(miMapa.values());

    }

    static void imprimirCollection(Collection collection) {
        collection.forEach(dato -> {
            System.out.println(dato);
        });
    }
}

