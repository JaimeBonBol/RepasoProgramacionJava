package POO2_Ejercicios.Ej8;

public class Coche extends Vehiculo {

    public Coche(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void mover() {
        System.out.println("El coche se mueve por la carretera a "+this.velocidad+" km/h.");
    }
}
