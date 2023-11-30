package Ejercicio_Prueba;

import java.time.LocalDateTime;

public class Avion_Principal {
    public static void main(String[] args) {
        Deposito dep = new Deposito(2000, 1500);
        Avion av = new Avion("Airbus", "A230", 20, dep);

        av.addRevision(new Revision(LocalDateTime.of(2023, 12, 12, 13, 40), true, 6));

        System.out.println(av.puedeViajar(1500) ? "Puede recorrer la distancia introducida" : "No puede recorrer la distancia introducida");
    }
}
