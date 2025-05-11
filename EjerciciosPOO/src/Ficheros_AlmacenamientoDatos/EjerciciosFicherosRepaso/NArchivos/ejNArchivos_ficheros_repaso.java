package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.NArchivos;

/*
Crear N archivo, nombre(1).txt, nombre(2).txt, .... nombre(n).txt en la carpeta que se solicita al usuario
Dentro de cada archivo debe escribirse la frase "Este es el fichero nombre(n).txt".
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejNArchivos_ficheros_repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta donde se creará la carpeta:");
        String ruta = sc.nextLine();

        System.out.println("Introduce el nombre de la carpeta:");
        String nombreCarpeta = sc.nextLine();

        System.out.println("Introduce el nombre base de los archivos:");
        String nombreBase = sc.nextLine();

        System.out.println("Introduce cuántos archivos habrá dentro:");
        int numeroArchivos = sc.nextInt();

        crearMultiplesArchivos(ruta, nombreCarpeta, nombreBase, numeroArchivos);
    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void crearMultiplesArchivos(String ruta, String nombreCarpeta, String nombreBase, int numeroArchivos){
        try {
            String rutaCarpeta = ruta+"/"+nombreCarpeta;
            File carpeta = new File(rutaCarpeta);

            if (!existeArchivo(carpeta)){
                carpeta.mkdirs();

                for (int i = 1; i <= numeroArchivos; i++) {
                    String nombreArchivo = nombreBase+"("+ i +")"+".txt";
                    File archivo = new File(carpeta,nombreArchivo);

                    BufferedWriter bw = new BufferedWriter(new FileWriter(archivo.getPath()));

                    bw.write("Este es el fichero "+nombreArchivo);

                    bw.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
