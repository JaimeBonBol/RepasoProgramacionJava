package poo;
import javax.swing.*;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche micoche = new Coche();

        micoche.setColor(JOptionPane.showInputDialog("Introduce color "));

        System.out.println(micoche.getDatosGenerales());

        System.out.println(micoche.getColor());

        micoche.setAsientos_cuero(JOptionPane.showInputDialog("¿Tiene asientos de cuero? "));
        System.out.println(micoche.getAsientos_cuero());

        micoche.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(micoche.getClimatizador());

        System.out.println(micoche.dimePesoTotal());
        System.out.println("El precio final del coche es: "+micoche.precioCoche());
    }
}
