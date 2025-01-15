package POO4_EjerciciosPdfs.Ej4_Servicios;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{

    /**
     * Atributos especificos de la clase TrabajoPintura.
     */
    private double superficie;
    private double precioPintura;
    private double costeAdicional;

    /**
     * Constructor de la clase TrabajoPintura.
     * @param trabajador
     * @param fechaInicio
     * @param cliente
     * @param superficie
     * @param precioPintura
     */
    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura){
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    /**
     * Metodo getter sobreescrito de la clase abstracta Servicio para obtener el valor de la variable trabajador.
     * @return
     */
    @Override
    public String getTrabajador() {
        return super.getTrabajador();
    }

    /**
     * Metodo getter sobreescrito de la clase abstracta Servicio para obtener el valor de la variable fechaInicio.
     * @return
     */
    @Override
    public LocalDate getFechaInicio() {
        return super.getFechaInicio();
    }

    /**
     * Metodo getter sobreescrito de la clase abstracta Servicio para obtener el valor de la variable cliente.
     * @return
     */
    @Override
    public String getCliente() {
        return super.getCliente();
    }

    /**
     * Metodo getter para obtener el valor de la variable superficie.
     * @return
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Metodo getter para obtener el valor de la variable precioPintura.
     * @return
     */
    public double getPrecioPintura() {
        return precioPintura;
    }

    /**
     * Metodo setter sobreescrito de la clase abstracta Servicio para modificar el valor de la variable trabajador.
     * @param trabajador
     */
    @Override
    public void setTrabajador(String trabajador) {
        super.setTrabajador(trabajador);
    }

    /**
     * Metodo setter sobreescrito de la clase abstracta Servicio para modificar el valor de la variable fechaInicio.
     * @param fechaInicio
     */
    @Override
    public void setFechaInicio(LocalDate fechaInicio) {
        super.setFechaInicio(fechaInicio);
    }

    /**
     * Metodo setter sobreescrito de la clase abstracta Servicio para modificar el valor de la variable cliente.
     * @param cliente
     */
    @Override
    public void setCliente(String cliente) {
        super.setCliente(cliente);
    }

    /**
     * Metodo setter para modificar el valor de la variable superficie.
     * @param superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Metodo setter para modificar el valor de la variable precioPintura.
     * @param precioPintura
     */
    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    /**
     * Metodo sobreescrito de la clase abstracta Servicio para calcular el coste del matrerial según la formula
     * que nos indica el cliente.
     * @return
     */
    @Override
    public double costeMaterial() {
        return (this.superficie / 7.8) * this.precioPintura;
    }

    /**
     * Metodo sobreescrito de la clase abstracta Servicio para calcular el coste de la mano de obra según la formula
     * que nos indica el cliente.
     * @return
     */
    @Override
    public double costeManoObra() {
        return (this.superficie / 10) * 9.5;
    }

    /**
     * Metodo sobreescrito de la clase abstracta Servicio para calcular el coste total según la formula
     * que nos indica el cliente.
     * Hay que tener en cuenta que cuando la superficie a pintar es de menos de
     * 50 metros cuadrados se añade un coste adicional del 15% sobre el
     * anterior coste.
     * @return
     */
    @Override
    public double costeTotal() {
        if (this.superficie > 50){
            return costeMaterial() + costeManoObra();
        }else {
            this.costeAdicional = ((costeMaterial() + costeManoObra()) * 1.15) - (costeMaterial() + costeManoObra());
            return (costeMaterial() + costeManoObra()) * 1.15;
        }
    }

    /**
     * Este metodo devolverá un resumen del servicio.
     * @return
     */
    @Override
    public String detalleServicio() {
        return "TRABAJO DE PINTURA" +
                "\nCliente: "+ getCliente()+
                "\nFecha de inicio: "+ getFechaInicio()+
                "\n------------------------------------------"+
                "\nPintor: "+getTrabajador()+
                "\nCoste material....."+costeMaterial()+" €"+
                "\nCoste mano obra...."+costeManoObra()+" €"+
                "\ncoste adicional....."+this.costeAdicional+" €"+
                "\nTOTAL: ............."+costeTotal()+" €"+
                "\n-------------------------------------------";
    }
}
