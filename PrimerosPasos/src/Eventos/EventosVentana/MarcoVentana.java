package Eventos.EventosVentana;

import javax.swing.*;
import java.awt.event.*;

public class MarcoVentana extends JFrame {

    public MarcoVentana(){

        //setTitle("Respondiendo");

        //setBounds(300,300,500,350);

        setVisible(true);

        /*M_Ventana oyenteVentana = new M_Ventana();  //Creamos una instancia perteneciente a la clase oyente(Que es M_Ventana).

        //Ahora tenemos que poner el marco a la escucha, es decir que esté preparado para llamar a la clase oyente.
        addWindowListener(oyenteVentana);*/

        addWindowListener(new M_Ventana());
    }

}

/**
 * Como hereda de una clase adaptadora, ya no hace falta implementar todos los metodos, solo los que vayamos a usar.
 */
class M_Ventana extends WindowAdapter{

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

}