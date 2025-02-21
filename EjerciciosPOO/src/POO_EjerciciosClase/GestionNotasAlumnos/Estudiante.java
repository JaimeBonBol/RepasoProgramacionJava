package POO_EjerciciosClase.GestionNotasAlumnos;

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
        for (int i = 0; i < numeroMaterias; i++) {
            System.out.println("Introduce asignatura: ");
            asignatura =sc.nextLine();
            asignaturas.add(asignatura);
            //Columnas
            for (int j = 0; j < numeroEvaluaciones; j++) {

                System.out.println("Introduce evaluación: ");
                evaluacion = sc.nextLine();
                evaluaciones.add(evaluacion);
                System.out.println("Introduce nota para "+evaluacion+" de la asignatura "+asignatura+": ");
                calificaciones[i][j]= Double.parseDouble(sc.nextLine());


            }
        }
    }

    public void mostrarCalificaciones(){
        int auxEvaluaciones = 0;
        System.out.println("Tabla de calificaciones de "+getNombre());
        //Comprobaciones
        for (String asignatura : asignaturas){
            System.out.print(asignatura+ ", ");
        }
        System.out.println();
        for (String evaluacion : evaluaciones){
            System.out.print(evaluacion+", ");
        }
        System.out.println();

        for (int i = 0; i < numeroMaterias; i++) {
            //System.out.print(this.asignatura+": ");
            for (int j = 0; j < numeroEvaluaciones; j++) {
                //System.out.println("\t\t\t"+this.evaluacion+"\t");
                System.out.print(asignaturas.get(i)+", "+evaluaciones.get(auxEvaluaciones)+": ");
                System.out.print(calificaciones[i][j]+"\t\t\t");
                auxEvaluaciones ++;
            }
            System.out.println();
        }
    }

    public String calcularPromedioMaterias(){
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

        return sb.toString();
    }

    
}
