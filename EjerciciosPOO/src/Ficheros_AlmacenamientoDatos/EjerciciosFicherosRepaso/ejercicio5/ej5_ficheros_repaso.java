package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio5;

/*
 Ejercicio 5: Contar palabras en un archivo
 Crea un programa que cuente el número total de palabras en el archivo `datos.txt` y muestre el resultado en la consola.
 */

import java.io.*;
import java.util.List;

public class ej5_ficheros_repaso {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio5/datos.txt";

        contarPalabrasArchivo(rutaArchivo);
    }

    public static boolean existeArchivo(File file){
        return file.exists();
    }

    public static void contarPalabrasArchivo(String rutaArchivo){
        try {
            File archivo = new File(rutaArchivo);

            if (existeArchivo(archivo)){

                BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                String linea;
                int palabras = 0;
                while ((linea = br.readLine()) != null){
                    String[] palabrasLinea = linea.split(" ");
                    palabras += palabrasLinea.length;

                    /* Otra manera de contabilizar las palabras
                    for (String palabra : palabrasLinea){
                        if (!palabra.isEmpty()){
                            palabras ++;
                        }
                    }*/
                }

                br.close();

                System.out.println("En el documento "+archivo.getName()+" hay un total de "+palabras+" palabras.");
            }else {
                System.out.println("El archivo no existe.");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
