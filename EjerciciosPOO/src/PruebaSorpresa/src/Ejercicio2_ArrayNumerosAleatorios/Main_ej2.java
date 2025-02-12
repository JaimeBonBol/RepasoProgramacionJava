/*
Escribe un programa que genere 20 números aleatorios entre 0 y 100 y que los almacene en un array. El programa debe ser capaz
de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y todos las números impares a las celdas
restantes. Utiliza arrays auxiliares si es necesario.
 */

package Ejercicio2_ArrayNumerosAleatorios;

import java.util.ArrayList;

public class Main_ej2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numPar = new ArrayList<>();
        ArrayList<Integer> numImpar = new ArrayList<>();
        int numAleatorio;

        for (int i=1; i<=20; i++){
            numAleatorio= ((int) (Math.random() * 100));
            if (numAleatorio % 2 ==0){
                numPar.add(numAleatorio);
            } else if (numAleatorio % 2 != 0) {
                numImpar.add(numAleatorio);
            }
        }
        System.out.println("Números pares: "+numPar);
        System.out.println("Números impares: "+numImpar);
        numeros.addAll(numPar);
        numeros.addAll(numImpar);
        System.out.println(numeros);
    }

}
