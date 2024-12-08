package POO1_EjerciciosIntermedios.Ej16;

public class Punto {
    /**
     * Atributos de la clase punto.
     */
    protected double x;
    protected double y;

    /**
     * Metodo constructor de la clase Punto.
     * @param x
     * @param y
     */
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo getX para obtener el valor de la variable x de un punto.
     * @return
     */
    public double getX() {
        return x;
    }

    /**
     * Metodo getY para obtener el valor de la variable y de un punto.
     * @return
     */
    public double getY() {
        return y;
    }
}
