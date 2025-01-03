package POO2_Ejercicios.Ej2;

import java.util.Scanner;

public class MainVehiculos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();

        int opcion;
        do {
            System.out.println("ELige una opción:");
            System.out.println("1. Anda con la bicicleta.");
            System.out.println("2. Haz el caballito con la bicicleta.");
            System.out.println("3. Anda con el cohe.");
            System.out.println("4. Quema rueda con el coche.");
            System.out.println("5. Ver kilometraje de la bicicleta.");
            System.out.println("6. Ver kilometraje del coche,");
            System.out.println("7. Ver kilometraje total.");
            System.out.println("8. Salir.");
            opcion = entrada.nextInt();

            switch (opcion){

                case 1:

                    int kmBicicleta;
                    System.out.println("¿Cuantos km anda?");
                    kmBicicleta = entrada.nextInt();
                    bicicleta.andar(kmBicicleta);
                    break;

                case 2:

                    bicicleta.hacerCaballito();
                    break;

                case 3:

                    int kmCoche;
                    System.out.println("¿Cuantos km anda?");
                    kmCoche =entrada.nextInt();
                    coche.andar(kmCoche);
                    break;

                case 4:

                    coche.quemarRueda();
                    break;

                case 5:

                    System.out.println("La bicicleta ha recorrido "+bicicleta.getKilometrosRecorridos()+" kilómetros.");
                    break;

                case 6:

                    System.out.println("el coche ha recorrido "+coche.getKilometrosRecorridos()+" kilómetros.");
                    break;

                case 7:

                    System.out.println("El kilometraje total de todos los vehículos es de "+Vehiculo.getKilometrosTotales()+" kilómetros.");
                    break;

                case 8:

                    System.out.println("Saliendo del programa..."   );
                    break;

                default:

                    System.out.println("Opción no válida, eliga un número entre el 1 y el 8.");
            }
        }while (opcion != 8);
    }
}
