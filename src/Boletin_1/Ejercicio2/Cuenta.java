package Boletin_1.Ejercicio2;

public class Cuenta {
    private double saldo;
    private int numReintegros;
    private int numIngresos;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
        numReintegros = 0;
        numIngresos = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void hacerReintegro(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            numReintegros++;
            System.out.println("Reintegro realizado correctamente. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: cantidad no válida o saldo insuficiente.");
        }
    }

    public void hacerIngreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numIngresos++;
            System.out.println("Ingreso realizado correctamente. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: cantidad no válida.");
        }
    }

    public void consultarSaldoYOperaciones() {
        System.out.println("Saldo actual: " + saldo);
        System.out.println("Número de reintegros realizados: " + numReintegros);
        System.out.println("Número de ingresos realizados: " + numIngresos);
    }

}
