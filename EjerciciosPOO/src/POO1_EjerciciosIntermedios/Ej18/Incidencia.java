package POO1_EjerciciosIntermedios.Ej18;

public class Incidencia {
    /**
     * Atributos de la clase Incidencia, donde codSiguiente y pendientes son static para llevar el control
     * del id de cada incidencia y de cuantas incidencias están pendientes (por cada incidencia que se cree)
     * fuera de la clase.
     */
    private int numPuesto;
    private String problema;
    private static int codigoSiguiente;
    private int codigo;
    private static int pendientes=0;
    private boolean estadoPendiente;
    private String solucion;

    /**
     * Metodo constructor de la clase Incidencia.
     * En este cada vez que se construya un objeto (se instancie un objeto) se incrementa el codigo de incidencia
     * y también incrementa las incidencias pendientes.
     * @param numPuesto
     * @param problema
     */
    public Incidencia(int numPuesto, String problema){
        this.numPuesto = numPuesto;
        this.problema = problema;
        this.estadoPendiente = true;
        codigoSiguiente ++;
        this.codigo = codigoSiguiente;
        pendientes ++;
    }

    /**
     * Metodo resuelve, el cual hay que pasarle por parámetro la solución, una vez resuelto
     * decrementa la variable pendientes ya que una incidencia ha sido solucionada y el estadoPendiente
     * de esa incidencia pasa a false.
     * @param solucion
     * @return
     */
    public boolean resuelve(String solucion){
        pendientes --;
        this.solucion = solucion;
        return this.estadoPendiente = false;
    }


    /**
     * Metodo para obtener la variable estadoPendiente de una incidencia.
     * @return
     */
    public String getestadoPendiente(){
        if (this.estadoPendiente == true){
            return "Pendiente";
        }
        else {
            return "Resuelta - "+solucion;

        }
    }

    /**
     * Metodo static para devolver el número de incidencias pendientes.
     * @return
     */
    public static int getPendientes() {
        return pendientes;
    }

    /**
     * Metodo toString para mostrar la información de una incidecncia.
     * @return
     */
    @Override
    public String toString() {
        return "Incidencia "+codigo+" - Puesto: "+ this.numPuesto+" - "+this.problema+" - "+getestadoPendiente();
    }

}

