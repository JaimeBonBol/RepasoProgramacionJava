package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.bol3_ejercicio2;

/*
El archivo 'alumnos_notas.txt' contiene una lista de 10 alumnos y las notas que han obtenido en cada asignatura.
El número de asignaturas de cada alumno es variable. Implementa un programa que muestre por pantalla la nota media de cada alumno junto a su nombre y apellido,
ordenado por nota media de mayor a menor.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class bol3_ej2_ficheros_repaso {
    public static void main(String[] args) {

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/Documentos/alumnos_notas.txt";

        mostrarAlumnos(rutaArchivo);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void mostrarAlumnos(String rutaArchivo){
        try {
            File arhcivo = new File(rutaArchivo);

            if (existeArchivo(arhcivo)){

                BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                String linea;
                String nombre = "";
                String apellido = "";

                while ((linea = br.readLine()) != null){
                    String[] palabrasLinea= linea.split(" ");

                    for (int i = 0; i < 2; i++) {
                        nombre = palabrasLinea[0];
                        apellido = palabrasLinea[1];
                    }

                    if (palabrasLinea.length > 2){
                        int sumatorioNota = 0;

                        for (int i = 2; i < palabrasLinea.length; i++) {
                            sumatorioNota += Integer.parseInt(palabrasLinea[i]);
                        }

                        int notaMedia = sumatorioNota / (palabrasLinea.length - 2);

                        System.out.println(nombre +" " + apellido +" con nota media de "+notaMedia);

                    }else {
                        System.out.println(nombre +" " + apellido +" aún no ha realizado ningún examen.");

                    }

                }

            }else {
                System.out.println("El archivo no existe.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
