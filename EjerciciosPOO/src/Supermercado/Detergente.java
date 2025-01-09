package Supermercado;

/**
 * Clase Detergente que implementa la interfaz ConDescuento.
 */
public class Detergente implements ConDescuento{

    /**
     * Atributos de la clase Detergente.
     */
    private String marca;
    private double precio;
    private double descuento;

    /**
     * Constructor de la clase Detergente en que hay que pasarle por prámetros una marca y un precio.
     * @param marca
     * @param precio
     */
    public Detergente(String marca, double precio){
        this.marca = marca;
        this.precio = precio;
    }

    /**
     * Metodo getter para obtener el valor de la variable marca.
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo getter para obtener el valor de la variable precio.
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo setter para definir un nuevo valor a la variable marca.
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo setter para definir un nuevo valor a la variable precio.
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo de la interfaz ConDescuento para definir el valor de la variable descuento.
     * @param des
     */
    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    /**
     * Metodo de la interfaz ConDescuento para obtener el valor de la variable descuento.
     * @return
     */
    @Override
    public double getDescuento() {
        return descuento;
    }

    /**
     * Metodo de la interfaz ConDescuento para obtener el precio una vez realizado el descuento.
     * @return
     */
    @Override
    public double getPrecioDescuento() {
        return this.precio - this.descuento;
    }

    /**
     * Metodo toString para mostrar la información del detergente.
     * @return
     */
    @Override
    public String toString() {
        return "Detergente:" +
                "\nMarca:" + marca +
                "\nPrecio:" + precio;
    }
}
