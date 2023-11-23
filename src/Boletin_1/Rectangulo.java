package Boletin_1;

import java.util.Scanner;

public class Rectangulo {
    private double longitud, ancho;

    public Rectangulo() {
        this.longitud = 1.0;
        this.ancho = 1.0;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0 && longitud < 20) {
            this.longitud = longitud;
        } else {
            System.out.println("Valor de longitud no valida");
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho > 0 && ancho < 20) {
            this.ancho = ancho;
        } else {
            System.out.println("Valor de ancho no valida");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce longitud del rectangulo: ");
        double nuevaLondigtud = teclado.nextDouble();

        System.out.print("Ingrese el ancho del rectángulo: ");
        double nuevoAncho = teclado.nextDouble();
    }
}
