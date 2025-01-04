package POO3_Ejercicios.Ej3;

public class Producto {

    /**
     * Atributos de la clase Producto.
     */
    private String nombre;
    private double precio;
    protected int stock;

    /**
     * Constructor de la clase Producto en el que hay que pasarle por parámetros el nombre del producto, el precio y el stock del mismo.
     * @param nombre
     * @param precio
     * @param stock
     */
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Metodo para reducir el stock, teniendole que pasar el número de unidades que deseamos reducir.
     * @return
     */
    public void reducirStock(){
        if (stock > 0){
            stock = stock --;
        }else {
            System.out.println("No hay suficientes unidades.");
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}
