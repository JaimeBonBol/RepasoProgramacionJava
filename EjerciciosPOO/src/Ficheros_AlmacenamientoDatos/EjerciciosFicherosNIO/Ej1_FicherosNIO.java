package Ficheros_AlmacenamientoDatos.EjerciciosFicherosNIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ej1_FicherosNIO {
    public static void main(String[] args) {

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosNIO/ejercicio1NIO.txt";

        //Definimos la ruta del archivo.
        Path path = Paths.get(rutaArchivo);

        List<String> contenido = List.of("Trabajando con el paquete java.NIO, ficheros grandes");

        try{
            Files.write(path,contenido, StandardCharsets.UTF_8);
            System.out.println("Archivo creado y escrito corrctamente");
            System.out.println("Nombre del archivo: "+path.getFileName());

        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
