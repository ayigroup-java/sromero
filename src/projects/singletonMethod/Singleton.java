package projects.singletonMethod;

public class Singleton implements Cloneable{
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) throws CloneNotSupportedException {
        if (instance == null) {
            instance = new Singleton(value);
        }

        try {
            instance = instance.clone();
            instance.value = "CHECK";
        } catch (Exception ex) {

        }

        return instance;
    }

    @Override
    public Singleton clone() {
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Ojo.. estas queriendo clonar un singleton...");
        }
        return null;
    }
}
