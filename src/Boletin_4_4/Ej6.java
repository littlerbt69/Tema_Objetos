package Boletin_4_4;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase/palabra para saber cuantas vocales tiene: ");
        String palaba = teclado.nextLine();

        System.out.println("La palabra tiene " + cuentaVocales(palaba) + " vocales diferentes.");
    }

    public static int cuentaVocales(String palabra) {
        palabra = palabra.toLowerCase();

        int contador = 0;

        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;

        for (int j = 0; j < palabra.length(); j++) {

            switch (palabra.charAt(j)) {
                case 'a':
                    a = true;
                    break;
                case 'e':
                    e = true;
                    break;
                case 'i':
                    i = true;
                    break;
                case 'o':
                    o = true;
                    break;
                case 'u':
                    u = true;
                    break;
            }
        }

        if (a) {
            contador++;
        }
        if (i) {
            contador++;
        }
        if (e) {
            contador++;
        }
        if (o) {
            contador++;
        }
        if (u) {
            contador++;
        }

        return contador;
    }
}
