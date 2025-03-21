package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

/*
 Ejercicio 2: Leer un archivo carácter por carácter
 Escribe un programa en Java que lea el archivo `datos.txt` carácter por carácter y muestre el contenido en la pantalla.
*/

import java.io.FileReader;
import java.io.IOException;

public class Ej2_Ficheros {
    public static void main(String[] args) {
        /**
         * Variable donde guardo la ruta del archivo.
         */
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/datos.txt";

        /**
         * Instancio un objeto de la clase FileReader
         * Try catch para recoger la excepción que lanza la clase FileReader.
         */
        try{
            FileReader reader = new FileReader(rutaArchivo);
            // Variable para almacenar el caracter que va leyendo y lo va mostrando, mientras
            // que este no sea -1, que es el valor que devuelve cuando termina de leer.
            int caracter;
            while ((caracter = reader.read()) != -1){
                System.out.print((char) caracter);
            }
            reader.close();
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
