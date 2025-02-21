package POO_EjerciciosClase.GestionNotasAlumnos;

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

        GestorDeCalificaciones gestor =new GestorDeCalificaciones();

        Estudiante estudiante1 =  gestor.agregarEstudiante("Pepe Ruiz");

        Estudiante estudiante2 = gestor.agregarEstudiante("Juan Perez");

        System.out.println();

        gestor.comprobarPromedioGeneral(estudiante1);

        System.out.println();

        gestor.comprobarPromedioGeneral(estudiante2);

        System.out.println();

        gestor.mejorEstudiante();
    }
}
