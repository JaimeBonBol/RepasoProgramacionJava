package Ficheros_AlmacenamientoDatos.Boletin3_Ficheros;

/*
Ejercicio 2 - Notas de alumnos
El archivo 'alumnos_notas.txt' contiene una lista de 10 alumnos y las notas que han obtenido en cada asignatura.
El número de asignaturas de cada alumno es variable. Implementa un programa que muestre por pantalla la nota media
de cada alumno junto a su nombre y apellido, ordenado por nota media de mayor a menor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ej2_Ficheros {
    public static void main(String[] args) {
        String archivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Boletin3_Ficheros/Documentos/alumnos_notas.txt";

        File file = new File(archivo);

        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){

            String linea;
            String nombre = "";
            double sumaNotas = 0;
            double notaMedia;
            int numNotas = 0;
            double notaMediaMayor = 0;
            ArrayList<String> listaOrdenada = new ArrayList<>();

            while ((linea = lector.readLine()) != null){
                String[] palabrasLinea = linea.split(" ");

                //Para ordenar.
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < palabrasLinea.length; i++) {
                    nombre = palabrasLinea[0] + " "+ palabrasLinea[1];
                    if (i >= 2){
                        sumaNotas += Double.parseDouble(palabrasLinea[i]);
                        numNotas ++;
                    }
                }
                notaMedia = sumaNotas / numNotas;
                sb.append("Nombre: "+nombre+". Nota media: "+notaMedia);
                //listaOrdenada.add(sb.toString());
                //listaOrdenada.addFirst(sb.toString());

                System.out.println(notaMediaMayor);
                System.out.println(notaMedia);
                if (notaMedia >notaMediaMayor){
                    notaMediaMayor = notaMedia;
                    listaOrdenada.addFirst(sb.toString());
                }else {
                    listaOrdenada.add(sb.toString());
                }

            }
            for (String elemento : listaOrdenada){
                System.out.println(elemento);
            }


        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }



    }
}
