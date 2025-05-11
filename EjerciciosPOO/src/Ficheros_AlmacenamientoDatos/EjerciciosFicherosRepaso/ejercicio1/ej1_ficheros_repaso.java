package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio1;

/*
 Ejercicio 1: Crear y escribir en un archivo
 Crea un programa en Java que cree un archivo de texto llamado `datos.txt` y escriba dentro de él un mensaje de bienvenida.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ej1_ficheros_repaso {
    public static void main(String[] args) {

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio1/datos.txt";

        File archivo = crearArchivo(rutaArchivo);

        if (archivo != null){
            escribirFichero(archivo);
        }
    }

    public static File crearArchivo(String ruta){
        try{
            File archivo = new File(ruta);

            if (existeArchivo(archivo)){
                System.out.println("El archivo ya existe");
                return archivo;
            }else {
                archivo.createNewFile();
                System.out.println("Archivo creado.");
                return archivo;
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return null;
    }

    public static boolean existeArchivo(File archivo){
        if (archivo.exists()){
            return true;
        }else {
            return false;
        }
    }

    public static void escribirFichero(File archivo){
        try {
            if (existeArchivo(archivo)){
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivo.getPath()));

                bw.write("Bienvenido!");

                System.out.println("Escritura completada.");
                bw.close();
            }else {
                System.out.println("No existe el archivo para escribir.");
            }

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
