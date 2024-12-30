package Graficos.PruebaImagenes;

import javax.swing.*;

public class MarcoImagen extends JFrame {

    public MarcoImagen(){
        setTitle("Marco con imagen");
        setBounds(750,300,300,200);

        LaminaConImagen miLamina = new LaminaConImagen();

        add(miLamina);
    }

}
