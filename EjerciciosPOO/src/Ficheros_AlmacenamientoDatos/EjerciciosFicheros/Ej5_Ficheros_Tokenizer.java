package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ej5_Ficheros_Tokenizer {
    public static void main(String[] args) {
        /**
         * Variable donde guardo la ruta del archivo
         */
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/copia.txt";
        File archivo = new File(rutaArchivo);

        try{
            //Instancia de BuffereReader pero que dentro tiene una instancia de FileReader.
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));

            // variable donde almaceno la línea leida y la voy mostrando.
            String linea;

            //Variable para llevar la cuenta de las palabras
            int cuentaPalabras = 0;

            // Se va repitiendo mientras que no devuleva un null que siginifica que ha llegado al final de la línea.
            //Creo un array para guardar la línea dividida por cada espacio, y luego recorro ese array para contar cuantas palabras hay por línea.
            while ((linea = lector.readLine()) != null){
                StringTokenizer tokenizer = new StringTokenizer(linea);
                cuentaPalabras += tokenizer.countTokens();
            }

            System.out.println("En el documento "+archivo.getName()+" hay un total de "+cuentaPalabras+" palabras.");
            lector.close();

        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
