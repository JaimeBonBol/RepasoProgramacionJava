package examen;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Scanner;

/**
 * Clase principal del gestor de contactos.
 * El alumno debe implementar el menú y la lógica de interacción con la clase Agenda.
 */
public class ProbarAgenda {

    public static void main(String[] args) {

        // TODO: Implementar lógica del menú interactivo
        Agenda agenda = new Agenda();

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n== GESTOR DE CONTACTOS DE MI AGENDA ==");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Listar todos los contactos");
            System.out.println("5. Guardar y salir");
            System.out.print("Elige una opción: ");

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    // TODO: Llamar a método para agregar contacto
                    System.out.println("Nombre contacto: ");
                    String nombreContacto = sc.nextLine();

                    System.out.println("Teléfono contacto:");
                    String telefonoContacto = sc.nextLine();

                    System.out.println("Email contacto:");
                    String emailContacto = sc.nextLine();

                    Contacto contacto = new Contacto(nombreContacto, telefonoContacto, emailContacto);

                    agenda.agregarContacto(contacto);

                    break;
                case 2:
                    // TODO: Llamar a método para eliminar contacto
                    System.out.println("Nombre del contacto a eliminar:");
                    String nombreEliminar = sc.nextLine();

                    agenda.eliminarContacto(nombreEliminar);

                    break;
                case 3:
                    // TODO: Llamar a método para buscar contacto
                    System.out.println("Nombre de contactos a buscar:");
                    String nombreBuscar = sc.nextLine();

                    List<Contacto> contactosEncontrados = agenda.buscarContacto(nombreBuscar);

                    for (Contacto contacto1 : contactosEncontrados){
                        System.out.println(contacto1);
                    }

                    break;
                case 4:
                    // TODO: Llamar a método para listar contactos

                    List<Contacto> listaContactos = agenda.getContactos();

                    for (Contacto c : listaContactos){
                        System.out.println(c);
                    }

                    break;
                case 5:
                    // TODO: Guardar en JSON antes de salir
                    String rutaArhcivoJSON = "resources/agenda.json";
                    agenda.guardarEnJSON(agenda.getContactos(), rutaArhcivoJSON);

                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        sc.close();
        System.out.println("¡Hasta pronto!");
    }


}
