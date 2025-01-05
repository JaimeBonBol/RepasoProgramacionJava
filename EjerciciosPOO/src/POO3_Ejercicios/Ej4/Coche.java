package POO3_Ejercicios.Ej4;

public class Coche extends Vehiculo{

    /**
     * Atributos de la clase cohce que hereda de Vehiculo.
     */
    private String marca;
    private String modelo;

    /**
     *Constructor de la clase Coche.
     * @param matricula
     * @param capacidad
     * @param marca
     * @param modelo
     */
    public Coche(String matricula, int capacidad, String marca, String modelo){
        super(matricula, capacidad);
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Metodo para mostrar información de la clase Coche.
     */
    @Override
    public void mostrarInformacion() {

        //Llamo al metodo la superclase Vehiculo.
        super.mostrarInformacion();

        //Y además muestro los dos atributos específicos de la clase Coche.
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
    }
}
