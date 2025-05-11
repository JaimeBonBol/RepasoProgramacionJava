package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio2;

/*
 Ejercicio 2: Leer un archivo carácter por carácter
 Escribe un programa en Java que lea el archivo `datos.txt` carácter por carácter y muestre el contenido en la pantalla.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej2_ficheros_repaso {
    public static void main(String[] args) {

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio2/datos.txt";

        File arhcivo = new File(rutaArchivo);

        if (existeArchivo(arhcivo)){
            leerArchivo(rutaArchivo);
        }else {
            System.out.println("No existe el archivo.");
        }

    }

    public static boolean existeArchivo(File archivo){
        if (archivo.exists()){
            return true;
        }else {
            return false;
        }
    }

    public static void leerArchivo(String rutaArchivo){
        try {
            File file = new File(rutaArchivo);
            FileReader reader = new FileReader(rutaArchivo);

            int caracter;
            while ((caracter = reader.read()) != -1){
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
