package Ficheros_AlmacenamientoDatos.EjerciciosFicherosNIO;

/*
Ejercicio 11: Listar archivos en un directorio
Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
 */

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Ej11_FicherosNIO {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosNIO";
        Path path = Paths.get(rutaArchivo);

        try {
            Stream<Path> archivos = Files.list(path);
            
            //para usar un for each tradicional hay que pasar el stream a lista primero
            List<Path> listaArchivos = archivos.toList();
            for (Path p : listaArchivos){
                if (Files.isDirectory(p)){
                    System.out.println(p.getFileName()+" (Directorio)");
                }else{
                    System.out.println(p.getFileName()+" (Archivo)");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
