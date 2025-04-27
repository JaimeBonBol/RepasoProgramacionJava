package Ejercicio_GestorContactosJackson;

import Ejercicio_GestorContactosJackson.modelo.Contacto;
import JSON.Usuario;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorContactos {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        int opcion;
        File archivoJSON = new File("EjerciciosPOO/src/Ejercicio_GestorContactosJackson/javaContactos.json");
        List<Contacto> contactos = recuperarContactos(archivoJSON);


        do {
            System.out.println("GESTOR DE CONTACTOS");
            System.out.println("1. Agregar contacto " +
                    "\n2. Eliminar contacto" +
                    "\n3. Buscar contacto" +
                    "\n4. Listar todos los contactos" +
                    "\n5. Guardar y salir.");
            System.out.println("Elige una opción:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    agregarContacto(contactos);

                    break;

                case 2:
                    eliminarContatco(contactos);

                    break;

                case 3:
                    buscarContacto(contactos);

                    break;

                case 4:
                    listarTodosContactos(contactos);

                    break;

                case 5:
                    guardarJSON(contactos, archivoJSON);

                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion != 5);

    }

    public static void agregarContacto(List<Contacto> contactos){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce nombre: ");
        String nombreContacto = sc.nextLine();

        System.out.println("Inroduce teléfono: ");
        int tlfContatco = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce email: ");
        String emailContacto = sc.nextLine();

        Contacto contacto = new Contacto(nombreContacto, tlfContatco, emailContacto);
        contactos.add(contacto);
    }

    public static void eliminarContatco(List<Contacto> contactos){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del contacto a eliminar: ");
        String nombreEliminar = sc.nextLine();

        boolean encontrado = false;

        for (Contacto c : contactos){
            if (c.getNombre().equalsIgnoreCase(nombreEliminar)){
                contactos.remove(c);
                System.out.println("Contacto eliminado con éxito.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("El contacto no está en la lista.");
        }
    }

    public static void buscarContacto(List<Contacto> contactos){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del contacto a buscar: ");
        String nombreBuscar = sc.nextLine();

        boolean encontradoBusqueda = false;

        for (Contacto c : contactos){
            if (c.getNombre().equalsIgnoreCase(nombreBuscar)){
                System.out.println(c);
                encontradoBusqueda = true;
                break;
            }
        }

        if (!encontradoBusqueda){
            System.out.println("El contacto no está en la lista.");
        }
    }

    public static void listarTodosContactos(List<Contacto> contactos){
        Scanner sc = new Scanner(System.in);

        System.out.println("Listando todos los contactos: ");

        for (Contacto c : contactos){
            System.out.println(c);
        }
    }

    public static void guardarJSON(List<Contacto> contactos, File archivoJSON){
        Scanner sc = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();


        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(archivoJSON, contactos);
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static List<Contacto> recuperarContactos(File archivoJSON) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contacto> contactosRecuperados;

        if (archivoJSON.exists()){
            contactosRecuperados = mapper.readValue(archivoJSON, new TypeReference<List<Contacto>>() {});
        }else {
            contactosRecuperados = new ArrayList<>();
        }

        return contactosRecuperados;
    }
}
