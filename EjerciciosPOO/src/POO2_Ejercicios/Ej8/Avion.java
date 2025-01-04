package POO2_Ejercicios.Ej8;

public class Avion extends Vehiculo{

    public Avion(int velocidad){
        this.velocidad = velocidad;
    }

    @Override
    public void mover() {
        System.out.println("El avión vuela por el cielo a "+this.velocidad+" km/h.");
    }
}
