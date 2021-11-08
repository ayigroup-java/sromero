package projects.laboratorioUno;

public class Ejercicios extends Cetaceo {

    public static void main(String[] args) {

    }

    static void ejerc1() {
        String[] str = {"JAVA", "FOR", "DEVS"};
        //System.out.println(str.length());
    }

    static void ejerc2() {
        int[] miArray = new int[] {3,1,4};
        System.out.println(miArray.length);
    }

    static void ejerc3() {
        int[] miArray = new int[] {3,1,4};
        System.out.println(miArray);
    }

    static void ejerc4() {
        String[] str = {"JAVA", "FOR", "DEVS"};
        System.out.println(str[0].length());
    }

    static void ejerc5() {
        int[] miArray = new int[] {3,1,4};

        for (int i=0; i<miArray.length; i++) {
            System.out.println(miArray[i]);
        }
    }

    static void ejerc6() {
        Mamifero elefante = new Mamifero();
        Cetaceo delfin = new Cetaceo();

        imprimirTipo(elefante);
        imprimirTipo(delfin);
    }

    static void ejerc7() {
        int a = 1;
        while (a<=10) {
            System.out.println(a);
            a++;
        }
    }

    static void ejerc8() {
        int a = 10;
        int b = 1;
        int c = a*b;
        int d = b*c;

        System.out.println(d);
    }

    public static void imprimirTipo(Mamifero m) {
        System.out.println(m.tipo());
    }
}

class Mamifero {
    private String habitat;

    public Mamifero(String h) {
        habitat = h;
    }
    public Mamifero() {
        this("terrestre");
    }

    public String tipo() {
        return "mamifero " + habitat;
    }
}

class Cetaceo extends Mamifero {
    public Cetaceo(String h) {
        super(h);
    }
    public Cetaceo() {
        this("actuatico");
    }

    public String tipo() {
        return super.tipo() + " (cetaceo)";
    }
}
