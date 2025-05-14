package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicioRepasoClase;

/*
Ejercicio 8. El centro de la Tierra

Crea una clase llamada ExploradorArchivos que realice las siguientes operaciones:

    Listar todos los archivos y carpetas contenidos en la ruta "/resources/explorador/"
    Hacer 10 copias de un archivo, por ejemplo copiar.txt (debes crearlo) y que las copias se encuentren en la carpeta
    Crear una estructura de subdirectorios dentro de "/resources/explorador/" que tenga la siguiente forma:
    "/resources/explorador/volcan/descenso/aprobar/programacion/ y dentro de ella debe contener un archivo llamado "centroTierra.txt"

 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExploradorArchivos {
    public static void main(String[] args) {

        String rutaCarpeta = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicioRepasoClase/explorador";

        String nombreArchivo = "copiar";

        copiarArchivo(rutaCarpeta, nombreArchivo, 10);

        System.out.println();

        listarArchivos(rutaCarpeta);

        System.out.println();

        String rutaSubdirectorios = rutaCarpeta+"/volcan/descenso/aprobar/programacion";

        crearEstructura(rutaSubdirectorios);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void copiarArchivo(String rutaCarpeta, String nombreArchivo, int numeroCopias) {
        try {
            File carpeta = new File(rutaCarpeta);

            File archivo = new File(rutaCarpeta+"/"+ nombreArchivo+".txt");

            if (!existeArchivo(carpeta)){
                carpeta.mkdir();
                if (!existeArchivo(archivo)){
                    archivo.createNewFile();
                    System.out.println("Archivo original creado. Creando copias...");
                }else System.out.println("El arhcivo original ya existe. Creando copias...");

                for (int i = 1; i <= numeroCopias; i++) {
                    File copiaArchivo = new File(rutaCarpeta+"/"+nombreArchivo+(i)+".txt");
                    copiaArchivo.createNewFile();
                }
                System.out.println("Copias realizadas.");
            }else {
                archivo.createNewFile();
                System.out.println("Archivo original creado.");

                for (int i = 1; i <= numeroCopias; i++) {
                    File copiaArchivo = new File(rutaCarpeta+"/"+nombreArchivo+(i)+".txt");
                    copiaArchivo.createNewFile();
                }
                System.out.println("Copias realizadas.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void listarArchivos(String rutaCarpeta){
        File carpeta =  new File(rutaCarpeta);
        if (existeArchivo(carpeta)){
            File[] archivos = carpeta.listFiles();

            for (File archivo:  archivos){
                if (archivo.isDirectory()){
                    System.out.println(archivo.getName()+" - Directorio");
                } else if (archivo.isFile()) {
                    System.out.println(archivo.getName()+" - Archivo");
                }
            }
        }else System.out.println("No existe la carpeta.");
    }

    public static void crearEstructura(String rutaEstructura) {
        try {
            File estructura = new File(rutaEstructura);

            if (!existeArchivo(estructura)){
                estructura.mkdirs();
                System.out.println("Estructura creada.");

                File centroTierra = new File(rutaEstructura+"/centroTierra.txt");
                centroTierra.createNewFile();

                BufferedWriter bw = new BufferedWriter(new FileWriter(centroTierra.getPath()));
                bw.write("Prueba finalizada!");
                bw.close();
            }else System.out.println("La estructura ya existe.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
