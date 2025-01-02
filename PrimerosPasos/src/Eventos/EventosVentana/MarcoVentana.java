package Eventos.EventosVentana;

import javax.swing.*;
import java.awt.event.*;

public class MarcoVentana extends JFrame {

    public MarcoVentana(){

        //setTitle("Respondiendo");

        //setBounds(300,300,500,350);

        setVisible(true);

        M_Ventana oyenteVentana = new M_Ventana();  //Creamos una instancia perteneciente a la clase oyente(Que es M_Ventana).

        //Ahora tenemos que poner el marco a la escucha, es decir que esté preparado para llamar a la clase oyente.
        addWindowListener(oyenteVentana);
    }

}

class M_Ventana implements WindowListener{


    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("La ventana ha sido cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada");
    }
}