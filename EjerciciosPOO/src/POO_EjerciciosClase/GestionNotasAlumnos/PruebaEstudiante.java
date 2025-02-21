package POO_EjerciciosClase.GestionNotasAlumnos;

public class PruebaEstudiante {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Pepe García", 2, 2);

        estudiante1.inroducirCalificaciones();
        estudiante1.mostrarCalificaciones();
        System.out.println(estudiante1.calcularPromedioMaterias());
    }
}
