package ClasesInternas;


import javax.swing.*;

public class PruebaTemporizador2 {
    public static void main(String[] args) {

        Reloj miReloj = new Reloj(3000,true);

        miReloj.enMarcha();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar:");

        System.exit(0);

    }
}