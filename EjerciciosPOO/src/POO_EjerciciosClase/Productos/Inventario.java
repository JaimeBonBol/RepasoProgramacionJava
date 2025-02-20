package POO_EjerciciosClase.Productos;

import java.util.ArrayList;

public class Inventario {

    /**
     * Atributo de la clase Inventario.
     * Una lista de productos.
     */
    private ArrayList<Producto> productos;

    public Inventario(){
        this.productos = new ArrayList<>();
    }

    /**
     * Metodo para agregar un nuevo producto al inventario.
     * @param producto Producto que se quiere agregar al inventario.
     */
    public void agregarProducto(Producto producto){
        productos.add(producto);
        System.out.println("Producto "+producto.getNombre()+" agregado con éxito al inventario.");
    }

    /**
     * Metodo que busca un producto en el inventario a través del código y devuelve el nombre del producto.
     * @param codigo Código que se pasa para buscar el prodcuto.
     * @return Dvuelve el nombre del producto.
     */
    public String buscarProducto(int codigo){
        StringBuilder sb = new StringBuilder();
        for (Producto producto : productos){
            if (producto.getCodigo() == codigo){
                sb.append(producto.getNombre());
            }
        }
        return sb.toString();
    }

    /**
     * Metodo que muestra toda la lista de productos en el inventario.
     */
    public void mostrarInventario(){
        StringBuilder sb = new StringBuilder();
        for (Producto producto : productos){
            sb.append(producto.mostrarInformacion());
            sb.append("----------------\n");
        }
        System.out.println("El inventario tiene: \n"+sb+"\n");
    }

    /**
     * Metodo que disminuye el stock de un producto al realizar una venta. Muestra un mensaje si no hay suficiente stock disponible.
     * @param codigo Código para buscar el producto.
     * @param cantidad Cantidad a disminuir.
     */
    public void venderProducto(int codigo, int cantidad){
        for (Producto producto : productos){
            if (producto.getCodigo() == codigo){
                producto.reducirStock(cantidad);
            }
        }
    }

}
