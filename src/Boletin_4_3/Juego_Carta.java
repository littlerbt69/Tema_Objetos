package Boletin_4_3;

import java.util.Random;

public class Juego_Carta {
    //Creamos un objeto baraja tipo carta[]
    private Carta[] baraja;

    private int contador;
    private int cartasRepartidas = 0;

    public Juego_Carta(Carta[] baraja) {
        this.baraja = baraja;
        contador = 0;
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

        Carta cartaCambiar;

        for (int i = cartasRepartidas; i < baraja.length; i++) {
            int posicionAleatoria = random.nextInt(cartasRepartidas, baraja.length);

            cartaCambiar = baraja[i];
            baraja[i] = baraja[posicionAleatoria];
            baraja[posicionAleatoria] = cartaCambiar;
        }
    }

    public void comprobarBarajaCompleta() {
        for (int i = 0; i < baraja.length; i++) {
            if (baraja[i] != null) {
                System.out.println("La baraja esta completa.");
            } else {
                System.out.println("La baraja no esta completa.");
            }
        }
    }

    public int cartaRestantes() {
        return baraja.length - cartasRepartidas;
    }

    public void repartirCartas (int numJugadores, int numCartas) throws CartaException {
        if (baraja.length - cartasRepartidas >= (numCartas * numJugadores)) {
            for (int i = 1; i < numCartas; i++) {
                System.out.println("Repartiendo cartas al jugador " + (i));
                for (int j = 0; j < numCartas; j++) {
                    System.out.println("\t" + baraja[cartasRepartidas++]);
                }
            }
        } else {
            throw new CartaException("No hay suficientes cartas para repartir.");
        }
    }
}
