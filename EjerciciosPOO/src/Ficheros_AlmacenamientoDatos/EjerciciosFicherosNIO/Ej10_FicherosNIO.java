package Ficheros_AlmacenamientoDatos.EjerciciosFicherosNIO;

/*
Ejercicio 10: Eliminar un archivo
Crea un programa que elimine el archivo informacionNIO.txt y muestre un mensaje confirmando su eliminación.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ej10_FicherosNIO {
    public static void main(String[] args) {

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosNIO/informacionNIO.txt";
        Path path = Paths.get(rutaArchivo);

        try{
            if(Files.deleteIfExists(path)){
                System.out.println("Archivo "+path.getFileName()+" eliminado con éxito.");
            }else {
                System.out.println("No existe el archivo "+path.getFileName());
            }

        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
