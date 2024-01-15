package Boletin_4_4;

public class Ej12 {
    public static void main(String[] args) {

    }

    public static boolean validarCorreo(String correo) {
        String[] correoDividido = correo.split("@");

        if (!Character.isLetter(correoDividido[0].charAt(0))) {
            return false;
        }

        return true;
    }
}
