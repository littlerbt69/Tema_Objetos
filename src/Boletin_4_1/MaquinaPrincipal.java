package Boletin_4_1;

import java.util.Scanner;

public class MaquinaPrincipal {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;


    }

    public static void mostrarMenu() {
        System.out.println("MENU MAQUINA DE CAFE\n");
        System.out.println("1. Servir café solo (1 euro)\n" +
                "2. Servir leche (0,8 euros)\n" +
                "3. Servir café con leche (1,5 euros)\n" +
                "4. Consultar estado máquina. Aparecen los datos de los depósitos y\n" +
                "del monedero\n" +
                "5. Apagar máquina y salir");

    }
}
