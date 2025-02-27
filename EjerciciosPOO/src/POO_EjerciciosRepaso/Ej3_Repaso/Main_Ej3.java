package POO_EjerciciosRepaso.Ej3_Repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Ej3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce cuantas password quieres tener: ");
        int tamanoArrayPasswors = entrada.nextInt();

        Password[] listaPasswords = new Password[tamanoArrayPasswors];

        System.out.println("Introduce longitud que tendrán las contraseñas: ");
        int longitudPasswords = entrada.nextInt();

        Boolean[] seguridadPAsswords = new Boolean[tamanoArrayPasswors];

        for (int i = 0; i < tamanoArrayPasswors; i++) {
            //En la posicion de cada iteración (i) se añade una nueva Password.
            listaPasswords[i] = new Password(longitudPasswords);

            //Se añade al array de booleanos de seguridad de password de cada iteración, comprobando con el medtodo esFuerte
            // de la contraseña que se encuentra en la posición de cada iteración (i), el valor ture o false.
            seguridadPAsswords[i] = listaPasswords[i].esFuerte();
        }

        for (int i = 0; i < listaPasswords.length; i++) {
            System.out.println(listaPasswords[i].toString()+"\n"+seguridadPAsswords[i]);
        }
    }
}
