package POO_EjerciciosClase.Productos;

public class Producto {

    /**
     * Atributos clase Producto.
     * codigo: Código unico dekl producto.
     * nombre: Nombre del producto.
     * precio: Precio del producto.
     * cantidadStock: Cantidad disponible en el inventario.
     */
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidadStock;
    /**
     * Constructor que inicializa los atributos.
     * @param codigo Código unico dekl producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param cantidadStock Cantidad disponible en el inventario.
     */
    public Producto(int codigo, String nombre, double precio, int cantidadStock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    /**
     * Getter para obtener el código de un producto.
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Setter para asignarle un nuevo código al producto.
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Getter para obtener el nombre del producto.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para asignarle un nuevo nombre al producto.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para obtener el precio del producto.
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter para asignarl un nuevo valor al producto.
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getter para obtener la cantidad de unidades en stock del producto.
     * @return
     */
    public int getCantidadStock() {
        return cantidadStock;
    }

    /**
     * Setter para asignarle una nueva cantidad de unidades en stock al producto.
     * @param cantidadStock
     */
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    /**
     * Metodo para mostrar la información del producto.
     */
    public String mostrarInformacion(){
        StringBuilder sb = new StringBuilder();
        sb.append("Producto:"+
                            "\nCódigo: "+this.codigo+
                            "\nNombre: "+this.nombre+
                            "\nPrecio: "+this.precio+" euros"+
                            "\nCantidad en stock: "+this.cantidadStock+" unidades.\n");

        return sb.toString();
    }

    /**
     * Metodo para reducir el stock de un producto, primero se comprueba si hay
     * suficientes unidades en stock para reducir.
     * @param cantidad Cantidad que se desea reducir.
     */
    public void reducirStock(int cantidad){
        if (cantidadStock < cantidad){
            System.out.println("No hay suficientes unidades.");
        }else {
            cantidadStock -= cantidad;
            System.out.println("Se ha reducido la cantidad del stock correctamente.");
        }
    }

    /**
     * Metodo pora aumentar el stock de un producto.
     * @param cantidad Cantidad que se desea incrementar.
     */
    public void incrementarStock(int cantidad){
        cantidadStock += cantidad;
        System.out.println("Se ha incrementado el stock correctamente.");
    }

}
