package Examen_2022;

public class Equipo {
    public String pais;
    public String nombreEntrenador;
    public Jugador jugador1;
    public Jugador jugador2;

    public Equipo(String pais, String nombreEntrenador) {
        this.pais = pais;
        this.nombreEntrenador = nombreEntrenador;
        this.jugador1 = null;
        this.jugador2 = null;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public String getPais() {
        return pais;
    }

    public void añadirJugador(Jugador jugador) {
        if (jugador1 == null) {
            jugador1 = jugador;
        } else if (jugador2 == null) {
            jugador2 = jugador;
        } else {
            System.out.println("El equipo ya tiene 2 jugadores.");
        }
    }

    public void eliminarJugador(Jugador jugador) {
        if (jugador1 == jugador) {
            jugador1 = null;
        } else if (jugador2 == jugador) {
            jugador2 = null;
        }
    }

    public String obtenerNombreEntrenador() {
        return nombreEntrenador;
    }

    public int obtenerGolesTotalesEquipo() {
        return jugador1.obtenerGolesMarcados() + jugador2.obtenerGolesMarcados();
    }
}
