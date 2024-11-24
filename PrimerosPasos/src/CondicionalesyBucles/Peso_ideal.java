package CondicionalesyBucles;

import javax.swing.*;

public class Peso_ideal {
    public static void main(String[] args) {
        /*Programa que pide tu genero y calcula tu "peso ideal" con un do while para que te pida introducir el género
        mientras que lo que introduzcas no sea ni H ni M. Y con el if dependiendo de tu género te calcula el peso idal.
         */

        String genero=" ";

        do {
            genero = JOptionPane.showInputDialog("Introduce tu género (H/M): ");

        }while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        int pesoideal = 0;

        if (genero.equalsIgnoreCase("H")){
            pesoideal = altura - 110;
        } else if (genero.equalsIgnoreCase("M")) {
            pesoideal = altura - 120;
        }
        System.out.println("Tu peso ideal es "+pesoideal+" kg");
    }
}
