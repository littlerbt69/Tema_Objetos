package Ejercicio_Prueba;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Revision {
    private LocalDateTime fecha;
    private boolean estado;

    //Esa variable se mide en meses.
    private int periodoValidez;

    public Revision(LocalDateTime fecha, boolean estado, int periodoValidez) {
        if (fecha.isBefore(LocalDateTime.now())) {
            this.fecha = fecha;
        }
        this.estado = estado;
        if (periodoValidez > 0) {
            this.periodoValidez = periodoValidez;
        }
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getPeriodoValidez() {
        return periodoValidez;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return fecha.format(formatter) + " con resultado " + (estado ? "Apto para volar" + " con una validez de: " + periodoValidez + " meses." : "No apto para volar");
    }
}
