package projects.enumSample;

public enum Continentes {
    AFRICA(53, "1.5 bill"),
    EUROPA(46, "2.5 bill"),
    ASIA(44, "3.5 bill"),
    AMERICA(34, "4.5 bill");

    private final int paises;
    private final String habitantes;

    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return this.habitantes;
    }
}


/*
    public static final LUNES
    enum son constantes

    definimos un constructor que va a afectar a todos los enums.
    por encapsulamiento ese atrib es privado y tenemos que crear uno publico

 */