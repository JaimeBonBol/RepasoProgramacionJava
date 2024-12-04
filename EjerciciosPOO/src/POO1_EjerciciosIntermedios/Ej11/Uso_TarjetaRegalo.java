package POO1_EjerciciosIntermedios.Ej11;

public class Uso_TarjetaRegalo {
    public static void main(String[] args) {
        TarjetaRegalo t1 = new TarjetaRegalo(100);
        TarjetaRegalo t2 = new TarjetaRegalo(120);
        System.out.println(t1);
        System.out.println(t2);
        t1.gastar(45.90);
        t2.gastar(5);
        t2.gastar(200);
        t1.gastar(3.55);
        System.out.println(t1);
        System.out.println(t2);
        TarjetaRegalo t3 = t1.fusionar(t2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
