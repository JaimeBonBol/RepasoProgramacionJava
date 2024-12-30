package Graficos.PruebaDibujoJava2D;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class LaminaConFigurasJava2D extends JPanel {

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g; //Refundición, hemos convertido nuestro objeto de tipo Graphics en un objeto de tipo Graphics2D.

        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);

        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();

        elipse.setFrame(rectangulo);

        g2.draw(elipse);

        g2.draw(new Line2D.Double(100, 100, 300, 250));

        double centroX = rectangulo.getCenterX();

        double centroY = rectangulo.getCenterY();

        double radio = 150;

        Ellipse2D circulo = new Ellipse2D.Double();

        circulo.setFrameFromCenter(centroX, centroY,centroX+radio, centroY+radio);

        g2.draw(circulo);
    }

}
