package Ficheros_AlmacenamientoDatos.Boletin3_Ficheros.ej4;

/*
Ejercicio 4 - Nombre y apellidos

Implementa un programa que genere aleatoriamente nombres de persona (combinando nombres y apellidos de 'usa_nombres.txt' y 'usa_apellidos.txt').
Se le pedirá al usuario cuántos nombres de persona desea generar y a qué archivo añadirlos (por ejemplo 'usa_personas.txt').
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ej4_NombreApellidos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca ruta para guardar los nombres: ");
        String ruta = sc.nextLine();

        System.out.println("Introduce nombre del archivo: ");
        String nombreArchivo = sc.nextLine();

        String destino = ruta+"/"+nombreArchivo+".txt";

        System.out.println("Introduce cuantos nombres quieres generar aleatoriamente: ");
        int numNombres = sc.nextInt();

        generarNombres(destino,numNombres);

    }

    public static void generarNombres(String archivoDestino, int numNombres){

        String archivoNombres = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Boletin3_Ficheros/Documentos/usa_nombres.txt";
        String archivoApellidos = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Boletin3_Ficheros/Documentos/usa_apellidos.txt";

        Random random = new Random();

       String nombre;

       String apellido;

       StringBuilder sb = new StringBuilder();

       ArrayList<String> nombresAleatorios = leerArchivo(archivoNombres);
       ArrayList<String> apellidosAleatorios = leerArchivo(archivoNombres);

        for (int i = 0; i < numNombres; i++) {
            nombre = nombresAleatorios.get(random.nextInt(nombresAleatorios.size()));
            apellido = apellidosAleatorios.get(random.nextInt(apellidosAleatorios.size()));
            sb.append(nombre+" "+apellido+"\n");
            escribirArchivo(archivoDestino, sb.toString());
        }
        System.out.println("Escritura realizada");

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

    public static void escribirArchivo(String rutaArchivo, String texto){

        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))){
            escritor.write(texto);

        }catch (IOException e){
            System.out.println("Error al escribir el archivo: "+e.getMessage());
        }
    }

}
