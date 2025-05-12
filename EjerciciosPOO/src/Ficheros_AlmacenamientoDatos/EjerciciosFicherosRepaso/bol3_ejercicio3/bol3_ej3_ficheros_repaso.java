package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.bol3_ejercicio3;

/*
Ejercicio 3 - Ordenando archivos
Implementa un programa que pida al usuario un nombre de archivo A para lectura y otro nombre de archivo B para escritura.
Leerá el contenido del archivo A (por ejemplo 'usa_personas.txt') y lo escribirá ordenado alfabéticamente en B (por ejemplo 'usa_personas_sorted.txt').
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bol3_ej3_ficheros_repaso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del arhcio de lectura:");
        String rutaArchivoLectura = sc.nextLine();

        System.out.println("Introdcue la ruta del archivo de escritura:");
        String rutaArchivoEscritura = sc.nextLine();

        String textoEscritura = leerArchivoOrdenado(rutaArchivoLectura);

        escribirArchivo(rutaArchivoEscritura, textoEscritura);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static String leerArchivoOrdenado(String rutaArchivo){
        try {
            File archivo = new File(rutaArchivo);

            if (existeArchivo(archivo)){

                BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                String linea;
                StringBuilder sb = new StringBuilder();
                List<String> lineas = new ArrayList<>();

                while ((linea = br.readLine()) != null){
                    lineas.add(linea);
                }

                Collections.sort(lineas);

                for (String l : lineas) {
                    sb.append(l).append("\n");
                }

                System.out.println("Lectura corecta.");

                br.close();

                return sb.toString();

            }else {
                System.out.println("El arhcivo no existe.");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void escribirArchivo(String  rutaArchivo, String texto){
        try {
            File archivo = new File(rutaArchivo);

            archivo.createNewFile();

            if (existeArchivo(archivo)){

                BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo));

                bw.write(texto);

                System.out.println("Escritura correcta.");

                bw.close();

            }else {
                System.out.println("El archivo no existe.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
