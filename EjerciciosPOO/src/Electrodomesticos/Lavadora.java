package Electrodomesticos;

public class Lavadora extends Electrodomestico{

    /**
     * Atibutos de la clase Lavadora.
     */
    private double precio;
    private boolean aguaCaliente;

    /**
     * Constrcutor de la clase Lavadora que recibe por parámetros la marca de la lavadora y su potencia.
     * También inicializa el modo de agua caliente en false.
     * @param marca
     * @param potencia
     */
    public Lavadora(String marca, double potencia){
        super(marca,potencia);
        this.marca = marca;
        this.potencia = potencia;
        this.aguaCaliente = false;
    }

    /**
     * Constructo de la clase Lavadora.
     * @param marca
     * @param precio
     * @param potencia
     * @param aguaCaliente
     */
    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente){
        super(marca,potencia);
        this.marca = marca;
        this.precio = precio;
        this.potencia = potencia;
        this.aguaCaliente = aguaCaliente;
    }

    /**
     * Metodo getter sobreescrito de la clase Electrodomestico para obtener el valor de la variable tipo de la lavadora.
     * @return
     */
    @Override
    public String getTipo() {
        if (tipo != null){
            return super.getTipo();
        }
        else {
            return "No especificado";
        }
    }

    /**
     * Metodo getter sobreescrito de la clase Electrodomestico para obtener el valor de la variable marca de la lavadora.
     * @return
     */
    @Override
    public String getMarca() {
        return super.getMarca();
    }

    /**
     * Metodo getter sobreescrito de la clase Electrodomestico para obtener el valor de la variable tipo de la lavadora.
     * @return
     */
    @Override
    public double getPotencia() {
        return super.getPotencia();
    }

    /**
     * Metodo getter sobreescrito de la clase Electrodomestico para obtener el valor de la variable consumo de la lavadora
     * pasandole por parámetro el numero de horas. Dependiendo de la variable booleana aguaCaliente el consumo será diferente.
     * @param horas
     * @return
     */
    @Override
    public double getConsumo(int horas) {
        if (!aguaCaliente){
            return horas * this.potencia;
        }else {
            return horas * (this.potencia + this.potencia *0.20);
        }
    }

    /**
     * Metodo getter sobreescrito de la clase Electrodomestico para obtener el valor del coste consumo de la lavadora.
     * @param horas
     * @param costeHora
     * @return
     */
    @Override
    public double getCosteConsumo(int horas, double costeHora) {
        return super.getCosteConsumo(horas, costeHora);
    }

    /**
     * Metodo getter para obtener el valor de la variable precio de la lavadora.
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo setter sobreescrito de la clase Electrodomestico para asignarle un nuevo valor a la variable tipo de la clase Lavadora.
     * @param tipo
     */
    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    /**
     * Metodo setter sobreescrito de la clase Electrodomestico para asignarle un nuevo valor a la variable marca de la clase Lavadora.
     * @param marca
     */
    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    /**
     * Metodo setter sobreescrito de la clase Electrodomestico para asignarle un nuevo valor a la variable potencia de la clase Lavadora.
     * @param potencia
     */
    @Override
    public void setPotencia(double potencia) {
        super.setPotencia(potencia);
    }

    /**
     * Metodo setter para asignarle un nuevo valor a la variable precio de la clase Lavadora.
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo setter para asignarle un nuevo valor a la variable aguaCaliente de la clase Lavadora.
     * @param aguaCaliente
     */
    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    /**
     * Metodo toString para mostrar la información de la clase Lavadora.
     * @return
     */
    @Override
    public String toString() {
        return "Lavadora:" +
                "Precio=" + precio +
                "\nAguaCaliente:" + aguaCaliente +
                "\nTipo:" + getTipo() +
                "\nMarca:" + marca +
                "\nPotencia:" + potencia;
    }

}
