package examen;

import java.io.File;

/**
 * Clase que lista todos los archivos y carpetas de un directorio dado.
 */
public class ListadorDirectorios {

    /**
     * Lista el contenido del directorio especificado.
     *
     * @param rutaDirectorio Ruta absoluta o relativa del directorio.
     * @return Array de cadenas con el nombre y tipo de cada elemento.
     */
    public static String[] listarContenido(String rutaDirectorio) {
        // TODO: Implementar el listado de archivos y carpetas
        File directorio = new File(rutaDirectorio);

        File[] contenidoDirectorio = directorio.listFiles();

        String[] contenidoString = new String[(int) directorio.length()];

        for (int i = 0; i < contenidoDirectorio.length; i++) {
            contenidoString[i] = contenidoDirectorio[i].getName();
        }

        return contenidoString;
    }

    public static void main(String[] args) {
        String ruta = "resources";
        String[] resultado = listarContenido(ruta);
        for (String s : resultado) {
            System.out.println(s);
        }
    }
}
