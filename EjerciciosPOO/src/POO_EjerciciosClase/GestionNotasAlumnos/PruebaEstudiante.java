package POO_EjerciciosClase.GestionNotasAlumnos;

import javax.swing.*;
import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {

        /*Estudiante estudiante1 = new Estudiante("Pepe García", 2, 2);

        estudiante1.inroducirCalificaciones();

        System.out.println();

        estudiante1.mostrarCalificaciones();

        System.out.println();

        System.out.println(estudiante1.calcularPromedioMaterias());

        System.out.println();

        System.out.println("El promedio general del alumno "+estudiante1.getNombre()+" es de "+estudiante1.promedioGeneral());*/

        /*

        //Instacio un nuevo alumno mediante el gestor de calificaciones.
        Estudiante estudiante1 =  gestor.agregarEstudiante("Pepe Ruiz");

        //Instacio un nuevo alumno mediante el gestor de calificaciones.
        Estudiante estudiante2 = gestor.agregarEstudiante("Juan Perez");

        System.out.println();

        gestor.comprobarPromedioGeneral(estudiante1);

        System.out.println();

        gestor.comprobarPromedioGeneral(estudiante2);

        System.out.println();

        gestor.mejorEstudiante();

         */

        /**
         * PROGRAMA PRINCIPAL, CON ENTRADAD DE DATOS A TRAVÉS DE JOPTION PANE.
         */

        //Instacion un gestor de calificaciones.
        GestorDeCalificaciones gestor =new GestorDeCalificaciones();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        boolean enter = false;
        String PASSWORD = "hola";
        String comienzo;

        do {

             comienzo = JOptionPane.showInputDialog("BIENVENIDO AL SISTEMA DE GESTIÓN DE CALIFICACIONES DE ESTUDIANTES" +
                    "\nEscriba la contraseña para entrar: ");

            if (comienzo.equals(PASSWORD)){
                enter = true;
            }else {
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta, intentelo de nuevo.");
            }

        }while (!comienzo.equals(PASSWORD));


        do {

            if (enter){
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer, pulse su correspondiente número:" +
                        "\n1. Agregar estudiante." +
                        "\n2. Mostrar estudiantes en el gestor." +
                        "\n3. Mostrar alertas." +
                        "\n4. Mostrar mejor estudiante." +
                        "\n5. Buscar y mostrar estudiante." +
                        "\n6. Mostrar promedio por materias de estudiante." +
                        "\n7. Mostrar promedio general de estudiante." +
                        "\n8. Salir."));

                switch (opcion){
                    case 1:
                        String nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno: ");

                        Estudiante estudiante = gestor.agregarEstudiante(nombre);

                        break;

                    case 2:
                        if (gestor.listaEstudiantes.isEmpty()){
                            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
                        }else {
                            JOptionPane.showMessageDialog(null, "Los estudiantes registrados son: ");
                            for (Estudiante e : gestor.listaEstudiantes){
                                JOptionPane.showMessageDialog(null,e.getNombre());
                            }
                        }

                        break;


                    case 3:
                        JOptionPane.showMessageDialog(null,"Buscando alertas...");

                        for (Estudiante e : gestor.listaEstudiantes){
                            gestor.comprobarPromedioGeneral(e);
                        }

                        break;

                    case 4:
                        if (gestor.listaEstudiantes != null){
                            gestor.mejorEstudiante();
                        }else {
                            JOptionPane.showMessageDialog(null,"No hay estudiantes registrados");
                        }

                        break;

                    case 5:
                        String estudianteAmostrar = JOptionPane.showInputDialog("Introduce el nombre del estudiante para mostrar sus calificaciones: ");
                        boolean encontrado = false;
                        for (Estudiante e : gestor.listaEstudiantes){
                            if (e.getNombre().equalsIgnoreCase(estudianteAmostrar)){
                                e.mostrarCalificaciones();
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado){
                            JOptionPane.showMessageDialog(null, "El estudiante "+estudianteAmostrar+" no está registrado.");
                        }
                        break;

                    case 6:
                        String estudiantePromedioMaterias = JOptionPane.showInputDialog("Introduce el nombre del estudiante para mostrar su promedio por materias: ");
                        for (Estudiante e : gestor.listaEstudiantes){
                            if (e.getNombre().equalsIgnoreCase(estudiantePromedioMaterias)){
                                e.calcularPromedioMaterias();
                            }
                        }

                        break;

                    case 7:
                        String estudiantePromedioGeneral = JOptionPane.showInputDialog("Introduce el nombre del estudiante para mostrar su promedio general: ");
                        for (Estudiante e : gestor.listaEstudiantes){
                            if (e.getNombre().equalsIgnoreCase(estudiantePromedioGeneral)){
                                e.calcularPromedioGeneral();
                            }
                        }

                        break;

                    case 8:
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"Opción no válida.");

                }
            }

        }while (opcion != 8);


    }
}
