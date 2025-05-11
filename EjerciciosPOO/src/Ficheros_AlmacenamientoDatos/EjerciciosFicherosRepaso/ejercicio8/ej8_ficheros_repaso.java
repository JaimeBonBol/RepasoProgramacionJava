package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio8;

/*
 Ejercicio 8: Contar la cantidad de líneas en un archivo
 Crea un programa que cuente cuántas líneas tiene el archivo `datos.txt` y muestre el total.
 */

import java.io.*;

public class ej8_ficheros_repaso {
    public static void main(String[] args) {
        String rutaArhcivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio8/datos.txt";

        contarLineasArchivo(rutaArhcivo);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void contarLineasArchivo(String rutaArchivo){
        try {
            File archivo = new File(rutaArchivo);

            if (existeArchivo(archivo)){

                BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                int contajeLineas = 0;
                while ( br.readLine() != null){
                    contajeLineas ++;
                }

                System.out.println("El archivo "+archivo.getName()+" tiene "+contajeLineas+" líneas.");

                br.close();

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
