package Boletin_4_4;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase");

        String frase = teclado.nextLine().toLowerCase();

        int suma = sumaNumeros(frase);

        System.out.println("La suma de los números es " + suma);
    }

    public static int sumaNumeros(String frase) {
        int suma = 0;
        StringBuilder numero = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isDigit(c)) {
                numero.append(c);
            }
            else {
                if (numero.length() > 0) {
                    // Convertimos el número en int
                    suma += Integer.parseInt(numero.toString());
                    numero.delete(0, numero.length());
                }
            }
        }

        if (numero.length() > 0) {
            // Convertimos el número en int
            suma += Integer.parseInt(numero.toString());

        }

        return suma;
    }
}
