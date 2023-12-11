package Boletin_4_3;

import java.util.Random;

public class Juego_Carta {
    //Creamos un objeto baraja tipo carta[]
    private Carta[] baraja;

    public Juego_Carta(Carta[] baraja) {
        this.baraja = baraja;
    }

    public Carta[] getBaraja() {
        return baraja;
    }

    public void mostrarBaraja() {
        for (int i = 0; i < baraja.length; i++) {
            System.out.print(baraja[i]);
        }
    }

    public void barajar() {
        Random random = new Random();

        for (int i = 0; i < baraja.length; i++) {
            int posicionAleatoria = random.nextInt(baraja.length);
        }
    }
}
