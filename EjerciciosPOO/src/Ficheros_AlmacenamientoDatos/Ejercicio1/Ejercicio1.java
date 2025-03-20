package Ficheros_AlmacenamientoDatos.Ejercicio1;

/*
 Ejercicio 1: Crear y escribir en un archivo
 Crea un programa en Java que cree un archivo de texto llamado `datos.txt` y escriba dentro de él un mensaje de bienvenida.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        String rutaArchivoEj1 = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Ejercicio1/datos.txt";
        File archivoEj1 = new File(rutaArchivoEj1);

        try{
            if (archivoEj1.exists()){
                System.out.println("El archivo ya existe.");
            }else {
                archivoEj1.createNewFile();
                System.out.println("Archivo creado.");
            }
        }catch (IOException e){
            System.out.println("Error al crear archivo: "+ e.getMessage());
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivoEj1));
            bw.write("Bienvenido!");
            bw.close();
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
