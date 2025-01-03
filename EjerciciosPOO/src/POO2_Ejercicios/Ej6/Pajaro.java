package POO2_Ejercicios.Ej6;

public class Pajaro extends Animal{

    /**
     * Constructor de la clase Pajaro en el cula hay que pasarle el nombre.
     * @param nombre
     */
    public Pajaro(String nombre){
        this.nombre = nombre;
    }

    /**
     * Sobreescribiendo el metodo de la clase abstracta Animal para que el pajaro haga pio.
     */
    @Override
    public void hacerSonido() {
        System.out.println("El pajaro "+ nombre + " hace pio.");
    }
}
