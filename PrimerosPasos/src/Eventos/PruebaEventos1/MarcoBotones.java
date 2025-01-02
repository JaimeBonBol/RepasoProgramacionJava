package Eventos.PruebaEventos1;

import javax.swing.*;

public class MarcoBotones extends JFrame {

    public MarcoBotones(){
        setTitle("Botones y Eventos");
        setBounds(700,300,500,300);

        LaminaBotones miLamnina = new LaminaBotones();

        add(miLamnina);
    }

}
