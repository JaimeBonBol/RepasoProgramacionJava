package ClasesInternas.ClasesInternasLocales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Reloj {

    public void enMarcha(final int intervalo, final boolean sonido){

        //Clase interna local. ES una clase dentro de un metodo.
        class DameLaHora2 implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {

                Date ahora = new Date();

                System.out.println("Te pongo la hora cada "+(intervalo/1000)+" segundos: "+ ahora);

                if (sonido){ //sonido == true
                    //Para que haga un sonido:(En micaso no me funciona)
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener oyente = new DameLaHora2();

        Timer miTemporizador = new Timer(intervalo, oyente);

        miTemporizador.start();

    }

}
