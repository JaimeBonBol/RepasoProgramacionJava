package CondicionalesyBucles.BuclesAnidados;

public class Ejercicio4 {
    public static void main(String[] args) {
        int n;

        System.out.println("Introduce los lados del cuadrado: ");
        n= EntradaDatos.LeerNumeroInt();

        //Primer bucle para filas y segundo para columnas, que es el que pinta los *.
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
