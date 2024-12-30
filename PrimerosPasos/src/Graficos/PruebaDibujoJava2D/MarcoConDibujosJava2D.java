package Graficos.PruebaDibujoJava2D;

import javax.swing.*;

public class MarcoConDibujosJava2D extends JFrame{

    public MarcoConDibujosJava2D(){

        setTitle("Prueba de dibujo");

        setSize(400,400);

        LaminaConFigurasJava2D miLamina = new LaminaConFigurasJava2D();

        add(miLamina);

    }

}
