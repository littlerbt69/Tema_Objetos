package Boletin_4_4;

public class Ej12 {

    public static void main(String[] args) {
        String direccionCorreo = "usuario@organizacion.fin"; // Cambia esto con la dirección que deseas validar
        boolean esValido = validarDireccionCorreo(direccionCorreo);

        if (esValido) {
            System.out.println("La dirección de correo es válida.");
        } else {
            System.out.println("La dirección de correo no es válida.");
        }
    }

    public static boolean validarDireccionCorreo(String direccionCorreo) {
        // Dividir la dirección de correo en usuario, organización y fin
        String[] partes = direccionCorreo.split("@");

        if (partes.length != 2) {
            return false; // La dirección debe tener un solo símbolo '@'
        }

        String usuario = partes[0];
        String dominio = partes[1];

        if (usuario.length() < 1 || !Character.isLetter(usuario.charAt(0))) {
            return false; // El usuario debe tener longitud 1 o más y comenzar con una letra
        }

        // Dividir el dominio en organización y fin
        String[] partesDominio = dominio.split("\\.");

        if (partesDominio.length != 2) {
            return false; // El dominio debe tener un solo punto '.'
        }

        String organizacion = partesDominio[0];
        String fin = partesDominio[1];

        if (organizacion.length() < 1 || !Character.isLetter(organizacion.charAt(0))) {
            return false; // La organización debe tener longitud 1 o más y comenzar con una letra
        }

        if (!(fin.length() == 2 || fin.length() == 3) || !Character.isLetter(fin.charAt(0))) {
            return false; // El fin debe tener longitud 2 o 3 y comenzar con una letra
        }

        // Si ha pasado todas las validaciones, la dirección de correo es válida
        return true;
    }
}
