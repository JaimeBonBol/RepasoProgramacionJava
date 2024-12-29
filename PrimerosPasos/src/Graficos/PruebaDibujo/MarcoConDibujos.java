package Graficos.PruebaDibujo;

import javax.swing.*;

public class MarcoConDibujos extends JFrame{

    public MarcoConDibujos(){

        setTitle("Prueba de dibujo");

        setSize(400,400);

        LaminaConFiguras miLamina = new LaminaConFiguras();

        add(miLamina);

    }

}
