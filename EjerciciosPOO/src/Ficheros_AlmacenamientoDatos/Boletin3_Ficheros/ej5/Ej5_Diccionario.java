package Ficheros_AlmacenamientoDatos.Boletin3_Ficheros.ej5;

/*
Ejercicio 5 - Diccionario

Implementa un programa que cree la carpeta 'Diccionario' con tantos archivos como letras del abecedario (A.txt, B.txt… Z.txt).
Introducirá en cada archivo las palabras de 'diccionario.txt' que comiencen por dicha letra.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej5_Diccionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta: ");
        String ruta = sc.nextLine();

        crearCarpetayArchivos(ruta);

    }

    public static void crearCarpetayArchivos(String rutaCarpeta){
        File carpeta = new File(rutaCarpeta+"/Diccionario");
        String[] abecedario = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        if (!existeArchivo(carpeta)){
            carpeta.mkdirs();
            ArrayList<String> documento = leerArchivo("EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Boletin3_Ficheros/Documentos/diccionario.txt");

            for (String letra : abecedario){
                ArrayList<String> palabrasPorLetra = new ArrayList<>();
                File archivo = new File(carpeta, letra+".txt");

                for (String palabra : documento){
                    if (palabra.toUpperCase().startsWith(letra)){
                        palabrasPorLetra.add(palabra);
                    }
                }
                escribirArchivo(archivo.getPath(),palabrasPorLetra);
            }
        }
    }

    public static boolean existeArchivo(File archivo){

        if (archivo.exists()){
            return true;
        }else {
            return false;
        }
    }

    public static ArrayList<String> leerArchivo(String rutaArchivo){
        ArrayList<String> palabras = new ArrayList<>();

        try(BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;

            while ((linea = lector.readLine()) != null){
                palabras.add(linea);
            }


        }catch (IOException e){
            System.out.println("Error al leer el archivo: "+e.getMessage());
        }
        return palabras;

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
