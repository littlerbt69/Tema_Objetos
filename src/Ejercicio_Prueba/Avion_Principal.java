package Ejercicio_Prueba;

import java.time.LocalDateTime;

public class Avion_Principal {
    public static void main(String[] args) {
        Deposito dep = new Deposito(2000, 1500);
        Avion av = new Avion("Sukikoro", "A230", 20, dep);

        av.addRevision(new Revision(LocalDateTime.now(), true, 6));

        System.out.println(av);
    }
}
