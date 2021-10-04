package projects.genericsSample.genericCustom;

public class GenericsCustomMain {

    public static void main(String[] args) {
        GenericsCustom <Chocolate> bolsa = new GenericsCustom<Chocolate>(3);

        Chocolate c0 = new Chocolate("milka");
        Chocolate c1 = new Chocolate("milka");
        Chocolate c2 = new Chocolate("ferrero");
        Chocolate c3 = new Chocolate("arcor");

        bolsa.add(c0);
        bolsa.add(c1);
        bolsa.add(c2);

        for (Chocolate chocolate : bolsa) {
            System.out.println(chocolate.getMarca());
        }
    }
}

class Chocolate {

    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Chocolate(String marca) {
        super();
        this.marca = marca;
    }
}
