package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio10;

/*
 Ejercicio 10: Eliminar un archivo
 Crea un programa que elimine el archivo `informacion.txt` y muestre un mensaje confirmando su eliminación.
 */

import java.io.File;

public class ej10_ficheros_repaso {
    public static void main(String[] args) {

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio10/informacion.txt";

        eliminarArchivo(rutaArchivo);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void eliminarArchivo(String rutaArchivo){

        File archivo = new File(rutaArchivo);

        if (existeArchivo(archivo)){
            archivo.delete();
            System.out.println("Archivo "+archivo.getName()+" eliminado con éxito.");
        }else {
            System.out.println("No existe el archivo.");
        }

    }
}
