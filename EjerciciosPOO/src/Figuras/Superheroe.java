package Figuras;

public class Superheroe {

    /**
     * Atributos de la clase Superheroe.
     */
    private String nombre;
    private String descripcion;
    private boolean capa;

    /**
     * Constructor de la clase Superheroe en el que se le pasa por parámetro el nombre.
     * @param nombre
     */
    public Superheroe(String nombre){
        this.nombre = nombre;
        this.descripcion = " ";
        this.capa = false;
    }

    /**
     * Metodo para obtener el nombre.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener la desfripción.
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo para obtener el valor de la variable booleana capa.
     * @return capa
     */
    public Boolean getCapa(){
        return capa;
    }

    /**
     * Metodo para definir un nuevo nombre.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para definir una nueva descripción.
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo para definir un nuevo valor booleano para la variable capa.
     * @param capa
     */
    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    public String tieneCapa(){
        if (capa){
            return "tiene capa";
        }else {
            return "no tiene capa";
        }
    }

    /**
     * Metodo toString para mostrar los datos del superheroe.
     * @return
     */
    @Override
    public String toString() {
        return "El superheroe "+this.nombre + " con la siguiente descripción: "+this.descripcion+" "+tieneCapa();
    }
}
