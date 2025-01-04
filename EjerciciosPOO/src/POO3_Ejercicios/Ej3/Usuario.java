package POO3_Ejercicios.Ej3;

public class Usuario {

    /**
     * Atributos de la clase Usuario.
     */
    private String nombre;
    private String direccion;
    private Carrito carrito;

    /**
     * Constructor de la clase Usuario en el que hay que pasarle porm parámetros el nombre y la dirección,
     * y empieza con el carrito vacío.
     * @param nombre
     * @param direccion
     */
    public Usuario(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.carrito = new Carrito();
    }

    public void agregarCarrito(Carrito carrito){
        this.carrito = carrito;
    }

    /**
     * Metodo para realizar pedido, en el cual se muestra los productos del carrito y se vacía.
     */
    public void realizarPedido(){
        System.out.println(carrito);
        carrito.vaciarCarrito();
        System.out.println("Pedido realizado con éxito, ahora el carrito está vacio.");
    }

}
