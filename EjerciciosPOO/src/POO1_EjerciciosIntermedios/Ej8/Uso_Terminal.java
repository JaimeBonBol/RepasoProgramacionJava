package POO1_EjerciciosIntermedios.Ej8;

import java.util.Scanner;

public class Uso_Terminal {
    public static void main(String[] args) {
        Terminal t1 = new Terminal(612214589);
        Terminal t2 = new Terminal(798765432);
        Terminal t3 = new Terminal(814256987);

        Scanner sc = new Scanner(System.in);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);


        System.out.println("Hora de llamar...");
        System.out.println("Cuantos segundos dura la llamada: ");

        int tiempoLlamada = sc.nextInt();
        t1.llamada(t2,tiempoLlamada);

        System.out.println("Datos Post llamadas: ");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);



        System.out.println("Hora de llamar...");
        System.out.println("Cuantos segundos dura la llamada: ");

        int tiempoLlamada2 = sc.nextInt();
        t1.llamada(t3, tiempoLlamada2);

        System.out.println("Datos Post llamadas: ");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
