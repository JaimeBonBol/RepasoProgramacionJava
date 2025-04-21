package JSON;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Crear Clase Usuario y una Clase Main para trtabajar con objetos en formato JSON.Al final deberás poder guardar una LISTA
 * de usuarios en un archivo .json y volver a leerla para reconstruir los ibjetos en  memoria.
 *
 * Parte II. Añade un campo int edad a la clase Usuario y por tanto, modifca el JSON.
 * Modifica la lista para que se lea desde teclado antes de guardarla.
 * Crea un metodo que recorra la lista y muestre los usuarios mayores de 30 años.
 */

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan Martínez", "juan@gmail.com");
        Usuario usuario2 = new Usuario("Marta Pérez", "marta@gmail.com");
        Usuario usuario3 = new Usuario("Luisa Trigual", "luisa@gmail.com");

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

            /*
            List<Usuario> usuariosGuardar = new ArrayList<>();
            usuariosGuardar.add(usuario1);
            usuariosGuardar.add(usuario2);
            usuariosGuardar.add(usuario3);
             */

            List<Usuario> usuarioList = new ArrayList<>(Arrays.asList(
                    new Usuario("Juan Martínez", "juan@gmail.com"),
                    new Usuario("Marta Pérez", "marta@gmail.com"),
                    new Usuario("Luisa Trigual", "luisa@gmail.com")
            )
            );

            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Cuántos usuarios quieres introducir?");
            int usuariosIntroducir = scanner.nextInt();

            for (int i = 0; i < usuariosIntroducir; i++) {
                usuarioList.add(introducirUsuario());
            }

            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(archivoJSON,usuarioList);
            for (Usuario u : usuarioList){
                System.out.println("Usuario guardado "+u);
            }


            //Leer el JSON y convertirlo a objeto.
            List<Usuario> usuarios = mapper.readValue(archivoJSON, new TypeReference<List<Usuario>>() {});

            for (Usuario user : usuarios){
                System.out.println("Usaurio leído desde el JSON "+archivoJSON.getName()+": "+user);
            }

            System.out.println("AHORA SE MOSTRARÁN LOS USUARIOS MAYPRES DE 30");
            usuariosMayores30(usuarios);


        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static Usuario introducirUsuario(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del usuario: ");
        String nombreUsuario = sc.nextLine();

        System.out.println("Introduce el gmail del usuario: ");
        String emailUsuario = sc.nextLine();

        System.out.println("Introduce la edad del usuario: ");
        int edadUsuario = sc.nextInt();

        Usuario usuario = new Usuario(nombreUsuario,emailUsuario,edadUsuario);
        return usuario;
    }

    public static void usuariosMayores30(List<Usuario> usuarios){
        for (Usuario usuario : usuarios){
            if (usuario.getEdad() > 30){
                System.out.println(usuario);
            }
        }
    }
}
