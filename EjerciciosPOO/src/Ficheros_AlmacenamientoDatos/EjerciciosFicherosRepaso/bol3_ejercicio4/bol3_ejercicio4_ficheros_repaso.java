package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.bol3_ejercicio4;


/*
Nombre y apellidos
Implementa un programa que genere aleatoriamente nombres de persona (combinando nombres y apellidos de 'usa_nombres.txt' y 'usa_apellidos.txt').
 Se le pedirá al usuario cuántos nombres de persona desea generar y a qué archivo añadirlos (por ejemplo 'usa_personas.txt').
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class bol3_ejercicio4_ficheros_repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuántos nombres de persona quiere generar: ");
        int numPersonas = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la ruta del archivo donde guardar:");
        String rutaArchivo = sc.nextLine();

        generarNombreAleatorio(rutaArchivo, numPersonas);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void generarNombreAleatorio(String rutaArchivoGenerado, int numeroNombres){
        try {
            File archivo = new File(rutaArchivoGenerado);

            archivo.createNewFile();
            if (existeArchivo(archivo)){

                String rutaNombres = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/Documentos/usa_nombres.txt";
                String rutaApellidos = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/Documentos/usa_apellidos.txt";

                List<String> nombresDisponibles = leerArchivo(rutaNombres);
                List<String> apellidosDisponibles = leerArchivo(rutaApellidos);

                Random random = new Random();

                BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivoGenerado));

                for (int i = 0; i < numeroNombres; i++) {
                    bw.write(nombresDisponibles.get(random.nextInt(nombresDisponibles.size()))+" ");
                    bw.write(apellidosDisponibles.get(random.nextInt(apellidosDisponibles.size())));
                    bw.newLine();
                }

                bw.close();

            }else {
                System.out.println("El archivo no existe.");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> leerArchivo(String rutaArchivo){
        try {
            File archivo = new File(rutaArchivo);

            if (existeArchivo(archivo)){

                List<String> listaNombres = new ArrayList<>();

                BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                String nombre;

                while ((nombre = br.readLine()) != null){
                    listaNombres.add(nombre);
                }

                br.close();

                return listaNombres;

            }else System.out.println("No existe el archivo.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
