package POO4_EjerciciosPdfs.Ej2_Electrodomesticos;

public class Electrodomestico {

    /**
     * Atributos de la clase Electrodomestico.
     */
    protected String tipo;
    protected String marca;
    protected double potencia;

    /**
     * Constructor de la clase Electrodomestico.
     * @param tipo Tipo de electrodomestico que es.
     * @param marca Marca del electrodomestico.
     * @param potencia Potencia de consumo en Kw hora.
     */
    public Electrodomestico(String tipo,String marca, double potencia){
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Electrodomestico(String marca, double potencia){
        this.marca = marca;
        this.potencia = potencia;
    }

    /**
     * Metodo getter para obtener el valor de la variable tipo.
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo getter para obtener el valor de la variable marca.
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo getter para obtener el valor de la variable potencia.
     * @return
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * Metodo setter para asignar un nuevo valor a la variable tipo.
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo setter para asignar un nuevo valor a la variable marca.
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo setter para asignar un nuevo valor a la variable potencia.
     * @param potencia
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * Metodo toString para mostrar información de la clase Electrodomestico.
     * @return
     */
    @Override
    public String toString() {
        return "Tipo electrodoméstico: "+this.tipo+"\nMarca electrodoméstico: "+this.marca+"\nPotencia electrodoméstico: "+this.potencia+" Kw";
    }

    /**
     * Metodo para obtener el consumo del electrodoméstico en las horas que le pasemos por parámetro.
     * @param horas
     * @return
     */
    public double getConsumo(int horas){
        return this.potencia * horas;
    }

    /**
     * Metrodo para obtener el coste del consumo. Pasandole por parámetros las horas y el coste por hora.
     * Primeramente hay que calcular el consumo de las horas que le pasamos y luegoi multiplicamos ese valor por el coste por hora.
     * @param horas
     * @param costeHora
     * @return
     */
    public double getCosteConsumo(int horas, double costeHora){
        return getConsumo(horas) * costeHora;
    }


}
