package CondicionalesyBucles;

import javax.swing.*;

public class Acceso_aplicacion {
    public static void main(String[] args) {
        //Ejemplo bucle while.

        String clave = "Pepe";

        String password = " ";

        while (clave.equals(password)==false){
            password = JOptionPane.showInputDialog("Introduce la contraseña: ");
            if (clave.equals(password)==false){
                System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
            }
        }
        System.out.println("Contraseña correcta. Acceso permitido.");
    }
}
