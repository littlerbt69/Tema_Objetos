package Boletin_4_2;

public class OrdenadorVideojuego {
    private int nucleosProcesador;
    private int velocidadCPU;
    private int espacioDiscoDuro;
    private int nucleosGPU;
    private int memoriaGPU;

    public OrdenadorVideojuego(int nucleosProcesador, int velocidadCPU, int espacioDiscoDuro, int nucleosGPU, int memoriaGPU) {
        this.nucleosProcesador = nucleosProcesador;
        this.velocidadCPU = velocidadCPU;
        this.espacioDiscoDuro = espacioDiscoDuro;
        this.nucleosGPU = nucleosGPU;
        this.memoriaGPU = memoriaGPU;
    }

    public int getNucleosProcesador() {
        return nucleosProcesador;
    }

    public int getVelocidadCPU() {
        return velocidadCPU;
    }

    public int getEspacioDiscoDuro() {
        return espacioDiscoDuro;
    }

    public int getNucleosGPU() {
        return nucleosGPU;
    }

    public int getMemoriaGPU() {
        return memoriaGPU;
    }
}