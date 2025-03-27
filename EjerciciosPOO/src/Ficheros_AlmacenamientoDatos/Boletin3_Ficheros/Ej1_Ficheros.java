package Ficheros_AlmacenamientoDatos.Boletin3_Ficheros;

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

        for (int elemento : minMax){
            System.out.println(elemento);
        }
    }

    public static ArrayList encontrarMaximoMinimo(String file){
        Path path = Paths.get(file);
        ArrayList<Integer> retorno = new ArrayList<Integer>();

        try {
            int maximo = 0;
            int minimo = 1000000000;
            List<String> lineas = Files.readAllLines(path);
            for (String linea : lineas){
                String[] numeros = linea.split(" ");
                for (String num :numeros){
                    int number = Integer.parseInt(num);
                    //System.out.println(number);
                    if (number > maximo){
                        maximo = number;
                    }
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
