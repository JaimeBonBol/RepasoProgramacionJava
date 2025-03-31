package Ficheros_AlmacenamientoDatos.Serializacion;

import java.io.*;

public class SerializacionEjemplo {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 30);

        String ruta = "EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Serializacion/persona.dat";

        // Serializar (Guardar un obkjeto en un archivo binario) puede ser .dat o .ser

        //Si se mete en el paréntesis no hay que cerrarlo
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))){
            out.writeObject(p1);
            System.out.println("Objetio serializado: "+p1);
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }

        // Deserializar(Cargar/Leer un objeto desde un archivo binario)

        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(ruta))){
            //input.readObject();
            //System.out.println(input.readObject());
            Persona p2 = (Persona) input.readObject();

            System.out.println("Objeto deserializado: "+p2);
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error al cargar: "+e.getMessage());
        }
    }
}
