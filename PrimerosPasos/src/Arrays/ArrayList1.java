package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {
        //Un ArrayList en lo que conocíamos en pyton como LISTA
        //Un ArrayList es una estructura de dtatos en Java que permite allmacenar elementos de forma dinamica.

        //Ventaja sobre Array: No necesito definir su tamaño de antemano.

        ArrayList<String> nombres = new ArrayList<>();
        String[] n={"Pepe","Juan"};

        //Agregar elementos al ArrayList
        nombres.add("Ester");
        nombres.add("Juan");
        nombres.add("Ricardo");

        System.out.println("lista de nombres: "+nombres);
        System.out.println(Arrays.toString(n));

        // Accedder a un elemeneto específico:
        System.out.println("El primer nombre: "+nombres.get(0));
        System.out.println("El segundo nombre: "+nombres.get(1));

        // Cambiar un elemento:
        nombres.set(1,"Carmen");
        System.out.println("Lista actualizada: "+ nombres);

        /*
         * add(): Metodo para agregar items
         * get(): Permite acceder a un elemento por su index
         * set(): Cambia un elemento de la lista en una posición especifica.
         */

    }
}
