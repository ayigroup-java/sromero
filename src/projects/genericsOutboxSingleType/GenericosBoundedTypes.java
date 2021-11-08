package projects.genericsOutboxSingleType;

class GenericosBoundedTypes<T,V extends T> {
    //Aquí, V debe ser algún tipo como T o una subclase de T
    T primero;
    V segundo;

    GenericosBoundedTypes(T a, V b){
        primero=a;
        segundo=b;
    }

    public static void main(String[] args) {
        GenericosBoundedTypes<Integer, Integer> x = new GenericosBoundedTypes<Integer, Integer>(1, 2);
        GenericosBoundedTypes<Number, Integer> y = new GenericosBoundedTypes<Number, Integer>(10.4, 12);
        //GenericosBoundedTypes<Number, String> z = new GenericosBoundedTypes<Number, String>(10.4, "12");
    }
}