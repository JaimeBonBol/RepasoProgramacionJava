package POO2_Ejercicios.Ej2;

public class Vehiculo {
    /**
     * Atributos de la clase vehículo.
     */
    protected static int vehiculosCreados;
    protected static int kilometrosTotales;
    protected int kilometrosRecorridos;

    /**
     * Contructor de la clase Vehiculo.
     */
    public Vehiculo(){
        vehiculosCreados ++;
        this.kilometrosRecorridos = 0;
    }

    /**
     * Metodo andar que servira para las subclases de Vehiculo, como son Coche y Bicicleta, en el que hay que pasarle por parámetro
     * los kilometros que se desean andar.
     * @param km
     */
    public void andar(int km){
        kilometrosRecorridos += km;
        kilometrosTotales += km;
    }

    /**
     * Metodo para ver los kilómetros recorridos de cada Vehiculo.
     * @return
     */
    public int getKilometrosRecorridos(){
        return kilometrosRecorridos;
    }

    /**
     * Metodo para obtener los kilometros totales, tiene que ser estático por que así puede acceder directamente a el metodo sin necesidad de instaciar un objeto.
     * @return
     */
    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }
}
