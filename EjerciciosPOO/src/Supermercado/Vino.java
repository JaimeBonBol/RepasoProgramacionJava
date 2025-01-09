package Supermercado;

public class Vino implements EsLiquido, ConDescuento{

    /**
     * Atributos de la clase Vino.
     */
    private String marca;
    private String tipoVino;
    private double gradosAlcohol;
    private double precio;
    private double volumen;
    private String envase;
    private double descuento;
    private double calorias;

    /**
     * Constructor de la clase Vino.
     * @param marca
     * @param tipoVino
     * @param gradosAlcohol
     * @param precio
     */
    public Vino(String marca, String tipoVino, double gradosAlcohol, double precio){
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.gradosAlcohol = gradosAlcohol;
        this.precio = precio;
        this.calorias = this.gradosAlcohol * 10;
    }

    /**
     * Metodo getter para obtener el valor de la variable marca.
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo getter para obtener el valor de la variable tipoVino.
     * @return
     */
    public String getTipoVino() {
        return tipoVino;
    }

    /**
     * Metodo getter para obtener el valor de la variable gradosAlcohol.
     * @return
     */
    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    /**
     * Metodo getter para obtener el valor de la variable precio.
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo getter de la interfaz EsLiquido para obtener el valor del volumen de la clase Vino.
     * @return
     */
    @Override
    public double getVolumen() {
        return this.volumen;
    }

    /**
     * Metodo getter de la interfaz EsLiquido para obtener el valor de la variable envase de la clase Vino.
     * @return
     */
    @Override
    public String getTipoEnvase() {
        return this.envase;
    }

    /**
     * Metodo getter de la interfaz ConDescuento para obtener el valor de la variable descuento de la clase vino.
     * @return
     */
    @Override
    public double getDescuento() {
        return descuento;
    }

    /**
     * Metodo getter de la interfaz ConDescuento para obtener el precio con descuento de la clase vino.
     * @return
     */
    @Override
    public double getPrecioDescuento() {
        return this.precio-this.descuento;
    }

    /**
     * Metodo getter para obtener el valor de la variable envase.
     * @return
     */
    public String getEnvase() {
        return envase;
    }

    /**
     * Metodo getter para obtener el valor de las calorías.
     * @return
     */
    public double getCalorias() {
        return calorias;
    }

    /**
     * Metodo setter para modificar el valor de la variable marca.
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo setter para modificar el valor de la variable tipoVino.
     * @param tipoVino
     */
    public void setTipoVino(String tipoVino) {
        this.tipoVino = tipoVino;
    }

    /**
     * Metodo setter para modificar el valor de la variable gradosAlcohol.
     * @param gradosAlcohol
     */
    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    /**
     * Metodo setter para modificar el valor de la variable precio.
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo setter de la interfaz ConDescuento para modificar el valor de la variable descuento de la clase Vino.
     * @param des
     */
    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    /**
     * Metodo setter de la interfaz EsLiquido para modificar el valor de la variable volumen de la clase Vino.
     * @param volumen
     */
    @Override
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    /**
     * Metodo setter de la interfaz EsLiquido para modificar el valor de la variable tipoEnvase de la clase Vino.
     * @param env
     */
    @Override
    public void setTipoEnvase(String env) {
        this.envase=env;
    }

    /**
     * Metodo setter para modificar el valor de la variable envase.
     * @param envase
     */
    public void setEnvase(String envase) {
        this.envase = envase;
    }

    /**
     * Metodo setter para modificar el valor de la variable calorias.
     * @param calorias
     */
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Vino:" +
                "\nMarca: " + marca +
                "\nTipoVino: " + tipoVino +
                "\nGradosAlcohol: " + gradosAlcohol +
                "\nPrecio: " + precio +
                "\nVolumen: " + volumen +
                "\nEnvase: " + envase +
                "\nCalorías: "+ calorias;
    }
}
