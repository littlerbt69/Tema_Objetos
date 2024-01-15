package Boletin_4_2;

class Jarra {
    private int capacidad;
    private int agua;
    private static int totalAguaConsumida = 0;

    public Jarra(int capacidad) {
        this.capacidad = capacidad;
        this.agua = 0;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getAgua() {
        return agua;
    }

    public static int getTotalAguaConsumida() {
        return totalAguaConsumida;
    }

    public void llenarJarra() {
        totalAguaConsumida += capacidad - agua;
        agua = capacidad;
    }

    public void vaciarJarra() {
        agua = 0;
    }

    public void volcarEnOtraJarra(Jarra otraJarra) {
        int espacioLibre = otraJarra.capacidad - otraJarra.agua;
        if (agua <= espacioLibre) {
            otraJarra.agua += agua;
            agua = 0;
        } else {
            otraJarra.agua = otraJarra.capacidad;
            agua -= espacioLibre;
        }
    }
}
