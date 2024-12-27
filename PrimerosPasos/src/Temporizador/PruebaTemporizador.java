package Temporizador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador {
    public static void main(String[] args) {

        DameLaHora oyente = new DameLaHora();

        Timer miTemporizador = new Timer(5000, oyente);

        //Metodo por defecto de la clase Timer start() para comenzar a ejecutar el temporizador.
        miTemporizador.start();

        //Mientras que esté esta ventana emergente el programa se estará ejecutando, hasta que pulsemos en Aceptar y entonces continuará con el programa hacia abajo.
        JOptionPane.showMessageDialog(null,"Pulsa Aceptar para detener.");

        //Esta función lo que hace es detener el programa.
        System.exit(0);
    }
}

class DameLaHora implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //En esta clase Date se esta almacenando en el objeto ahora la hora actual(En el momento de llamar a esta función).
        Date ahora = new Date();

        System.out.println("Te pongo la hora cada 5 segundos: "+ahora);
    }
}