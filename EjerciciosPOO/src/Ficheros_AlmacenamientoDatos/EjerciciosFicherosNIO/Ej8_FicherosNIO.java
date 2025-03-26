package Ficheros_AlmacenamientoDatos.EjerciciosFicherosNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ej8_FicherosNIO {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosNIO/copiaEjercicio1NIO.txt";

        Path path = Paths.get(rutaArchivo);

        try {
            List<String> lineas = Files.readAllLines(path);

            int contador = 0;

            for (String linea : lineas ){
                contador ++;
            }

            System.out.println("El archivo "+path.getFileName()+" tiene "+contador+" líneas.");
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
