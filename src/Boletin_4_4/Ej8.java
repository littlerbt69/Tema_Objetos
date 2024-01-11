package Boletin_4_4;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase:");

        String frase = teclado.nextLine();
        System.out.println("En la frase introducida hay " + cuentaPalabras(frase) + " palabras");

    }

    public static int cuentaPalabras(String frase) {
        return frase.trim().split("\\s+").length;
    }
}
