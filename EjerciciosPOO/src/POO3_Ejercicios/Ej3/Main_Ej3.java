package POO3_Ejercicios.Ej3;

public class Main_Ej3 {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Lapiz", 1.20, 4);
        Producto producto2 = new Producto("Goma", 2.10, 3);
        Producto producto3 = new Producto("Estuche", 6.90, 2);

        Carrito carrito1 = new Carrito();
        Carrito carrito2 = new Carrito();
        Carrito carrito3 = new Carrito();

        Usuario usuario1 = new Usuario("Pepe Gonzalez", "C/ Rana");
        Usuario usuario2 = new Usuario("Marta Fernandez", "C/ Pato");
        Usuario usuario3 = new Usuario("Jorge Lorenzo", "C/ Perro");

        carrito1.agregarProducto(producto1);
        carrito2.agregarProducto(producto1);
        carrito2.agregarProducto(producto2);
        carrito3.agregarProducto(producto1);
        carrito3.agregarProducto(producto2);
        carrito3.agregarProducto(producto3);

        carrito1.mostrarResumen();
        carrito2.mostrarResumen();
        carrito3.mostrarResumen();

        carrito2.vaciarCarrito();
        carrito1.vaciarCarrito();

        carrito1.mostrarResumen();
        carrito2.mostrarResumen();
        carrito3.mostrarResumen();

        System.out.println();

        usuario1.agregarCarrito(carrito3);

        usuario1.realizarPedido();

        carrito3.mostrarResumen();


    }
}
