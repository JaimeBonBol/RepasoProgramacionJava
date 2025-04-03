package Ficheros_AlmacenamientoDatos.Boletin3_Ficheros.ej6;

/*
Ejercicio 6 - Búsqueda en PI
Implementa un programa que pida al usuario un número de cualquier longitud, como por ejemplo "1234",
y le diga al usuario si dicho número aparece en el primer millón de decimales del nº pi (están en el archivo 'pi-million.txt').
No está permitido utilizar ninguna librería ni clase ni metodo que realice la búsqueda. Debes implementar el algoritmo de búsqueda tú.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ej6_BusquedaPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Boletin3_Ficheros/Documentos/pi-million.txt";


        System.out.println("Introduce un número de la longitud que quieras: ");
        String patron = sc.nextLine().trim();

        if (comprobarNmero(patron)){
            System.out.println("El número "+patron+" SI se encuentra en el documento.");
        }else {
            System.out.println("El número "+patron+" NO se encuentra en el documento.");
        }

        conContain(patron);
    }

    public static boolean comprobarNmero(String patron){
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Boletin3_Ficheros/Documentos/pi-million.txt";

        String documento = leerArchivo(rutaArchivo).substring(2);

        int longitudPatron = patron.length();

        //String regex ="(?<=\\G.{" + longitudPatron + "})" ;

        //Formateo para que divida una cadena de texto en partes, en este caso del tamaño de mi patrón, y lo almacene en un array.
        String[] documentoDividido = documento.split("(?<=\\G.{" + longitudPatron + "})");

        for (int i = 0; i < documentoDividido.length; i++) {
            if (documentoDividido[i].equals(patron)){

                return true;
            }
        }

        /*for (String elemento : documentoDividido){
            System.out.print(elemento+", ");
            if (elemento.equals(patron)){
                System.out.println();
                return true;
            }
        }*/
        return false;
    }

    public static String leerArchivo(String rutaArchivo){

        StringBuilder sb = new StringBuilder();

        try(BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;

            while ((linea = lector.readLine()) != null){
                sb.append(linea);
            }

        }catch (IOException e){
            System.out.println("Error al leer el archivo: "+e.getMessage());
        }

        return sb.toString();

    }

    public static void conContain(String patron){
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Boletin3_Ficheros/Documentos/pi-million.txt";

        if (leerArchivo(rutaArchivo).contains(patron)){
            System.out.println("Encontrado el num "+patron+" en la pos "+leerArchivo(rutaArchivo).indexOf(patron));
        }else {
            System.out.println("el número "+patron+" no aparece en el documento");
        }
    }
}
