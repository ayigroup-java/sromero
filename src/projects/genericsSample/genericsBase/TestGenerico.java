package projects.genericsSample.genericsBase;

public class TestGenerico {

    public static void main(String[] args) {

        //no podemos implementar con tipos primitivos, solo con wrappers
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica("santi");
        objetoString.obtenerTipo();

        ClaseGenerica<ParentObject> objetoPo = new ClaseGenerica(15423.2012032);
        objetoPo.obtenerTipo();

        Integer ia[]={10,20,30,40};
        Double da[]={7.5,3.4,5.6};
        String sa[]={"existe","valor","para","generics"};

        printAr(ia);
        printAr(da);
        printAr(sa);

    }

    public static <E> void printAr(E a[]){
        int i=0;
        for (E elem:a)
            System.out.println((i++)+")="+elem);
    }
}

class ParentObject {

}

/*
T = Type
E = Element -> List<E> list de elementos
V = Value -> valor de un map
K = Key -> key en un map
 */
