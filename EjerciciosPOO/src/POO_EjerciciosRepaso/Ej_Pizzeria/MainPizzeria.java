package POO_EjerciciosRepaso.Ej_Pizzeria;

import java.util.Scanner;

public class MainPizzeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pizzeria pizzeria = new Pizzeria("Pizza Marquilla");

        int opcion;

        do {
            System.out.println("Menú Pizzería "+pizzeria.getNombre()
            +"\nIntroduce una opción:" +
                    "\n1. Inicializar pizzería." +
                    "\n2. Agregar pedido." +
                    "\n3. Eliminar pedido." +
                    "\n4. Buscar pedido por nombre." +
                    "\n5. Mostrar pedidos." +
                    "\n6. Salir.");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    pizzeria.inicializarPizzeria();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Introduce el nombre: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();

                    System.out.println("Introduce el teléfono: ");
                    int tlf = sc.nextInt();

                    System.out.println("Introduce el número de ingredientes que desea: ");
                    int ingredientes = sc.nextInt();

                    Pedido pedido = new Pedido(nombre, tlf, ingredientes);

                    pizzeria.agregarPedido(pedido);
                    System.out.println();

                    break;

                case 3:
                    System.out.println("Introduce el código de pedido para eliminarlo: ");
                    int codEliminar = sc.nextInt();

                    pizzeria.eliminarPedido(codEliminar);
                    System.out.println();

                    break;

                case 4:
                    System.out.println("Introduce nombre para buscar pedido: ");
                    sc.nextLine();
                    String nombrBuscar = sc.nextLine();

                    pizzeria.buscarPedidoPorNombre(nombrBuscar);
                    System.out.println();

                    break;

                case 5:
                    System.out.println("Lista de pedidos: ");
                    pizzeria.mostrarPedidos();
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }while (opcion != 6);

    }
}
