package Boletin_4_4;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        // Lee la frase y la palabra escondida
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce frase:");
        String frase = scanner.nextLine();

        System.out.println("Palabra escondida:");
        String palabraEscondida = scanner.nextLine();

        // Realiza la búsqueda y muestra el resultado
        if (buscarPalabraEscondida(frase, palabraEscondida)) {
            System.out.println("Encontrada");
        } else {
            System.out.println("No se encuentra");
        }
    }

    public static boolean buscarPalabraEscondida(String frase, String palabraEscondida) {
        // Itera sobre todas las posibles subcadenas de la frase
        for (int i = 0; i <= frase.length() - palabraEscondida.length(); i++) {
            String subcadena = frase.substring(i, i + palabraEscondida.length());

            // Compara la subcadena con la palabra escondida
            if (subcadena.equals(palabraEscondida)) {
                return true;
            }
        }

        // Si no se encontró ninguna coincidencia
        return false;
    }
}
