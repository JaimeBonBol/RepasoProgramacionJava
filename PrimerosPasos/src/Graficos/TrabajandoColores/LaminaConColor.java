package Graficos.TrabajandoColores;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class LaminaConColor extends JPanel {

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        //Casting para convertir el objeto g a un objeto Graphics2D al cuál denomino g2.
        Graphics2D g2 = (Graphics2D) g;

        //Dibujo de rectángulo.
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);

        g2.setPaint(Color.BLUE);    //Establezco color, es decir como si tuviera este color en la mano.

        g2.draw(rectangulo);    //Ahora dibujo el rectángulo.

        g2.setPaint(Color.RED); //Vuelvo a establecer otro color.

        g2.fill(rectangulo);    //Y se rellena el rectángulo.

        //Dibujo de elipse.
        Ellipse2D elipse = new Ellipse2D.Double();

        elipse.setFrame(rectangulo);

        Color miColor = new Color(86, 142, 200);

        g2.setPaint(miColor);

        g2.fill(elipse);

    }
}
