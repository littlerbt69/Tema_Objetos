package Boletin_4_4;

import java.util.Scanner;

public class Ej10 {

    public static final String COMIENZO_WEB = "http://www";

    public static void main(String[] args) {

        System.out.println(compruebaDireccionValida("http://www.elmundo.es"));

    }

    public static boolean compruebaDireccionValida(String direccion) {
        String[] direccionDividida = direccion.split("\\.");

        /*
            for (String s : direccionDividida) {
            System.out.println(s);
            }
         */

        if (direccionDividida.length != 3) {
            return false;
        }

        //COMPRUEBA QUE EN LA POSICION 1 NO EXISTEN ESPACIOS Y EL PRIMER CARACTER DEL DOMINIO NO ES UN DIGITO Y QUE LA POSICION 0 EMPIECE POR LA CONSTANTE INDICADA
        if (direccionDividida[1].contains(" ")) {
            return false;
        }

        if (!COMIENZO_WEB.equals(direccionDividida[0])) {
            return false;
        }

        if (!Character.isDigit(direccionDividida[1].charAt(0))) {
            return false;
        }

        //COMPRUEBA QUE EL FINAL DE LA DIRECCION WEB TERMINE POR COM O ES
        if (!direccionDividida[2].equals("es") && !direccionDividida[2].equals("com")) {
            return false;
        }

        return true;
    }
}
