package Examen_2024;

public class Dispositivo {
    private String nombre;
    private String conexiones;
    private String protocolos;

    public Dispositivo(String nombre, String conexiones, String protocolos) {
        this.nombre = nombre;
        this.conexiones = conexiones;
        this.protocolos = protocolos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConexiones() {
        return conexiones;
    }

    public void setConexiones(String conexiones) {
        this.conexiones = conexiones;
    }

    public String getProtocolos() {
        return protocolos;
    }

    public void setProtocolos(String protocolos) {
        this.protocolos = protocolos;
    }


}
