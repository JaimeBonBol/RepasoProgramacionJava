package POO2_Ejercicios.Ej4;

public class MainFraccion {
    public static void main(String[] args) {

        Fraccion fraccion1 = new Fraccion(10,5);
        Fraccion fraccion2 = new Fraccion(30,40);

        System.out.println(fraccion1);
        System.out.println(fraccion2);

        System.out.println();

        fraccion1.invierte();
        System.out.println(fraccion1);

        fraccion2.invierte();
        System.out.println(fraccion2);

        System.out.println();

        fraccion1.simplifica();
        System.out.println(fraccion1);
        fraccion2.simplifica();
        System.out.println(fraccion2);

        System.out.println();

        System.out.println(fraccion1.multiplica(fraccion2));
        System.out.println(fraccion1.divide(fraccion2));
    }
}
