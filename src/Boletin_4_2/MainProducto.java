package Boletin_4_2;

public class MainProducto {
    public static void main(String[] args) {
        // Crear productos y probar métodos
        Producto producto1 = new Producto("Producto A", 100.0);
        Producto producto2 = new Producto("Producto B", 50.0);

        System.out.println("Producto 1:");
        System.out.println("Código: " + producto1.getCodigo());
        System.out.println("Descripción: " + producto1.getDescripcion());
        System.out.println("Precio sin IVA: $" + producto1.getPrecioSinIVA());
        System.out.println("Precio con IVA: $" + producto1.getPrecioConIVA());

        System.out.println("\nProducto 2:");
        System.out.println("Código: " + producto2.getCodigo());
        System.out.println("Descripción: " + producto2.getDescripcion());
        System.out.println("Precio sin IVA: $" + producto2.getPrecioSinIVA());
        System.out.println("Precio con IVA: $" + producto2.getPrecioConIVA());

        // Modificar descripción y precio del producto1
        producto1.setDescripcion("Nuevo Producto A");
        producto1.setPrecioSinIVA(120.0);

        System.out.println("\nProducto 1 (modificado):");
        System.out.println("Código: " + producto1.getCodigo());
        System.out.println("Descripción: " + producto1.getDescripcion());
        System.out.println("Precio sin IVA: $" + producto1.getPrecioSinIVA());
        System.out.println("Precio con IVA: $" + producto1.getPrecioConIVA());
    }
}
