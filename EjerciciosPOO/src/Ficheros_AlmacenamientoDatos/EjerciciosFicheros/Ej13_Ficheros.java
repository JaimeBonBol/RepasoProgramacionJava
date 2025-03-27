package Ficheros_AlmacenamientoDatos.EjerciciosFicheros;

/*
Copiar archivo binario
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ej13_Ficheros {
    public static void main(String[] args) {
        String rutaImagen = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/imgPrueba1.jpg";
        String rutaImagenCopia = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicheros/copiaImgPrueba1.jpg";
        copiarArchivoBinario(rutaImagen,rutaImagenCopia);
    }

    private static void copiarArchivoBinario(String archivoOrigen, String archivoDestino){
        try {
            //Creamos flujos de entrada y salida.
            FileInputStream flujoEntrada = new FileInputStream(archivoOrigen);
            FileOutputStream flujoSalida = new FileOutputStream(archivoDestino);

            File img1 = new File(archivoOrigen);

            int tamanioImagen = (int)img1.length();

            //Buffer de lectura y escribir bloques de datos
            byte[] buffer = new byte[tamanioImagen];
            int bytesLeidos = 0;

            //Leemos y esribimos blolques de datos.
            while ((bytesLeidos = flujoEntrada.read(buffer)) !=-1 ){
                flujoSalida.write(buffer,0, bytesLeidos);
            }

            System.out.println("Tamaño imagen: "+tamanioImagen+" bytes");
            System.out.println("Archivo binario copiado exitosamente");

            flujoEntrada.close();
            flujoSalida.close();
        }catch (IOException e){
            System.out.println("Error al copiar: "+e.getMessage());
        }
    }
}
