/*
Realiza un programa que pinte una tableta de turrón con un bocado realizado de forma aleatoria. El ancho y alto de la tableta se pide por teclado.
El bocado se da alrededor del turrón, obviamente no se puede dar un bocado en medio de la tableta.
 */

package Ejercicio1_NumerosAleatorios;

public class Main_ej1 {
    public static void main(String[] args) {
        int anchura, altura;

        System.out.println("Introduce la la anchura de la tableta: ");
        anchura=EntradaDatos.LeerNumeroInt();

        System.out.println("Introduce la altura de la tableta: ");
        altura=EntradaDatos.LeerNumeroInt();

       for (int fila=0; fila<altura; fila++){
           for (int columna=0; columna<anchura; columna++){
               System.out.print(" * ");
           }
           System.out.println();
       }

        String [][] tableta = new String[altura][anchura];
        String bocado =" ";
        //tableta[1][1]="*";
        String choco = "* ";
        //tableta[(int)(Math.random()*altura)][(int)(Math.random()*anchura)]=bocado;
        int bocadoFila = 0, bocadoColumna = 0;
        tableta[bocadoFila][bocadoColumna] = " ";
        for (int fila=0; fila<altura; fila++){

            for (int columna=0; columna<anchura; columna++){
                System.out.print(tableta[fila][columna]+" ");
            }
            System.out.println();
        }

    }
}
