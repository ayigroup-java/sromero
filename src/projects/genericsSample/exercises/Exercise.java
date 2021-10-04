package projects.genericsSample.exercises;

import java.lang.reflect.Method;

public class Exercise {

    public static void main( String args[] ) {
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
    public void print(Integer[] value) {
        System.out.println(value);
    }

    public void print(String[] value) {
        System.out.println(value);
    }
}
