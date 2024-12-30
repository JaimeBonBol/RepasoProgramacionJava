package Graficos;

import javax.swing.*;
import java.awt.*;

public class ComprobarFuentesInstaladas {
    public static void main(String[] args) {

        //Programa para ver que tipos de letras hay intaladas en nuestro ordenador, lo devolverá en un array.


        String fuente = JOptionPane.showInputDialog("Introduce fuente: ");
        boolean estaFuente = false;


        String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        /*for (String e: nombresDeFuentes){
            System.out.println(e);
        }*/

        for (String nombreFuente : nombresDeFuentes){
            if (nombreFuente.equalsIgnoreCase(fuente)){
                estaFuente = true;
            }
        }
        if (estaFuente){
            System.out.println("Fuente instalada.");
        }else {
            System.out.println("No esta instalada la fuente.");
        }

    }
}
