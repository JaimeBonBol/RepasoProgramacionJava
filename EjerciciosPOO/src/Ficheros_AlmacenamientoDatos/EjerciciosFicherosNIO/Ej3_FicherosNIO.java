package Ficheros_AlmacenamientoDatos.EjerciciosFicherosNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ej3_FicherosNIO {
    public static void main(String[] args) {

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosNIO/ejercicio1NIO.txt";

        Path path = Paths.get(rutaArchivo);

        try{
            List<String> lineas = Files.readAllLines(path);

            //Imprime cada línea del archivo por consola.
            for (String linea: lineas){
                System.out.println(linea);
            }
            //lineas.forEach(System.out::println);
            //lineas.forEach(linea -> System.out.println(linea));
        } catch (IOException e) {
            System.out.println("ERror: "+e.getMessage());
        }
    }
}
