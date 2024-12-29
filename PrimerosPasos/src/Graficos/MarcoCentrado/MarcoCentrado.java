package Graficos.MarcoCentrado;

import javax.swing.*;
import java.awt.*;

public class MarcoCentrado extends JFrame {

    public MarcoCentrado(){

        //En la varibale de tipo objeto Toolkit hemos guardado nuestro sistema nativo de ventanas.
        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        //Hay que instaciar un objeto de tipo deimension para actuar sobre ese para obtener el tamaño de mi pamntalla.
        Dimension tamanoPantalla = miPantalla.getScreenSize();

        int alturaPantalla = tamanoPantalla.height;

        int anchuraPAntalla = tamanoPantalla.width;

        //Para darle la mitad de altura y de anchura que la pantalla.
        setSize(anchuraPAntalla/2, alturaPantalla/2);

        //Para centrarlo en la pantalla.
        setLocation(anchuraPAntalla/4, alturaPantalla/4);

        //Para dar titulo a la ventana.
        setTitle("Marco centrado.");

        //Para cambiar el icono de la ventana.(Aunque en linux no me sale ningún icono ni por defecto).
        Image miIcono = miPantalla.getImage("src/Graficos/icono.jpg");

        setIconImage(miIcono);
    }

}
