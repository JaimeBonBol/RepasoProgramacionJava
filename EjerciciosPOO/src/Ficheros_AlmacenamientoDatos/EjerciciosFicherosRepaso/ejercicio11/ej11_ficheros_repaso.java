package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio11;

/*
 Ejercicio 11: Listar archivos en un directorio
 Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
 */

import java.io.File;

public class ej11_ficheros_repaso {
    public static void main(String[] args) {

        String rutaDirectorio = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso";

        listarArchivos(rutaDirectorio);

    }

    public static boolean existeDirectorio(File directorio){
        return  directorio.exists();
    }

    public static void listarArchivos(String rutaDirectorio){
        File directorio = new File(rutaDirectorio);

        if (existeDirectorio(directorio)){
            File[] archivos = directorio.listFiles();

            if (archivos != null){
                for (File archivo : archivos){
                    if (archivo.isFile()){
                        System.out.println(archivo.getName()+" - Archivo");
                    } else if (archivo.isDirectory()) {
                        System.out.println(archivo.getName()+" - Directorio");
                    }
                }
            }else {
                System.out.println("El directorio esta vacío.");
            }

        }else {
            System.out.println("No existe el directorio.");
        }
    }
}
