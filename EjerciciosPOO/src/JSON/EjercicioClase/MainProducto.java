package JSON.EjercicioClase;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class MainProducto {
    public static void main(String[] args) {

        Producto p1 = new Producto("Libro", 20);
        File archivoJSON = new File("EjerciciosPOO/src/JSON/EjercicioClase/javaProducto.json");


        guardarObjetoJSON(p1,archivoJSON);
        leerObjetoJSON(archivoJSON);

    }

    public static void guardarObjetoJSON(Producto producto, File archivoJSON){
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(archivoJSON, producto);
            System.out.println("Producto "+producto.getNombre()+" guardado en "+archivoJSON.getName());

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void leerObjetoJSON(File archivoJSON){
        ObjectMapper mapper = new ObjectMapper();

        try {
            Producto productoLeidoJSON = mapper.readValue(archivoJSON, Producto.class);
            System.out.println("Producto "+productoLeidoJSON.getNombre()+" leído de "+archivoJSON.getName()+":\n" + productoLeidoJSON);

        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
