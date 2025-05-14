package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.repasoSerializar.serializarListaPersonas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainSerializarLista {
    public static void main(String[] args) throws IOException {

        Persona p1 = new Persona("Marta", 24, "marta@gmail.es");
        Persona p2 = new Persona("Juan", 40, "juan@gmail.es");
        Persona p3 = new Persona("Luis", 36, "luis@gmail.es");
        Persona p4 = new Persona("Laura", 18, "laura@gmail.es");

        List<Persona> personas= new ArrayList<>();

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/repasoSerializar/serializarListaPersonas/serializarListaPersonas.dat";

        File arhcivoSer = new File(rutaArchivo);

        if (!existeArchivo(arhcivoSer)){
            arhcivoSer.createNewFile();
        }

        serializarLista(rutaArchivo, personas);

        deserializarLista(rutaArchivo);

        }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void serializarLista(String rutaArchivo, List<Persona> personas){
        try {
            File archivo = new File(rutaArchivo);

            if (existeArchivo(archivo)){
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(rutaArchivo));

                output.writeObject(personas);

                System.out.println("Lista serializada correctamente en el archivo "+archivo.getName());

                output.close();

            }else System.out.println("No existe el archivo, crealo antes.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserializarLista(String rutaArchivo){
        try {
            File archivo = new File(rutaArchivo);

            if (existeArchivo(archivo)){

                ObjectInputStream input = new ObjectInputStream(new FileInputStream(rutaArchivo));

                List<Persona> listaPersonasDeserializada = (List<Persona>) input.readObject();

                System.out.println("Lista de personas deserializada del archivo "+archivo.getName());

                for (Persona persona : listaPersonasDeserializada){
                    System.out.println(persona);
                }

                input.close();

            }else System.out.println("No existe el archivo.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
