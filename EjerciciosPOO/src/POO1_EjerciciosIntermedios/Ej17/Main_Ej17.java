package POO1_EjerciciosIntermedios.Ej17;

public class Main_Ej17 {
    public static void main(String[] args) {
        Piramide p = new Piramide(4);
        Piramide p2 = new Piramide(6);
        Rectangulo r1 = new Rectangulo(4, 3);
        Rectangulo r2 = new Rectangulo(6, 2);
        p.pintaPiramide();
        System.out.println();
        p2.pintaPiramide();
        System.out.println();
        r1.pintaRectangulo();
        System.out.println();
        r2.pintaRectangulo();
        System.out.println();
        System.out.println("Pirámides creadas: " + Piramide.getContajePiramides());
        System.out.println("Rectángulos creados: " + Rectangulo.getContajeRectangulos());
    }
}
