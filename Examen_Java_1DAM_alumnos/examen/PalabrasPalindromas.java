package examen;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PalabrasPalindromas {

    /**
     * Analiza un archivo de entrada (texto_palindromos.txt) y escribe en un archivo de salida (palindromos_encontrados.txt)
     * todas las palabras únicas que son palíndromas, una por línea, ordenadas.
     * Al final debe añadirse el total de palíndromos encontrados.
     *
     * @param entrada Ruta al archivo de texto de entrada.
     * @param salida Ruta al archivo de texto de salida.
     *
     * Ejemplo de salida:
     * acaso
     * anita
     * reconocer
     * Total: 3 palíndromos encontrados
     */
    public static void generarPalindromos(String entrada, String salida) {
        // TODO: Implementar según el enunciado
        try {
            File archivoEntrada = new File(entrada);
            File archivoSalida = new File(salida);

            BufferedReader br = new BufferedReader(new FileReader(entrada));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida.getPath()));

            String linea;
            int contajePalindromo = 0;
            bw.write("Palindromos encontrados: "+contajePalindromo);


            while ((linea = br.readLine()) != null){
                String[] palabrasLinea = linea.split(" ");

                for (String palabra : palabrasLinea){
                    List<String> bytesPalabra = Collections.singletonList(Arrays.toString(palabra.getBytes()));
                    if (bytesPalabra.equals(bytesPalabra.reversed())){
                        contajePalindromo++;
                        bw.write(palabra);
                        bw.newLine();
                    }
                }
                bw.write("Palindromos encontrados: "+contajePalindromo);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Puedes probar aquí tu metodo
        List<String > p = new ArrayList<>();
        p.add("Holaaa");
        for (String pa : p){
            System.out.println(Arrays.toString(pa.getBytes()));
            List<String> bytes = Collections.singletonList(Arrays.toString(pa.getBytes()));
        }

        String rutaEntrada = "resources/texto_palindromos.txt";
        String rutaSalida = "resources/palindromos_encontrados.txt";

        generarPalindromos(rutaEntrada, rutaSalida);
    }
}
