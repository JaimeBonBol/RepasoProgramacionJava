package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio7;

/*
 Ejercicio 7: Buscar una palabra en un archivo
 Escribe un programa que busque una palabra específica dentro del archivo `datos.txt` e indique cuántas veces aparece.
 */

import java.io.*;
import java.util.Scanner;

public class ej7_ficheros_repaso {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio7/datos.txt";

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce palabra a buscar");
        String palabraBuscada = sc.nextLine();

        buscarContarPalabra(rutaArchivo, palabraBuscada);
    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void buscarContarPalabra(String rutaArhcivo, String palabraBuscada){
        try {
            File archivo = new File(rutaArhcivo);

            if (existeArchivo(archivo)){

                BufferedReader br = new BufferedReader(new FileReader(rutaArhcivo));

                String linea;
                int contajePalabra = 0;

                while ((linea = br.readLine()) != null){
                    String [] lineaDividida = linea.split(" ");

                    for (String palabra : lineaDividida){
                        palabra = palabra.replaceAll("^[^a-zA-ZáéíóúÁÉÍÓÚñÑ]+|[^a-zA-ZáéíóúÁÉÍÓÚñÑ]+$", "");

                        if (!palabra.isEmpty()){
                            if (palabra.equalsIgnoreCase(palabraBuscada)){
                                contajePalabra ++;
                            }
                        }
                    }
                }
                System.out.println("La palabra "+palabraBuscada+" aparece en el documento "+contajePalabra+" veces.");
                br.close();

            }else {
                System.out.println("No existe el archivo.");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
