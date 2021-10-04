package projects.genericsSample.exercises;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercise {

    public static void main( String args[] ) {
        executeExercise();
    }

    static void executeExercise() {
        Printer myPrinter = new Printer();

        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};

        myPrinter.print(intArray);
        myPrinter.print(stringArray);

        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("print"))
                count++;
        }

        if(count > 1) System.out.println("Method overloading is not allowed!");

    }
}

class Printer
{
    public <E> void print(E a[]) {
        for (E elemento : a) {
            System.out.println(elemento);
        }
    }
}
