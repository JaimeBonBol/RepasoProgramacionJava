package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.bol3_ejercicio1;

/*
Implementa un programa que muestre por pantalla los valores máximos y mínimos del archivo 'numeros.txt'.
 */

import java.io.*;

public class bol3_ej1_ficheros_repaso {
    public static void main(String[] args) {

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/Documentos/numeros.txt";

        valorMaximo(rutaArchivo);

        valorMinimo(rutaArchivo);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void valorMaximo(String rutaArhchivo){
        try {
            File archivo = new File(rutaArhchivo);

            if (existeArchivo(archivo)){

                BufferedReader br = new BufferedReader(new FileReader(rutaArhchivo));

                String linea;
                int valorMaximo = Integer.MIN_VALUE;
                int auxMaximo;

                while ((linea = br.readLine()) !=null){
                    auxMaximo = Integer.parseInt(linea);

                    if (auxMaximo > valorMaximo){
                        valorMaximo = auxMaximo;
                    }
                }

                System.out.println("El valor máximo del arhcivo "+archivo.getName()+" es "+valorMaximo);;

                br.close();

            }else {
                System.out.println("El archivo no existe.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void valorMinimo(String rutaArhchivo){
        try {
            File archivo = new File(rutaArhchivo);

            if (existeArchivo(archivo)){

                BufferedReader br = new BufferedReader(new FileReader(rutaArhchivo));

                String linea;
                int valorMinimo = Integer.MAX_VALUE;
                int auxMinimo;

                while ((linea = br.readLine()) !=null){
                    auxMinimo = Integer.parseInt(linea);

                    if (auxMinimo < valorMinimo){
                        valorMinimo = auxMinimo;
                    }
                }

                System.out.println("El valor mínimo del arhcivo "+archivo.getName()+" es "+valorMinimo);;

                br.close();

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
