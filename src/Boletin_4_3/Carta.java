package Boletin_4_3;

public class Carta {
    private static final String[] cartas = {"Oros", "Copas", "Espadas", "Bastos"};

    //Creamos las constantes necesarias
    public static final int NUM_MINIMO = 1;
    public static final int NUM_MAXIMO = 12;

    //Creamos las variables necesarias
    public String palo;
    public int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
