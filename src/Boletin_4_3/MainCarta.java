package Boletin_4_3;

public class MainCarta {

    public static final String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
    public static final int CARTAS_POR_PALO = 10;

    public static void main(String[] args) {
        Carta[] baraja = new Carta[palos.length * CARTAS_POR_PALO];

        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < CARTAS_POR_PALO; j++) {
                baraja[i * CARTAS_POR_PALO + j] = new Carta(palos[i],String.valueOf(j + 1));
            }
        }

        Juego_Carta juego = new Juego_Carta(baraja);

        try {
            juego.repartirCartas(3, 4);
        } catch (CartaException e) {
            System.out.println(e.getMessage());
        }
    }
}
