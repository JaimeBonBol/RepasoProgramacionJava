package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio9;

/*
 Ejercicio 9: Renombrar un archivo
 Desarrolla un programa que renombre el archivo `datos.txt` a `informacion.txt`, verificando que la operación se haya realizado con éxito.
 */

import java.io.File;

public class ej9_ficheros_repaso {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio9/datos.txt";
        String rutaNuevoNombre = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio9/informacion.txt";

        renombrarArchivo(rutaArchivo, rutaNuevoNombre);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void renombrarArchivo(String rutaArchivo, String rutaNuevoNombre){

        File archivo = new File(rutaArchivo);

        if (existeArchivo(archivo)){

            File nuevoArchivo = new File(rutaNuevoNombre);
            archivo.renameTo(nuevoArchivo);

            System.out.println("Arhcivo "+archivo.getName()+" renombrado a "+nuevoArchivo.getName());

        }else {
            System.out.println("El archivo no existe. ");
        }

    }
}
