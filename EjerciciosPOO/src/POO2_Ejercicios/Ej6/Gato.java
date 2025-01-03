package POO2_Ejercicios.Ej6;

public class Gato extends Animal{

    /**
     * Constructor de la clase Gato en el cual hay que pasarle el nombre.
     * @param nombre
     */
    public Gato(String nombre){
        this.nombre = nombre;
    }

    /**
     * Sobreescribiendo el metodo de la clase abstracta Animal para que el gato haga miau.
     */
    @Override
    public void hacerSonido() {
        System.out.println("El gato "+ nombre+ " hace miau");
    }
}
