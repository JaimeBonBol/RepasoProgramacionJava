package POO1_EjerciciosIntermedios.Ej7;

import javax.swing.*;

public class Uso_Sala {
    public static void main(String[] args) {
        Sala principal = new Sala(1000);
        Sala compraVenta = new Sala(200);
        Sala VIP = new Sala(25);

        boolean finPrograma = true;

        while (finPrograma){
            int opcion=Integer.parseInt(JOptionPane.showInputDialog("Introduce una opción: \n1: Mostrar número de entradas libres. \n2: Comprar entradas. \n3: Salir. "));
            switch (opcion){
                case 1:
                    System.out.println("En la zona principal hay "+principal.getEntradas()+" entradas.");
                    System.out.println("En la zona de compra-venta hay "+compraVenta.getEntradas()+" entradas.");
                    System.out.println("En la zona VIP hay "+VIP.getEntradas()+" entradas.");
                    break;

                case 2:
                    int zonaDeseada = Integer.parseInt(JOptionPane.showInputDialog("¿Que zona desea?: \n1: Zona principal. \n2: Zona Compra Venta. \n3: Zona VIP."));
                    int entradasDeseadas = Integer.parseInt(JOptionPane.showInputDialog("Cúantas entradas desea comprar: "));

                    switch (zonaDeseada){
                        case 1:
                            principal.ventaEntrada(entradasDeseadas);
                            break;
                        case 2:
                            compraVenta.ventaEntrada(entradasDeseadas);
                            break;
                        case 3:
                            VIP.ventaEntrada(entradasDeseadas);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    finPrograma = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }




    }
}
