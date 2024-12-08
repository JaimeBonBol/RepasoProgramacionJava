package POO1_EjerciciosIntermedios.Ej16;

public class Linea {
    /**
     * Atributos de la clase Linea, del tipo Punto.
     */
    private Punto p1;
    private Punto p2;

    /**
     * Constructor de la clase Linea, pasandole dos puntos.
     * @param p1
     * @param p2
     */
    public Linea(Punto p1, Punto p2){
        this.p1 = new Punto(p1.getX(), p1.getY());
        this.p2 = new Punto(p2.getX(), p2.getY());
    }

    /**
     * Metodo toString para mostrar la información de la línea, la cual está formada por dos puntos, que hay que obtener sus
     * coordenadas a través de los metodos getters, ya que si solo se pone "p1", mostraría la dirección de memoria a la que
     * apunta, a no ser que se implemente el metodo toString en la clase Punto.
     * @return
     */
    @Override
    public String toString() {
        return "Línea formada por los puntos "+"("+p1.getX()+", "+p1.getY()+") y ("+p2.getX()+", "+p2.getY()+")";
    }
}
