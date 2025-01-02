package Eventos.EventosVentana;

import javax.swing.*;

public class EventosVentana {
    public static void main(String[] args) {

        MarcoVentana miMarco = new MarcoVentana();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MarcoVentana miMarco2 = new MarcoVentana();

        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        miMarco.setTitle("Ventana 1");

        miMarco2.setTitle("Ventana 2");

        miMarco.setBounds(300,300,500,350);

        miMarco2.setBounds(900,300,500,350);
    }
}
