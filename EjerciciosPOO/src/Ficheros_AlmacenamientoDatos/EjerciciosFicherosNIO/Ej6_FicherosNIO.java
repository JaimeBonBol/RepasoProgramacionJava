package Ficheros_AlmacenamientoDatos.EjerciciosFicherosNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ej6_FicherosNIO {
    public static void main(String[] args) {

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosNIO/ejercicio1NIO.txt";
        String rutaArchivoNuevo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosNIO/copiaEjercicio1NIO.txt";

        Path pathOrigen = Paths.get(rutaArchivo);
        Path pathDestino = Paths.get(rutaArchivoNuevo);

        try {
            Files.copy(pathOrigen, pathDestino);
            System.out.println("Archivo copiado correctamente");
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
