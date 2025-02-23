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
        String PASSWORD = "HOLA";
        String comienzo;

        do {

             comienzo = JOptionPane.showInputDialog("BIENVENIDO AL SISTEMA DE GESTIÓN DE CALIFICACIONES DE ESTUDIANTES" +
                     "\nEl programa mostrará una ventana con el menú, y sus acciones se mostrarán en la consola" +
                     "\n" +
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
                            System.out.println("No hay estudiantes registrados.");
                        }else {
                            System.out.println("Los estudiantes registrados son: ");
                            for (Estudiante e : gestor.listaEstudiantes){
                                System.out.print(e.getNombre()+", ");
                            }
                        }

                        break;


                    case 3:
                        System.out.println("Buscando alertas...");
                        if (gestor.listaEstudiantes.isEmpty()){
                            System.out.println("No hay estudiantes registrados.");
                        }else {
                            for (Estudiante e : gestor.listaEstudiantes){
                                gestor.comprobarPromedioGeneral(e);
                            }
                        }

                        break;

                    case 4:
                        if (gestor.listaEstudiantes.isEmpty()){
                            System.out.println("No hay estudiantes registrados.");
                        }else{
                            gestor.mejorEstudiante();
                        }

                        /*if (gestor.listaEstudiantes != null){
                            gestor.mejorEstudiante();
                        }else {
                            System.out.println("No hay estudiantes registrados");
                        }*/

                        break;

                    case 5:
                        String estudianteAmostrar = JOptionPane.showInputDialog("Introduce el nombre del estudiante para mostrar sus calificaciones: ");
                        boolean encontrado1 = false;
                        for (Estudiante e : gestor.listaEstudiantes){
                            if (e.getNombre().equalsIgnoreCase(estudianteAmostrar)){
                                e.mostrarCalificaciones();
                                encontrado1 = true;
                                break;
                            }
                        }
                        if (!encontrado1){
                            System.out.println("El estudiante "+estudianteAmostrar+" no está registrado.");
                        }
                        break;

                    case 6:
                        String estudiantePromedioMaterias = JOptionPane.showInputDialog("Introduce el nombre del estudiante para mostrar su promedio por materias: ");
                        boolean encontrado2 = false;
                        for (Estudiante e : gestor.listaEstudiantes){
                            if (e.getNombre().equalsIgnoreCase(estudiantePromedioMaterias)){
                                System.out.println(e.calcularPromedioMaterias());
                                encontrado2 = true;
                                break;
                            }
                        }
                        if (!encontrado2){
                            System.out.println("El estudiante "+estudiantePromedioMaterias+" no está registrado.");
                        }
                        break;

                    case 7:
                        String estudiantePromedioGeneral = JOptionPane.showInputDialog("Introduce el nombre del estudiante para mostrar su promedio general: ");
                        boolean encontrado3 = false;
                        for (Estudiante e : gestor.listaEstudiantes){
                            if (e.getNombre().equalsIgnoreCase(estudiantePromedioGeneral)){
                                System.out.println("El promedio general del alumno "+e.getNombre()+" es de "+e.calcularPromedioGeneral());
                                encontrado3 = true;
                                break;
                            }
                        }
                        if (!encontrado3){
                            System.out.println("El estudiante "+estudiantePromedioGeneral+" no está registrado.");
                        }

                        break;

                    case 8:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"Opción no válida.");

                }
            }

        }while (opcion != 8);


    }
}
