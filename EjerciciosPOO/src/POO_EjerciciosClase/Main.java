package POO_EjerciciosClase;

public class Main {
    public static void main(String[] args) {

        TablaVentas tablaVentas = new TablaVentas();

        tablaVentas.mostrarTablaVentas();

        tablaVentas.introducirVentas();

        tablaVentas.mostrarTablaVentas();

        System.out.println();

        tablaVentas.totalVentasProducto();

        System.out.println();

        tablaVentas.productoMasVendido();
    }
}
