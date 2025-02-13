package POO_EjerciciosClase.Productos;

import java.util.Scanner;

public class GestionInvetario {
    public static void main(String[] args) {

        Inventario inventarioTienda = new Inventario();

        //MENÚ.

        boolean programa = true;

        while (programa){

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un valor: "+
                    "\n1. Agregar un nuevo producto."+
                    "\n2. Mostrar inventario."+
                    "\n3. Vender un producto."+
                    "\n4. Salir.");

            int opcion = sc.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Introduce el código del producto: ");
                    int codigo = sc.nextInt();

                    System.out.println("Introduce el nombre del producto: ");
                    String nombre = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Introduce el precio del producto: ");
                    int precio = sc.nextInt();

                    System.out.println("Introduce la cantidad de unidades que hay en stock del producto: ");
                    int cantidadStock = sc.nextInt();

                    Producto producto = new Producto(codigo,nombre,precio,cantidadStock);
                    System.out.println(producto.mostrarInformacion());


                    inventarioTienda.agregarProducto(producto);

                    break;

                case 2:
                    inventarioTienda.mostrarInventario();
                    break;

                case 3:
                    System.out.println("Introduce el código del producto que se quiere vender: ");
                    int codigoVenta = sc.nextInt();

                    System.out.println("Introduce la cantidad que se quiere vender: ");
                    int cantidadVender = sc.nextInt();

                    inventarioTienda.venderProducto(codigoVenta, cantidadVender);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");

                    programa = false;

                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        }

    }
}
