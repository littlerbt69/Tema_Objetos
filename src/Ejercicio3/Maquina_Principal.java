package Ejercicio3;

import Ejercicio3.Maquina;

import java.util.Scanner;

public class Maquina_Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        new Maquina(5);

        do {
            System.out.println("\nMENU MAQUINA CAFE:");
            System.out.println("1. Servir cafe solo (1 euros)");
            System.out.println("2. Servir leche (0.8 euros)");
            System.out.println("3. Servir cafe con leche (1.5 euros)");
            System.out.println("4. Consultar estado de la maquina.");
            System.out.println("5. Apagar maquina y salir.");

            System.out.print("Selecciona una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.print("¿Realmente desea salir? (Sí/No): ");
                    String respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("Sí")) {
                        System.out.println("Operaciones finalizadas. Saliendo del programa.");
                    }
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }
}
