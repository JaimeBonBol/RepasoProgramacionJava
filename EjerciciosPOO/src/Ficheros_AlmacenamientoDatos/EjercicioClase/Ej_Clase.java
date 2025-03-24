package Ficheros_AlmacenamientoDatos.EjercicioClase;

/*
RETO.
 */

import java.io.IOException;
import java.io.PrintWriter;

public class Ej_Clase {
    public static void main(String[] args) {
        //System.out es un objeto de PrintStream, que a su vez es de tipo OutputStream.
        //printWriter tiene un constructor que toma un objeto OutputStream como argumento

        PrintWriter pw = new PrintWriter(System.out, true);
        pw.print("Hola");
        pw.close();
    }
}
