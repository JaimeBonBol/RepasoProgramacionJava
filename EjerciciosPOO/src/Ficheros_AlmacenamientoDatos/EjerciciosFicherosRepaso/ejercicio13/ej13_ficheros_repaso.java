package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio13;

/*
 Copiar un archivo binario (imagen o vídeo)
Crea un programa que copie un archivo binario (por ejemplo, una imagen .jpg o un vídeo .mp4) de un directorio a otro sin modificar su contenido.
 */

import java.io.*;

public class ej13_ficheros_repaso {
    public static void main(String[] args) {
        String rutaArchivoBinario = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio13/imgPrueba1.jpg";
        String rutaCopiaArchivoBinario = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio13/imgPrueba1_copia.jpg";

        copiarArchivoBinario(rutaArchivoBinario, rutaCopiaArchivoBinario);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void copiarArchivoBinario(String rutaArchivoOrigen, String rutaArchivoDestino){
        try {
            File archivoOrigen = new File(rutaArchivoOrigen);
            File archivoDestino = new File(rutaArchivoDestino);

            if (existeArchivo(archivoOrigen)){

                //Crear flujos de entrada y salida.
                FileInputStream flujoEntrada = new FileInputStream(archivoOrigen);
                FileOutputStream flujoSalida = new FileOutputStream(archivoDestino);

                //flujoEntrada.transferTo(flujoSalida);

                //System.out.println("Imagen copiada.");

                File img1 = new File(rutaArchivoOrigen);

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

                /*
                int tamanioArchivoBinario = (int) archivoOrigen.length();

                //Buffer de lectura y escribir bloques de datos
                byte[] buffer = new byte[tamanioArchivoBinario];
                int bytesLeidos = 0;

                //Leemos y esribimos blolques de datos.
                while ((bytesLeidos = flujoEntrada.read()) != -1){
                    flujoSalida.write(buffer,0,bytesLeidos);
                }

                System.out.println("Archivo binario "+archivoOrigen.getName()+" copiado a "+archivoDestino.getName());
                System.out.println("Tamaño del archivo binario copiado; "+tamanioArchivoBinario+" bytes");
                 */



                flujoEntrada.close();
                flujoSalida.close();

            }else {
                System.out.println("No existe el archivo");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
