package projects.laboratorioDos;

import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Main {

    public static void main(String[] args) {
        check8();
    }

    private static void check1() {
        Map<Integer, String> concurrentSkipListMap = new ConcurrentSkipListMap<Integer, String>();
        concurrentSkipListMap.put(11, "audi");

        Iterator<Integer> keyIterator = concurrentSkipListMap.keySet().iterator();

        while (keyIterator.hasNext()) {
            System.out.println(keyIterator.next());
            concurrentSkipListMap.put(13,"bmw");
        }
    }

    private static void check2() {
/*
        try {
            Test t = new Test();
            t.doNothing();
            System.out.println("I have done nothing");
        } catch (IOException e) {
            System.out.println("Exception1");
        }
        */
    }

    private static void check3() {
        try {
            AnotherClass obj = new AnotherClass();
            obj.method1();
            System.out.println("Main completed");
        } catch (Exception e) {}
    }

    private static void check4() {
        MyGen<Integer> m = new MyGen<Integer>();
        //m.set("merit");
        System.out.println(m.get());
    }

    private static void check5() {
        try {
            Float f1 = new Float(3.0);
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);

        } catch (NumberFormatException e) {
            System.out.println("bad number");
        }


    }

    private static void check6() {
        Map<String, String> identityHashMap = new IdentityHashMap<String, String>();
        identityHashMap.put(new String("a"), "audi");
        identityHashMap.put(new String("a"), "audi");
        identityHashMap.put(new String("a"), "ferrari");
        identityHashMap.put(new String("a"), "ferrari");

        System.out.println(identityHashMap);
    }

    private static void check7() {
        try {
            throw new Exc1(); // Line 9
        } catch (Exc0 e0) { // Line 11
            System.out.println("Exc0 caught");
        }
        catch (Exception e) {
            System.out.println("exception caught");
        }
    }

    private static void check8() {
        Map<Integer, String>  m = new TreeMap<Integer, String>();

        m.put(1, "santi");
        System.out.println(m.size());
        System.out.println(m);

        m.put(null, null);

        System.out.println(m.size());
        System.out.println(m);
    }

}

class TestBase {
    public void doNothing(){

    }
}

class AnotherClass {
    public static void method2(){
        throw new ArrayIndexOutOfBoundsException();
    }
    public static void method1(){
        try {
            method2();
        } catch (NullPointerException ae) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Method 1 ends");
        }
    }
}

class MyGen<T> {
    T var;
    void set(T var) {
        this.var = var;
    }

    T get() {
        return var;
    }
}

class Generic<T> {
    private T t;

    public void set(T t) { this.t = t; }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Generic<Integer> integerBox = new Generic<Integer>();
        integerBox.set(10);
        integerBox.inspect(null);
        //integerBox.inspect(new Number("12"));
    }
}

class Exc0 extends Exception {}
class Exc1 extends Exc0 {} //Line 2

abstract class MyAbstract {
    abstract int getSum();
    abstract int getSum(int x);
    abstract int getSum(int x, int y);
}

abstract class Sub extends MyAbstract {
    int x = 4;

    int getSum() {
        return x+x;
    }

    public static void main(String[] args) {
        //Sub sub = new Sub();
        //sub.getSum(4, 2);
    }
}

class Test extends Exception {
    public Test(){}
    public Test(String str){
        super(str);
    }

    int importantData = 5;

    public static void main(String[] args) {
        Test t = new Test();
        try {
            t.importantMethod();
        } catch (Test test) {
            test.printStackTrace();
        }
    }

    private void importantMethod() throws Test {
        if (importantData > 5) {
            throw new Test("Important data is invalid");
        } else
            System.out.println(importantData);
    }
}