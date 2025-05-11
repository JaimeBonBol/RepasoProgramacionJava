package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio12;

/*
Leer un archivo CSV y mostrar los datos
Crea un programa que lea un archivo CSV llamado datos.csv y muestre su contenido en formato tabla.
 */

import java.io.*;

public class ej12_ficheros_repaso {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio12/datos.csv";

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
                System.out.println("El arhcivo no existe.");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
