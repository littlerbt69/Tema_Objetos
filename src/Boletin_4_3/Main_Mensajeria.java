package Boletin_4_3;

public class Main_Mensajeria {

    public static void main(String[] args) throws MensajeriaException {
        Persona p1 = new Persona("Manolo");
        Persona p2 = new Persona("Pedro");


        try {
            p1.enviarMensaje(p2,"Mensaje de prueba","Probando mensaje");

            p2.mostrarBuzonEntrada();

            p2.borrarMensajeRecibidoMasAntiguo();
            p2.mostrarBuzonEntrada();
        } catch (MensajeriaException m) {
            System.out.println(m.getMessage());
        }
    }
}
