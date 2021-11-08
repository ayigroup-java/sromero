package projects.genericsSample.genericsBase;

public class ClaseGenerica<T> {

    T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    public void obtenerTipo() {
        System.out.println("T es de tipo: " + objeto.getClass().getSimpleName());
    }
}
