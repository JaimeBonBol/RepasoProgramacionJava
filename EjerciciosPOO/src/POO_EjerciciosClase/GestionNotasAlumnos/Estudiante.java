package POO_EjerciciosClase.GestionNotasAlumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {

    /**
     * Atributos de la clase Estudiante.
     */
    private String nombre;
    private double [][] calificaciones;
    int filas;
    int columnas;
    private ArrayList<String> asignaturas = new ArrayList<>();
    private ArrayList<String> evaluaciones = new ArrayList<>();

    /**
     * Constrcutor de la clase Estudiante.
     * @param nombre Nombre que tendrá el estudiante.
     * @param filas Número de filas que tendrá el array de calificadiones del alumno.
     * @param columnas Número de columnas que tendrá el array caificaciones del alumno.
     */
    public Estudiante(String nombre, int filas, int columnas) {
        this.nombre = nombre;
        this.filas = filas;
        this.columnas = columnas;
        this.calificaciones = new double[filas][columnas];

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void inroducirCalificaciones(){
        String asignatura;
        String evaluacion;
        Scanner sc = new Scanner(System.in);

        //Filas.
        for (int i = 0; i < filas; i++) {
            System.out.println("Introduce asignatura: ");
            asignatura =sc.nextLine();
            asignaturas.add(asignatura);
            //Columnas
            for (int j = 0; j < columnas; j++) {

                System.out.println("Introduce evaluación: ");
                evaluacion = sc.nextLine();
                evaluaciones.add(evaluacion);
                System.out.println("Introduce nota para "+evaluacion+" de la asignatura "+asignatura+": ");
                calificaciones[i][j]= sc.nextDouble();
                sc.nextLine();

            }
        }
    }

    public void mostrarCalificaciones(){
        System.out.println("Tabla de calificaciones de "+getNombre());

        for (int i = 0; i < filas; i++) {
            //System.out.print(this.asignatura+": ");
            for (int j = 0; j < columnas; j++) {
                //System.out.println("\t\t\t"+this.evaluacion+"\t");
                System.out.print(asignaturas.get(i)+", "+evaluaciones.get(j)+": ");
                System.out.print(calificaciones[i][j]+"\t\t");
            }
            System.out.println();
        }
    }

}
