package Boletin_1.Ejercicio1;

import java.util.Scanner;

/*
Las variables static suelen ser constantes comunes para todos los objetos que creemos en la clase, son compartidas para todos los objetos.

Las variables no static suelen ser variables que son usadas para definir valores propios de los objetos.
 */

public class Rectangulo {
    public static final double MIN_LONGITUD_ANCHO = 0;
    public static final double MAX_LONGITUD_ANCHO = 20;

    private double longitud, ancho;

    public Rectangulo() {
        this.longitud = 1.0;
        this.ancho = 1.0;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        if (longitud > MIN_LONGITUD_ANCHO && longitud < MAX_LONGITUD_ANCHO) {
            this.longitud = longitud;
        } else {
            System.out.println("Valor de longitud no valida");
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho > MIN_LONGITUD_ANCHO && ancho < MAX_LONGITUD_ANCHO) {
            this.ancho = ancho;
        } else {
            System.out.println("Valor de ancho no valida");
        }
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * this.ancho + 2 * this.longitud;
    }

    // Método para calcular el área
    public double calcularArea() {
        return this.ancho * this.longitud;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Rectangulo rectangulo = new Rectangulo();

        System.out.print("Introduce longitud del rectángulo: ");
        double nuevaLongitud = teclado.nextDouble();
        rectangulo.setLongitud(nuevaLongitud);

        System.out.print("Ingrese el ancho del rectángulo: ");
        double nuevoAncho = teclado.nextDouble();
        rectangulo.setAncho(nuevoAncho);

        // Mostrar el área y el perímetro del rectángulo
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}
