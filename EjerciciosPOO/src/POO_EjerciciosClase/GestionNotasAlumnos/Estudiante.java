package POO_EjerciciosClase.GestionNotasAlumnos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Estudiante {

    /**
     * Atributos de la clase Estudiante.
     */
    private String nombre;
    private double [][] calificaciones;
    int numeroMaterias; //Asinaturas
    int numeroEvaluaciones; //Evaluaciones
    private ArrayList<String> asignaturas = new ArrayList<>();
    private ArrayList<String> evaluaciones = new ArrayList<>();

    /**
     * Constrcutor de la clase Estudiante.
     * @param nombre Nombre que tendrá el estudiante.
     * @param numeroMaterias Número de filas que tendrá el array de calificadiones del alumno.
     * @param numeroEvaluaciones Número de columnas que tendrá el array caificaciones del alumno.
     */
    public Estudiante(String nombre, int numeroMaterias, int numeroEvaluaciones) {
        this.nombre = nombre;
        this.numeroMaterias = numeroMaterias;
        this.numeroEvaluaciones = numeroEvaluaciones;
        this.calificaciones = new double[numeroMaterias][numeroEvaluaciones];

    }

    /**
     * Getter para obtener el nombre del alumno.
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para modificar el nombre del alumno
     * @param nombre Nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para introducir calificaciones al alumno, donde te pregunta las materias que tiene y las diferentes
     * evaluaciones y se debe de ir introducienod la nota de cada evaluación para su respectiva materia.
     */
    public void inroducirCalificaciones(){
        String asignatura;
        String evaluacion;
        double nota;
        Scanner sc = new Scanner(System.in);

        //Filas.
        for (int i = 0; i < numeroMaterias; i++) {
            //Para cada fila, que será una asignatura pregunta que asignatura quiere que sea.
            /*System.out.println("Introduce asignatura: ");
            asignatura =sc.nextLine();*/
            asignatura = JOptionPane.showInputDialog("Introduce asignatura: ");
            asignaturas.add(asignatura);
            //Columnas
            for (int j = 0; j < numeroEvaluaciones; j++) {
                //para cada fila, que será cada evaluación, primero preguntará que tipo de evaluación es y después su calificación.
                /*System.out.println("Introduce evaluación: ");
                evaluacion = sc.nextLine();*/
                evaluacion =JOptionPane.showInputDialog("Introduce evaluación: ");
                evaluaciones.add(evaluacion);
                /*System.out.println("Introduce nota para "+evaluacion+" de la asignatura "+asignatura+": ");
                calificaciones[i][j]= Double.parseDouble(sc.nextLine());*/
                nota = Double.parseDouble(JOptionPane.showInputDialog("Introduce nota para "+evaluacion+" de la asignatura "+asignatura+": "));
                calificaciones[i][j]= nota;

            }
        }
    }

    /**
     * Metodo para mostrar las calificaciones en forma de tabla. Dandote de cada nota información sobre qué
     * materia y evaluación es.
     */
    public void mostrarCalificaciones(){
        int auxEvaluaciones = 0;
        //System.out.println("Tabla de calificaciones de "+getNombre());
        JOptionPane.showMessageDialog(null,"Tabla de calificaciones de "+getNombre());
        //Comprobaciones
        /*
        for (String asignatura : asignaturas){
            System.out.print(asignatura+ ", ");
        }
        System.out.println();
        for (String evaluacion : evaluaciones){
            System.out.print(evaluacion+", ");
        }
        System.out.println();
        */

        for (int i = 0; i < numeroMaterias; i++) {
            for (int j = 0; j < numeroEvaluaciones; j++) {
                //System.out.println("\t\t\t"+this.evaluacion+"\t");
                //Para cada calificación mpstrará información de la materia y su evaluación correspondiente.
                /*System.out.print(asignaturas.get(i)+", "+evaluaciones.get(auxEvaluaciones)+": ");
                System.out.print(calificaciones[i][j]+"\t\t\t");*/
                JOptionPane.showMessageDialog(null,asignaturas.get(i)+", "+evaluaciones.get(auxEvaluaciones)+": ");
                JOptionPane.showMessageDialog(null,calificaciones[i][j]+"\t\t\t");
                auxEvaluaciones ++;
            }
            System.out.println();
        }
    }

    /**
     * Metodo para calcular el promedio del alumno por asignatura.
     * @return
     */
    public void calcularPromedioMaterias(){
        //Creo un array de doubles para luego devolverlo, de la longitud del array de calificaciones del alumno.
        double[] promedioMateria = new double[calificaciones.length];

        //En este primer bucle que se repetirá dependiendo del número de materias del alumno creo una variable
        //donde iré sumando sus calificaciones, como va a ser por materia lo creo dentro para que la próxima fila( que será la próxima materia)
        // se reinicie el valor de la variable.
        for (int i = 0; i < numeroMaterias; i++) {
            double sumaTotal = 0;
            //Aquí acumulo según el numero de columnas, es decir de evaluaciones, la nota a la variable.
            for (int j = 0; j < numeroEvaluaciones; j++) {
                sumaTotal += calificaciones[i][j];
            }
            //Ahora calculo el promedio cpn esa variable donde tengo acumuladas todas las notas de la primera fila, antes de que termine
            //el primer bucle y vuelva a comenzar por la segunda fila, reinicie la sumaTotal,etc.
            promedioMateria[i] = sumaTotal / numeroEvaluaciones;

        }
        //He encontrado que tiene que ponerse aí para que no muestre la dirección de memoria, y por tanto el metodo debuelve un String.
        //return Arrays.toString(promedioMateria);

        //Creo un StringBuilder para ir añadiendole el mensaje deseado.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < promedioMateria.length; i++) {
            sb.append("El promedio del alumno "+getNombre()+" en la asignatura "+asignaturas.get(i)+" es de "+promedioMateria[i]);
            sb.append("\n");
        }

        JOptionPane.showMessageDialog(null,sb.toString());
    }

    /**
     * Metodo para calcular el promedio general del alumno.
     * @return Delvuel e un double con el promedio general del alumno.
     */
    public double calcularPromedioGeneral(){
        //sumaTotal donde se almacenará la suma de todas las notas del alumno.
        double sumaTotal = 0;
        //promedioGeneral donde se almacenará el promedio total del alumno.
        double promedioGeneral = 0;
        for (int i = 0; i < numeroMaterias; i++) {
            for (int j = 0; j < numeroEvaluaciones; j++) {
                sumaTotal += calificaciones[i][j];
            }
        }
        //EL promedio general del alumno será el total de las calificaciones del alumno dividido entre el número de materias por el número de evaluaciones.
        promedioGeneral = sumaTotal / (numeroMaterias*numeroEvaluaciones);
        return promedioGeneral;
    }

}
