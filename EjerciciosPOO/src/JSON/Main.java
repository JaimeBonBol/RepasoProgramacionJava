package JSON;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan Martínez", "juan@gmail.com");
        Usuario usuario2 = new Usuario("Marta Pérez", "marta@gmail.com");

        ObjectMapper mapper = new ObjectMapper();

        //Convertir el objeto y escribirlo en el JSON
        File archivoJSON = new File("EjerciciosPOO/src/JSON/javaUsuario.json");
        try {
            /*
            mapper.writeValue(archivoJSON,usuario1);
            System.out.println("Usuario guardado en json");

            Usuario usuarioRecuperado = mapper.readValue(archivoJSON,Usuario.class);
            System.out.println("Usuario recuperado de json: "+usuarioRecuperado);
             */

            List<Usuario> usuariosGuardar = new ArrayList<>();
            usuariosGuardar.add(usuario1);
            usuariosGuardar.add(usuario2);

            mapper.writeValue(archivoJSON,usuariosGuardar);
            for (Usuario u : usuariosGuardar){
                System.out.println("Usuario guardado "+u);
            }


            //Leer el JSON y convertirlo a objeto.
            List<Usuario> usuarios = mapper.readValue(archivoJSON, new TypeReference<List<Usuario>>() {});

            for (Usuario user : usuarios){
                System.out.println("Usaurio leído desde el JSON "+archivoJSON.getName()+": "+user);
            }


        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
