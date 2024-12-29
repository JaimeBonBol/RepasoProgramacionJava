package Graficos;

import javax.swing.*;

public class CreandoMarcos {
    public static void main(String[] args) {

        Marco marco1 = new Marco();

        marco1.setVisible(true);    //Se puede poner en el constructor de la clase.

        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Se puede poner en el constructor de la clase.
    }
}
