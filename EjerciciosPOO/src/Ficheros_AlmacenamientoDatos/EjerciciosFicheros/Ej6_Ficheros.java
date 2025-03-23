package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

/*
 Ejercicio 6: Copiar el contenido de un archivo a otro
 Crea un programa que copie el contenido de `datos.txt` en un nuevo archivo llamado `copia.txt`, manteniendo el mismo formato.
 */

import java.io.*;

public class Ej6_Ficheros {
    public static void main(String[] args) {
        /**
         * Variable donde guardo la ruta del archivo
         */
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/datos.txt";
        String rutaArchivoNuevo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/copia.txt";
        File archivoNuevo = new File(rutaArchivoNuevo);

        try{
            //Si el archivo ya existe lo comunica
            if (archivoNuevo.exists()){
                System.out.println("El archivo ya existe");
            }else {
                //Crea el archivo nuevo
                archivoNuevo.createNewFile();
                System.out.println("Arhcivo "+archivoNuevo.getName()+" creado.");

                //Se lee lo que hay en datos.txt
                BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
                String linea;
                //SringBuilder donde se almacenarán las líneas.
                StringBuilder sb = new StringBuilder();

                //Se almacena en sb las líneas, con su respectivo salto de línea.
                while ((linea = lector.readLine()) != null){
                    sb.append(linea+"\n");
                }

                //Se escribe el archivo de datos.txt (cuyas líneas están almacenadas en sb) en copia.txt
                BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivoNuevo));
                escritor.write(sb.toString());

                lector.close();
                escritor.close();
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }

    }
}
