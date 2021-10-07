package projects.streamsSample;

import java.util.*;
import java.util.ArrayList;


public class TestStream {

    public static void main(String[] args) {
        distinctStream();
    }

    public static void mainStream() {
        ArrayList<Integer> miListadoAL;

        miListadoAL = new ArrayList<Integer>();

        miListadoAL.add(44);
        miListadoAL.add(7);
        miListadoAL.add(16);

        miListadoAL.add(29);
        miListadoAL.add(8);
        miListadoAL.add(50);


        resuelveSinStream(miListadoAL);
        System.out.println("\n");
        resuelveConStream(miListadoAL);
    }

    public static void resuelveSinStream(ArrayList<Integer> miListadoAL) {
        Iterator<Integer> it = miListadoAL.iterator();
        int sum = 0;

        while (it.hasNext()) {
            int num = it.next();

            if (num > 10) {
                sum += num;
            }
        }

        System.out.print("La suma de elementos mayores de 10 es: " + sum);
    }

    public static void resuelveConStream(ArrayList<Integer> miListadoAL) {
        System.out.print("La suma de elementos mayores de 10 es: " +
                miListadoAL
                        .stream()
                        .filter(i -> i > 10)
                        .mapToInt(i -> i).sum()
        );
    }

    public static void imprimirPersonas() {
        List<String> personas = getPersonas();
        for (String nombre: personas) {
            System.out.println(nombre);
        }
    }

    public static void imprimirPersonasStream() {
        List<String> personas = getPersonas();
        personas.stream()
                .forEach(System.out::println);
    }

    public static void filtrarPersonas() {
        List<String> personas = getPersonas();
        personas.stream()
                .filter(x -> x.startsWith("S"))
                .forEach(System.out::println);
    }

    public static void limitStream() {
        getPersonas().stream()
                .filter(x -> x.startsWith("S"))
                .limit(2)
                .forEach(System.out::println);
    }

    public static void distinctStream() {
        getPersonas().stream()
                .distinct()
                .forEach(x -> System.out.println(x));
    }

    public static List<String> getPersonas() {
        List<String> list = new ArrayList<>();

        list.add("Santi");
        list.add("Santi");
        list.add("Manolo");
        list.add("Manolo");
        list.add("Gabriel");
        list.add("Gabriel");
        list.add("Jose");
        list.add("Santino");

        return list;
    }
}