package projects.collectionsSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TestCollections {

    public static void main(String[] args) {
        hashSetImp();
    }

    static void treeSetImp() {
        TreeSet<String> al = new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Ravi");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    static void hashSetImp() {
        HashSet miSet = new HashSet(5);

        miSet.add(4L);
        miSet.add("5");
        miSet.add("1");
        miSet.add("z");
        miSet.add("1");
        miSet.add("2");
        miSet.add("3");
        miSet.add("b");
        miSet.add("a");

        imprimirCollection(miSet);
    }

    static void arrayListImp() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println(list);
    }

    static void linkedList() {
        LinkedList<String> ll = new LinkedList<String>();

        System.out.println("Initial list of elements: " + ll);
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        System.out.println("After invoking add(E e) method: " + ll);

        ll.add(1, "Gaurav");
        System.out.println("After invoking add(int index, E element) method: " + ll);

        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("Sonoo");
        ll2.add("Hanumat");
        ll.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: " + ll);

        LinkedList<String> ll3 = new LinkedList<String>();
        ll3.add("John");
        ll3.add("Rahul");

        ll.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + ll);
        ll.addFirst("Lokesh");
        System.out.println("After invoking addFirst(E e) method: " + ll);
        ll.addLast("Harsh");
        System.out.println("After invoking addLast(E e) method: " + ll);
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

    static void arrayToListImp() {

        String[] array = {"Java", "Python", "PHP", "C++"};
        System.out.println("Printing Array: " + Arrays.toString(array));

        List<String> list = new ArrayList<String>();
        for (String lang : array) {
            list.add(lang);
        }

        System.out.println("Printing List: " + list);
    }

    static void listToArray() {
        List<String> fruitList = new ArrayList<>();

        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Manzana");
        fruitList.add("Frutilla");

        String[] array = fruitList.toArray(new String[fruitList.size()]);

        System.out.println("Printing Array: "+Arrays.toString(array));
        System.out.println("Printing List: "+fruitList);
    }

    static void mapImp() {
        Map miMapa = new HashMap();

        miMapa.put("1", "santi");
        miMapa.put("2", "romero");
        miMapa.put("3", "santi");

        Set set = miMapa.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        imprimirCollection(miMapa.keySet());
        imprimirCollection(miMapa.values());

    }

    static void insertionTimeCost() {
        // hashSet timeframes
        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        // treeSet timeframes
        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        // linkedHashSet timeframes
        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
    }

    static void imprimirCollection(Collection collection) {
        //operacion lambda: lambda expressions
        collection.forEach(dato -> {
            System.out.println(dato);
        });
    }
}

