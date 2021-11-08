package projects.singletonMethod;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");


        System.out.println(singleton.value);
        System.out.println(singleton);
        System.out.println(anotherSingleton.value);
        System.out.println(anotherSingleton);
    }
}
