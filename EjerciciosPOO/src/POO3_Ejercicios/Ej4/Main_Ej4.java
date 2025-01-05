package POO3_Ejercicios.Ej4;

import java.util.List;

public class Main_Ej4 {
    public static void main(String[] args) {
        System.out.println("Prueba vehiculo: ");
        Vehiculo vehiculo1 = new Vehiculo("638QFT",7);
        vehiculo1.mostrarInformacion();

        System.out.println();

        System.out.println("Prueba coche:");
        Coche coche1 = new Coche("1234CDS", 5, "Opel","Vectra");
        coche1.mostrarInformacion();

        System.out.println();
        String[] paradas = {"P1", "P2", "P3", "P4"};
        Autobus autobus1 = new Autobus("8269JDE",40,"Alsa",paradas);
        autobus1.mostrarInformacion();

    }
}
