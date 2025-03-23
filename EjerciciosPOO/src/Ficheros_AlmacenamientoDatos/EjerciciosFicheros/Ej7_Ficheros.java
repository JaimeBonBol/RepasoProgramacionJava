package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

/*
 Ejercicio 7: Buscar una palabra en un archivo
 Escribe un programa que busque una palabra específica dentro del archivo `datos.txt` e indique cuántas veces aparece.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej7_Ficheros {
    public static void main(String[] args) {
        //Ruta del archivo y una instancia de tipo File con ese arhcivo por si quiero manejar nombre, etc de el.
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/datos.txt";
        File archivo = new File(rutaArchivo);
        Scanner sc = new Scanner(System.in);

        try {
            //Lectura del archivo.
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));

            //Variable donde se almacena cada línea
            String linea;
            //Variable para llevar la cuenta de las veces que aparece la palabra a buscar.
            int cuentaPalabraBusada = 0;
            //Variable palabra buscada.
            System.out.println("Introduce la palabra a contar: ");
            final String PALABRA_BUSCADA = sc.nextLine();

            while ((linea = lector.readLine()) != null){
                //Array donde se almacena cada palabra de cada línea divididas por espacios.
                String[] texto = linea.split(" ");
                //Y se comprueba si en esa linea palabra por palabra si es la que buscamos, si es así
                // incrementa la variable.
                for (String palabra : texto){
                    if (palabra.equalsIgnoreCase(PALABRA_BUSCADA)){
                        cuentaPalabraBusada++;
                    }
                }
            }

            System.out.println("La palabra "+PALABRA_BUSCADA+" aparece en el documento "+archivo.getName()+" "+cuentaPalabraBusada+" veces.");
            lector.close();
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
