package Ejercicio3;

public class Maquina {
    private static final int CAP_CAFE = 50;
    private static final int CAP_LECHE = 50;
    private static final int CAP_VASOS = 80;

    private static final double PRECIO_CAFE = 1.0;
    private static final double PRECIO_LECHE = 0.8;
    private static final double PRECIO_CAFE_LECHE = 1.5;

    private double monedero;

    public Maquina(double monedero) {
        this.monedero = 0.0;
    }

    public static void main(String[] args) {

    }

    public void consultaEstado () {
        System.out.println("\nESTADO DE LA MAQUINA:");
        System.out.println("Depósito de café: " + CAP_CAFE + " dosis");
        System.out.println("Depósito de leche: " + CAP_LECHE + " dosis");
        System.out.println("Depósito de vasos: " + CAP_VASOS + " vasos");
        System.out.println("Monedero: " + monedero + " euros");
    }

    public void vaciaMonedero() {
        this.monedero = 0.0;
    }
}
