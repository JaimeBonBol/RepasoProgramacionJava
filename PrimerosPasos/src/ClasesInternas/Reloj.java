package ClasesInternas;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Reloj {

    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMarcha(){

        ActionListener oyente = new DameLaHora2();

        Timer miTemporizador = new Timer(intervalo, oyente);

        miTemporizador.start();

    }

    private class DameLaHora2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            Date ahora = new Date();

            System.out.println("Te pongo la hora cada "+(intervalo/1000)+" segundos: "+ ahora);

            if (sonido == true){
                //Para que haga un sonido:(En micaso no me funciona)
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
