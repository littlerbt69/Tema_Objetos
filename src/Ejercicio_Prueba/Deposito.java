package Ejercicio_Prueba;

public class Deposito {
    private double capacidadMaxima;
    private double cantidadActual;

    public Deposito(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        setCantidadActual(cantidadActual);
    }

    public void setCantidadActual(double cantidadActual) {
        if (cantidadActual < capacidadMaxima && cantidadActual > 0) {
            this.cantidadActual = cantidadActual;
        }
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    @Override
    public String toString() {
        return " El deposito tiene una capacidad actual de " + cantidadActual/capacidadMaxima*100 + " % " +
                "de un maximo de: " + capacidadMaxima;
    }
}
