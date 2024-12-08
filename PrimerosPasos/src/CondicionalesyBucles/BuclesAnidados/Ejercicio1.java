package CondicionalesyBucles.BuclesAnidados;

public class Ejercicio1 {
    public static void main(String[] args) {
        int suma, i, j;

        //Bucle for anidado que se repite mientras que la i sea menor o igualq que 4, en la cada iteración vuelve a
        //hecer un bucle en este caso mientras que la j sea mayor que 0.
        for ( i=1; i<=4; i++){
            for (j=3; j>=0; j--){
                suma=i*10+j;
                System.out.println(suma);
            }
        }
    }
}
