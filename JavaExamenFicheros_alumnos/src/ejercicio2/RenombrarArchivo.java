package ejercicio2;

import java.io.File;

public class RenombrarArchivo {
    public static void main(String[] args) {
        // TODO: Renombrar el archivo "resources/info9.txt" a "resources/info9.txt" si existe
        String rutaArchivo = "resources/info9.txt";
        String rutaArchivoRenombrado = "resources/datos9.txt";


        File archivo = new File(rutaArchivo);
        if (archivo.exists()){
            File archivoRenombrado = new File(rutaArchivoRenombrado);
            archivo.renameTo(archivoRenombrado);
        }else {
            System.out.println("No existe el archivo.");
        }

    }

}
