package POO2_Ejercicios.Ej8;

public class MainVehiculos {
    public static void main(String[] args) {

        /**
         * Creo un array del tipo Vehiculo donde voy a almacenar 5 vehiculos.
         */
        Vehiculo[] vehiculos = new Vehiculo[5];

        /**
         * Lo relleno con 5 tipos de vehículos diferentes, es decir con instancias de las subclases.
         */
        vehiculos[0] = new Coche(90);
        vehiculos[1] = new Bicicleta(35);
        vehiculos[2] = new Avion(400);
        vehiculos[3] = new Bicicleta(45);
        vehiculos[4] = new Coche(120);

        /**
         * Recorro con un bucle for el array, diciendole que ejecute el metodod mover en cada iteración.
         */
        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i].mover();
            System.out.println();
        }
    }
}
