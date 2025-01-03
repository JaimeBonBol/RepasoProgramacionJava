package POO2_Ejercicios.Ej7;

public class Circulo extends Figura{

    private int radio;

    public Circulo(int radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
