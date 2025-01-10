package Servicios;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{

    /**
     * Atributo específico de la clase RevisionAlarma
     */
    private int numAlarmasRevisar;

    /**
     * Constructor de la clase RevisionAlarma.
     * @param fechaRevision
     * @param cliente
     * @param numAlarmasRevisar
     */
    public RevisionAlarma(LocalDate fechaRevision, String cliente, int numAlarmasRevisar){
        super(fechaRevision,cliente);
        this.numAlarmasRevisar = numAlarmasRevisar;
        this.trabajador = "Revisor Especialista Contraincendios";
    }

    /**
     * Metodo getter para obtener el valor de la variable numAlarmasRevisar.
     * @return
     */
    public int getNumAlarmasRevisar() {
        return numAlarmasRevisar;
    }

    /**
     * Metodo setter para modificar el valor de la variable numAlarmasRevisar.
     * @param numAlarmasRevisar
     */
    public void setNumAlarmasRevisar(int numAlarmasRevisar) {
        this.numAlarmasRevisar = numAlarmasRevisar;
    }

    /**
     * Metodo sobreescrito de la clase abstracta Servicio para calcular el coste del matrerial según la formula
     * que nos indica el cliente.
     * @return
     */
    @Override
    public double costeMaterial() {
        return 0;
    }

    /**
     * Metodo sobreescrito de la clase abstracta Servicio para calcular el coste de la mano de obra según la formula
     * que nos indica el cliente.
     * @return
     */
    @Override
    public double costeManoObra() {
        return (this.numAlarmasRevisar / 3) * 40;
    }

    /**
     * Metodo sobreescrito de la clase abstracta Servicio para calcular el coste total según la formula
     * que nos indica el cliente.
     * @return
     */
    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    /**
     * Este metodo devolverá un resumen del servicio.
     * @return
     */
    @Override
    public String detalleServicio() {
        return "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS"+
                "\nCliente: "+getCliente()+
                "\nFecha revisión: "+this.fechaRevision+
                "\n----------------------------------------------"+
                "\nTOTAL: .........."+costeTotal()+" €"+
                "\n----------------------------------------------";
    }
}
