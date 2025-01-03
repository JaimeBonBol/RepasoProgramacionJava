package POO2_Ejercicios.Ej5;

public class PedidosPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        Pizza p4 = new Pizza("cuatro quesos", "familiar");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println();

        p2.sirve();
        p2.sirve();

        p4.sirve();
        p4.sirve();

        p1.sirve();

        p3.sirve();

        System.out.println();

        System.out.println("Pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Servidas: " + Pizza.getTotalServidas());
    }
}
