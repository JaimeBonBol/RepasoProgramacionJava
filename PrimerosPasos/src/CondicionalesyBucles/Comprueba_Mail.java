package CondicionalesyBucles;

import javax.swing.*;

public class Comprueba_Mail {
    //Programa para comprobar si un mail es correcto.
    // Repaso de buce for.

    public static void main(String[] args) {
        int arroba=0;
        boolean punto=false;

        String mail = JOptionPane.showInputDialog("Introuce mail ");

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i)=='@'){
                arroba ++;
            }
            if (mail.charAt(i)=='.'){
                punto = true;
            }
        }

        if (arroba==1 && punto == true){
            System.out.println("Email correcto.");
        }else {
            System.out.println("Email incorrecto.");
        }


    }
}
