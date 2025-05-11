package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.ejercicio4;

/*
 Ejercicio 4: Agregar contenido a un archivo
 Modifica el archivo `datos.txt` para agregar nuevas líneas de texto sin borrar el contenido anterior.
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ej4_ficheros_repaso {
    public static void main(String[] args) {
        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/ejercicio4/datos.txt";

        String texto = "Este texo se agregará" +
                "\nCon este salto de línea";

        agregarLineas(rutaArchivo, texto);
    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void agregarLineas(String rutaArchivo, String texto){
        try{
            File archivo = new File(rutaArchivo);

            if (existeArchivo(archivo)){
                //Para no borrar lo anterior, hay que pasarle como segubndo parámetro el valor true.
                BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo, true));

                //Para dar salto de línea lo primero.
                escritor.newLine();

                escritor.write(texto);

                System.out.println("Texto escrito correctamente.");

                escritor.close();
            }else {
                System.out.println("No existe el archivo.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
