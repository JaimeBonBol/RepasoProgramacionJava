package POO_EjerciciosClase.GestionNotasAlumnos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDeCalificaciones {

    /**
     * Atributos de la clase Estudiante
     */
    protected ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    /**
     * Metodo para agregar estudiantes
     * @param nombre Nombre del estudiante.
     */
    public Estudiante agregarEstudiante(String nombre){
        //Almaceno cuantas materias tendrá el estudiante que las introducira el usuario.
        /*System.out.println("Cuántas materias tiene el estudiante "+nombre+": ");
        int materias = sc.nextInt();*/
        int materias = Integer.parseInt(JOptionPane.showInputDialog("Cuántas materias tiene el estudiante "+nombre+": "));

        //Almaceno cuantas evaluaciones tendrá el estudiante que las introducira el usuario.
        /*System.out.println("Cuántas evaluaciones tiene el estudiante "+nombre+": ");
        int evaluaciones = sc.nextInt();*/
        int evaluaciones = Integer.parseInt(JOptionPane.showInputDialog("Cuántas evaluaciones tiene el estudiante "+nombre+": "));

        //Instancio un nuevo estudiante con los datos que he recogido.
        Estudiante estudiante = new Estudiante(nombre, materias, evaluaciones);

        //Pido que agrege las calificaciones del estudiante.
        estudiante.inroducirCalificaciones();

        //Agrego el estudiante a la lista de estudiantes.
        listaEstudiantes.add(estudiante);
        //System.out.println("Estudiante agregado con éxito.");
        JOptionPane.showMessageDialog(null,"Estudiante agregado con éxito.");

        return estudiante;
    }

    /**
     * Metodo para comprobar el promedio general y motrar una alerta en caso de que sea menor de 5.0
     * @param estudiante
     */
    public void comprobarPromedioGeneral(Estudiante estudiante){
        if (estudiante.calcularPromedioGeneral() < 5.0){
            //System.out.println("MENSAJE DE ALERTA: Promedio general del estdiiante "+estudiante.getNombre() +"menor que 5.0");
            JOptionPane.showMessageDialog(null,"MENSAJE DE ALERTA: Promedio general del estudiante "+estudiante.getNombre() +" menor que 5.0");
        }else {
            JOptionPane.showMessageDialog(null,"No hay alerta para el estudiante "+estudiante.getNombre());
        }

        /*else {
            System.out.println("El promedio general del alumno es de "+estudiante.calcularPromedioGeneral());
        }*/
    }

    public void mejorEstudiante(){
        double promedio = 0;
        Estudiante mejorEstudiante = null;
        //Bucle que recorre la lista de estudiantes y comprueba por cada estudiante si su promedio es mayor que una variable
        //auxiliar inicializada en 0, por tanto si el promedio de un estudiante es mayor que el anterior(u otro estudnate) 
        //se actualiza esa variable auxiliar con el mayor promedio hasta el momento y se almacena el estudiante en una variable de 
        //tipo Estudiante auxiliar.
        for (Estudiante estudiante : listaEstudiantes){
            if (estudiante.calcularPromedioGeneral()>promedio){
                promedio += estudiante.calcularPromedioGeneral();
                mejorEstudiante = estudiante;
            }
        }
        
        //En esa variable de tipo Estudiante auxiliar está por tanto el estudiante que mayor promedio tiene, por lo que 
        //muestro sus calificaciones.
        //System.out.println("El mejor estudiante es "+mejorEstudiante.getNombre());
        JOptionPane.showMessageDialog(null,"El mejor estudiante es "+mejorEstudiante.getNombre());
        mejorEstudiante.mostrarCalificaciones();

    }

}
