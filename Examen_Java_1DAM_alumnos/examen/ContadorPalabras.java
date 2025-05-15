package examen;

import java.io.*;

/**
 * Clase que cuenta el número total de palabras en un archivo de texto.
 * El alumno debe implementar el metodo contarPalabras(String rutaArchivo).
 */
public class ContadorPalabras {

    /**
     * Cuenta las palabras en el archivo indicado por la ruta.
     *
     * @param rutaArchivo Ruta del archivo de texto.
     * @return Número total de palabras encontradas.
     */
    public static int contarPalabras(String rutaArchivo) {
        // TODO: Implementar lectura del archivo línea a línea y conteo de palabras
        try {
            File archivo = new File(rutaArchivo);

            if (archivo.exists()){
                BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                String linea;
                int contajePalabras = 0;
                while ((linea = br.readLine()) != null){
                    String[] palabrasLinea = linea.split(" ");

                    for (String palabra : palabrasLinea){
                        if (!palabra.isEmpty()){
                            contajePalabras ++;
                        }
                    }
                }

                br.close();
                return contajePalabras;

            }else {
                System.out.println("El arhcivo no existe.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return 0;
    }

    public static void main(String[] args) {
        // Ejemplo de ejecución
        String ruta = "resources/datos.txt"; // Asegúrate de que el archivo exista
        int total = contarPalabras(ruta);
        System.out.println("Total de palabras: " + total);
    }
}
