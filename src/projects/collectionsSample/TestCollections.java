package projects.collectionsSample;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {

    public static void main(String[] args) {
        List miLista = new ArrayList();

        miLista.add("santi");
        miLista.add(123);
        miLista.add(2.0);

        //uso de lambdas
        miLista.forEach(dato -> {
            System.out.println(dato);
        });
    }
}

