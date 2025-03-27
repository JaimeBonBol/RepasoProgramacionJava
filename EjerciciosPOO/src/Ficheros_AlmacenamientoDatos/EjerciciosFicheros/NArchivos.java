package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NArchivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ruta = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros";
        String nombreCarpeta;
        String nombreBase;
        int numArchivos;

        //Solicitar al usuario la carpeta donde se crearán los archivos
        System.out.println("Ingrese la ruta de la carpeta donde se crerarán los archivos: ");
        ruta = sc.nextLine();

        // Solicitar elk nmbre de la carpeta
        System.out.println("Ingrese el nombre de la carpeta: ");
        nombreCarpeta = sc.nextLine();

        //Solicitar el nombre base de los archivos
        System.out.println("Ingrese el nombre de base de los archivos: ");
        nombreBase = sc.nextLine();

        //Solicitar los archivos a crear
        System.out.println("Ingrese el número de los archivos a crear: ");
        numArchivos =sc.nextInt();
        //Crear los archivos
        crearArchivosMultiples(ruta, nombreCarpeta, nombreBase, numArchivos);

        sc.close();
    }

    //Crear N archivo, nombre(1).txt, nombre(2).txt, .... nombre(n).txt en la carpeta que se solicita al usuario
    // Dentro de cada archivo debe escribirse la frase "Este es el fichero nombre(n).txt".
    public static void crearArchivosMultiples(String ruta, String nombreCarpeta, String nombreBase , int number){

        try{
            File directorio = new File(ruta +"/"+nombreCarpeta);

            if (!directorio.exists()){
                directorio.mkdirs();
            }
            for (int i = 1; i <= number; i++) {
                String nombreArchivo = nombreBase +"("+ i +").txt";
                File archivo = new File(directorio, nombreArchivo);
                BufferedWriter bf = new BufferedWriter(new FileWriter(archivo));
                bf.write("Este es el fichero "+nombreBase+"("+i+").txt");
                bf.close();
            }

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
