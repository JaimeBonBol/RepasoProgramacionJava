package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

/*
 Ejercicio 11: Listar archivos en un directorio
 Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
 */

import java.io.File;
import java.io.IOException;

public class Ej11_Ficheros {
    public static void main(String[] args) {
        //Directorio actual
        String rutaDirectorio ="EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros";
        File directorio = new File(rutaDirectorio);

        //El metodo listFiles devuelve un array de File con lo que hay dentro del directorio.
        File[] listado = directorio.listFiles();
        if (listado != null){
            //En cada file dentro del array comprueba si es directorio o archivo y muestra un mensaje u otro.
            for (File archivo : listado){
                if (archivo.isDirectory()){
                    System.out.println(archivo.getName()+" (Directorio)");
                } else if (archivo.isFile()) {
                    System.out.println(archivo.getName()+" (Archivo)");
                }
            }
        }else {
            System.out.println("No hay nada en la carpeta");
        }
    }
}
