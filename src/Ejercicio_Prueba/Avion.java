package Ejercicio_Prueba;

import java.time.LocalDateTime;

public class Avion {
    public static final int NUM_REVISIONES_MAX = 10;

    private String marca;
    private String modelo;
    private double consumo;

    private Deposito deposito;
    private Revision[] revisiones;

    public Avion(String marca, String modelo, double consumo, Deposito deposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.deposito = deposito;
        this.revisiones = new Revision[NUM_REVISIONES_MAX];
    }

    public void addRevision (Revision revision) {
        for (int i = 0; i < NUM_REVISIONES_MAX; i++) {
            if (this.revisiones[i] == null) {
                this.revisiones[i] = revision;
                break;
            }
        }
    }

    public Revision getUltimaRevision () {
        for (int i = NUM_REVISIONES_MAX - 1; i >= 0; i--) {
            if (revisiones[i] != null) {
                return revisiones[i];
            }
        }
        return null;
    }

    //Distancia en km al destino
    public boolean puedeViajar (double distancia) {
        Revision ultimaRevision = getUltimaRevision();
        double distanciaAlcanzable = deposito.getCantidadActual()/consumo;
        if (distanciaAlcanzable >= distancia && ultimaRevision.isEstado() && ultimaRevision.getFecha().plusMonths(ultimaRevision.getPeriodoValidez()).isAfter(LocalDateTime.now())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "El avio de la marca " + marca + " con el modelo " + modelo + " tiene un consumo de " +
                consumo + " litros por Km" + deposito + " . Su ultima revision fue el: " + getUltimaRevision();
    }
}
