package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

/*
 Ejercicio 8: Contar la cantidad de líneas en un archivo
 Crea un programa que cuente cuántas líneas tiene el archivo `datos.txt` y muestre el total.

 */

import java.io.*;

public class Ej8_Ficheros {
    public static void main(String[] args) {
        //Ruta del archivo y una instancia de tipo File con ese arhcivo por si quiero manejar nombre, etc de el.
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/datos.txt";
        File archivo = new File(rutaArchivo);

        try {
            //Lectura del archivo.
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));

            //Variable donde se va a contar las líneas.
            int cuentaLineas = 0;

            while ((lector.readLine()) != null){
                cuentaLineas ++;
            }

            System.out.println("El archivo "+archivo.getName()+" tiene un total de "+cuentaLineas+" líneas");
            lector.close();

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
