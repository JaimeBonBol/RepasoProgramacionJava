package Ficheros_AlmacenamientoDatos.EjercicioClase.EjercicioB;

/*
EjercicioB. BORRADO DE ARCHIVOS

Implementa un programa con una función boolean borraTodo(File f) que borre f: Si no existe lanzará una excepción.
Si es un archivo lo borrará. Si es un directorio, borrará primero sus archivos y luego el propio directorio (recuerda que para poder borrar un directorio debe estar vacío).
Devolverá ‘true’ si pudo borrar el ‘File f’ (‘false’ si no fue posible).
Prueba la función borrando las carpetas: ‘Documentos/Fotografias’, ‘Documentos/Libros’ y ‘Documentos’ (es decir, tres llamadas a la función, en ese orden).

Super extra challenge: Esta función, tal y como está definida, no borrará las subcarpetas que estén dentro de una carpeta
(para ello habría que borrar primero el contenido de dichas subcarpetas). ¿Se te ocurre cómo podría hacerse?
 */

import java.io.File;

public class EjercicioB {

    public static void main(String[] args) {
        String rutaDocumentos = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjercicioClase/Documentos";

        File f1 = new File(rutaDocumentos+"/Fotografias");
        File f2 = new File(rutaDocumentos+"/Libros");
        File f3 = new File(rutaDocumentos);

        System.out.println("Borrando la carpeta "+ f1.getName());
        if (borraTodo(f1)){
            System.out.println("Carpeta "+ f1.getName()+" borrada con éxito.");
        }else {
            System.out.println("No se ha podido borrar "+f1.getName());
        }

        System.out.println("Borrando la carpeta "+ f2.getName());
        if (borraTodo(f2)){
            System.out.println("Carpeta "+ f2.getName()+" borrada con éxito.");
        }else {
            System.out.println("No se ha podido borrar "+f2.getName());
        }

        System.out.println("Borrando la carpeta "+ f3.getName());
        if (borraTodo(f3)){
            System.out.println("Carpeta "+ f3.getName()+" borrada con éxito.");
        }else {
            System.out.println("No se ha podido borrar "+f3.getName());
        }
    }

    public static boolean borraTodo(File f){
        if (!existeArchivo(f)){
            System.out.println("No existe el archivo que se desea borrar.");
        }else {
            if (esArchivo(f)){
                f.delete();
                return true;
            } else if (esDirectorio(f)) {
                File[] elemento = f.listFiles();
                for (File e : elemento){
                    borraTodo(e);
                }
                f.delete();
                return true;
            }
        }
        return false;
    }

    public static boolean existeArchivo(File f){
        if (f.exists()){
            return true;
        }else {
            return false;
        }
    }

    public static boolean esArchivo(File f){
        if (f.isFile()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean esDirectorio(File f){
        if (f.isDirectory()){
            return true;
        }else{
            return false;
        }
    }
}
