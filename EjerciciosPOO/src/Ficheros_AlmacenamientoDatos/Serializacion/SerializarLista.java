package Ficheros_AlmacenamientoDatos.Serializacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarLista {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Pepe", 26));
        personas.add(new Persona("Marta", 23));
        personas.add(new Persona("Jose", 16));

        String ruta = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Serializacion/personasList.dat";

        seralizarListaPersonas(personas, ruta);

        System.out.println();

        deserializarListaPersonas(personas, ruta);

    }

    public static void seralizarListaPersonas(ArrayList<Persona> listaPersonas, String rutaArchivo) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaArchivo))){
            out.writeObject(listaPersonas);
            System.out.println("Lista serializada sin foreach: "+listaPersonas);

            System.out.println("Lista serializada con foreach");
            for (Persona persona :listaPersonas){
                System.out.println("Objeto serializado: "+persona);
            }
        } catch (IOException e) {
            System.out.println("Error al compilar: "+e.getMessage());
        }
    }

    public static void deserializarListaPersonas(ArrayList<Persona> listaPersonas, String rutaArchivo) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaArchivo))){
            List<Persona> listaRecuperada = (List<Persona>) in.readObject();
            System.out.println("Lista deserializada sin foreach: "+listaRecuperada);

            System.out.println("Lista serializada con foreach");
            for (Persona persona : listaRecuperada){
                System.out.println("Objeto deserializado: "+persona);
            }
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error al cargar el objeto: "+e.getMessage());
        }
    }
}
