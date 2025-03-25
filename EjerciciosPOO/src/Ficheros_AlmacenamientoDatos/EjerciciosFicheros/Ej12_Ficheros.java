package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej12_Ficheros {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/datos.csv";
        try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            File archivo = new File(rutaArchivo);

            String linea;
            System.out.println("Contenido del CSV "+archivo.getName()+": ");
            while ((linea = lector.readLine()) != null){
                String[] texto = linea.split(",");

                for (String palabra : texto){
                    if (palabra.isEmpty()){
                        System.out.printf("                         ");
                    }else{
                        System.out.printf("%-25s", palabra);

                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
