package POO4_EjerciciosPdfs.Ej1_Figuras;

public class Figura {

    /**
     * Atributos de la clase Figura.
     */
    protected String codigo;
    protected double precio;
    private Dimension dimensiones;
    private Superheroe superheroe;

    /**
     * Constructor de la clase Figura.
     * @param codigo
     * @param precio
     * @param dimensiones
     * @param superheroe
     */
    public Figura(String codigo, double precio, Dimension dimensiones, Superheroe superheroe){
        this.codigo = codigo;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.superheroe = superheroe;
    }

    /**
     * Metodo getter para obtener el valor del código.
     * @return codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo getter para obtener el valor de precio.
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo getter para obtener el valor del objeto dimensiones.
     * @return dimensiones
     */
    public Dimension getDimensiones() {
        return dimensiones;
    }

    /**
     * Metodo getter para obtener el valor del objeto superheroes
     * @return superheroes
     */
    public Superheroe getSuperheroe() {
        return superheroe;
    }

    /**
     * Metodo setter para definir un valor a la variable codigo.
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo setter para definir un valor a la variable precio.
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metood setter para definir un valor a la variable de tipo objeto dimensiones.
     * @param dimensiones
     */
    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    /**
     * Metodo setter para definir un valor a la variable de tipo objeto superheroe.
     * @param superheroe
     */
    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    /**
     * Metodo toString para devolver la información de la clase Figura.
     * @return
     */
    @Override
    public String toString() {
        return "Figura:" +
                "\nCodigo:" + codigo +
                "\nPrecio:" + precio +
                "\nDimensiones:\n" + dimensiones.toString() +
                "\nSuperheroe:" + superheroe.getNombre()+"\n";
    }

    /**
     * Metodo subir cantidad, en el cuál hay que pasarle la cantidad que se quiere subir.
     * @param cantidad
     */
    public void subirPrecio(double cantidad){
        this.precio += cantidad;
        System.out.println("Precio subido con éxito.");
    }
}
