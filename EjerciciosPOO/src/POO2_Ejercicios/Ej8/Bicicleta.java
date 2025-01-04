package POO2_Ejercicios.Ej8;

public class Bicicleta extends Vehiculo{

    public Bicicleta(int velocidad){
        this.velocidad = velocidad;
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta se mueve por el carril bici a "+this.velocidad+" km/h.");
    }
}
