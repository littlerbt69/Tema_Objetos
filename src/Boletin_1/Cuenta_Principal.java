package Boletin_1;

import java.util.Scanner;

public class Cuenta_Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el saldo inicial: ");
        double saldoInicial = teclado.nextDouble();

        Cuenta cuenta = new Cuenta(saldoInicial);

        int opcion;
        do {
            System.out.println("\nMenú de operaciones:");
            System.out.println("1. Hacer un reintegro");
            System.out.println("2. Hacer un ingreso");
            System.out.println("3. Consultar saldo y operaciones");
            System.out.println("4. Finalizar operaciones");

            System.out.print("Selecciona una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la cantidad a retirar: ");
                    double cantidadReintegro = teclado.nextDouble();
                    cuenta.hacerReintegro(cantidadReintegro);
                    break;
                case 2:
                    System.out.print("Introduce la cantidad a ingresar: ");
                    double cantidadIngreso = teclado.nextDouble();
                    cuenta.hacerIngreso(cantidadIngreso);
                    break;
                case 3:
                    cuenta.consultarSaldoYOperaciones();
                    break;
                case 4:
                    System.out.print("¿Realmente desea salir? (Sí/No): ");
                    String respuesta = teclado.next();
                    if (respuesta.equalsIgnoreCase("Sí")) {
                        System.out.println("Operaciones finalizadas. Saldo final: " + cuenta.getSaldo());
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }
}
