package Ficheros_AlmacenamientoDatos.EjerciciosFicherosNIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ej7_FicherosNIO {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosNIO/copiaEjercicio1NIO.txt";

        Path path = Paths.get(rutaArchivo);

        final String PALABRA_BUSCADA =  "trabajando";

        try {
            List<String> lineas = Files.readAllLines(path, StandardCharsets.UTF_8);
            int contador = 0;

            for (String linea : lineas) {
                // Divide la línea en palabras eliminando signos de puntuación
                String[] palabras = linea.split("\\W+"); // Divide por caracteres no alfanuméricos
                for (String palabra : palabras) {
                    if (!palabra.isEmpty() && palabra.equalsIgnoreCase(PALABRA_BUSCADA)) {
                        contador++;
                    }
                }

            }

            System.out.println("La palabra '" + PALABRA_BUSCADA + "' aparece " + contador + " veces.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
