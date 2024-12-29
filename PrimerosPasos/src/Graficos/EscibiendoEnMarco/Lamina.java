package Graficos;

import javax.swing.*;
import java.awt.*;

public class Lamina extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        //LLama al metodo paintComponent de la clase JComponent para que haga su trabajo,
        // y además de eso sibuja después un texto.

        super.paintComponent(g);

        g.drawString("Estamos aprendiendo Swing",100,100);

    }
}
