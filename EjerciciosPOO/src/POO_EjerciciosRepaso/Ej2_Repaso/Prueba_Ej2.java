package POO_EjerciciosRepaso.Ej2_Repaso;

import java.util.Scanner;

public class Prueba_Ej2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Introduce la edad: ");
        int edad = entrada.nextInt();

        System.out.println("Introduce el sexo: ");
        char sexo = entrada.nextLine().charAt(0);

        System.out.println("Introduce el peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Introduce la altura: ");
        double altura =entrada.nextDouble();
    }
}
