package Graficos.TrabajandoConFuentes;

import javax.swing.*;
import java.awt.*;

public class MarcoConFuentes extends JFrame {

    public MarcoConFuentes(){

        setTitle("Prueba con fuentes");

        setSize(400,400);

        LaminaConFuentes miLamina = new LaminaConFuentes();

        add(miLamina);

        //Para establecer un color que deben tener todos los elementos dentro de una lámina.
        miLamina.setForeground(Color.BLUE);

    }

}
