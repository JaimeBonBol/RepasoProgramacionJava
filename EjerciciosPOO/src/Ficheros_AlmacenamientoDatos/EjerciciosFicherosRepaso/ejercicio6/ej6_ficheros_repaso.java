package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio6;

/*
 Ejercicio 6: Copiar el contenido de un archivo a otro
 Crea un programa que copie el contenido de `datos.txt` en un nuevo archivo llamado `copia.txt`, manteniendo el mismo formato.
 */

import java.io.*;

public class ej6_ficheros_repaso {
    public static void main(String[] args) {

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio6/datos.txt";
        String rutaArchivoNuevo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio6/copia.txt";

        copiaContenido(rutaArchivo, rutaArchivoNuevo);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void copiaContenido(String rutaArchivo, String rutaNuevoArchivo){

        try {
            File archivo = new File(rutaArchivo);
            File nuevoArchivo = new File(rutaNuevoArchivo);

            /*if (!existeArchivo(nuevoArchivo)){
                nuevoArchivo.createNewFile();
            }*/

            if (existeArchivo(archivo)){
                BufferedWriter bw = new BufferedWriter(new FileWriter(rutaNuevoArchivo));
                BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                String linea;
                StringBuilder sb = new StringBuilder();

                while ((linea = br.readLine()) != null){
                    //sb.append(linea + "\n");
                    bw.write(linea);
                    bw.newLine();
                }


                //bw.write(sb.toString());

                System.out.println("Contenido copiado desde "+archivo.getName()+" en el archivo "+nuevoArchivo.getName());

                br.close();
                bw.close();
            }else {
                System.out.println("No existe archivo desde donde copiar.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
