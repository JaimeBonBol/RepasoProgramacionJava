package CondicionalesyBucles;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Programa para calcular el factorial de un número.
        //Repaso bucles.

        long resultado = 1; //también se podría declarar Long resultado = 1L;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nunero: ");
        int numero= entrada.nextInt();

        for (int i = numero; i >0; i--) {
            resultado = resultado*i;
        }
        System.out.println("El factorial de "+numero+" es "+resultado);
    }
}
