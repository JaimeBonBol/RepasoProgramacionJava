package Ficheros_AlmacenamientoDatos.EjerciciosFicherosRepaso.repasoCRUD.CRUDPersona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Con la instancia de la clase ya carga desde el json.
        GestorPersonas gestorPersonas = new GestorPersonas();

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("-- Menú CRUD gestor de Personas --" +
                    "\nElige una opción:" +
                    "\n1.Crear persona." +
                    "\n2.Ver lista de personas almacenadas." +
                    "\n3.Actualizar una persona existente." +
                    "\n4.Eliminar una persona." +
                    "\n0.Salir del programa.");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Introduce el nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Introduce la edad:");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Introduce el email:");
                    String email = sc.nextLine();

                    Persona persona =new Persona(nombre, edad, email);

                    gestorPersonas.crearPersona(persona);

                    break;

                case 2:

                    gestorPersonas.mostrarListaPersonas();

                    break;

                case 3:

                    System.out.println("Introduce el nombre de la persona a actualizar:");
                    String nombreActualizar = sc.nextLine();

                    System.out.println("Introduce el nuevo nombre:");
                    String nuevoNombre = sc.nextLine();

                    System.out.println("Introduce la nueva edad:");
                    int nuevaEdad = sc.nextInt();
                    sc.nextLine();


                    System.out.println("Introduce el nuevo email:");
                    String nuevoEmail = sc.nextLine();

                    Persona personaActualizada = new Persona(nuevoNombre, nuevaEdad, nuevoEmail);

                    gestorPersonas.actualizarPersona(nombreActualizar, personaActualizada);

                    break;

                case 4:

                    System.out.println("Introduce el nombre de la persona a eliminar:");
                    String nombreEliminar = sc.nextLine();

                    gestorPersonas.eliminarPersona(nombreEliminar);

                    break;

                case 0:

                    System.out.println("Saliendo del programa...");

                    break;

                default:

                    System.out.println("Opción no válida.");
            }
        }while (opcion != 0);
    }
}
