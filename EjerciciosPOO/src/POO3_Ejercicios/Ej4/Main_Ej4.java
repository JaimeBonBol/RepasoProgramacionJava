package POO3_Ejercicios.Ej4;

import java.util.ArrayList;
import java.util.List;

public class Main_Ej4 {
    public static void main(String[] args) {
        /*System.out.println("Prueba vehiculo: ");
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
        */

        //Creo una lista de tipo Vehiculo donde voy introduciendo diferentes tipos de vehiuclos de las subcleses Coche y Autobus
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        //Creo dos listas para las paradas de los dos autobuses.
        String[] paradasAlsa = {"P1", "P2", "P3", "P4"};
        String[] paradasSocibus = {"P7", "P8", "P9", "P10"};

        vehiculos.add(new Coche("1234CDS", 5, "Opel","Vectra"));
        vehiculos.add(new Coche("629BHY", 7, "Peugeot","205"));
        vehiculos.add(new Autobus("8269JDE",40,"Alsa",paradasAlsa));
        vehiculos.add(new Coche("531LMC", 5, "Citroen","Xsara"));
        vehiculos.add(new Autobus("2371Gfs",60,"Socibus",paradasSocibus));
        vehiculos.add(new Coche("2334", 7, "Seat","Leon"));

        //Recorro la lista con un bucle for each y le digo que en cada iteración el vehiculo que le toque muestre su información.
        for (Vehiculo vehiculo : vehiculos){
            vehiculo.mostrarInformacion();
            System.out.println();
        }
    }
}
