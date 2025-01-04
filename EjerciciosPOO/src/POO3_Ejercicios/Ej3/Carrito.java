package POO3_Ejercicios.Ej3;

import java.util.ArrayList;

public class Carrito {

    /**
     * Atributos de la clasw Carrito.
     */
    protected ArrayList<Producto> productos;

    /**
     * Constrcutor de la clase Carrito para inicializar la lista productos cuando se instacie un carrito.
     */
    public Carrito(){
        this.productos =new ArrayList<>();
    }

    /**
     * Metodo para agregarProducto en la lista de productos del carrito.
     * @param producto
     */
    public void agregarProducto(Producto producto){
        //Se agrega el producto a la lista de productos del carrito.
        this.productos.add(producto);

        //Y se reduce el stock de ese producto a través del metodo creado en la clase Producto reducirStock.
        producto.reducirStock();
    }

    public void mostrarResumen(){
        System.out.println("El carrito contiene los siguientes productos: "+productos.toString());
    }

    @Override
    public String toString() {
        return "El carrito contiene los siguientes productos: "+productos.toString();
    }

    public void vaciarCarrito(){
        productos.clear();
    }
}
