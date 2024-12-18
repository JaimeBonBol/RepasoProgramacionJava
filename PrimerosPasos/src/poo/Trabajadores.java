package poo;

public interface Trabajadores {

    //Si no se pone public abstract se le asigna por defecto.
    public abstract double estabeleceBonus(double gratificacion);

    //Si no se pone public static final se le asigna por defecto.
    public static final double bonusBase = 1500;
}
