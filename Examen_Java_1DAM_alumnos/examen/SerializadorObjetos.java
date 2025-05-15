package examen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite serializar y deserializar una lista de objetos Persona.
 */
public class SerializadorObjetos {

    /**
     * Serializa una lista de personas en un archivo binario.
     */
    public static void guardarPersonas(List<Persona> personas, String rutaArchivo) {
        // TODO: Implementar serialización con ObjectOutputStream
        try {
            File archivoSer = new File(rutaArchivo);

            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(rutaArchivo));

            output.writeObject(personas);

            System.out.println("Lista de personas serializada en el archivo "+archivoSer.getName());

            output.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    /**
     * Deserializa una lista de personas desde un archivo binario.
     */
    public static List<Persona> cargarPersonas(String rutaArchivo) {
        // TODO: Implementar deserialización con ObjectInputStream
        try {
            File archivoSer = new File(rutaArchivo);

            if (archivoSer.exists()){

                ObjectInputStream input = new ObjectInputStream(new FileInputStream(rutaArchivo));

                List<Persona> listaPersonasDeserializada = (List<Persona>) input.readObject();

                System.out.println("Lista de personas deserializada desde el archivo "+archivoSer.getName());

                input.close();

                return listaPersonasDeserializada;


            }else {
                System.out.println("El archivo no existe.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        String ruta = "resources/personas.dat";

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 30));

        guardarPersonas(personas, ruta);
        List<Persona> cargadas = cargarPersonas(ruta);

        for (Persona p : cargadas) {
            System.out.println(p);
        }
    }
}

