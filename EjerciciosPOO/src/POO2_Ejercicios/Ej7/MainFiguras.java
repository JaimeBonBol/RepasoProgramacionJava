package POO2_Ejercicios.Ej7;

import java.util.ArrayList;

public class MainFiguras {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Rectangulo(4, 2));
        figuras.add(new Rectangulo(8, 10));
        figuras.add(new Circulo(2));
        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(1, 7));
        figuras.add(new Circulo(7));
        figuras.add(new Rectangulo(3, 6));

        for (Figura figura : figuras){
            figura.imprimirArea();
            System.out.println();
        }
    }
}
