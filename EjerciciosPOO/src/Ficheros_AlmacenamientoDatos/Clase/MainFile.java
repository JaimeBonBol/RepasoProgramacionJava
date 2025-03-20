package Ficheros_AlmacenamientoDatos.Clase;

import java.io.*;

public class MainFile {
    public static void main(String[] args) {
        //File no solo son archivos, sino también direrctorios.
        File archivo = new File("EjerciciosPOO/src/Ejercicios_AlmacenamientoDatos/archivo1.txt");

        File carpeta = new File("EjerciciosPOO/src/Ejercicios_AlmacenamientoDatos");

        if (archivo.exists()){
            System.out.println("El archivo existe");
            System.out.println("Nombre del archivo: "+archivo.getName());
            System.out.println("Ruta absoluta: "+archivo.getAbsolutePath());
            System.out.println("Tamaño del fichero: "+archivo.length()+" bytes");
        }else {
            System.out.println("El archivo no existe");
        }

        System.out.println();

        if (carpeta.exists()){
            System.out.println("La carpeta existe");
            System.out.println("Nombre del archivo: "+carpeta.getName());
            System.out.println("Ruta absoluta: "+carpeta.getAbsolutePath());
            System.out.println("Tamaño del fichero: "+carpeta.length()+" bytes");
        }else {
            System.out.println("La carpeta no existe");
        }

        System.out.println();
        File archivo2 = new File("EjerciciosPOO/src/Ejercicios_AlmacenamientoDatos/nuevoArchivo.txt");

        try {
            if (archivo2.exists()){
                System.out.println("El archivo ya existe");
            }else{
                archivo2.createNewFile();
                System.out.println("Archivo creado");
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }

        System.out.println();
        File directorio = new File("EjerciciosPOO/src/Ejercicios_AlmacenamientoDatos/NuevoDirectorio");

        if (directorio.exists()){
            System.out.println("El directotirio ya existe.");
        }else{
            directorio.mkdir();
            System.out.println("Directorio creado");
        }

        System.out.println();
        // . -> carpeta actual, pero la mas arriba, en este caso RepasoProgramacion.
        File directorio2 = new File("./EjerciciosPOO/src");
        //Guarda la lista de directorios que hay en el directorio2 en el array String archivos.
        String [] archivos = directorio2.list();
        if (archivos != null){
            for (String a : archivos){
                System.out.println(a);
            }
        }else {
            System.out.println("No hay archivos en la carpeta");
        }

        System.out.println();

        try {
            FileReader lector = new FileReader("EjerciciosPOO/src/Ejercicios_AlmacenamientoDatos/archivo1.txt");
            int caracter;
            while ((caracter = lector.read()) != -1){
                System.out.print((char) caracter);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }

        try {
            BufferedReader lectorBuffer = new BufferedReader(new FileReader("EjerciciosPOO/src/Ejercicios_AlmacenamientoDatos/nuevoArchivo.txt"));
            String linea;
            StringBuilder sb = new StringBuilder();
            while ((linea = lectorBuffer.readLine()) != null){
                sb.append(linea+"\n");
            }
            System.out.println(sb);
            lectorBuffer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
