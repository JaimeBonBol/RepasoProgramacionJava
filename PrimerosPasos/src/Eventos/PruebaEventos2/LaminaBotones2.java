package Eventos.PruebaEventos2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaBotones2 extends JPanel{

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones2(){

        add(botonAzul);

        add(botonAmarillo);

        add(botonRojo);

        ColorFondo azul = new ColorFondo(Color.BLUE);
        ColorFondo amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo rojo = new ColorFondo(Color.RED);

        botonAzul.addActionListener(azul);  //Le decimos al boton que va a desencadenar un evento de tipo ratón(click).

        botonAmarillo.addActionListener(amarillo);

        botonRojo.addActionListener(rojo);
    }

    private class ColorFondo implements ActionListener {

        private Color colorDeFondo;

        public ColorFondo(Color color){
            this.colorDeFondo = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            setBackground(colorDeFondo);

        }
    }
}
