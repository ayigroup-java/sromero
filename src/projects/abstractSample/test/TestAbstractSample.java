package projects.abstractSample.test;

import projects.abstractSample.FiguraGeometrica;
import projects.abstractSample.Rectangulo;
import projects.abstractSample.Triangulo;

public class TestAbstractSample {

    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        rectangulo.dibujar();
        System.out.println(rectangulo.toString());

        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        triangulo.dibujar();
        System.out.println(triangulo.toString());
    }
}
