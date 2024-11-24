package CondicionalesyBucles;

import java.util.*;

public class Evalua_Edad {
    public static void main(String[] args) {
        //Condicionante if.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad, por favor: ");
        int edad = entrada.nextInt();

        if (edad<18){
            System.out.println("Eres un adolescente.");
        } else if (edad<65){
            System.out.println("Eres adulto.");
        } else {
            System.out.println("Ya eres jubilado.");
        }
    }
}
