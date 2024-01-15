package Examen_2022;

public class Jugador {
    private String nombre;
    private int edad;
    private int golesMarcados;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.golesMarcados = 20;
    }

    public String getNombre() {
        return nombre;
    }

    public void añadirGol() {
        golesMarcados++;
    }

    public int obtenerGolesMarcados() {
        return golesMarcados;
    }
}
