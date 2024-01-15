package Boletin_4_2;

public class Videojuego {
    private String nombre;
    private String compañia;
    private int año;

    private int nucleos;
    private int velocidad;
    private int capacidadDisco;
    private int nucleosGPU;
    private int memoriaGPU;

    public Videojuego(String nombre, String compañia, int año, int nucleos, int velocidad, int capacidadDisco, int nucleosGPU, int memoriaGPU) {
        this.nombre = nombre;
        this.compañia = compañia;
        this.año = año;
        this.nucleos = nucleos;
        this.velocidad = velocidad;
        this.capacidadDisco = capacidadDisco;
        this.nucleosGPU = nucleosGPU;
        this.memoriaGPU = memoriaGPU;
    }

    public boolean puedeEjecutarse(OrdenadorVideojuego ordenador) throws VideojuegoException {
        if (ordenador.getNucleosProcesador() >= nucleos &&
                ordenador.getVelocidadCPU() >= velocidad &&
                ordenador.getEspacioDiscoDuro() >= capacidadDisco &&
                ordenador.getNucleosGPU() >= nucleosGPU &&
                ordenador.getMemoriaGPU() >= memoriaGPU) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws VideojuegoException {
        Videojuego juego1 = new Videojuego("Mario bros", "Sega", 1888, 4, 5, 200, 2, 2);
        Videojuego juego2 = new Videojuego("F1", "Codemaster", 2000, 10, 20, 500, 8, 8);

        OrdenadorVideojuego ordenador1 = new OrdenadorVideojuego(2, 4, 1000, 2, 4);
        OrdenadorVideojuego ordenador2 = new OrdenadorVideojuego(12, 30, 2000, 8, 8);

        // Probar los videojuegos con los ordenadores
        try {
            System.out.println("¿El juego 1 puede ejecutarse en el ordenador 1? " + juego1.puedeEjecutarse(ordenador1));
            System.out.println("¿El juego 2 puede ejecutarse en el ordenador 1? " + juego2.puedeEjecutarse(ordenador1));
            System.out.println("¿El juego 1 puede ejecutarse en el ordenador 2? " + juego1.puedeEjecutarse(ordenador2));
            System.out.println("¿El juego 2 puede ejecutarse en el ordenador 2? " + juego2.puedeEjecutarse(ordenador2));
        } catch (VideojuegoException e) {
            throw new VideojuegoException(e);
        }

    }
}
