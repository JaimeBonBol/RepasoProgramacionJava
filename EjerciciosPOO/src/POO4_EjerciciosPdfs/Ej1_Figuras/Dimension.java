package POO4_EjerciciosPdfs.Ej1_Figuras;

public class Dimension {

    /**
     * Atributos de la clase Dimension.
     */
    private double alto;
    private double ancho;
    private double profundidad;

    /**
     * Constructor en el que no hya que pasarle ningún parámetro e inicializa todas las variables a 0.
     */
    public Dimension(){
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    /**
     * Constructor de la clase Dimension en el que hay que pasarle por parámetros un alto, un ach y una profundidad.
     * @param alto
     * @param ancho
     * @param profundidad
     */
    public Dimension(double alto, double ancho, double profundidad){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    /**
     * Metodo getter para obtener el alto.
     * @return alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Metodo getter para obtener el ancho.
     * @return ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Metodo getter para obtener la profundidad.
     * @return profundidad
     */
    public double getProfundidad() {
        return profundidad;
    }

    /**
     * Metodo setter para definir un nuevo valor de alto.
     * @param alto
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * Metodo setter para definir un nuevo valor de ancho.
     * @param ancho
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * Metodo settter para defininr un nuevo valor de profundidad.
     * @param profundidad
     */
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    /**
     * Metodo para obtener el volumen que ocupa el objeto.
     * @return
     */
    public double getVolumen(){
        return this.alto * this.ancho * this.profundidad;
    }

    @Override
    public String toString() {
        return "Alto: "+this.alto+"\nAncho: "+this.ancho+"\nProfundidad: "+this.profundidad+"\nVolumen máximo del objeto: "+getVolumen();
    }
}
