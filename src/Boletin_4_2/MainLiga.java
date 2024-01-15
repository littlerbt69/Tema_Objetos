package Boletin_4_2;

public class MainLiga {
    public static void main(String[] args) {
        // Crear equipos
        Equipo equipo1 = new Equipo("EquipoA");
        Equipo equipo2 = new Equipo("EquipoB");

        // Crear un partido y poner un resultado
        Partido partido1 = new Partido(1, equipo1, equipo2);

        try {
            partido1.ponerResultado("2-1");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Crear otros dos partidos con resultados específicos
        Partido partido2 = null;
        Partido partido3 = null;

        while (partido2 == null || partido3 == null) {
            try {
                partido2 = new Partido(2, equipo1, equipo2);
                partido2.ponerResultado("0-0");

                partido3 = new Partido(3, equipo2, equipo1);
                partido3.ponerResultado("1-2");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + ". Intentando nuevamente.");
            }
        }

        // Mostrar información de los partidos y equipos
        System.out.println(partido1);
        System.out.println(partido2);
        System.out.println(partido3);

        System.out.println("\nInformación de los equipos:");
        System.out.println(equipo1);
        System.out.println(equipo2);
    }
}