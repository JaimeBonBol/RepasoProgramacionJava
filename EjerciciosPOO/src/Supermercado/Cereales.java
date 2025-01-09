package Supermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento{

    /**
     * Atributos de la clase Cereales.
     */
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate fechaCaducidad;
    private int calorias;

    /**
     * Constructor de la clase Cereales.
     * @param marca
     * @param precio
     * @param tipoCereal
     */
    public Cereales(String marca, double precio, String tipoCereal){
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
        if (this.tipoCereal.equalsIgnoreCase("espelta")){
            this.calorias = 5;
        } else if (this.tipoCereal.equalsIgnoreCase("maiz")) {
            this.calorias = 8;
        } else if (this.tipoCereal.equalsIgnoreCase("trigo")) {
            this.calorias = 12;
        }else {
            this.calorias = 15;
        }
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
     * Metodo getter para obtener el valor de la variable tipoCereal.
     * @return
     */
    public String getTipoCereal() {
        return tipoCereal;
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
     * Metodo setter para definir un nuveo valor a la variable tipoCereal.
     * @param tipoCereal
     */
    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    /**
     * Metodo de la interfaz EsAlimento para establecer la fecha de caducidad.
     * @param fc
     */
    @Override
    public void setCaducidad(LocalDate fc) {
        this.fechaCaducidad = fc;
    }

    /**
     * Metodo de la interfaz EsAlimento para obtener la fecha de caducidad.
     * @return
     */
    @Override
    public LocalDate getCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Metodo de la interfaz EsAlimento para eobtener las calorias.
     * @return
     */
    @Override
    public int getCalorias() {
        return calorias;
    }

    /**
     * Metodo toString para mostrar la información de la clase Cereales.
     * @return
     */
    @Override
    public String toString() {
        return "Cereal" +
                "\nMarca: " + marca +
                "\nPrecio: " + precio +
                "\nTipoCereal: " + tipoCereal +
                "\nFechaCaducidad: " + fechaCaducidad +
                "\nCalorias: " + calorias;
    }
}
