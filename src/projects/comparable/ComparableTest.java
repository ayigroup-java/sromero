package projects.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class ComparableTest  {

    public static void main(String[] args) {

        List<String> personas = Arrays.asList("Rodri", "Lean", "Vane", "Gonza", "Martin", "Emi");
        System.out.println("lista de personas:" + personas);

        Collections.sort(personas);
        System.out.println("lista de personas ordenada:" + personas);

        Set<String> otrasPersonas = new TreeSet<>();
        otrasPersonas.add("Santi");
        otrasPersonas.add("Gabriel");
        otrasPersonas.add("Manolo");
        System.out.println("conjunto ordenado de treeSet: " + otrasPersonas);

        //interfaz java.lang.Comparable

        Set<Persona> setPersonas = new TreeSet<>();
        setPersonas.add(new Persona(1, "Santi"));
        setPersonas.add(new Persona(5, "Santiago"));
        setPersonas.add(new Persona(7, "Santino"));
        setPersonas.add(new Persona(2, "Gabriel"));
        setPersonas.add(new Persona(3, "Manolo"));

        System.out.println("set de personas ordenado: " + setPersonas);

        //interfaz java.util.Comparator

        List<Persona> listPersonas = Arrays.asList(
                new Persona(9, "santi"),
                new Persona(5, "gabriel"),
                new Persona(23, "manolo")
        );
        Collections.sort(listPersonas, new PersonaPorId());
        System.out.println("list de personas por id: " + listPersonas);

        Set<Persona> conjuntoPersonas = new TreeSet<>(new PersonaPorId());

        conjuntoPersonas.add(new Persona(9, "santi"));
        conjuntoPersonas.add(new Persona(5, "gabriel"));
        conjuntoPersonas.add(new Persona(23, "manolo"));
        System.out.println("set de personas por id: " + conjuntoPersonas);

    }

}

class Persona implements Comparable<Persona> {

    private int id;
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Persona.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nombre='" + nombre + "'")
                .toString();
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareTo(o.nombre);
    }
}

class PersonaPorId implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {

        /*
        o1.id == o2.id -> 0
        o1.id < o2.id -> menor a 0
        o1.id > o2.id -> mayor a 0
        */

        return o1.getId() - o2.getId();
    }
}