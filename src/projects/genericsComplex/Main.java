package projects.genericsComplex;

import java.util.*;

/*
Generic Class

Convencion:

E: elemento de una colección.
K: clave.
N: número.
T: tipo.
V: valor.
S, U, V etc: para segundos, terceros y cuartos tipos.

 */

class ClaseGenericaDos<K, V> {

    K ob1;
    V ob2;

    ClaseGenericaDos(K o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    K getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    void mostrarTipo() {
        System.out.println("El tipo de T es: " + ob1.getClass().getName());
        System.out.println("El tipo de V es: " + ob2.getClass().getName());
    }
}

class ClaseGenerica<T> {
    
    T object;

    public ClaseGenerica(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }

    public void classType() {
        System.out.println("El tipo de T es " + this.object.getClass().getName());
    }
}

public class Main {

    public static void mainBase(String args[]) {
        compareImple();
    }

    public static void typeGenericSample() {
        
        /* 
            Uso de wildcard
            List<? extends String> 
        */
        
        // Creamos una instancia de ClaseGenerica para Integer.
        ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(88);
        intObj.classType();

        // Creamos una instancia de ClaseGenerica para String.
        ClaseGenerica<String> strObj = new ClaseGenerica<String>("Test");
        strObj.classType();
        
        ClaseGenerica<Integer> iOb;

        iOb = new ClaseGenerica<Integer>(28);
        iOb.classType();

        int v = iOb.getObject();
        System.out.println("Valor: " + v);
        System.out.println();

        ClaseGenerica<String> strOb = new ClaseGenerica<String>("Prueba de genéricos");

        strOb.classType();
        String str = strOb.getObject();
        System.out.println("Valor: " + str);

        //ClaseGenerica<int> intOb = new ClaseGenerica<int>(28);
        //iOb = strOb;
        
    }

    public static void typeGenericDosSample() {
        ClaseGenericaDos<Integer, String> dosGen = new ClaseGenericaDos<Integer, String>(28, "Genericos");
        ClaseGenericaDos<String, Integer> dosGenExtra = new ClaseGenericaDos<String, Integer>("Santi", 2);

        dosGen.mostrarTipo();

        int v = dosGen.getOb1();
        System.out.println("Valor: " + v);
        String str = dosGen.getOb2();
        System.out.println("Valor: " + str);
        
        dosGen.mostrarTipo();

        int vExtra = dosGenExtra.getOb2();
        System.out.println("Valor: " + vExtra);
        String strExtra = dosGenExtra.getOb1();
        System.out.println("Valor: " + strExtra);
    }

    public static void boxSample() {
        Box<Integer> integerBox1 = new Box<Integer>();
        Box<Integer> integerBox2 = new Box<>();
        OrderedPair<String, Integer> p1 = new OrderedPair<>("Santi", 15);

        System.out.println(p1.getKey());
        System.out.println(p1.getValue());

        Box rawBox = new Box();

    }

    public static void compareImple() {
        Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");
        boolean same = compare(p1, p2);
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static void process(List<? extends Number> list) {
        /* ... */ }

}
