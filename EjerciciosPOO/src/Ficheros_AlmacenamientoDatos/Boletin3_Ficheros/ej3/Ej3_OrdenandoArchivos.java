package Ficheros_AlmacenamientoDatos.Boletin3_Ficheros.ej3;

/*
Ejercicio 3 - Ordenando archivos

Implementa un programa que pida al usuario un nombre de archivo A para lectura y otro nombre de archivo B para escritura.
Leerá el contenido del archivo A (por ejemplo 'usa_personas.txt') y lo escribirá ordenado alfabéticamente en B (por ejemplo 'usa_personas_sorted.txt').
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej3_OrdenandoArchivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String rutaBase = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Boletin3_Ficheros/Documentos/";

        System.out.println("Introduce el nombre del archivo origen: ");
        String archivoOrigen = rutaBase +sc.nextLine();

        System.out.println("Introduce el nombre del archivo destino: ");
        String archivoDestino = rutaBase +sc.nextLine();


        crearArchivoOrdenado(archivoOrigen,archivoDestino);

    }

    public static void crearArchivoOrdenado(String archivoOrigen, String archivoDestino){

        escribirArchivo(archivoDestino,leerArchivo(archivoOrigen));


    }

    public static boolean existeArchivo(String rutaArchivo){
        File archivo = new File(rutaArchivo);

        if (archivo.exists()){
            return true;
        }else {
            return false;
        }
    }

    public static ArrayList<String> leerArchivo(String rutaArchivo){
        ArrayList<String> nombres = new ArrayList<>();

        if (existeArchivo(rutaArchivo)){

            try(BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))){
                String linea;

                while ((linea = lector.readLine()) != null){
                    nombres.add(linea);
                }


            }catch (IOException e){
                System.out.println("Error al leer el archivo: "+e.getMessage());
            }
        }else {
            System.out.println("No existe el archivo.");
        }
        return nombres;
    }

    public static void escribirArchivo(String rutaArchivo, ArrayList<String> texto){

        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))){
            for (String linea : texto){
                escritor.write(linea+"\n");
            }
        }catch (IOException e){
            System.out.println("Error al escribir el archivo: "+e.getMessage());
        }
    }

}
