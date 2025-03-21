package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 Ejercicio 4: Agregar contenido a un archivo
 Modifica el archivo `datos.txt` para agregar nuevas líneas de texto sin borrar el contenido anterior.
*/
public class Ej4_Ficheros {
    public static void main(String[] args) {
        /**
         * Variables donde guardo la ruta del archivo y el texto que se va a escirbir.
         */
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/datos.txt";
        String nuevoTexto = "Hola, este es un nuevo texto" +
                "\nPerteneciente al ejercicio 4 de ficheros";

        /**
         * Instancio un objeto de la clase BufferedWriter en el cuál dentro hay que
         * instanciar un objeto de la clase FileWriter.
         * recogido en un try catch
         */

        try{
            //Para no borrar lo anterior hay que poner true como sehundo parámetro en el FileWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo,true));

            //para iniciar en la sig línea
            bw.newLine();
            //Con el metodo .write escribo en el archivo.
            bw.write(nuevoTexto);
            //Mensaje para que se sepa que se ha escrito correctamente
            System.out.println("Texo escrito correctamente");

            //Cerrar el BufferefWriter
            bw.close();

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
