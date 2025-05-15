package examen;

import java.io.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que busca un patrón en un archivo de texto usando expresiones regulares.
 */
public class BuscadorPatrones {

    /**
     * Cuenta cuántas veces aparece un patrón en el archivo indicado.
     *
     * @param rutaArchivo Ruta del archivo de texto.
     * @param palabra Palabra regular a buscar.
     * @return Número de coincidencias encontradas.
     */
    public static int contarCoincidencias(String rutaArchivo, String palabra) {

        // TODO: Implementar lectura del archivo y búsqueda del patrón
        try {
            File archivo = new File(rutaArchivo);

            if (archivo.exists()){

                BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                String linea;
                int contajePalabra = 0;

                while ((linea = br.readLine()) != null){
                    String[] palabrasLinea = linea.split(" ");

                    for (String p : palabrasLinea){
                        if (!p.isEmpty()){
                            if (p.equalsIgnoreCase(palabra)){
                                contajePalabra ++;
                            }
                        }
                    }
                }

                br.close();

                return contajePalabra;

            }else {
                System.out.println("El archivo no existe.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return 0;
    }

    public static void main(String[] args) {
        String ruta = "resources/datos.txt";
        String patron = "examen"; // buscar la palabra exacta "examen"
        int resultado = contarCoincidencias(ruta, patron);
        System.out.println("Coincidencias encontradas: " + resultado);
    }
}
