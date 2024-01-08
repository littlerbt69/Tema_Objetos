package Boletin_4_1;

public class Maquina {

    private static final int CAPACIDAD_CAFE = 50;
    private static final int CAPACIDAD_LECHE = 50;
    private static final int CAPACIDAD_VASOS = 80;
    public static final double MONEDERO_INICIAL = 100.00;
    public static final double PRECIO_CAFE = 1.00;
    public static final double PRECIO_LECHE = 0.80;
    public static final double PRECIO_CAFE_LECHE = 1.50;

    private int cafeRestante;
    private int lecheRestante;
    private int vasosRestante;
    public double monedero;

    public Maquina() {
        llenaDepositos();
        monedero = MONEDERO_INICIAL;
    }

    public void llenaDepositos() {
        cafeRestante = CAPACIDAD_CAFE;
        lecheRestante = CAPACIDAD_LECHE;
        vasosRestante = CAPACIDAD_VASOS;

        System.out.println("Todos los depositos han sido rellenados.");
    }

    public void vaciaMonedero() {

    }
}
