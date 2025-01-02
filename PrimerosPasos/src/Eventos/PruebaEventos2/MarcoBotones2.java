package Eventos.PruebaEventos2;

import javax.swing.*;

public class MarcoBotones2 extends JFrame {

    public MarcoBotones2(){
        setTitle("Botones y Eventos");
        setBounds(700,300,500,300);

        LaminaBotones2 miLamnina = new LaminaBotones2();

        add(miLamnina);
    }

}
