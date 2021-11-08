package projects.enumSample;

import java.util.Arrays;

public class TestEnums {

    public static void main(String[] args) {
/*
        System.out.println("Dia 1: " + Dias.LUNES);
        diaDeSemana(Dias.LUNES);

        System.out.println("Continente 2: " + Continentes.AMERICA);
        System.out.println("Nro de paises: " + Continentes.AMERICA.getPaises());
        System.out.println("Nro de habitantes: " + Continentes.AMERICA.getHabitantes());
*/
        var sitiosValues = Sitios.getAllEnums();

        System.out.println(sitiosValues.getClass().getSimpleName());
        for (Sitios sitio: sitiosValues) {
            System.out.println(sitio.getPrimitiveName());
            System.out.println(sitio.getProvincias());
        }

        for(Sitios c : Sitios.values())
            System.out.println(c);
    }

    private static void diaDeSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("dia 1");
                break;

            case MARTES:
                System.out.println("dia 2");
                break;
        }
    }
}
