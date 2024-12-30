package Graficos.TrabajandoColores;

import javax.swing.*;
import java.awt.*;

public class MarcoConColor extends JFrame {

    public MarcoConColor(){

        setTitle("Prueba con colores");

        setSize(400,400);

        LaminaConColor miLamina = new LaminaConColor();

        add(miLamina);

        miLamina.setBackground(SystemColor.window); //Para aplicarle el color de fondo a la lamina. En este caso con SystemColor.window se aplica el color por defecto de sistema operativo de ventana.
    }

}
