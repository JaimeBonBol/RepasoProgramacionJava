package Ejercicio2_ArrayNumerosAleatorios;//Clase para la recogida de entrada de datos.

//Importo clases necesarias.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EntradaDatos {
    //Metodo para leer cadena.
    public static String LeerCadena(){
        //Creación de objeto para lectura de datos.
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        //Declaro variable string.
        String str="";
        //Recogo datos de cadena.
        try{
            str= lector.readLine();
        } catch (Exception e) {
            System.out.println("Ocurrió un error: "+e.getMessage());
        }
        return str;
    }

    //Metodo para leer caracter.
    public static char LeerCaracter(){
        //Declaro variable char.
        char ch = 0;
        //Recogo datos a partir del metodo leer cadena que recoge datos de entrada en forma de string,en este metodo lo voy a utilizar para
        //solo recoger el primer carácter.
        try {
            ch = LeerCadena().charAt(0);
        }catch (Exception e) {
            System.out.println("Ocurrió un error: "+e.getMessage());
        }

        return ch;
    }

    //Metodo para leer números con coma flotante.
    public static double LeerNumeroDouble(){
        //Declaro variable.
        double num = 0;

        //Recogo num a partir del metodo LeerCadena anterior, que recoge datos en forma string, por tanto lo tengo que pasar a double.
        try {
            num = Double.parseDouble(LeerCadena().trim());

        }catch (Exception e) {
            System.out.println("Ocurrió un error: "+e.getMessage());
        }
        return num;
    }

    //Metodo para leer números enteros.
    public static int LeerNumeroInt(){
        //Declaro variable.
        int num=0;
        //Recogo num a partir del metodo LeerCadena anterior, que recoge datos en forma string, por tanto lo tengo que pasar a int.
        try {

            num= Integer.parseInt(LeerCadena().trim());
        }catch (Exception e) {
            System.out.println("Ocurrió un error: "+e.getMessage());
        }
        return num;
    }
}
