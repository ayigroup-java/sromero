/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects.genericsComplex;

import java.lang.reflect.Method;

/**
 *
 * @author sromero
 */

/*
    Generic Method


Convencion:

E: elemento de una colección.
K: clave.
N: número.
T: tipo.
V: valor.
S, U, V etc: para segundos, terceros y cuartos tipos.

 */
public class MainGeneric {

    public static void main(String args[]) {

        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hola", "Mundo"};
        Boolean[] boolArray = {true, false, true};

        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        myPrinter.printArray(boolArray);

        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray")) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Method overloading is not allowed!");
        }

    }
}

class Printer {

    public <E> void printArray(E[] arryObj) {

        for (E elemento : arryObj) {

            System.out.println(elemento);
        }
    }
}
