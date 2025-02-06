package POO_EjerciciosClase;

import java.util.ArrayList;
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

public class TablaVentas {

    private int[][] tablaVentas;
    private int prod1;
    private int prod2;
    private int prod3;

    public TablaVentas(){
        tablaVentas = new  int[3][2];
    }

    public void introducirVentas(){
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("PRIMER DÍA: ");

        System.out.println("Introduce las ventas del primer producto:");
        int ventasProd1 = sc.nextInt();
        this.prod1 += ventasProd1;
        tablaVentas[0][0] = ventasProd1;

        System.out.println("Introduce las ventas del segundo producto:");
        int ventasProd2 = sc.nextInt();
        this.prod2 += ventasProd2;
        tablaVentas[1][0] = ventasProd2;

        System.out.println("Introduce las ventas del tercer producto:");
        int ventasProd3 = sc.nextInt();
        this.prod3 += ventasProd3;
        tablaVentas[2][0] = ventasProd3;

        System.out.println("SEGUNDO DÍA");

        System.out.println("Introduce las ventas del primer producto:");
        int ventasProd1Dia2 = sc.nextInt();
        this.prod1 += ventasProd1Dia2;
        tablaVentas[0][1] = ventasProd1Dia2;

        System.out.println("Introduce las ventas del segundo producto:");
        int ventasProd2Dia2 = sc.nextInt();
        this.prod2 += ventasProd2Dia2;
        tablaVentas[1][1] = ventasProd2Dia2;

        System.out.println("Introduce las ventas del tercer producto:");
        int ventasProd3Dia3 = sc.nextInt();
        this.prod3 += ventasProd3Dia3;
        tablaVentas[2][1] = ventasProd3Dia3;

        /*int dia = 1;
        for (int i = 0; i < 2; i++) {

            System.out.println("Dia "+dia);
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce las ventas del producto: ");
                tablaVentas[i][j] = sc.nextInt();

            }
            dia ++;
        }*/
    }

    public void mostrarTablaVentas(){
        int dia = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                if (j==0){
                    dia = 1;
                }
                else {
                    dia = 2;
                }
                System.out.print("Dia "+dia+": ");
                System.out.print(tablaVentas[i][j]+" ");
            }

        }
        System.out.println();
    }

    public void totalVentasProducto(){
        System.out.println("Total ventas producto 1: "+prod1);
        System.out.println("Total ventas producto 2: "+prod2);
        System.out.println("Total ventas producto 3: "+prod3);
    }

    public void productoMasVendido(){
        ArrayList<Integer> productos = new ArrayList<>();

        productos.add(prod1);
        productos.add(prod2);
        productos.add(prod3);

        int prodMasVendido = 0;
        for (int producto : productos){
            if (producto > prodMasVendido){
                prodMasVendido = producto;
            }
        }
        if (prodMasVendido == prod1){
            prodMasVendido = 1;
        } else if (prodMasVendido == prod2) {
            prodMasVendido = 2;
        } else if (prodMasVendido == prod3) {
            prodMasVendido = 3;
        }
        System.out.println("EL producto más vendido es el producto "+prodMasVendido);
    }
}
