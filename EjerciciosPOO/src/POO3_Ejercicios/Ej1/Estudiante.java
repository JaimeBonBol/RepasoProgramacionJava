package POO3_Ejercicios.Ej1;

import java.util.ArrayList;

public class Estudiante {

    /**
     * Atributos de la clase estudiante.
     */
    private String nombre;
    private int edad;
    private String matricula;
    private static ArrayList<Estudiante> estudiantes;

    /**
     * Constructor de la clase estudiante.
     * @param nombre
     * @param edad
     * @param matricula
     */
    public Estudiante(String nombre, int edad, String matricula){
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        estudiantes = new ArrayList<>();
    }

    /**
     * Metodo para agregar un estudiante.
     * @param nombre
     * @param edad
     * @param matricula
     */
    public static void registrarEstudiante(String nombre, int edad, String matricula){

        //Creas un nuevo estudiante con los datos que le pasamos al metodo agregarEstudiante.
        Estudiante estudiante = new Estudiante(nombre, edad, matricula);

        //Y a continuación lo agregamos a la lista creada para la clase Estudiante.
        estudiantes.add(estudiante);

        System.out.println("Estudiante agregado con éxito.");
    }

    /**
     * Metodo para mostrar información de un estudiante.
     */
    public void mostrarInformacion(){
        System.out.println("Nombre del estudiante: "+this.nombre);
        System.out.println("Edad del estudiante: "+this.edad);
        System.out.println("Matricula del estudiante: "+this.matricula);
    }

    /**
     * Metodo para buscar un estudiante por su matricula. Es estático por que no depende de una instancia de la clase Estudiante.
     * @param estudiantes
     * @param matricula
     * @return
     */
    public static Estudiante buscarPorMatricula(ArrayList<Estudiante> estudiantes ,String matricula){
        //Bucle que recorre la lista estudiantes.
        for (Estudiante estudiante : estudiantes){
            //Por cada iteración se pregunta si la matricula del estudiante es la misma que la matricula que se le pasa por parámetros al metodo para buscar.
            //Si se encuentra devuelve ese estudiante.
            if (estudiante.matricula.equalsIgnoreCase(matricula)){
                return estudiante;
            }
        }
        //Si no se encuentra nada, no devuelve nada.
        return null;
    }
}
