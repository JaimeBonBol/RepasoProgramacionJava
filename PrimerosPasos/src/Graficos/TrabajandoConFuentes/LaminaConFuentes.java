package Graficos.TrabajandoConFuentes;

import javax.swing.*;
import java.awt.*;

public class LaminaConFuentes extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Font miFuente = new Font("Ubuntu", Font.BOLD, 26);

        g2.setFont(miFuente);

        //g2.setColor(Color.BLUE);

        g2.drawString("Modificando la fuente", 100, 100);

        Font miFuente2 = new Font("Serif",Font.ITALIC,24);

        g2.setFont(miFuente2);

        //g2.setColor(new Color(128,90,50).brighter());

        g2.drawString("Curso de java", 100, 200);
    }
}
