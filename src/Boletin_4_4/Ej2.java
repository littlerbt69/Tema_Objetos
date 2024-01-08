package Boletin_4_4;

import java.util.Scanner;

public class Ej2 {

    private String cadena;
    private int mayusculas, minusculas, numeros;

    public Ej2(String cadena) {
        this.cadena = cadena;
        cuentaCaracteres();
    }

    public String getCadena() {
        return cadena;
    }

    public int getMayusculas() {
        return mayusculas;
    }

    public int getMinusculas() {
        return minusculas;
    }

    public int getNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();

        Ej2 caracteres = new Ej2(cadena);

        System.out.println("En la frase introducida anteriormente hay: " + caracteres.getMinusculas() + " minusculas " + caracteres.getMayusculas() + " mayusculas, y " + caracteres.getNumeros() + " numeros.");

    }

    private void cuentaCaracteres () {
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                mayusculas++;
            } else if (Character.isLowerCase(cadena.charAt(i))) {
                minusculas++;
            } else if (Character.isDigit(cadena.charAt(i))) {
                numeros++;
            }
        }
    }
}
