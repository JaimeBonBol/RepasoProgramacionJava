package Ficheros_AlmacenamientoDatos.Boletin3_Ficheros.Ej2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ej_2NotasAlumnos {
    public static void main(String[] args) throws IOException {
        String fileName = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Boletin3_Ficheros/Documentos/alumnos_notas.txt";

        List<Alumno> alumnos = calcularNotasMedias(fileName);

        // Ordenar alumnos por nota media de MAYOR a menor (orden dscendente)
        alumnos.sort(Comparator.comparing((Alumno a) -> a.notaMedia).reversed());
        /*alumnos.sort(Comparator.comparing(Alumno::getNotaMedia).reversed());

        alumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return Double.compare(a1.notaMedia, a2.notaMedia);
            }
        });

        Collections.sort(alumnos, Comparator.comparing(Alumno::getNotaMedia).reversed());
        */

        for (Alumno alumno : alumnos){
            System.out.println(alumno);
        }
    }

    private static List<Alumno> calcularNotasMedias(String fileName) throws IOException {
        List<Alumno> alumnos = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String linea;

            while ((linea = br.readLine()) != null){
                // Divide la linea en partyes separadas por un espacio.
                String[] partes = linea.trim().split(" ");


                if (partes.length >= 3){
                    String nombre = partes[0];
                    String apellido = partes[1];

                    //Calcular nota media
                    double sumaNotas = 0;
                    for (int i = 2; i < partes.length; i++) {
                        sumaNotas += Double.parseDouble(partes[i]);
                    }
                    double notaMedia = sumaNotas / (partes.length-2);
                    alumnos.add(new Alumno(nombre,apellido,notaMedia));
                }

            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }

        return alumnos;
    }
}
