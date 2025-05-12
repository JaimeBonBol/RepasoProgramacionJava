package ejercicio1;

import java.io.*;

public class LectorCSV {
    public static void main(String[] args) {
        // TODO: Leer el archivo "resources/datos.csv" y mostrar su contenido formateado por columnas

        String rutaArchivo = "resources/datos.csv";

        mostrarTablaCSV(rutaArchivo);


    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void mostrarTablaCSV(String rutaArchivo){
        try {
            File archivo = new File(rutaArchivo);

            if (existeArchivo(archivo)){

                BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                String linea;

                System.out.println("Contenido del CSV "+archivo.getName()+": ");
                while ((linea = br.readLine()) != null){
                    String[] texto = linea.split(",");

                    for (String palabra : texto){
                        if (palabra.isEmpty()){
                            System.out.printf("                         ");
                        }else{
                            System.out.printf("%-25s", palabra);

                        }
                    }
                    System.out.println();
                }

            }else {
                System.out.println("El archivo no existe.");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
