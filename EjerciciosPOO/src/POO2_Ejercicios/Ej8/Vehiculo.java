package POO2_Ejercicios.Ej8;

public abstract class Vehiculo {

    /**
     * Atributo de la clase abstracta.
     */
    protected int velocidad;

    /**
     * Constructor al que hay que pasarle por parámetros la velocidad, donde las subclases llamarán a este constructor en la creación de cada subclase.
     * @param velocidad
     *//*
    public Vehiculo(int velocidad){
        this.velocidad = velocidad;
    }*/

    /**
     * Metodo abstracto que utilizarán las subclases para imprimir como se mueve el vehículo.
     */
    public abstract void mover();

}
