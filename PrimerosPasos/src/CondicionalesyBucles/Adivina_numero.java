package CondicionalesyBucles;

import java.util.*;

public class Adivina_numero {
    public static void main(String[] args) {
        /*Programa que genera un número aleatorio entre 0 y 100 e introducimos un número para intentar
        adivinarlo.

        Repaso de bucle while con condicionante.
         */

        /*Variable que almacena un número aleatorio.
        Math.random()  da un num aleatorio entre 0.0 y 1.0 por tanto se múltiplica por 100 para que de un número
        aleatorio entre 0 y 100, y se convierne a int.
         */

        int aleatorio = (int) (Math.random()*100);

        Scanner entrada = new Scanner(System.in);

        int numero=0;
        int intentos=0;

        do {
            intentos ++;
            System.out.println("Introduce un número: ");
            numero=entrada.nextInt();

            if (aleatorio<numero){
                System.out.println("Más bajo.");
            } else if (aleatorio>numero) {
                System.out.println("Más alto.");
            }
        }while (numero!=aleatorio);
        System.out.println("Enhorabuena has acertado.");
        System.out.println("Lo has adivinado en "+intentos+ " intentos.");
    }
}
