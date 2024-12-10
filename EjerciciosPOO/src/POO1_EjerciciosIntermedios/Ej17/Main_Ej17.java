package POO1_EjerciciosIntermedios.Ej17;

public class Main_Ej17 {
    public static void main(String[] args) {
        Piramide p = new Piramide(2);
        Rectangulo r1 = new Rectangulo(4, 3);
        Rectangulo r2 = new Rectangulo(6, 2);
        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Pirámides creadas: " + Piramide.getContajePiramides());
        System.out.println("Rectángulos creados: " + Rectangulo.getContajeRectangulos());
    }
}
