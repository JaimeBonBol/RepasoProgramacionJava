package Graficos.PruebaImagenes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class LaminaConImagen extends JPanel {

    private Image imagen;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        File miImagen = new File("PrimerosPasos/src/Graficos/coche.png");

        //Tratamiento de excpeciones.
        try {
            imagen = ImageIO.read(miImagen);
        }catch (IOException e){
            System.out.println("La imagen no se encuentra");
        }

        //g.drawImage(imagen,5,5,null);
        g.drawImage(imagen,5,5,250,150,null);
    }
}
