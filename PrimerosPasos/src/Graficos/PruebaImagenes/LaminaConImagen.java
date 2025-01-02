package Graficos.PruebaImagenes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class LaminaConImagen extends JPanel {

    private Image imagen;

    public LaminaConImagen(){

        File miImagen = new File("PrimerosPasos/src/Graficos/bola.png");

        //Tratamiento de excpeciones.
        try {
            imagen = ImageIO.read(miImagen);
        }catch (IOException e){
            System.out.println("La imagen no se encuentra");
        }

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        //g.drawImage(imagen,5,5,null);

        //El operador this hace referencia al objeto dobde me encuentro, en este caso en la lámina, por lo tanto estoy informando
        // de que es la lámina el objeto que espera que la imagen sea cargada.


        g.drawImage(imagen,0,0,20,20,null);
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 200; j++) {
                if (i+j>0){
                    g.copyArea(0,0,anchuraImagen,alturaImagen,20*i,20*j);
                }

            }
        }


    }
}
