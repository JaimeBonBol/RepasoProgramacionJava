package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.bol3_ejercicio5;

/*
Ejercicio 5 - Diccionario

Implementa un programa que cree la carpeta 'Diccionario' con tantos archivos como letras del abecedario (A.txt, B.txt… Z.txt).
Introducirá en cada archivo las palabras de 'diccionario.txt' que comiencen por dicha letra.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class bol3_ejercicio5_ficheros_repaso {
    public static void main(String[] args) {
        String rutaCarpeta = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/bol3_ejercicio5/Diccionario";

        crearCarpetayArchivos(rutaCarpeta);

    }

    public static boolean existeArchivo(File file){
        return file.exists();
    }

    public static void crearCarpetayArchivos(String rutaArchivo){
        try{
            File file = new File(rutaArchivo);

            if (!existeArchivo(file)){
                file.mkdirs();

                String[] abecedario = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                        "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

                String rutaArchivoDiccionario ="EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/Documentos/diccionario.txt";

                List<String> palabrasArchivoDiccionario = leerArchivo(rutaArchivoDiccionario);


                for (String letra :abecedario){
                    File archivo = new File(rutaArchivo+"/"+letra+".txt");
                    BufferedWriter bw = new BufferedWriter(new FileWriter(archivo.getPath()));

                    for (String palabra : palabrasArchivoDiccionario){
                        if (!palabra.isEmpty()){
                            if (palabra.startsWith(letra.toLowerCase())){
                                bw.write(palabra);
                                bw.newLine();
                            }
                        }
                    }
                }

            }else System.out.println("El directorio ya existe.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> leerArchivo(String rutaArchivo){
        try {
            File file = new File(rutaArchivo);

            if (existeArchivo(file)){

                BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

                List<String> palabrasArchivo = new ArrayList<>();

                String palabra;

                while ((palabra =br.readLine()) != null){
                    palabrasArchivo.add(palabra);
                }

                br.close();

                return palabrasArchivo;

            }else System.out.println("El archivo no existe.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
