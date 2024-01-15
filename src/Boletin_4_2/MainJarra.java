package Boletin_4_2;

import java.util.Scanner;

public class MainJarra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la capacidad de la jarra A: ");
        int capacidadA = scanner.nextInt();
        System.out.print("Ingrese la capacidad de la jarra B: ");
        int capacidadB = scanner.nextInt();

        Jarra jarraA = new Jarra(capacidadA);
        Jarra jarraB = new Jarra(capacidadB);

        char opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("a. Llenar jarra");
            System.out.println("b. Vaciar jarra");
            System.out.println("c. Volcar jarra A en B");
            System.out.println("d. Volcar jarra B en A");
            System.out.println("e. Ver estado de las jarras");
            System.out.println("f. Salir");
            System.out.print("Seleccione una opción (a/b/c/d/e/f): ");
            opcion = scanner.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.print("¿Qué jarra desea llenar (A/B)? ");
                    char jarraLlenar = scanner.next().toUpperCase().charAt(0);
                    if (jarraLlenar == 'A') {
                        jarraA.llenarJarra();
                    } else if (jarraLlenar == 'B') {
                        jarraB.llenarJarra();
                    }
                    break;
                case 'b':
                    System.out.print("¿Qué jarra desea vaciar (A/B)? ");
                    char jarraVaciar = scanner.next().toUpperCase().charAt(0);
                    if (jarraVaciar == 'A') {
                        jarraA.vaciarJarra();
                    } else if (jarraVaciar == 'B') {
                        jarraB.vaciarJarra();
                    }
                    break;
                case 'c':
                    jarraA.volcarEnOtraJarra(jarraB);
                    break;
                case 'd':
                    jarraB.volcarEnOtraJarra(jarraA);
                    break;
                case 'e':
                    System.out.println("Estado de la jarra A - Capacidad: " + jarraA.getCapacidad() +
                            ", Agua: " + jarraA.getAgua());
                    System.out.println("Estado de la jarra B - Capacidad: " + jarraB.getCapacidad() +
                            ", Agua: " + jarraB.getAgua());
                    break;
                case 'f':
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 'f');

        System.out.println("El total de agua que se ha gastado llenando jarras es " +
                Jarra.getTotalAguaConsumida() + " litros");
    }
}
