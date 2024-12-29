package Graficos.EscibiendoEnMarco;

import javax.swing.*;

public class MarcoConTexto extends JFrame {

    public MarcoConTexto(){

        setVisible(true);

        setSize(600,450);

        setLocation(400,200);

        setTitle("Primer texto");

        //Además de todas las características anteriores tiene que incluir una lamina de la clase Lamina creada antes.
        Lamina miLamina = new Lamina();

        //Para agregar lámina instanciada.
        add(miLamina);

    }

}
