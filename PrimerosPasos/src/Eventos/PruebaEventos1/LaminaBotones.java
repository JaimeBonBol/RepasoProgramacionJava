package Eventos.PruebaEventos1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaBotones extends JPanel implements ActionListener {

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones(){

        add(botonAzul);

        add(botonAmarillo);

        add(botonRojo);

        botonAzul.addActionListener(this);  //Le decimos al boton que va a desencadenar un evento de tipo ratón(click).

        botonAmarillo.addActionListener(this);

        botonRojo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Aqui se programa lo que tiene que hacer cuando ocurra el evento.

        //getSource es un objeto perteneciente a la clase ActionEvent, por lo que lo utilizamos sobre el objeto e que es de la clase ActionEvent.
        //Este metodo nos devuelve quién es la fuente, el origen del evento. Y eso se almacena en botonPulsado de tipo Objeto, ya que nuestros botones son objetos.
        Object botonPulsado = e.getSource();

        if (botonPulsado == botonAzul){

            setBackground(Color.BLUE);

        } else if (botonPulsado == botonAmarillo){

            setBackground(Color.YELLOW);

        }else {

            setBackground(Color.RED);

        }

    }

}
