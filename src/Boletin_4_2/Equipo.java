package Boletin_4_2;

import java.util.Objects;

class Equipo {
    private String nombre;
    private int partidosGanados;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.partidosGanados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void incrementarPartidosGanados() {
        partidosGanados++;
    }

    // Método toString para imprimir información del equipo
    @Override
    public String toString() {
        return "Equipo: " + nombre + ", Partidos Ganados: " + partidosGanados;
    }

    // Método equals para comparar equipos por nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Equipo equipo = (Equipo) obj;
        return Objects.equals(nombre, equipo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}