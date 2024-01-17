package Boletin_4_4;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        // Lee el texto original, la palabra a buscar y la palabra a reemplazar
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto original:");
        String textoOriginal = scanner.nextLine();

        System.out.println("Introduce el texto a buscar:");
        String palabraBuscar = scanner.nextLine();

        System.out.println("Introduce el texto a reemplazar:");
        String palabraReemplazar = scanner.nextLine();

        // Realiza el reemplazo y muestra el resultado
        String textoModificado = reemplazarPalabra(textoOriginal, palabraBuscar, palabraReemplazar);
        System.out.println("El texto modificado es:");
        System.out.println(textoModificado);
    }

    public static String reemplazarPalabra(String texto, String palabraBuscar, String palabraReemplazar) {
        // Dividir el texto en palabras usando el espacio como separador
        String[] palabras = texto.split(" ");

        // Recorrer las palabras y reemplazar la palabra a buscar si es necesario
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraBuscar)) {
                // Mantener el caso original de la palabra reemplazada
                palabras[i] = mantenerCasoOriginal(palabras[i], palabraReemplazar);
            }
        }

        // Unir las palabras nuevamente en un solo texto
        return String.join(" ", palabras);
    }

    private static String mantenerCasoOriginal(String palabraOriginal, String palabraNueva) {
        // Mantener el caso original de la palabra reemplazada
        if (Character.isUpperCase(palabraOriginal.charAt(0))) {
            return palabraNueva.substring(0, 1).toUpperCase() + palabraNueva.substring(1);
        } else {
            return palabraNueva.toLowerCase();
        }
    }
}
