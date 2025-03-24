package Ficheros_AlmacenamientoDatos.Clase;

/*
Programa que recibe el nombre de un archivo como argumento y muestra su contenido en la consola
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_Argumentos {
    public static void main(String[] args) {

        String archivo = args[0];
        //File archivo = new File(archivo);

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));

            String linea;
            while ((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
