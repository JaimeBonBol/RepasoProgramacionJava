package Ficheros_AlmacenamientoDatos.EjercicioClase.EjercicioA;

/*
EjercicioA. Crear y mover carpetas

Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas: ‘Mis Cosas’ y ‘Alfabeto’. Mueve las carpetas
‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’. Luego crea dentro de ‘Alfabeto’ una carpeta por cada letra del alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjercicioA {
    public static void main(String[] args) {
        crearCarpetayArchivo();
    }

    public static void crearCarpetayArchivo(){
        String rutaDocumentos = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjercicioClase/Documentos";
        File directorioDocumentos = new File(rutaDocumentos);

        Path directorioFotografias = Paths.get(rutaDocumentos+"/Fotografias");

        File directorioMisCosas = new File(rutaDocumentos+"/MisCosas");
        File directorioAlfabeto = new File(rutaDocumentos+"/Alfabeto");
        Path directorioLibros = Paths.get(rutaDocumentos+"/Libros");

        File destinoFotografias = new File(rutaDocumentos+"/MisCosas/Fotografias");
        File destinoLibros = new File(rutaDocumentos+"/MisCosas/Libros");

        try{
            if (!existeArchivo(directorioMisCosas)){
                directorioMisCosas.mkdir();
                Files.move(directorioFotografias,destinoFotografias.toPath());
                Files.move(directorioLibros,destinoLibros.toPath());
            }

            if (!existeArchivo(directorioAlfabeto)){
                directorioAlfabeto.mkdir();

                for (char letra = 'A'; letra <= 'Z'; letra ++){
                    File archivoLetra = new File(directorioAlfabeto.getPath()+"/"+letra);
                    archivoLetra.mkdir();
                }
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }

    }

    public static boolean existeArchivo(File archivo){

        if (archivo.exists()){
            return true;
        }else {
            return false;
        }
    }

}
