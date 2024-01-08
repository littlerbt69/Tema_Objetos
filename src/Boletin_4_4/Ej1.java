package Boletin_4_4;

public class Ej1 {
    public static void main(String[] args) {
        String caracteres = "Hola mundo";
        char caracter = 'o';
        System.out.printf("En la cadena %s hay %d ocurrencia del caracter %c ", caracteres, contarCaracterEnCadena(caracteres, caracter), caracter);
    }

    public static int contarCaracterEnCadena(String a, char o) {
        int contador = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.toLowerCase().charAt(i) == Character.toLowerCase(o)) {
                contador++;
            }
        }
        return contador;
    }
}
