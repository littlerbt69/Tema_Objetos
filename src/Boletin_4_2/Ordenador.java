package Boletin_4_2;

public class Ordenador {
    private Placa_Base placaBase;
    private discoDuro discoDuro;
    private micoprocesador micoprocesador;
    private tarjetaGrafica tarjetaGrafica;

    public Ordenador(Placa_Base placaBase, Boletin_4_2.discoDuro discoDuro, Boletin_4_2.micoprocesador micoprocesador, Boletin_4_2.tarjetaGrafica tarjetaGrafica) throws ordenadorException {
        this.placaBase = placaBase;
        this.discoDuro = discoDuro;
        this.micoprocesador = micoprocesador;
        this.tarjetaGrafica = tarjetaGrafica;

        if (!placaBase.procesadorCompatible(micoprocesador)) {
            throw new ordenadorException("El microprocesador no es compatible con la placa seleccionada");
        }
    }

    public void imprimirInformacion() {
        System.out.println("=== Información del Ordenador ===");
        System.out.println("Placa Base: ");
        System.out.println("  Marca: " + placaBase.getMarca());
        System.out.println("  Chipset: " + placaBase.getChipset());
        System.out.println("  Socket: " + placaBase.getSocket());

        System.out.println("Microprocesador: ");
        System.out.println("  Marca: " + micoprocesador.getMarca());
        System.out.println("  Modelo: " + micoprocesador.getModelo());
        System.out.println("  Número de Núcleos: " + micoprocesador.getNucleos());
        System.out.println("  Velocidad Base: " + micoprocesador.getVelocidad() + " GHz");
        System.out.println("  Socket: " + micoprocesador.getSocket());

        System.out.println("Disco Duro: ");
        System.out.println("  Marca: " + discoDuro.getMarca());
        System.out.println("  Tipo: " + discoDuro.getTipo());
        System.out.println("  Capacidad: " + discoDuro.getCapacidad() + " GB");

        System.out.println("Tarjeta Gráfica: ");
        System.out.println("  Marca: " + tarjetaGrafica.getMarca());
        System.out.println("  Modelo: " + tarjetaGrafica.getModelo());
        System.out.println("  Número de Núcleos: " + tarjetaGrafica.getNucleos());
        System.out.println("  Velocidad: " + tarjetaGrafica.getVelocidad() + " GHz");
        System.out.println("  Cantidad de Memoria: " + tarjetaGrafica.getCantidadMemoria() + " GB");
    }

    public static void main(String[] args) throws ordenadorException {
        try {
            Placa_Base placaBase = new Placa_Base("ASUS", "Intel", "LGA1200");
            micoprocesador microprocesador = new micoprocesador("LGA1200", "Core i5", "LGA1200", 5, 4.2f);
            discoDuro discoDuro = new discoDuro("Seagate", "SSD", 500);
            tarjetaGrafica tarjetaGrafica = new tarjetaGrafica("NVIDIA", "GTX 1660", 6, 1.5f, 4);

            Ordenador ordenador = new Ordenador(placaBase, discoDuro, microprocesador, tarjetaGrafica);
            ordenador.imprimirInformacion();
        } catch (ordenadorException e) {
            System.out.println(e.getMessage());
        }
    }
}
