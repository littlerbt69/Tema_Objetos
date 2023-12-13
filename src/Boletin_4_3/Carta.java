package Boletin_4_3;

public class Carta {
    //Creamos las variables necesarias
    public String palo;
    public int numero;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = Integer.parseInt(numero);
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return " " + numero + " de " + palo;
    }
}
