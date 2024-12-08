package CondicionalesyBucles.BuclesAnidados;

public class Ejercicio3 {
    public static void main(String[] args) {
        int i, j, resultado;

        //Bucle for anidado donde la i será un buble que se repetirá 10 veces, pero en su interior en cada iteración
        //se repite el bucle de la j en el que realizará la mulktiplicación de la i por la j.

        for (i=1; i<=10; i++){
            System.out.println("Tabla del "+i);
            for (j=1; j<=10; j++){
                resultado = i*j;
                System.out.println(i+" * "+j+" = "+resultado);
            }
            System.out.println();
        }
    }
}
