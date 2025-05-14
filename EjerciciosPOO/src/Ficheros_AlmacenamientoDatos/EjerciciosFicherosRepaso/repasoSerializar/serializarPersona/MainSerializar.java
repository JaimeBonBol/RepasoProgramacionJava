package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.repasoSerializar.serializarPersona;

import java.io.*;

public class MainSerializar {
    public static void main(String[] args) {

        Persona p1 = new Persona("Pepe", 30, "pepe@gmail.com");

        String rutaArchivo = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/EjerciciosFicherosRepaso/repasoSerializar/serializarPersona/serializarPersona.dat";

        serializarPersona(rutaArchivo, p1);

        deserializarPersona(rutaArchivo);

    }

    public static boolean existeArchivo(File archivo){
        return archivo.exists();
    }

    public static void serializarPersona(String rutaArhcivo, Persona persona){
        try {
            File archivo = new File(rutaArhcivo);

            if (!existeArchivo(archivo)){

                archivo.createNewFile();

                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaArhcivo));

                out.writeObject(persona);

                System.out.println("Persona serializada al arhcivo "+archivo.getName()+": "+ persona);

                out.close();

            }else System.out.println("Ya existe el archivo.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserializarPersona(String rutaArchivo){
        try {
            File archivo = new File(rutaArchivo);

            if (existeArchivo(archivo)){
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(rutaArchivo));

                Persona personaDeserializada = (Persona) input.readObject();

                System.out.println("Persona deserializada del archivo "+archivo.getName()+": "+personaDeserializada);

                input.close();

            }else System.out.println("No existe el archivo");


        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
