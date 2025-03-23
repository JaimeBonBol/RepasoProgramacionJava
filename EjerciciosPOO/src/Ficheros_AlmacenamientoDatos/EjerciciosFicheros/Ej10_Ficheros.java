package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

/*
 Ejercicio 10: Eliminar un archivo
 Crea un programa que elimine el archivo `informacion.txt` y muestre un mensaje confirmando su eliminación.
 */

import java.io.File;

public class Ej10_Ficheros {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/informacion.txt";
        File archivo = new File(rutaArchivo);

        //Eliminar un archivo
        if (archivo.exists()){
            archivo.delete();
            System.out.println("Archivo "+archivo.getName()+" eliminado.");
        }else {
            System.out.println("No existe el archivo "+archivo.getName());
        }

    }
}
