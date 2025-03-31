package Ficheros_AlmacenamientoDatos.Serializacion;

import java.io.*;

public class EjemploSerializacionTransient {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Lucia", "abc123");
        String archivo ="EjerciciosPOO/src/Ficheros_AlmacenamientoDatos/Serializacion/usuarios.dat";

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))){
            out.writeObject(u1);
            System.out.println("Usuario serializado correctamente "+u1);
        }catch (IOException e){
            System.out.println("Error al compilar: "+e.getMessage());
        }

        //Deserializar

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))){
            Usuario usuarioRecuperado = (Usuario) in.readObject();
            System.out.println("Usuario deserializado: "+usuarioRecuperado);
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error al cargar: "+e.getMessage());
        }
    }
}
