package Examen_2022;

public class Mundial {
    public String nombreMundial;
    public Equipo[] equipos;
    public int cantidadEquipos;

    public Mundial(String nombreMundial) {
        this.nombreMundial = nombreMundial;
        this.equipos = new Equipo[4];
        this.cantidadEquipos = 0;
    }

    public void agregarEquipoMundial (Equipo equipo) {
        if (cantidadEquipos < 4) {
            equipos[cantidadEquipos] = equipo;
            cantidadEquipos++;
            System.out.println("Se ha añadido el equipo con exito al mundial.");
        } else {
            System.out.println("Ya existen 4 equipos en el mundial.");
        }
    }

    public void eliminarEquipoMundial (Equipo equipo) {
        for (int i = 0; i < cantidadEquipos; i++) {
            if (equipos[i] == equipo) {
                equipos[i] = null;
                cantidadEquipos--;
                System.out.println("Equipo eliminado del mundial.");
                return;
            }
        }
        System.out.println("El equipo que deseabas eliminar no se ha encontrado.");
    }

    public int totalGolesMarcadosMundial () {
        int totalGoles = 0;
        for (int i = 0; i < cantidadEquipos; i++) {
            totalGoles += equipos[i].obtenerGolesTotalesEquipo();
        }
        return totalGoles;
    }

    public Equipo equipoConMasGoles() {
        Equipo equipoConMasGoles = null;
        int maximoGoles = 0;

        for (int i = 0; i < cantidadEquipos; i++) {
            int golesEquipo = equipos[i].obtenerGolesTotalesEquipo();
            if (golesEquipo > maximoGoles) {
                equipoConMasGoles = equipos[i];
            }
        }

        return equipoConMasGoles;
    }

    public Jugador obtenerJugadorConMasGoles() {
        Jugador jugadorConMasGoles = null;
        int maximoGoles = 0;

        for (int i = 0; i < cantidadEquipos; i++) {
            Jugador jugador1 = equipos[i].getJugador1();
            Jugador jugador2 = equipos[i].getJugador2();

            if (jugador1 != null && jugador1.obtenerGolesMarcados() > maximoGoles) {
                maximoGoles = jugador1.obtenerGolesMarcados();
                jugadorConMasGoles = jugador1;
            }

            if (jugador2 != null && jugador2.obtenerGolesMarcados() > maximoGoles) {
                maximoGoles = jugador2.obtenerGolesMarcados();
                jugadorConMasGoles = jugador2;
            }
        }

        return jugadorConMasGoles;
    }
}
