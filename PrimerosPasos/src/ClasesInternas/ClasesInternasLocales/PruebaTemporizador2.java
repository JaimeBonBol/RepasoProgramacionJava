package ClasesInternas.ClasesInternasLocales;


import javax.swing.*;

public class PruebaTemporizador2 {
    public static void main(String[] args) {

        Reloj miReloj = new Reloj();

        miReloj.enMarcha(3000,true);

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar:");

        System.exit(0);

    }
}