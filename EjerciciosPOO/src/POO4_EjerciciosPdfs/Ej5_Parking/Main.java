package POO4_EjerciciosPdfs.Ej5_Parking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instanciación de parking, con el nombre de Parking Centro y un total de 10 plazas.
        Parking parking = new Parking("Parking Centro",10);

        //Menu con 4 opciones: 1) Entrada de coche, 2) Salida de coche, 3) Mostrar parking y 4) Salir del programa.
        boolean finPrograma = true;

        while (finPrograma){
            Scanner entradaDatos = new Scanner(System.in);

            System.out.println("Introduzca una opcíon: "+
                    "\n1) Entrada de coche."+
                    "\n2) Salida de coche."+
                    "\n3) Mostrar parking."+
                    "\n4) Salir del programa.");

            //Pide el ejercicio que se convierta la entrada a numero entero.
            int opcion = Integer.parseInt(entradaDatos.nextLine());

            switch (opcion){
                case 1:

                    System.out.println("Introduzca matrícula para entrada: ");
                    String matriculaentrada = entradaDatos.nextLine();

                    System.out.println("Introduce la plaza a la que desea ingresar: ");
                    int plazaEntrada = entradaDatos.nextInt();

                    parking.entrada(matriculaentrada, plazaEntrada);

                    System.out.println();

                    System.out.println("Número de plazas totales: "+parking.getPlazasTotales());

                    System.out.println("Número de plazas ocupadas: "+parking.getPlazasOcupadas());

                    System.out.println("Número de plazas disponibles: "+parking.getPlazasLibres());

                    System.out.println();

                    break;

                case 2:

                    System.out.println("Introduzca la matrícula para salida: ");
                    String matriculaSalida = entradaDatos.nextLine();

                    parking.salida(matriculaSalida);

                    System.out.println();

                    System.out.println("Número de plazas totales: "+parking.getPlazasTotales());

                    System.out.println("Número de plazas ocupadas: "+parking.getPlazasOcupadas());

                    System.out.println("Número de plazas disponibles: "+parking.getPlazasLibres());

                    System.out.println();

                    break;

                case 3:

                    System.out.println(parking);

                    System.out.println();

                    break;

                case 4:

                    System.out.println("Saliendo...");

                    finPrograma = false;

                    break;

                default:

                    System.out.println("Opción no válida.");
            }
        }
    }
}
