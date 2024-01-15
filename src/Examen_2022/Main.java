package Examen_2022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Mundial mundial = new Mundial("Copa mundial de chapas en Casa-Puerta Isla Cristina 2023");

        int opcion;
        do {
            System.out.println("\n---Menu principal del mundial---");
            System.out.println("\nINGRESE LA OPCION DESEADA:");
            System.out.println("1. Crear un nuevo equipo:");
            System.out.println("2. Añadir un jugador a un equipo:");
            System.out.println("3. Ver el numero total de goles marcados por un equipo existente.");
            System.out.println("4. Ver el número total de goles marcados por un jugador existente");
            System.out.println("5. Ver el equipo con más goles marcados en el mundial");
            System.out.println("6. Ver el jugador con más goles marcados en el mundial");
            System.out.println("0. SALIR DEL PROGRAMA");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Introduzca el pais del equipo a crear:");
                    String paisEquipo = teclado.nextLine();
                    System.out.println("Introduzca el nombre del entrenador:");
                    String nombreEntrenador = teclado.nextLine();

                    Equipo nuevoEquipo = new Equipo(paisEquipo, nombreEntrenador);
                    mundial.agregarEquipoMundial(nuevoEquipo);
                    System.out.println("Equipo agregado al mundial con exito.");
                    break;

                case 2:
                    if (mundial.cantidadEquipos == 0) {
                        System.out.println("No hay ningun equipo registrado.");
                        break;
                    }

                    System.out.println("Seleccione el equipo que desea añadir al jugador:");
                    for (int i = 0; i < mundial.cantidadEquipos; i++) {
                        System.out.println((i+1) + ". " + mundial.equipos[i].getPais());
                    }

                    System.out.println("Introduzca el numero del equipo deseado: ");
                    int numeroEquipo = teclado.nextInt();
                    teclado.nextLine();

                    if (numeroEquipo < 1 || numeroEquipo > mundial.cantidadEquipos) {
                        System.out.println("ERROR. Numero de equipo no valido.");
                        break;
                    }

                    Equipo equipoSeleccionado = mundial.equipos[numeroEquipo - 1];

                    System.out.println("Introduzca el nombre del jugador: ");
                    String nombreJugador = teclado.nextLine();
                    System.out.println("Introduzca la edad del jugador: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();

                    Jugador nuevoJugador = new Jugador(nombreJugador, edad);
                    equipoSeleccionado.añadirJugador(nuevoJugador);
                    System.out.println("Jugador añadido con exito.");
                    break;

                case 3:
                    if (mundial.cantidadEquipos == 0) {
                        System.out.println("No hay equipos registrados.");
                        break;
                    }

                    System.out.println("Introduzca el equipo del que quieres saber los goles totales: ");
                    for (int i = 0; i < mundial.cantidadEquipos; i++) {
                        System.out.println((i+1) + ". " + mundial.equipos[i].getPais());
                    }

                    System.out.println("Ingrese el numero del equipo seleccionado: ");
                    numeroEquipo = teclado.nextInt();

                    if (numeroEquipo < 1 || numeroEquipo > mundial.cantidadEquipos) {
                        System.out.println("Numero de equipo no valido.");
                        break;
                    }

                    Equipo equipoSeleccionadoGoles = mundial.equipos[numeroEquipo - 1];

                    System.out.println("El equipo " + equipoSeleccionadoGoles.getPais() + " ha marcado un total de " + equipoSeleccionadoGoles.obtenerGolesTotalesEquipo() + " goles.");
                    break;

                case 4:
                    if (mundial.cantidadEquipos == 0) {
                        System.out.println("No hay equipos registrados en el mundial.");
                        break;
                    }

                    System.out.println("Selecciona un equipo: ");
                    for (int i = 0; i < mundial.cantidadEquipos; i++) {
                        System.out.println((i+1) + ". " + mundial.equipos[i].getPais());
                    }

                    System.out.println("Ingrese el numero del equipo seleccionado: ");
                    numeroEquipo = teclado.nextInt();

                    if (numeroEquipo < 1 || numeroEquipo > mundial.cantidadEquipos) {
                        System.out.println("Numero de equipo no valido.");
                        break;
                    }

                    Equipo equipoSeleccionadoJugador = mundial.equipos[numeroEquipo - 1];

                    System.out.println("Seleccione un jugador:");
                    System.out.println("1. " + equipoSeleccionadoJugador.getJugador1().getNombre());
                    System.out.println("2. " + equipoSeleccionadoJugador.getJugador2().getNombre());

                    System.out.println("Ingrese el numero del jugador seleccionado: ");
                    int numeroJugador = teclado.nextInt();

                    if (numeroJugador < 1 || numeroJugador > 2) {
                        System.out.println("Numero de jugador no valido.");
                        break;
                    }

                    Jugador jugadorSeleccionado;

                    if (numeroJugador == 1) {
                        jugadorSeleccionado = equipoSeleccionadoJugador.getJugador1();
                } else {
                        jugadorSeleccionado = equipoSeleccionadoJugador.getJugador2();
                    }

                    System.out.println("El jugador " + jugadorSeleccionado.getNombre() + " ha marcado un total de " + jugadorSeleccionado.obtenerGolesMarcados() + " goles.");

                case 5:
                    if (mundial.cantidadEquipos == 0) {
                        System.out.println("No hay equipos registrados en el mundial.");
                        break;
                    }

                    Equipo equipoConMasGoles = mundial.equipoConMasGoles();
                    System.out.println("El equipo con mas goles en el mundial es " + equipoConMasGoles.getPais() + " con un total de " + equipoConMasGoles.obtenerGolesTotalesEquipo() + " goles.");
                    break;

                case 6:

                    if (mundial.cantidadEquipos == 0) {
                        System.out.println("No hay equipos registrados en el mundial.");
                        break;
                    }

                    Jugador jugadorMasGoles = mundial.obtenerJugadorConMasGoles();
                    System.out.println("El jugador con mas goles en el mundial es " + jugadorMasGoles.getNombre() + " con un total de " + jugadorMasGoles.obtenerGolesMarcados() + " goles.");
                    break;

                case 0:
                    System.out.println("¡GRACIAS POR USAR EL PROGRAMA DEL MUNDIAL!");
                    break;

                default:
                    System.out.println("Opcion no valida. (0-6)");
                    break;
            }

        } while (opcion != 0);
    }
}
