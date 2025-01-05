package POO3_Ejercicios.Ej4;

public class Vehiculo {

    /**
     * Atributos de la clase Vehiculo.
     */
    private String matricula;
    private int capacidad;

    /**
     * Constructor de la clase Vehiculo, el cual  hay que pasarle por parámetros la matricula y la capacidad
     * cada vez que se instancie un objeto de la clase.
     * @param matricula
     * @param capacidad
     */
    public Vehiculo(String matricula, int capacidad){
        this.matricula = matricula;
         this.capacidad = capacidad;
    }

    /**
     * Metodo para mostrar la información del vehiculo, mostrando su matrícula y su capacidad.
     */
    public void mostrarInformacion(){
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Cpacidad: "+this.capacidad+" personas.");
    }

}
