package POO_EjerciciosClase;

import java.util.Scanner;

/**
 * Desarrolla un programa que gestione una tabla de ventas de productos en dos días consecutivos. El programa debe:
 *  - Crear un array bidimensional que almacene las ventas de 3 productos durante 2 días.
 *  - Solicitar al usuario que introduzca las ventas (int) para cada producto y día.
 *  - Mostrar la tabla completa de ventas.
 *  - Calcular y mostrar el total de ventas por producto.
 *  - Determinar qué producto tuvo el mayor total de ventas
 *
 */

public class TablaVentasProfesor {

    public static void mostrarVentas(int[][] ventas) {
        System.out.println("Tabla de ventas:");
        System.out.println("\t\t    Lunes\tMartes");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Producto " + (i+1) + ":  ");
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print(ventas[i][j] + "      ");
            }
            System.out.println();
        }
    }

    public static void productoConMasVentas(int[][] ventas) {
        int maxVentas = 0;
        int productoMasVendido = 0;
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 2; j++) {
                total += ventas[i][j];
            }

            if (total > maxVentas) {
                maxVentas = total;
                productoMasVendido = i + 1;
            }
        }
        System.out.println("El producto con mayor total de ventas es el Producto " + productoMasVendido + " con " + maxVentas + " ventas");
    }

    public static void ventasTotalesPorProducto(int[][] ventas) {
        System.out.println("Total de ventas por producto:");
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 2; j++) {
                total += ventas[i][j];
            }
            System.out.println("Producto " + (i+1) + ": " + total);
        }
    }

    public static void main(String[] args) {

        //Ej_ArraysBidi_TablaVentas obj = new Ej_ArraysBidi_TablaVentas(); //solo en el caso de que haya tomado la mala decisión de no hacer el metodo mostrarVentas estatico

        int[][] ventas = {
                {11, 22},
                {33, 44},
                {88, 99}
        };
        Scanner entrada = new Scanner(System.in);

        // Entrada de datos

        // Manera larga e ineficiente de introducir ventas
        /*
        System.out.println("Ingrese ventas para producto 1 del lunes");
        ventas[0][0] = entrada.nextInt();
        System.out.println("Ingrese ventas para producto 1 del martes");
        ventas[0][1] = entrada.nextInt();
        System.out.println("Ingrese ventas para producto 2 del lunes");
        ventas[1][0] = entrada.nextInt();
        System.out.println("Ingrese ventas para producto 2 del martes");
        ventas[1][1] = entrada.nextInt();
        System.out.println("Ingrese ventas para producto 3 del lunes");
        ventas[2][0] = entrada.nextInt();
        System.out.println("Ingrese ventas para producto 3 del martes");
        ventas[2][1] = entrada.nextInt();
        */

        // Manera corta y correcta de introducir datos en el array de ventas:
        /*for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("Ingrese ventas para producto " + (i+1) + " del día " + (j+1) + ": ");
                ventas[i][j] = entrada.nextInt();
            }
        }*/

        // Funcion mostrar ventas
        mostrarVentas(ventas);
        ventasTotalesPorProducto(ventas);
        productoConMasVentas(ventas);


    }

}