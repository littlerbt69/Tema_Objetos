package Boletin_4_3;

public class Persona {
    public static final int CAPACIDAD_BUZON = 5;

    private String nombre;
    private Mensaje[] mensajesRecibidos;
    private Mensaje[] mensajesEnviados;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.mensajesRecibidos = new Mensaje[CAPACIDAD_BUZON];
        this.mensajesEnviados = new Mensaje[CAPACIDAD_BUZON];
    }

    public void enviarMensaje(Persona destinatario, String cuerpo, String asunto) throws MensajeriaException {
        if (destinatario == null) {
            throw new MensajeriaException("El destinatario no existe.");
        }

        if (asunto == null || asunto.isEmpty()) {
            throw new MensajeriaException("El asunto esta vacio.");
        }

        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MensajeriaException("El cuerpo esta vacio.");
        }

        if (destinatario.mensajesRecibidos[CAPACIDAD_BUZON - 1] != null) {
            throw new MensajeriaException("La bandeja entrante de mensajes esta completa (5/5).");
        }

        if (mensajesEnviados[CAPACIDAD_BUZON - 1] != null) {
            throw new MensajeriaException("La bandeja de salida de mensajes esta completa (5/5).");
        }

        //CREAMOS UN MENSAJE
        Mensaje mensaje = new Mensaje(asunto, cuerpo, this, destinatario);

        //INTRODUCIR MENSAJE EN LA BANDEJA DE ENVIADOS ->
        for (int i = 0; i < CAPACIDAD_BUZON; i++) {
            if (mensajesEnviados[i] == null) {
                mensajesEnviados[i] = mensaje;
                break;
            }
        }

        //INTRODUCIR EL MENSAJE EN LA BANDEJA DE RECIBIDOS ->
        for (int i = 0; i < CAPACIDAD_BUZON; i++) {
            if (destinatario.mensajesRecibidos[i] == null) {
                destinatario.mensajesRecibidos[i] = mensaje;
                break;
            }
        }
    }

    public void mostrarBuzonEntrada() {
        if (mensajesRecibidos[0] == null) {
            System.out.println("La bandeja de entrada esta vacia.");
        } else {
            for (int i = 0; i < CAPACIDAD_BUZON && mensajesRecibidos[i] != null; i++) {
                System.out.println(mensajesRecibidos[i]);
            }
        }
    }

    public void mostrarBuzonSalida() {
        if (mensajesEnviados[0] == null) {
            System.out.println("La bandeja de salida esta vacia.");
        } else {
            for (int i = 0; i < CAPACIDAD_BUZON && mensajesEnviados[i] != null; i++) {
                System.out.println(mensajesEnviados[i]);
            }
        }
    }
}
