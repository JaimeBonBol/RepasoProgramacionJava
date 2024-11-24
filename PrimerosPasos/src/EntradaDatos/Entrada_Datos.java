package EntradaDatos;

import javax.swing.*;
import java.util.Scanner;

public class Entrada_Datos {
    public static void main(String[] args) {
        //Entrada de datos.

        /*
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        try {
            String  n = lector.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce edad: ");
        int edad_usuario = entrada.nextInt();

        System.out.println("Hola "+nombre_usuario+", el año que viene tendrás "+(edad_usuario +1)+" años");


        //Entrada datos mediante JOptionPane.

        String nombre_usuario2 = JOptionPane.showInputDialog("Introduce tu nombre: ");

        String  edad =  JOptionPane.showInputDialog("Introduce la edad: ");
        int edad_usuario2 = Integer.parseInt(edad);
        System.out.println("Hola "+ nombre_usuario2 + ". El año que viene tendrás "+ ( edad_usuario2 +1 )+" años.");
    }
}
