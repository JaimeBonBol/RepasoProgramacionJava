package POO1_EjerciciosIntermedios.Ej9;

public class Uso_Movil {
    public static void main(String[] args) {
        Movil m1 = new Movil(678452145, "rata");
        Movil m2 = new Movil(741369852, "mono");
        Movil m3 = new Movil(873021450, "bisonte");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("Tiempo de llamada...");
        m1.llamada(m2, 320);


        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("Tiempo de llamada...");
        m1.llamada(m3, 200);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("Tiempo de llamada...");
        m2.llamada(m3, 550);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}