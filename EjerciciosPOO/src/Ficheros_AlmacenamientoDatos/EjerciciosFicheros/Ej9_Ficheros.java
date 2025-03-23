package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

/*
 Ejercicio 9: Renombrar un archivo
 Desarrolla un programa que renombre el archivo `datos.txt` a `informacion.txt`, verificando que la operación se haya realizado con éxito.
 */

import java.io.File;

public class Ej9_Ficheros {
    public static void main(String[] args) {
        //Ruta del archivo y una instancia de tipo File con ese arhcivo por si quiero manejar nombre, etc de el.
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/datos.txt";
        File archivo = new File(rutaArchivo);

        //Nueva ruta, para crear una instancia File con esa nueva ruta con el nuevo nombre.
        String rutaNuevoArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/informacion.txt";
        File nuevoArchivo = new File(rutaNuevoArchivo);

        //Metodo para renombrar donde hay que pasarle un nuevo File que es por el que será reemplazado.
        archivo.renameTo(nuevoArchivo);
        System.out.println("Archivo "+archivo.getName()+" renombrado a "+nuevoArchivo.getName());
    }
}
