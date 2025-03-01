package POO_EjerciciosRepaso.Ej_Pizzeria;

import java.util.Scanner;

public class MainPizzeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el  nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce el telefono: ");
        int tlf = sc.nextInt();

        System.out.println("Introduce el numero de ingredientes que desea: ");
        int ingredientes = sc.nextInt();

        Pedido pedido = new Pedido(nombre, tlf, ingredientes);

        Pizzeria pizzeria = new Pizzeria("Pizza Loca");

        pizzeria.agregarPedido(pedido);

        pizzeria.mostrarPedidos();
    }
}
