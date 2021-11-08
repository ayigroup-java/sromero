package projects.exceptionsSample;

import projects.exceptionsSample.exceptions.OperacionEx;

public class TestExceptions {

    public static void main(String[] args) throws Exception{

        try {
            runDivision();
        } catch (Exception ex) {
            System.out.println("hubo un error en los metodos internos...");
            ex.printStackTrace();
        }

        System.out.println("Ejecutado luego del error...");

    }

    static void arithmeticEx() {
        int resultInt = 0;
        try {
            resultInt = 10 / 0 ;
        } catch (ArithmeticException ex) {

            System.out.println("StackTrace: ");
            ex.printStackTrace();
            System.out.println("Exception msg: " + ex.getMessage());

        } finally {
            System.out.println("Existe revisión de error...");
            //cerramos recursos como connect con DB
        }

        System.out.println(resultInt);

        Double resultDouble = 10.0/0;
        System.out.println(resultDouble);
    }

    static void nullPointerEx() {
        CheckEx checkEx = null;
        checkEx.toString();
    }

    static void runDivision() throws OperacionEx {
        try {
            int responseDivision = division(10, 0);
            System.out.println(responseDivision);
        } catch (OperacionEx ex) {
            System.out.println("[OperacionEx] hubo un operacionEx...");
            ex.printStackTrace();
            throw new OperacionEx("[OperacionEx] hubo un operacionEx");
        } catch (Exception ex) {
            System.out.println("hubo un error...");
            ex.printStackTrace();
        }
    }

    static int division(int numerador, int denominador) throws OperacionEx {

        if (denominador == 0) {
            throw new OperacionEx("denominador es 0...");
        }

        return numerador / denominador;
    }
}

class CheckEx {}
