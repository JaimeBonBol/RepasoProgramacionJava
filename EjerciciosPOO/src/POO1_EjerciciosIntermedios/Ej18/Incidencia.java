package POO1_EjerciciosIntermedios.Ej18;

public class Incidencia {
    private int numPuesto;
    private String problema;
    private static int codigoSiguiente;
    private int codigo;
    private static int pendientes=0;
    private boolean estadoPendiente;
    private String solucion;

    public Incidencia(int numPuesto, String problema){
        this.numPuesto = numPuesto;
        this.problema = problema;
        this.estadoPendiente = true;
        codigoSiguiente ++;
        this.codigo = codigoSiguiente;
        pendientes ++;
    }

    public boolean resuelve(String solucion){
        pendientes --;
        this.solucion = solucion;
        return this.estadoPendiente = false;
    }

    public String getestadoPendiente(){
        if (this.estadoPendiente == true){
            return "Pendiente";
        }
        else {
            return "Resuelta";
        }
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        return "Incidencia "+codigo+" - Puesto: "+ this.numPuesto+" - "+this.problema+" - "+getestadoPendiente()+" - "+ this.solucion;
    }
}
