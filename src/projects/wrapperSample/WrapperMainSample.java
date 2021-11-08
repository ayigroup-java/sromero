package projects.wrapperSample;

public class WrapperMainSample {

    public static void main(String[] args) {

        /*
        char -> Character
        boolean -> Boolean
        byte -> Byte
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        */

        Character chWrapped = 'a'; //Autoboxing
        System.out.println(chWrapped.getClass());

        char ch = 'a';
        System.out.println(((Object) ch).getClass());


        int numPrimitive = 6;
        Integer numWrapper = Integer.valueOf(numPrimitive);
        System.out.println(numWrapper.getClass().getName() + " ¿Es un objeto? " + (numWrapper instanceof Object));

        int numPrimitiveExtra = 6;
        Integer numWrapperExtra = Integer.valueOf(numPrimitiveExtra);
        System.out.println(numWrapperExtra.getClass().getName() + " ¿Es un objeto? " + (numWrapperExtra instanceof Object));

        int numUnWrapped = numWrapperExtra.intValue();
        System.out.println(numUnWrapped);
    }
}
