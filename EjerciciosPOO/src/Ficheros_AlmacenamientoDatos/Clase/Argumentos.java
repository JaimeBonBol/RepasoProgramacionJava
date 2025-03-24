package Ficheros_AlmacenamientoDatos.Clase;

public class Argumentos {
    public static void main(String[] args) {
        //Si hay argumentos
        if (args.length >0 ){
            System.out.println("Argumento recibido: "+args[0]);
        }else {
            System.out.println("No se han pasado argumentos");
        }
    }
}
