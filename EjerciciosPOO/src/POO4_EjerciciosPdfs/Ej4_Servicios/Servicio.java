package POO4_EjerciciosPdfs.Ej4_Servicios;

import java.time.LocalDate;

public abstract class Servicio {

    /**
     * Atributos de la clase abstracta Servicio, un servicio siempre tendrá las siguientes propiedades.
     */
    protected String trabajador;
    private LocalDate fechaInicio;
    protected LocalDate fechaRevision;
    private String cliente;


    /**
     * Constructor de la clase Servicios, en que hay que pasarle por parámetros un Nombre y apellidos del trabajador, la fecha de inicio del servicio y
     * el nombre y apellidos del cliente(o el n ombre de la empresa cliente).
     * @param trabajador
     * @param fechaInicio
     * @param cliente
     */
    public Servicio(String trabajador, LocalDate fechaInicio, String cliente){
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    public Servicio(LocalDate fechaRevision, String cliente) {
        this.fechaRevision = fechaRevision;
        this.cliente = cliente;
    }

    /**
     * Metodo getter para obtener el valor de la variable trabajador.
     * @return
     */
    public String getTrabajador() {
        return trabajador;
    }

    /**
     * Metodo getter para obtener el valor de la variable cliente.
     * @return
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Metodo getter para obtener el valor de la variable fechaInicio.
     * @return
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Metodo setter para modificar el valor de la variable trabajador.
     * @param trabajador
     */
    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    /**
     * Metodo setter para modificar el valor de la variable cliente.
     * @param cliente
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Metodo setter para modificar el valor de la variable fechaInicio.
     * @param fechaInicio
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    //Metodos abstractos de la clase Servicio, que siempre tienen que programarse para cualquier servicio, es decir para cualquier
    //clase que herede de Servicio.

    /**
     * Este metodo calculará el total gastado en material.
     * @return
     */
    public abstract double costeMaterial();

    /**
     * Este metodo calculará el total gastado en mano de obra.
     * @return
     */
    public abstract double costeManoObra();

    /**
     * Este metodo calculará el coste total del servicio.
     * @return
     */
    public abstract double costeTotal();

    /**
     * Este metodo devolverá una cadena con información detallada de lo que
     * ha costado el Servicio
     * @return
     */
    public abstract String detalleServicio();

}
