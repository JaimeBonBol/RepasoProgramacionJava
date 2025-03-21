package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 Ejercicio 3: Leer un archivo línea por línea
 Desarrolla un programa en Java que lea el archivo `datos.txt` línea por línea e imprima cada línea en la consola.
*/
public class Ej3_Ficheros {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/datos.txt";

        /**
         * Instancio un objeto de la clase BufferedReader.
         * Try catch para recoger error que lanza la clase BufferedReader.
         */

        try {
            //Instancia de BuffereReader pero que dentro tiene una instancia de FileReader.
            BufferedReader lectorBuffer = new BufferedReader(new FileReader(rutaArchivo));

            // variable donde almaceno la línea leida y la voy mostradno( también se podría ir almacenando en un
            // StringBuilder y luego lo muestro), se va repitiendo mientras que no devuleva un null,
            // que siginifica que ha llegado al final de la línea.
            String linea;
            while ((linea = lectorBuffer.readLine()) != null){
                System.out.print(linea);
                System.out.println();
            }

            lectorBuffer.close();
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
