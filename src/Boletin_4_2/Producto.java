package Boletin_4_2;

class Producto {
    private static int contadorCodigos = 1;
    private static final double IVA = 0.20;  // 20% de IVA

    private int codigo;
    private String descripcion;
    private double precioSinIVA;

    public Producto(String descripcion, double precioSinIVA) {
        this.codigo = contadorCodigos++;
        this.descripcion = descripcion;
        this.precioSinIVA = precioSinIVA;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(double precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    public double getPrecioConIVA() {
        return precioSinIVA * (1 + IVA);
    }
}

