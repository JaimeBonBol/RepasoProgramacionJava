package POO1_EjerciciosIntermedios.Ej15;

import java.util.ArrayList;

public class Uso_FichaDomino {
    public static void main(String[] args) {

        ArrayList <FichaDomino> secuencia = new ArrayList<>();

        //Ceación de la primera ficha, para sobre esta empezar a comprobar.
        FichaDomino ficha1 = new FichaDomino((int)(Math.random()*6), (int)(Math.random()*6));
        secuencia.add(ficha1);

        for (int i = 1; i < 8;) {
            //Saca el último número de la ficha anterior.
            int ultimoNumero = secuencia.get(i-1).numero2;

            //Creación de una nueva ficha, con dos números aleatorios del 0 a 6.
            FichaDomino nuevaFicha = new FichaDomino((int)(Math.random()*6), (int)(Math.random()*6));

            //Comprobación si el último número de la ficha anterior es igual al primer número de la ficha nueva, es decir
            //comprobación para ver si encajan.
            //Si las fichas encajan entonces se mete la nueva ficha en la lista y se suma uno para que continue el bucle for, si no
            // no se le suma uno y vuelve a repetir el proceso.
            if (ultimoNumero == nuevaFicha.numero1){
                secuencia.add(nuevaFicha);
                i++;
            }
        }

        for (FichaDomino ficha: secuencia){
            System.out.print(ficha);
        }

    }
}
