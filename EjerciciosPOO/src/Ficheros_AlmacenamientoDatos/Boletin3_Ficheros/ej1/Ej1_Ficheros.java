package Ficheros_AlmacenamientoDatos.Boletin3_Ficheros.ej1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ej1_Ficheros {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Boletin3_Ficheros/Documentos/numeros.txt";

        ArrayList<Integer> minMax = encontrarMaximoMinimo(rutaArchivo);

        /*for (int elemento : minMax){
            System.out.println(elemento);
        }*/
        System.out.println("Máximo: "+ minMax.get(0));
        System.out.println("Mínimo: "+ minMax.get(1));
    }

    public static ArrayList encontrarMaximoMinimo(String file){
        Path path = Paths.get(file);
        ArrayList<Integer> retorno = new ArrayList<Integer>();

        try {
            int maximo = Integer.MIN_VALUE;
            int minimo = Integer.MAX_VALUE;
            List<String> lineas = Files.readAllLines(path);
            for (String linea : lineas){
                String[] numeros = linea.split(" ");
                for (String num :numeros){
                    int number = Integer.parseInt(num);
                    //System.out.println(number);
                    if (number > maximo){
                        maximo = number;
                    }
                    minimo = number;
                    if (number < minimo){
                        minimo = number;
                    }
                }
            }
            retorno.add(maximo);
            retorno.add(minimo);

        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        return retorno;
    }
}
