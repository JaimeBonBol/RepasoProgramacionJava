package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio3;

/*
 Ejercicio 3: Leer un archivo línea por línea
 Desarrolla un programa en Java que lea el archivo `datos.txt` línea por línea e imprima cada línea en la consola.
*/

import java.io.*;

public class ej3_ficheros_repaso {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio3/datos.txt";

        leerArchivoLineaxLinea(rutaArchivo);
    }

    public static boolean existeArchivo(File archivo){
        if (archivo.exists()){
            return true;
        }else return false;
    }

    public static void leerArchivoLineaxLinea(String rutaArchivo){
        try {
            File archivo = new File(rutaArchivo);

            if (existeArchivo(archivo)){
                BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));

                String linea;

                while ((linea = lector.readLine()) != null){
                    System.out.println(linea);
                }

                lector.close();
            }else {
                System.out.println("No existe el archivo.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
