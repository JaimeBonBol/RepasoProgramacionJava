package POO2_Ejercicios.Ej6;

public class Perro extends Animal{

    /**
     * Constructor de la clase Perro en el cual hay que pasarle el nombre.
     * @param nombre
     */
    public Perro(String nombre){
        this.nombre = nombre;
    }

    /**
     * Sobreescribiendo el metodo de la clase abstracta Animal para que el perro haga Guau.
     */
    @Override
    public void hacerSonido() {
        System.out.println("El perro "+ nombre+" hace guau");
    }


}
