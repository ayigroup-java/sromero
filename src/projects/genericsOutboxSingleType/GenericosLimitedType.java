package projects.genericsOutboxSingleType;

import java.util.List;

// OperaMat intenta (sin éxito) crear una clase genérica
// que puede calcular varias funciones numéricas,
// como el recíproco o parte fraccionaria, dado cualquier tipo de número.
class OperaMate <T extends Number>{
    // En este caso, el argumento de tipo
    // debe ser Number o una subclase en Number.
    T num;

    // Pase al constructor una referencia a un objeto numérico.
    OperaMate(T n){
        num=n;
    }

    //Devuelve el recíproco
    double reciproco(){
        return 1/num.doubleValue();
    }

    //Devuelve parte fraccionaria
    double fraccion(){
        return num.doubleValue()-num.intValue();
    }
}

//Demostrar OperaMate
class GenericosLimitedType{
    public static void main(String[] args) {
        OperaMate<Integer> iOb= new OperaMate<Integer>(5);

        System.out.println("El recíproco de 5 es: "+iOb.reciproco());
        System.out.println("La parte fraccionaria de 5 es: "+iOb.fraccion());
        System.out.println();

        OperaMate<Double> dOb= new OperaMate<Double>(15.25);

        System.out.println("El recíproco de 15.25 es: "+dOb.reciproco());
        System.out.println("La parte fraccionaria de 15.25 es: "+dOb.fraccion());

        // Esto no se compilará
        // porque String no es una subclase de Number.
        //OperaMate<String> strOb = new OperaMate<String>("Error");
    }

    public static void checkWildcardNumber(List<? super String> list) {
    }

    public static void checkWildcardBase(List<?> list) {
        System.out.println(list.size());
        list.clear();
    }
}